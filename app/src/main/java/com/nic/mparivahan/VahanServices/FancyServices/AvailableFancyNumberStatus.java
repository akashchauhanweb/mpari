package com.nic.mparivahan.VahanServices.FancyServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyNumberStatus;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyService.AvailableFancyService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModle;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.a20;
import com.zepto.b20;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.p10;
import com.zepto.pq;
import com.zepto.ra7;
import com.zepto.s6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yh7;
import com.zepto.yy0;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bR\u0010SJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00109\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010M\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u00104\u001a\u0004\bK\u00106\"\u0004\bL\u00108R\"\u0010Q\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00104\u001a\u0004\bO\u00106\"\u0004\bP\u00108¨\u0006T"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyNumberStatus;", "Lcom/zepto/pq;", "", "M1", "", "it", "", "J1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/s6;", "C", "Lcom/zepto/s6;", "q1", "()Lcom/zepto/s6;", "C1", "(Lcom/zepto/s6;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "w1", "()Lcom/zepto/ld7;", "I1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "t1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "F1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "s1", "()Landroid/app/ProgressDialog;", "E1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/ImageView;", "G", "Landroid/widget/ImageView;", "p1", "()Landroid/widget/ImageView;", "B1", "(Landroid/widget/ImageView;)V", "back_image", "H", "Ljava/lang/String;", "getOff_code", "()Ljava/lang/String;", "setOff_code", "(Ljava/lang/String;)V", "off_code", "Lcom/zepto/wa3;", "I", "Lcom/zepto/wa3;", "r1", "()Lcom/zepto/wa3;", "D1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyService/AvailableFancyService;", "J", "Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyService/AvailableFancyService;", "retrofitServicefancy", "Lcom/zepto/b20;", "K", "Lcom/zepto/b20;", "viewModelfancy", "L", "v1", "H1", "stateCode", "M", "u1", "G1", "rtoCode", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AvailableFancyNumberStatus extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public s6 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ImageView back_image;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String off_code = "0";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public AvailableFancyService retrofitServicefancy;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public b20 viewModelfancy;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String rtoCode;

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (AvailableFancyNumberStatus.this.q1().g.getSelectedItemPosition() != 0) {
                AvailableFancyNumberStatus.this.s1().show();
                Object selectedItem = AvailableFancyNumberStatus.this.q1().g.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) selectedItem;
                Toast.makeText(AvailableFancyNumberStatus.this, vahanStateModleSubList.toString(), 1).show();
                AvailableFancyNumberStatus.this.w1().P0(vahanStateModleSubList.get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (AvailableFancyNumberStatus.this.q1().e.getSelectedItemPosition() != 0) {
                Object selectedItem = AvailableFancyNumberStatus.this.q1().e.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem");
                AvailableFancyNumberStatus.this.G1(((RtoNameModleItem) selectedItem).getOff_cd());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
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
            if (!str.equals("SUCCESS")) {
                AvailableFancyNumberStatus.this.J1(str);
                return;
            }
            Intent intent = new Intent(AvailableFancyNumberStatus.this, (Class<?>) AvailableFancyNumberList.class);
            intent.putExtra("stateCode", AvailableFancyNumberStatus.this.v1());
            intent.putExtra("rtoCode", AvailableFancyNumberStatus.this.u1());
            AvailableFancyNumberStatus.this.startActivity(intent);
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
            AvailableFancyNumberStatus.this.s1().show();
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

    public static final void A1(AvailableFancyNumberStatus this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.q1().g.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.r1().b("label_log_sel_state", this$0.getString(R.string.please_selecr_State)), 1).show();
            return;
        }
        if (this$0.q1().e.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.r1().b("select_rto", this$0.getString(R.string.please_select_rto)), 1).show();
            return;
        }
        Object selectedItem = this$0.q1().g.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
        ArrayList arrayList = (ArrayList) selectedItem;
        Object obj = arrayList.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        Log.e("stateInfo2", (String) obj);
        Object obj2 = arrayList.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        this$0.H1((String) obj2);
        Log.e("statertoinfo", this$0.v1());
        Log.e("statertoinfor", this$0.u1());
        if (this$0.M1()) {
            b20 b20Var = this$0.viewModelfancy;
            if (b20Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModelfancy");
                b20Var = null;
            }
            b20Var.i(this$0.v1(), this$0.u1(), "10", VContant.MAINSCREEN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText(r1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AvailableFancyNumberStatus.K1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AvailableFancyNumberStatus.L1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void x1(AvailableFancyNumberStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void y1(AvailableFancyNumberStatus this$0, VahanStateModle vahanStateModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s1().dismiss();
        Log.e("got state", vahanStateModle.toString());
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            Intrinsics.checkNotNull(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            this$0.q1().g.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void z1(AvailableFancyNumberStatus this$0, RtoNameModle rtoNameModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s1().dismiss();
        try {
            RtoNameModleItem rtoNameModleItem = new RtoNameModleItem("0", "0", "0", "0", "0", "0", "Select RTO", "0", "0", "0", "0", "0", "0");
            Intrinsics.checkNotNull(rtoNameModle);
            rtoNameModle.add(0, rtoNameModleItem);
            try {
                this$0.H1(new RtoNameModleItem("0", "0", "0", "0", "0", "0", "Select RTO", "0", "0", "0", "0", "0", "0").getState_cd());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this$0.q1().e.setAdapter((SpinnerAdapter) new ra7(this$0, rtoNameModle));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void B1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.back_image = imageView;
    }

    public final void C1(s6 s6Var) {
        Intrinsics.checkNotNullParameter(s6Var, "<set-?>");
        this.binding = s6Var;
    }

    public final void D1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void E1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void F1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void G1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void I1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final boolean M1() {
        if (q1().g.getSelectedItemPosition() == 0) {
            Toast.makeText(this, r1().b("label_log_sel_state", getString(R.string.please_selecr_State)), 0).show();
            return false;
        }
        if (q1().e.getSelectedItemPosition() != 0) {
            return true;
        }
        Toast.makeText(this, r1().b("select_rto", getString(R.string.please_select_rto)), 0).show();
        return false;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        s6 s6VarC = s6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(s6VarC, "inflate(...)");
        C1(s6VarC);
        setContentView(q1().b());
        F1(VahanProService.INSTANCE.a(this));
        View viewFindViewById = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        B1((ImageView) viewFindViewById);
        D1(new wa3(this));
        ta3.a.L(this, q1());
        q1().h.i.setText(getIntent().getStringExtra("ServiceName"));
        E1(new ProgressDialog(this));
        s1().setMessage(r1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        I1((ld7) new z(this, new kd7(new jd7(t1()))).a(ld7.class));
        this.retrofitServicefancy = AvailableFancyService.INSTANCE.a(this);
        AvailableFancyService availableFancyService = this.retrofitServicefancy;
        b20 b20Var = null;
        if (availableFancyService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitServicefancy");
            availableFancyService = null;
        }
        this.viewModelfancy = (b20) new z(this, new p10(new a20(availableFancyService))).a(b20.class);
        p1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AvailableFancyNumberStatus.x1(this.a, view);
            }
        });
        try {
            s1().show();
            w1().a1(this);
        } catch (Exception unused) {
        }
        w1().Z0().g(this, new mf4() { // from class: com.zepto.v10
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AvailableFancyNumberStatus.y1(this.a, (VahanStateModle) obj);
            }
        });
        Spinner spinner = q1().g;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a());
        }
        w1().i0().g(this, new mf4() { // from class: com.zepto.w10
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AvailableFancyNumberStatus.z1(this.a, (RtoNameModle) obj);
            }
        });
        Spinner spinner2 = q1().e;
        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener(new b());
        }
        b20 b20Var2 = this.viewModelfancy;
        if (b20Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelfancy");
        } else {
            b20Var = b20Var2;
        }
        b20Var.h().g(this, new e(new c()));
        w1().I().g(this, new e(new d()));
        q1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                AvailableFancyNumberStatus.A1(this.a, view);
            }
        });
    }

    public final ImageView p1() {
        ImageView imageView = this.back_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("back_image");
        return null;
    }

    public final s6 q1() {
        s6 s6Var = this.binding;
        if (s6Var != null) {
            return s6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 r1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final VahanProService t1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final String u1() {
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    public final String v1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    public final ld7 w1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
