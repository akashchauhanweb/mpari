package com.nic.mparivahan.VahanServices.FancyServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusModel.AuctionStatusModel;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusModel.Data;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusServices.AuctionStatusRetrofitServices;
import com.zepto.mf4;
import com.zepto.mz;
import com.zepto.nz;
import com.zepto.oz;
import com.zepto.pq;
import com.zepto.q6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yy0;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\r\u001a\u00020\u0002H\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusActivity;", "Lcom/zepto/pq;", "", "w1", "", "K1", "B1", "", "it", "H1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "o1", "Lcom/zepto/q6;", "C", "Lcom/zepto/q6;", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "u1", "()Landroid/app/ProgressDialog;", "F1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusServices/AuctionStatusRetrofitServices;", "E", "Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusServices/AuctionStatusRetrofitServices;", "v1", "()Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusServices/AuctionStatusRetrofitServices;", "G1", "(Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusServices/AuctionStatusRetrofitServices;)V", "retrofitService", "Lcom/zepto/oz;", "F", "Lcom/zepto/oz;", "r1", "()Lcom/zepto/oz;", "C1", "(Lcom/zepto/oz;)V", "auctionViewModle", "G", "Ljava/lang/String;", "digit", "Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusModel/AuctionStatusModel;", "H", "Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusModel/AuctionStatusModel;", "s1", "()Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusModel/AuctionStatusModel;", "D1", "(Lcom/nic/mparivahan/VahanServices/FancyServices/AuctionStatusModel/AuctionStatusModel;)V", "checkObj", "Lcom/zepto/wa3;", "I", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "E1", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AuctionStatusActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public q6 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public AuctionStatusRetrofitServices retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public oz auctionViewModle;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public AuctionStatusModel checkObj;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wa3 languageSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(AuctionStatusModel auctionStatusModel) {
            try {
                AuctionStatusActivity auctionStatusActivity = AuctionStatusActivity.this;
                Intrinsics.checkNotNull(auctionStatusModel);
                auctionStatusActivity.D1(auctionStatusModel);
                AuctionStatusActivity.this.u1().dismiss();
                AuctionStatusActivity.this.o1();
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AuctionStatusModel) obj);
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
            AuctionStatusActivity.this.u1().dismiss();
            AuctionStatusActivity.this.H1(str.toString());
            Log.e("CallingError", str);
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

    public static final void A1(AuctionStatusActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void B1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(String it) {
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
        textView.setText(t1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuctionStatusActivity.I1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuctionStatusActivity.J1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final boolean K1() throws JSONException {
        u1().show();
        q6 q6Var = this.binding;
        q6 q6Var2 = null;
        if (q6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q6Var = null;
        }
        Editable text = q6Var.h.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() != 0) {
            oz ozVarR1 = r1();
            q6 q6Var3 = this.binding;
            if (q6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                q6Var2 = q6Var3;
            }
            Editable text2 = q6Var2.h.getText();
            Intrinsics.checkNotNull(text2);
            ozVarR1.i(text2.toString());
            return true;
        }
        q6 q6Var4 = this.binding;
        if (q6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q6Var4 = null;
        }
        q6Var4.h.setError(t1().b("please_enter_ack_no", getString(R.string.please_enter_ack_no)));
        q6 q6Var5 = this.binding;
        if (q6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q6Var2 = q6Var5;
        }
        q6Var2.h.requestFocus();
        u1().dismiss();
        return false;
    }

    private final void w1() {
        try {
            getIntent();
        } catch (Exception unused) {
        }
        q6 q6Var = this.binding;
        q6 q6Var2 = null;
        if (q6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q6Var = null;
        }
        q6Var.c.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuctionStatusActivity.x1(this.a, view);
            }
        });
        q6 q6Var3 = this.binding;
        if (q6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q6Var3 = null;
        }
        q6Var3.c.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuctionStatusActivity.y1(this.a, view);
            }
        });
        q6 q6Var4 = this.binding;
        if (q6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q6Var4 = null;
        }
        q6Var4.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuctionStatusActivity.z1(this.a, view);
            }
        });
        q6 q6Var5 = this.binding;
        if (q6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q6Var5 = null;
        }
        q6Var5.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuctionStatusActivity.A1(this.a, view);
            }
        });
        q6 q6Var6 = this.binding;
        if (q6Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q6Var6 = null;
        }
        q6Var6.h.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        q6 q6Var7 = this.binding;
        if (q6Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q6Var2 = q6Var7;
        }
        q6Var2.h.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
    }

    public static final void x1(AuctionStatusActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1();
    }

    public static final void y1(AuctionStatusActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void z1(AuctionStatusActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.K1()) {
            AuctionStatusModel auctionStatusModelS1 = this$0.s1();
            String message = auctionStatusModelS1 != null ? auctionStatusModelS1.getMessage() : null;
            Intrinsics.checkNotNull(message);
            Log.e("auctionRespo02", message);
        }
    }

    public final void C1(oz ozVar) {
        Intrinsics.checkNotNullParameter(ozVar, "<set-?>");
        this.auctionViewModle = ozVar;
    }

    public final void D1(AuctionStatusModel auctionStatusModel) {
        Intrinsics.checkNotNullParameter(auctionStatusModel, "<set-?>");
        this.checkObj = auctionStatusModel;
    }

    public final void E1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void F1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void G1(AuctionStatusRetrofitServices auctionStatusRetrofitServices) {
        Intrinsics.checkNotNullParameter(auctionStatusRetrofitServices, "<set-?>");
        this.retrofitService = auctionStatusRetrofitServices;
    }

    public final void o1() {
        Data data;
        Data data2;
        Data data3;
        Data data4;
        Data data5;
        Data data6;
        Data data7;
        Data data8;
        Data data9;
        Data data10;
        Data data11;
        Data data12;
        Data data13;
        Data data14;
        Data data15;
        AuctionStatusModel auctionStatusModelS1 = s1();
        String status = null;
        if (StringsKt__StringsJVMKt.equals$default(auctionStatusModelS1 != null ? auctionStatusModelS1.getMessage() : null, "Record found.", false, 2, null)) {
            Intent intent = new Intent(this, (Class<?>) AllocateStatusDetails.class);
            AuctionStatusModel auctionStatusModelS12 = s1();
            intent.putExtra("regno", (auctionStatusModelS12 == null || (data15 = auctionStatusModelS12.getData()) == null) ? null : data15.getRegn_no());
            AuctionStatusModel auctionStatusModelS13 = s1();
            intent.putExtra("ackNo", (auctionStatusModelS13 == null || (data14 = auctionStatusModelS13.getData()) == null) ? null : data14.getAck_no());
            AuctionStatusModel auctionStatusModelS14 = s1();
            intent.putExtra("recpno", (auctionStatusModelS14 == null || (data13 = auctionStatusModelS14.getData()) == null) ? null : data13.getRecp_no());
            AuctionStatusModel auctionStatusModelS15 = s1();
            intent.putExtra("ownerName", (auctionStatusModelS15 == null || (data12 = auctionStatusModelS15.getData()) == null) ? null : data12.getOwner_name());
            AuctionStatusModel auctionStatusModelS16 = s1();
            intent.putExtra("fatherName", (auctionStatusModelS16 == null || (data11 = auctionStatusModelS16.getData()) == null) ? null : data11.getFather_name());
            AuctionStatusModel auctionStatusModelS17 = s1();
            intent.putExtra("mobileNumber", (auctionStatusModelS17 == null || (data10 = auctionStatusModelS17.getData()) == null) ? null : data10.getMobile_no());
            AuctionStatusModel auctionStatusModelS18 = s1();
            intent.putExtra("address", (auctionStatusModelS18 == null || (data9 = auctionStatusModelS18.getData()) == null) ? null : data9.getAddress());
            AuctionStatusModel auctionStatusModelS19 = s1();
            intent.putExtra("pincode", (auctionStatusModelS19 == null || (data8 = auctionStatusModelS19.getData()) == null) ? null : data8.getPincode());
            AuctionStatusModel auctionStatusModelS110 = s1();
            intent.putExtra("state", (auctionStatusModelS110 == null || (data7 = auctionStatusModelS110.getData()) == null) ? null : data7.getState());
            AuctionStatusModel auctionStatusModelS111 = s1();
            intent.putExtra("rto", (auctionStatusModelS111 == null || (data6 = auctionStatusModelS111.getData()) == null) ? null : data6.getRto());
            AuctionStatusModel auctionStatusModelS112 = s1();
            intent.putExtra("reserve_amt", (auctionStatusModelS112 == null || (data5 = auctionStatusModelS112.getData()) == null) ? null : data5.getReserve_amt());
            AuctionStatusModel auctionStatusModelS113 = s1();
            intent.putExtra("auctionAmt", (auctionStatusModelS113 == null || (data4 = auctionStatusModelS113.getData()) == null) ? null : data4.getAuction_amt());
            AuctionStatusModel auctionStatusModelS114 = s1();
            intent.putExtra("bookingDate", (auctionStatusModelS114 == null || (data3 = auctionStatusModelS114.getData()) == null) ? null : data3.getOp_dt());
            AuctionStatusModel auctionStatusModelS115 = s1();
            intent.putExtra("allotmentType", (auctionStatusModelS115 == null || (data2 = auctionStatusModelS115.getData()) == null) ? null : data2.getAllotted_to());
            AuctionStatusModel auctionStatusModelS116 = s1();
            if (auctionStatusModelS116 != null && (data = auctionStatusModelS116.getData()) != null) {
                status = data.getStatus();
            }
            intent.putExtra("status", status);
            startActivity(intent);
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        q6 q6VarC = q6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(q6VarC, "inflate(...)");
        this.binding = q6VarC;
        q6 q6Var = null;
        if (q6VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q6VarC = null;
        }
        setContentView(q6VarC.b());
        E1(new wa3(this));
        ta3.a aVar = ta3.a;
        q6 q6Var2 = this.binding;
        if (q6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q6Var2 = null;
        }
        aVar.J(this, q6Var2);
        q6 q6Var3 = this.binding;
        if (q6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q6Var = q6Var3;
        }
        q6Var.c.i.setText(getIntent().getStringExtra("ServiceName"));
        F1(new ProgressDialog(this));
        u1().setMessage(t1().b("label_challan_please_wait", "Please wait..."));
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        G1(AuctionStatusRetrofitServices.INSTANCE.a(this));
        C1((oz) new z(this, new mz(new nz(v1()))).a(oz.class));
        D1(new AuctionStatusModel(new Data("", "", "", 0, "", "", "", "", "", "", "", "", 0, "", "", ""), "", ""));
        w1();
        r1().h().g(this, new c(new a()));
        r1().g().g(this, new c(new b()));
    }

    public final oz r1() {
        oz ozVar = this.auctionViewModle;
        if (ozVar != null) {
            return ozVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("auctionViewModle");
        return null;
    }

    public final AuctionStatusModel s1() {
        AuctionStatusModel auctionStatusModel = this.checkObj;
        if (auctionStatusModel != null) {
            return auctionStatusModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkObj");
        return null;
    }

    public final wa3 t1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final AuctionStatusRetrofitServices v1() {
        AuctionStatusRetrofitServices auctionStatusRetrofitServices = this.retrofitService;
        if (auctionStatusRetrofitServices != null) {
            return auctionStatusRetrofitServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }
}
