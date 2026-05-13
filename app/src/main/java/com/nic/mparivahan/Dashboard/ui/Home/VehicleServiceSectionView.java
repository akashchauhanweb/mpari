package com.nic.mparivahan.Dashboard.ui.Home;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Dashboard.ui.Home.VehicleServiceSectionView;
import com.nic.mparivahan.R;
import com.zepto.i42;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.uy1;
import com.zepto.vy1;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xy1;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bL\u0010MJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\u001e\u0010\n\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u0006\u0010\u000b\u001a\u00020\u0004R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R2\u0010G\u001a\u0012\u0012\u0004\u0012\u00020@0\u0006j\b\u0012\u0004\u0012\u00020@`\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FRR\u0010K\u001a2\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u0006j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b`\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010F¨\u0006N"}, d2 = {"Lcom/nic/mparivahan/Dashboard/ui/Home/VehicleServiceSectionView;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Dashboard/EnabledServices/PojoClasses/Enabledservice;", "Lkotlin/collections/ArrayList;", "mList", "z1", "t1", "Landroid/widget/TextView;", "C", "Landroid/widget/TextView;", "l1", "()Landroid/widget/TextView;", "u1", "(Landroid/widget/TextView;)V", "lable", "Landroid/widget/LinearLayout;", "D", "Landroid/widget/LinearLayout;", "n1", "()Landroid/widget/LinearLayout;", "w1", "(Landroid/widget/LinearLayout;)V", "nexgenarrow", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "o1", "()Landroid/app/ProgressDialog;", "x1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroidx/recyclerview/widget/RecyclerView;", "F", "Landroidx/recyclerview/widget/RecyclerView;", "p1", "()Landroidx/recyclerview/widget/RecyclerView;", "y1", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerView_vahan", "Lcom/zepto/ws6;", "G", "Lcom/zepto/ws6;", "getSessionManager", "()Lcom/zepto/ws6;", "A1", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/xy1;", "H", "Lcom/zepto/xy1;", "m1", "()Lcom/zepto/xy1;", "v1", "(Lcom/zepto/xy1;)V", "mESViewModel", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "I", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "mESInterface", "", "J", "Ljava/util/ArrayList;", "getSecion", "()Ljava/util/ArrayList;", "setSecion", "(Ljava/util/ArrayList;)V", "secion", "K", "getSectionList", "setSectionList", "sectionList", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VehicleServiceSectionView extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public TextView lable;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public LinearLayout nexgenarrow;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public RecyclerView recyclerView_vahan;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public xy1 mESViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ESInterface mESInterface;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ArrayList secion = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList sectionList = new ArrayList();

    public static final void q1(VehicleServiceSectionView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void r1(VehicleServiceSectionView this$0, EnableServiceResponse enableServiceResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.o1().dismiss();
            ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
            Collections.sort(enabledservice);
            this$0.z1(enabledservice);
        } catch (Exception unused) {
            this$0.o1().dismiss();
        }
    }

    public static final void s1(VehicleServiceSectionView this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.o1().dismiss();
        } catch (Exception unused) {
        }
    }

    public final void A1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final TextView l1() {
        TextView textView = this.lable;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lable");
        return null;
    }

    public final xy1 m1() {
        xy1 xy1Var = this.mESViewModel;
        if (xy1Var != null) {
            return xy1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mESViewModel");
        return null;
    }

    public final LinearLayout n1() {
        LinearLayout linearLayout = this.nexgenarrow;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexgenarrow");
        return null;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sectionview);
        this.mESInterface = ESInterface.INSTANCE.a(this);
        View viewFindViewById = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        w1((LinearLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.lableService);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        u1((TextView) viewFindViewById2);
        l1().setText(new wa3(this).b("label_vehicle_related", getString(R.string.vehicle_related_service)));
        View viewFindViewById3 = findViewById(R.id.es_vahan_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        y1((RecyclerView) viewFindViewById3);
        t1();
        x1(new ProgressDialog(this));
        o1().setMessage("Please wait...");
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        A1(new ws6(this));
        n1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceSectionView.q1(this.a, view);
            }
        });
        ESInterface eSInterface = this.mESInterface;
        if (eSInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mESInterface");
            eSInterface = null;
        }
        v1((xy1) new z(this, new uy1(new vy1(eSInterface))).a(xy1.class));
        o1().show();
        m1().i(String.valueOf(getIntent().getStringExtra("state_code")));
        m1().s().g(this, new mf4() { // from class: com.zepto.kn7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VehicleServiceSectionView.r1(this.a, (EnableServiceResponse) obj);
            }
        });
        m1().v().g(this, new mf4() { // from class: com.zepto.ln7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VehicleServiceSectionView.s1(this.a, (String) obj);
            }
        });
    }

    public final RecyclerView p1() {
        RecyclerView recyclerView = this.recyclerView_vahan;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerView_vahan");
        return null;
    }

    public final void t1() {
        for (int i = 0; i < 4; i++) {
            this.secion.add(Integer.valueOf(i));
        }
    }

    public final void u1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.lable = textView;
    }

    public final void v1(xy1 xy1Var) {
        Intrinsics.checkNotNullParameter(xy1Var, "<set-?>");
        this.mESViewModel = xy1Var;
    }

    public final void w1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nexgenarrow = linearLayout;
    }

    public final void x1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void y1(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerView_vahan = recyclerView;
    }

    public final void z1(ArrayList mList) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        int size = this.secion.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            int size2 = mList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Integer num = (Integer) this.secion.get(i);
                int servSection = ((Enabledservice) mList.get(i2)).getServSection();
                if (num != null && num.intValue() == servSection) {
                    arrayList.add(mList.get(i2));
                }
            }
            if (arrayList.size() > 0) {
                this.sectionList.add(arrayList);
            }
        }
        p1().setLayoutManager(new LinearLayoutManager(this));
        p1().setAdapter(new i42(this.sectionList, this, String.valueOf(getIntent().getStringExtra("state_code"))));
    }
}
