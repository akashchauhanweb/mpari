package com.nic.mparivahan.Checkpost;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Checkpost.DownloadCheckPostReceipt2;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptServices.CheckpostTaxReceiptServices;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.DownloadCheckpostTaxReceiptList;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.db;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.tj0;
import com.zepto.uj0;
import com.zepto.vj0;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bD\u0010EJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/nic/mparivahan/Checkpost/DownloadCheckPostReceipt2;", "Lcom/zepto/pq;", "", "it", "", "D1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/db;", "C", "Lcom/zepto/db;", "o1", "()Lcom/zepto/db;", "x1", "(Lcom/zepto/db;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "t1", "()Lcom/zepto/ld7;", "C1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "r1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "A1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "q1", "()Landroid/app/ProgressDialog;", "z1", "(Landroid/app/ProgressDialog;)V", "pDialog", "G", "Ljava/lang/String;", "getOff_code", "()Ljava/lang/String;", "setOff_code", "(Ljava/lang/String;)V", "off_code", "H", "s1", "B1", "stateCode", "Lcom/nic/mparivahan/VahanServices/Checkpost/CheckpostTaxReceipt/CheckpostTaxReceiptServices/CheckpostTaxReceiptServices;", "I", "Lcom/nic/mparivahan/VahanServices/Checkpost/CheckpostTaxReceipt/CheckpostTaxReceiptServices/CheckpostTaxReceiptServices;", "retrofitServicetax", "Lcom/zepto/vj0;", "J", "Lcom/zepto/vj0;", "viewModeltax", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "p1", "()Lcom/zepto/wa3;", "y1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DownloadCheckPostReceipt2 extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public db binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String off_code = "0";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public CheckpostTaxReceiptServices retrofitServicetax;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public vj0 viewModeltax;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 langSession;

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
            if (!str.equals("SUCCESS")) {
                DownloadCheckPostReceipt2.this.D1(str);
                return;
            }
            Intent intent = new Intent(DownloadCheckPostReceipt2.this, (Class<?>) DownloadCheckpostTaxReceiptList.class);
            intent.putExtra("stateCode", DownloadCheckPostReceipt2.this.s1());
            intent.putExtra("regNo", String.valueOf(DownloadCheckPostReceipt2.this.o1().k.getText()));
            DownloadCheckPostReceipt2.this.startActivity(intent);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(String it) {
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
        textView.setText(p1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadCheckPostReceipt2.E1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadCheckPostReceipt2.F1(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void E1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void F1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void u1(DownloadCheckPostReceipt2 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void v1(DownloadCheckPostReceipt2 this$0, VahanStateModle vahanStateModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q1().dismiss();
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
            this$0.o1().i.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void w1(DownloadCheckPostReceipt2 this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.o1().i.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.p1().b("label_log_sel_state", this$0.getString(R.string.please_selecr_State)), 1).show();
            return;
        }
        Editable text = this$0.o1().k.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() < 2) {
            Toast.makeText(this$0, this$0.p1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)), 1).show();
            return;
        }
        Object selectedItem = this$0.o1().i.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
        ArrayList arrayList = (ArrayList) selectedItem;
        Object obj = arrayList.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        Log.e("stateInfo2", (String) obj);
        Object obj2 = arrayList.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        this$0.B1((String) obj2);
        Log.e("statertoinfo", this$0.s1());
        vj0 vj0Var = this$0.viewModeltax;
        if (vj0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModeltax");
            vj0Var = null;
        }
        vj0Var.i(this$0.s1(), String.valueOf(this$0.o1().k.getText()));
    }

    public final void A1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void B1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void C1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final db o1() {
        db dbVar = this.binding;
        if (dbVar != null) {
            return dbVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db dbVarC = db.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(dbVarC, "inflate(...)");
        x1(dbVarC);
        setContentView(o1().b());
        o1().b.i.setText("Download Checkpost Tax Receipt");
        A1(VahanProService.INSTANCE.a(this));
        y1(new wa3(this));
        ta3.a.C0(this, o1());
        z1(new ProgressDialog(this));
        q1().setMessage("Please wait...");
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        o1().b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadCheckPostReceipt2.u1(this.a, view);
            }
        });
        C1((ld7) new z(this, new kd7(new jd7(r1()))).a(ld7.class));
        this.retrofitServicetax = CheckpostTaxReceiptServices.INSTANCE.a(this);
        CheckpostTaxReceiptServices checkpostTaxReceiptServices = this.retrofitServicetax;
        vj0 vj0Var = null;
        if (checkpostTaxReceiptServices == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitServicetax");
            checkpostTaxReceiptServices = null;
        }
        this.viewModeltax = (vj0) new z(this, new tj0(new uj0(checkpostTaxReceiptServices))).a(vj0.class);
        try {
            q1().show();
            t1().a1(this);
        } catch (Exception unused) {
        }
        t1().Z0().g(this, new mf4() { // from class: com.zepto.wu1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DownloadCheckPostReceipt2.v1(this.a, (VahanStateModle) obj);
            }
        });
        vj0 vj0Var2 = this.viewModeltax;
        if (vj0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModeltax");
        } else {
            vj0Var = vj0Var2;
        }
        vj0Var.h().g(this, new b(new a()));
        o1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                DownloadCheckPostReceipt2.w1(this.a, view);
            }
        });
    }

    public final wa3 p1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final VahanProService r1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final String s1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    public final ld7 t1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void x1(db dbVar) {
        Intrinsics.checkNotNullParameter(dbVar, "<set-?>");
        this.binding = dbVar;
    }

    public final void y1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void z1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }
}
