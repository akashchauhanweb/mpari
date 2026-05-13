package com.nic.mparivahan.ClServices.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.ServiceSubmitResponse;
import com.nic.mparivahan.ClServices.View.RenewalCl;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen;
import com.nic.mparivahan.R;
import com.zepto.jl0;
import com.zepto.kl0;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ye;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b|\u0010}J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010C\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\"\u0010K\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010BR\"\u0010O\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010>\u001a\u0004\bM\u0010@\"\u0004\bN\u0010BR\"\u0010S\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010@\"\u0004\bR\u0010BR\"\u0010W\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010>\u001a\u0004\bU\u0010@\"\u0004\bV\u0010BR\"\u0010[\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010>\u001a\u0004\bY\u0010@\"\u0004\bZ\u0010BR\"\u0010_\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010>\u001a\u0004\b]\u0010@\"\u0004\b^\u0010BR\"\u0010c\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010>\u001a\u0004\ba\u0010@\"\u0004\bb\u0010BR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010o\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010>\u001a\u0004\bm\u0010@\"\u0004\bn\u0010BR\"\u0010s\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010>\u001a\u0004\bq\u0010@\"\u0004\br\u0010BR\"\u0010w\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010>\u001a\u0004\bu\u0010@\"\u0004\bv\u0010BR\"\u0010{\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010>\u001a\u0004\by\u0010@\"\u0004\bz\u0010B¨\u0006~"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/RenewalCl;", "Lcom/zepto/pq;", "", "P1", "N1", "Landroid/content/Context;", "context", "", "message", "W1", "Z1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/ye;", "C", "Lcom/zepto/ye;", "F1", "()Lcom/zepto/ye;", "k2", "(Lcom/zepto/ye;)V", "msBinding", "D", "Landroid/content/Context;", "D1", "()Landroid/content/Context;", "i2", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/wa3;", "E", "Lcom/zepto/wa3;", "K1", "()Lcom/zepto/wa3;", "p2", "(Lcom/zepto/wa3;)V", "session", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "G1", "()Landroid/app/ProgressDialog;", "l2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/kl0;", "G", "Lcom/zepto/kl0;", "B1", "()Lcom/zepto/kl0;", "g2", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "H", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "C1", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "h2", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "I", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "d2", "(Ljava/lang/String;)V", "dlValue", "J", "y1", "e2", "dobValue", "K", "z1", "f2", "fatherName", "L", "u1", "b2", "clName", "M", "v1", "c2", "clPhoto", "N", "H1", "m2", "rtoCode", "O", "L1", "q2", "stateCode", "P", "E1", "j2", "Mobile_no", "Q", "I1", "n2", "rtoName", "Lcom/zepto/wl5;", "R", "Lcom/zepto/wl5;", "J1", "()Lcom/zepto/wl5;", "o2", "(Lcom/zepto/wl5;)V", "sarathiSession", "S", "t1", "setAddress", "address", "T", "A1", "setIssuing_authority", "issuing_authority", "U", "M1", "setValidity", "validity", "V", "w1", "setCl_Status", "cl_Status", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class RenewalCl extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ye msBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dlValue;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String fatherName;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String clName;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String clPhoto;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String rtoName;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public wl5 sarathiSession;

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
            RenewalCl.this.G1().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(serviceSubmitResponse.getStatus_code(), "00", true)) {
                    String applicationNo = serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo();
                    if (applicationNo == null || applicationNo.length() == 0) {
                        RenewalCl renewalCl = RenewalCl.this;
                        renewalCl.Z1(renewalCl.K1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                        str = str;
                    } else {
                        try {
                            Intent intent = new Intent(RenewalCl.this, (Class<?>) ClSubmitScreen.class);
                            intent.putExtra("appNumber", serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dlValue", RenewalCl.this.x1());
                            intent.putExtra("dobValue", RenewalCl.this.y1());
                            intent.putExtra("fatherName", RenewalCl.this.z1());
                            intent.putExtra("clName", RenewalCl.this.u1());
                            intent.putExtra("clPhoto", RenewalCl.this.v1());
                            intent.putExtra("stateCode", RenewalCl.this.L1());
                            intent.putExtra("rtoCode", RenewalCl.this.H1());
                            intent.putExtra("rtoName", RenewalCl.this.I1());
                            intent.putExtra("Mobile_no", RenewalCl.this.E1());
                            intent.putExtra("address", RenewalCl.this.getAddress()).toString();
                            intent.putExtra("issuing_authority", RenewalCl.this.getIssuing_authority()).toString();
                            intent.putExtra("validity", RenewalCl.this.getValidity()).toString();
                            cl_Status = RenewalCl.this.getCl_Status();
                            intent.putExtra("cl_Status", cl_Status).toString();
                            RenewalCl.this.startActivity(intent);
                            str = intent;
                        } catch (Exception unused) {
                        }
                    }
                } else if (StringsKt__StringsJVMKt.equals(serviceSubmitResponse.getStatus_code(), "01", true)) {
                    RenewalCl.this.Z1(serviceSubmitResponse.getStatus_desc());
                    str = str;
                } else {
                    RenewalCl renewalCl2 = RenewalCl.this;
                    renewalCl2.Z1(renewalCl2.K1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                    str = str;
                }
            } catch (Exception unused2) {
                RenewalCl renewalCl3 = RenewalCl.this;
                renewalCl3.Z1(renewalCl3.K1().b(cl_Status, str));
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

    private final void N1() {
        i2(this);
        p2(new wa3(D1()));
        o2(new wl5(D1()));
        l2(new ProgressDialog(D1()));
        G1().setMessage(K1().b("label_challan_please_wait", getString(R.string.please_wait)));
        G1().setCancelable(false);
        G1().setCanceledOnTouchOutside(false);
        try {
            e2(String.valueOf(getIntent().getStringExtra("dobValue")));
            d2(String.valueOf(getIntent().getStringExtra("dlValue")));
            f2(String.valueOf(getIntent().getStringExtra("fatherName")));
            b2(String.valueOf(getIntent().getStringExtra("clName")));
            c2(String.valueOf(getIntent().getStringExtra("clPhoto")));
            m2(String.valueOf(getIntent().getStringExtra("rtoCode")));
            n2(String.valueOf(getIntent().getStringExtra("rtoName")));
            q2(String.valueOf(getIntent().getStringExtra("stateCode")));
            j2(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            F1().E.setText(K1().b("CL_NO", "CL No.") + ' ' + x1());
            F1().A.g.setText(J1().k());
            this.address = String.valueOf(getIntent().getStringExtra("address"));
            this.issuing_authority = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.validity = String.valueOf(getIntent().getStringExtra("validity"));
            this.cl_Status = String.valueOf(getIntent().getStringExtra("cl_Status"));
            String strV1 = v1();
            if (strV1 == null || strV1.length() == 0) {
                F1().A.f.setVisibility(8);
            } else {
                F1().A.f.setVisibility(0);
                F1().A.b.setImageBitmap(kt6.a(v1()));
            }
        } catch (Exception unused) {
        }
        h2(ClInter.INSTANCE.a(D1()));
        g2((kl0) new z(this, new sn0(new jl0(C1()))).a(kl0.class));
        B1().l().g(this, new mf4() { // from class: com.zepto.t85
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                RenewalCl.O1(this.a, (String) obj);
            }
        });
        B1().s().g(this, new b(new a()));
    }

    public static final void O1(RenewalCl this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1().dismiss();
        String strB = this$0.K1().b("label_unable_details", this$0.getString(R.string.unable_to_get_details));
        Intrinsics.checkNotNull(strB);
        this$0.Z1(strB);
    }

    private final void P1() {
        F1().B.g.setText(J1().k());
        F1().B.h.setPaintFlags(F1().B.h.getPaintFlags() | 8);
        TextView textView = F1().B.h;
        String strX1 = x1();
        Intrinsics.checkNotNull(strX1);
        textView.setText(StringsKt__StringsKt.trim((CharSequence) strX1).toString());
        F1().B.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalCl.Q1(this.a, view);
            }
        });
    }

    public static final void Q1(RenewalCl this$0, View view) {
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

    public static final void R1(RenewalCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void S1(RenewalCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void T1(RenewalCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.W1(this$0.D1(), this$0.K1().b("label_want_to_proceed", "Are you sure, You want to proceed ?"));
        } else {
            Toast.makeText(this$0.D1(), "Please Check Your Internet connection", 1).show();
        }
    }

    public static final void U1(RenewalCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void V1(RenewalCl this$0, View view) {
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

    private final void W1(Context context, String message) {
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
        ((TextView) viewFindViewById4).setText(K1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(K1().b("radio_dl_serv_yes", "Proceed"));
        textView2.setText(K1().b("radio_dl_serv_no", "Cancel"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalCl.X1(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalCl.Y1(dialog, this, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void Y1(Dialog d, RenewalCl this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.G1().show();
        this$0.B1().v(this$0, this$0.L1(), this$0.H1(), "552", this$0.x1(), this$0.y1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(String message) {
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
        textView.setText(K1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(K1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(K1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalCl.a2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a2(Dialog d, View view) {
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

    public final ye F1() {
        ye yeVar = this.msBinding;
        if (yeVar != null) {
            return yeVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("msBinding");
        return null;
    }

    public final ProgressDialog G1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String H1() {
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    public final String I1() {
        String str = this.rtoName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoName");
        return null;
    }

    public final wl5 J1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final wa3 K1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final String L1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final String getValidity() {
        return this.validity;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clName = str;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhoto = str;
    }

    public final void d2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void e2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void f2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fatherName = str;
    }

    public final void g2(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void h2(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void i2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void j2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.Mobile_no = str;
    }

    public final void k2(ye yeVar) {
        Intrinsics.checkNotNullParameter(yeVar, "<set-?>");
        this.msBinding = yeVar;
    }

    public final void l2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoName = str;
    }

    public final void o2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renewal_cl);
        ye yeVarX = ye.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(yeVarX, "inflate(...)");
        k2(yeVarX);
        setContentView(F1().m());
        N1();
        ta3.a.H1(this, F1());
        F1().A.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalCl.R1(this.a, view);
            }
        });
        F1().B.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalCl.S1(this.a, view);
            }
        });
        F1().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalCl.T1(this.a, view);
            }
        });
        F1().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalCl.U1(this.a, view);
            }
        });
        F1().H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalCl.V1(this.a, view);
            }
        });
        P1();
    }

    public final void p2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
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
