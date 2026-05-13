package com.nic.mparivahan.Dashboard;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Dashboard.EsSectionActivity;
import com.nic.mparivahan.R;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.uy1;
import com.zepto.vy1;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xy1;
import com.zepto.z32;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b_\u0010`J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u001e\u0010\r\u001a\u00020\u00042\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bJ\u0006\u0010\u000e\u001a\u00020\u0004R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR2\u0010R\u001a\u0012\u0012\u0004\u0012\u00020K0\tj\b\u0012\u0004\u0012\u00020K`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QRR\u0010V\u001a2\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\tj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006a"}, d2 = {"Lcom/nic/mparivahan/Dashboard/EsSectionActivity;", "Lcom/zepto/pq;", "", "message", "", "w1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Dashboard/EnabledServices/PojoClasses/Enabledservice;", "Lkotlin/collections/ArrayList;", "mList", "G1", "y1", "Lcom/zepto/xy1;", "C", "Lcom/zepto/xy1;", "o1", "()Lcom/zepto/xy1;", "B1", "(Lcom/zepto/xy1;)V", "mESViewModel", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "D", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "mESInterface", "Landroidx/recyclerview/widget/RecyclerView;", "E", "Landroidx/recyclerview/widget/RecyclerView;", "s1", "()Landroidx/recyclerview/widget/RecyclerView;", "F1", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerView", "Landroid/widget/TextView;", "F", "Landroid/widget/TextView;", "m1", "()Landroid/widget/TextView;", "z1", "(Landroid/widget/TextView;)V", "lableService", "Landroid/content/Context;", "G", "Landroid/content/Context;", "n1", "()Landroid/content/Context;", "A1", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/ws6;", "H", "Lcom/zepto/ws6;", "getSessionManager", "()Lcom/zepto/ws6;", "H1", "(Lcom/zepto/ws6;)V", "sessionManager", "Landroid/widget/LinearLayout;", "I", "Landroid/widget/LinearLayout;", "q1", "()Landroid/widget/LinearLayout;", "D1", "(Landroid/widget/LinearLayout;)V", "nexgenarrow", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "p1", "()Lcom/zepto/wa3;", "C1", "(Lcom/zepto/wa3;)V", "mLanguageKeySession", "", "K", "Ljava/util/ArrayList;", "getSecion", "()Ljava/util/ArrayList;", "setSecion", "(Ljava/util/ArrayList;)V", "secion", "L", "getSectionList", "setSectionList", "sectionList", "Landroid/app/ProgressDialog;", "M", "Landroid/app/ProgressDialog;", "r1", "()Landroid/app/ProgressDialog;", "E1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class EsSectionActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public xy1 mESViewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ESInterface mESInterface;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public RecyclerView recyclerView;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public TextView lableService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public LinearLayout nexgenarrow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 mLanguageKeySession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList secion = new ArrayList();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ArrayList sectionList = new ArrayList();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    public static final void t1(EsSectionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void u1(EsSectionActivity this$0, EnableServiceResponse enableServiceResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.r1().dismiss();
            if (!StringsKt__StringsJVMKt.equals(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                this$0.w1(enableServiceResponse.getStatusDesc());
                return;
            }
            ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
            Collections.sort(enabledservice);
            this$0.G1(enabledservice);
            ArrayList arrayList = new ArrayList();
            int size = enabledservice.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(enabledservice.get(i).getServCode());
            }
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this$0.getApplicationContext()).edit();
            editorEdit.putString("enabledServiceList", new Gson().toJson(arrayList));
            editorEdit.commit();
        } catch (Exception unused) {
            this$0.w1(this$0.p1().b("no_details", this$0.getString(R.string.no_Details_are_avail)));
        }
    }

    public static final void v1(EsSectionActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1().dismiss();
    }

    private final void w1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d42
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EsSectionActivity.x1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final void A1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void B1(xy1 xy1Var) {
        Intrinsics.checkNotNullParameter(xy1Var, "<set-?>");
        this.mESViewModel = xy1Var;
    }

    public final void C1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.mLanguageKeySession = wa3Var;
    }

    public final void D1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nexgenarrow = linearLayout;
    }

    public final void E1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void F1(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerView = recyclerView;
    }

    public final void G1(ArrayList mList) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        int size = this.secion.size();
        for (int i = 0; i < size; i++) {
            Log.e("Test", mList.toString());
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
                Log.e("Test", String.valueOf(i));
                this.sectionList.add(arrayList);
            }
        }
        s1().setLayoutManager(new LinearLayoutManager(n1()));
        s1().setAdapter(new z32(this.sectionList, n1(), String.valueOf(getIntent().getStringExtra("state_code"))));
    }

    public final void H1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final TextView m1() {
        TextView textView = this.lableService;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lableService");
        return null;
    }

    public final Context n1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final xy1 o1() {
        xy1 xy1Var = this.mESViewModel;
        if (xy1Var != null) {
            return xy1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mESViewModel");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sectionview);
        A1(this);
        H1(new ws6(n1()));
        C1(new wa3(n1()));
        this.mESInterface = ESInterface.INSTANCE.a(n1());
        View viewFindViewById = findViewById(R.id.es_vahan_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        F1((RecyclerView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.lableService);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        z1((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        D1((LinearLayout) viewFindViewById3);
        E1(new ProgressDialog(this));
        r1().setMessage("Please wait...");
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        y1();
        m1().setText(p1().b("label_driving_licence_related", "Driving Licence Related Services"));
        q1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a42
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EsSectionActivity.t1(this.a, view);
            }
        });
        ESInterface eSInterface = this.mESInterface;
        if (eSInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mESInterface");
            eSInterface = null;
        }
        B1((xy1) new z(this, new uy1(new vy1(eSInterface))).a(xy1.class));
        if (com.nic.mparivahan.a.a.a(this)) {
            r1().show();
            o1().h(String.valueOf(getIntent().getStringExtra("state_code")));
        } else {
            Toast.makeText(getApplicationContext(), p1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
        o1().m().g(this, new mf4() { // from class: com.zepto.b42
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                EsSectionActivity.u1(this.a, (EnableServiceResponse) obj);
            }
        });
        o1().p().g(this, new mf4() { // from class: com.zepto.c42
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                EsSectionActivity.v1(this.a, (String) obj);
            }
        });
    }

    public final wa3 p1() {
        wa3 wa3Var = this.mLanguageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLanguageKeySession");
        return null;
    }

    public final LinearLayout q1() {
        LinearLayout linearLayout = this.nexgenarrow;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexgenarrow");
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

    public final RecyclerView s1() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        return null;
    }

    public final void y1() {
        for (int i = 0; i < 5; i++) {
            this.secion.add(Integer.valueOf(i));
        }
    }

    public final void z1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.lableService = textView;
    }
}
