package com.nic.mparivahan.AddCov.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.AddCov.AddCovInterface;
import com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails;
import com.nic.mparivahan.AddCov.PojoClass.CovDataSubmit;
import com.nic.mparivahan.AddCov.View.CovList;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.zepto.mf4;
import com.zepto.pi;
import com.zepto.pq;
import com.zepto.qi;
import com.zepto.ri;
import com.zepto.ta3;
import com.zepto.u8;
import com.zepto.wa3;
import com.zepto.wl5;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bT\u0010UJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0002J \u0010\u0013\u001a\u00020\u00052\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0010j\b\u0012\u0004\u0012\u00020\u0003`\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0002R2\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0010j\b\u0012\u0004\u0012\u00020\u0003`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0010j\b\u0012\u0004\u0012\u00020\u0003`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R&\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0010j\b\u0012\u0004\u0012\u00020\u0003`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\"\u0010;\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006V"}, d2 = {"Lcom/nic/mparivahan/AddCov/View/CovList;", "Lcom/zepto/pq;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "", "message", "", "B1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/widget/CompoundButton;", "buttonView", "", "isChecked", "onCheckedChanged", "u1", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "serviceClass", "K1", "H1", "J1", "C", "Ljava/util/ArrayList;", "getReqTrans", "()Ljava/util/ArrayList;", "setReqTrans", "(Ljava/util/ArrayList;)V", "reqTrans", "D", "selectedServiceId", "E", "selectedServiceClass", "Lcom/zepto/u8;", "F", "Lcom/zepto/u8;", "binding", "Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "G", "Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "q1", "()Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "E1", "(Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;)V", "mApplStatusDetails", "Lcom/zepto/qi;", "H", "Lcom/zepto/qi;", "mAddCovModel", "Lcom/nic/mparivahan/AddCov/AddCovInterface;", "I", "Lcom/nic/mparivahan/AddCov/AddCovInterface;", "mAddCovInterface", "J", "Ljava/lang/String;", "r1", "()Ljava/lang/String;", "F1", "(Ljava/lang/String;)V", "newdob", "K", "p1", "D1", "app", "Lcom/zepto/wl5;", "L", "Lcom/zepto/wl5;", "s1", "()Lcom/zepto/wl5;", "G1", "(Lcom/zepto/wl5;)V", "sahi_session", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "I1", "(Lcom/zepto/wa3;)V", "session", "Landroid/app/ProgressDialog;", "N", "Landroid/app/ProgressDialog;", "dialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CovList extends pq implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ArrayList reqTrans = new ArrayList();

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ArrayList selectedServiceId = new ArrayList();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ArrayList selectedServiceClass = new ArrayList();

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public u8 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ApplStatusDetails mApplStatusDetails;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public qi mAddCovModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public AddCovInterface mAddCovInterface;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String newdob;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String app;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wl5 sahi_session;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ProgressDialog dialog;

    public static final void A1(CovList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void B1(String message) {
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
        textView.setText(t1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(t1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(t1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovList.C1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void C1(Dialog d, CovList this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void v1(CovList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void w1(CovList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void x1(CovList this$0, View view) {
        qi qiVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList arrayList = this$0.selectedServiceClass;
        if (arrayList == null || arrayList.isEmpty() || this$0.selectedServiceClass.size() < 1) {
            Toast.makeText(this$0, "Please Select Vehicle Class", 1).show();
            return;
        }
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        qi qiVar2 = this$0.mAddCovModel;
        if (qiVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddCovModel");
            qiVar = null;
        } else {
            qiVar = qiVar2;
        }
        qiVar.i(this$0, this$0.p1(), this$0.r1(), this$0.s1().n(), this$0.selectedServiceClass);
    }

    public static final void y1(CovList this$0, CovDataSubmit covDataSubmit) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        try {
            if (Intrinsics.areEqual(covDataSubmit.getStatus_code(), "01")) {
                this$0.B1(covDataSubmit.getStatus_desc());
            } else {
                Toast.makeText(this$0, covDataSubmit.getStatus_desc(), 1).show();
            }
        } catch (Exception unused) {
            Toast.makeText(this$0, "Service temporarily unavailable, Please try again later.", 0).show();
        }
    }

    public static final void z1(CovList this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        Toast.makeText(this$0, "Service temporarily unavailable, Please try again later.", 0).show();
    }

    public final void D1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app = str;
    }

    public final void E1(ApplStatusDetails applStatusDetails) {
        Intrinsics.checkNotNullParameter(applStatusDetails, "<set-?>");
        this.mApplStatusDetails = applStatusDetails;
    }

    public final void F1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newdob = str;
    }

    public final void G1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sahi_session = wl5Var;
    }

    public final void H1() {
        u8 u8Var = this.binding;
        if (u8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u8Var = null;
        }
        u8Var.Z.removeAllViews();
        int size = this.selectedServiceClass.size();
        for (int i = 0; i < size; i++) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            TextView textView = new TextView(this);
            textView.setPadding(16, 5, 16, 5);
            textView.setTextColor(getColor(R.color.black));
            textView.setTextSize(16.0f);
            textView.setText((CharSequence) this.selectedServiceClass.get(i));
            linearLayout.addView(textView);
            u8 u8Var2 = this.binding;
            if (u8Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                u8Var2 = null;
            }
            u8Var2.Z.addView(linearLayout);
        }
    }

    public final void I1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void J1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, "Select");
        int size = this.selectedServiceClass.size();
        for (int i = 0; i < size; i++) {
            arrayList.addAll(CollectionsKt__CollectionsJVMKt.listOf(this.selectedServiceClass.get(i)));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        u8 u8Var = this.binding;
        if (u8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u8Var = null;
        }
        u8Var.j0.setAdapter((SpinnerAdapter) arrayAdapter);
    }

    public final void K1(ArrayList serviceClass) {
        int size = serviceClass.size();
        for (int i = 0; i < size; i++) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            CheckBox checkBox = new CheckBox(this);
            checkBox.setOnCheckedChangeListener(this);
            checkBox.setText((CharSequence) serviceClass.get(i));
            linearLayout.addView(checkBox);
            u8 u8Var = this.binding;
            if (u8Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                u8Var = null;
            }
            u8Var.X.addView(linearLayout);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        ArrayList arrayList = this.selectedServiceId;
        Intrinsics.checkNotNull(buttonView);
        if (arrayList.contains(buttonView.getText().toString())) {
            this.selectedServiceId.remove(buttonView.getText().toString());
            buttonView.getText().toString();
            this.selectedServiceClass.remove(buttonView.getText().toString());
        } else {
            this.selectedServiceId.add(buttonView.getText().toString());
            this.selectedServiceClass.add(buttonView.getText().toString());
        }
        u8 u8Var = null;
        if (this.selectedServiceClass.size() <= 0) {
            u8 u8Var2 = this.binding;
            if (u8Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                u8Var2 = null;
            }
            u8Var2.Z.setVisibility(8);
            u8 u8Var3 = this.binding;
            if (u8Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                u8Var = u8Var3;
            }
            u8Var.a0.setVisibility(8);
            return;
        }
        u8 u8Var4 = this.binding;
        if (u8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u8Var4 = null;
        }
        u8Var4.a0.setVisibility(0);
        u8 u8Var5 = this.binding;
        if (u8Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            u8Var = u8Var5;
        }
        u8Var.Z.setVisibility(0);
        J1();
        H1();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        u8 u8VarX = u8.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(u8VarX, "inflate(...)");
        this.binding = u8VarX;
        u8 u8Var = null;
        if (u8VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u8VarX = null;
        }
        setContentView(u8VarX.m());
        u1();
        ta3.a aVar = ta3.a;
        u8 u8Var2 = this.binding;
        if (u8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u8Var2 = null;
        }
        aVar.u(this, u8Var2);
        u8 u8Var3 = this.binding;
        if (u8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u8Var3 = null;
        }
        u8Var3.S.g.setText(s1().k());
        u8 u8Var4 = this.binding;
        if (u8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u8Var4 = null;
        }
        u8Var4.S.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovList.v1(this.a, view);
            }
        });
        if (getIntent() != null) {
            F1(String.valueOf(getIntent().getStringExtra("newdob")));
            D1(String.valueOf(getIntent().getStringExtra("app_number")));
            Serializable serializableExtra = getIntent().getSerializableExtra("ApplStatusDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails");
            E1((ApplStatusDetails) serializableExtra);
            try {
                String selectedCovs = q1().getSelectedCovs();
                if (selectedCovs == null || selectedCovs.length() == 0) {
                    u8 u8Var5 = this.binding;
                    if (u8Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        u8Var5 = null;
                    }
                    u8Var5.Y.setText("NA");
                } else {
                    u8 u8Var6 = this.binding;
                    if (u8Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        u8Var6 = null;
                    }
                    u8Var6.Y.setText(q1().getSelectedCovs());
                }
            } catch (Exception unused) {
                u8 u8Var7 = this.binding;
                if (u8Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    u8Var7 = null;
                }
                u8Var7.Y.setText("NA");
            }
        }
        u8 u8Var8 = this.binding;
        if (u8Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u8Var8 = null;
        }
        u8Var8.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovList.w1(this.a, view);
            }
        });
        K1(q1().getEligiblecovs_EnableMode());
        u8 u8Var9 = this.binding;
        if (u8Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u8Var9 = null;
        }
        u8Var9.T.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovList.x1(this.a, view);
            }
        });
        qi qiVar = this.mAddCovModel;
        if (qiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddCovModel");
            qiVar = null;
        }
        qiVar.o().g(this, new mf4() { // from class: com.zepto.a11
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CovList.y1(this.a, (CovDataSubmit) obj);
            }
        });
        qi qiVar2 = this.mAddCovModel;
        if (qiVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddCovModel");
            qiVar2 = null;
        }
        qiVar2.m().g(this, new mf4() { // from class: com.zepto.b11
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CovList.z1(this.a, (String) obj);
            }
        });
        u8 u8Var10 = this.binding;
        if (u8Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            u8Var = u8Var10;
        }
        u8Var.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovList.A1(this.a, view);
            }
        });
    }

    public final String p1() {
        String str = this.app;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("app");
        return null;
    }

    public final ApplStatusDetails q1() {
        ApplStatusDetails applStatusDetails = this.mApplStatusDetails;
        if (applStatusDetails != null) {
            return applStatusDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mApplStatusDetails");
        return null;
    }

    public final String r1() {
        String str = this.newdob;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newdob");
        return null;
    }

    public final wl5 s1() {
        wl5 wl5Var = this.sahi_session;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sahi_session");
        return null;
    }

    public final wa3 t1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void u1() {
        G1(new wl5(this));
        I1(new wa3(this));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(t1().b("label_challan_please_wait", "Please wait..."));
        this.mAddCovInterface = AddCovInterface.INSTANCE.a(this);
        AddCovInterface addCovInterface = this.mAddCovInterface;
        if (addCovInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddCovInterface");
            addCovInterface = null;
        }
        this.mAddCovModel = (qi) new z(this, new pi(new ri(addCovInterface))).a(qi.class);
    }
}
