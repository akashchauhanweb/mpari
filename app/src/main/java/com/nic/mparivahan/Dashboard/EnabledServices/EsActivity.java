package com.nic.mparivahan.Dashboard.EnabledServices;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.nic.mparivahan.Dashboard.EnabledServices.EsActivity;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.R;
import com.nic.mparivahan.a;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.uy1;
import com.zepto.vy1;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xy1;
import com.zepto.y32;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bQ\u0010RJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010\u001f\u001a\u0004\bN\u0010!\"\u0004\bO\u0010#¨\u0006S"}, d2 = {"Lcom/nic/mparivahan/Dashboard/EnabledServices/EsActivity;", "Lcom/zepto/pq;", "", "message", "", "w1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/xy1;", "C", "Lcom/zepto/xy1;", "o1", "()Lcom/zepto/xy1;", "B1", "(Lcom/zepto/xy1;)V", "mESViewModel", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "D", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "mESInterface", "Landroidx/recyclerview/widget/RecyclerView;", "E", "Landroidx/recyclerview/widget/RecyclerView;", "s1", "()Landroidx/recyclerview/widget/RecyclerView;", "F1", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerView", "Landroid/widget/TextView;", "F", "Landroid/widget/TextView;", "m1", "()Landroid/widget/TextView;", "z1", "(Landroid/widget/TextView;)V", "lableService", "Landroid/content/Context;", "G", "Landroid/content/Context;", "n1", "()Landroid/content/Context;", "A1", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/ws6;", "H", "Lcom/zepto/ws6;", "getSessionManager", "()Lcom/zepto/ws6;", "G1", "(Lcom/zepto/ws6;)V", "sessionManager", "Landroid/widget/LinearLayout;", "I", "Landroid/widget/LinearLayout;", "q1", "()Landroid/widget/LinearLayout;", "D1", "(Landroid/widget/LinearLayout;)V", "nexgenarrow", "Landroid/widget/ProgressBar;", "J", "Landroid/widget/ProgressBar;", "r1", "()Landroid/widget/ProgressBar;", "E1", "(Landroid/widget/ProgressBar;)V", "pb_es", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "p1", "()Lcom/zepto/wa3;", "C1", "(Lcom/zepto/wa3;)V", "mLanguageKeySession", "L", "getDl_related_service", "y1", "dl_related_service", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class EsActivity extends pq {

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
    public ProgressBar pb_es;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 mLanguageKeySession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView dl_related_service;

    public static final void t1(EsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void u1(EsActivity this$0, EnableServiceResponse enableServiceResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.r1().setVisibility(8);
            if (!StringsKt__StringsJVMKt.equals(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                this$0.w1(enableServiceResponse.getStatusDesc());
                return;
            }
            ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
            this$0.s1().setLayoutManager(new GridLayoutManager(this$0.n1(), 4));
            this$0.s1().setAdapter(new y32(enabledservice, this$0.n1(), String.valueOf(this$0.getIntent().getStringExtra("state_code"))));
            ArrayList arrayList = new ArrayList();
            int size = enabledservice.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(enabledservice.get(i).getServCode());
            }
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this$0.getApplicationContext()).edit();
            editorEdit.putString("enabledServiceList", new Gson().toJson(arrayList));
            editorEdit.commit();
        } catch (Exception unused) {
            this$0.r1().setVisibility(8);
            this$0.w1(this$0.p1().b("no_details", this$0.getString(R.string.no_Details_are_avail)));
        }
    }

    public static final void v1(EsActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1().setVisibility(8);
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EsActivity.x1(dialog, view);
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

    public final void E1(ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.pb_es = progressBar;
    }

    public final void F1(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerView = recyclerView;
    }

    public final void G1(ws6 ws6Var) {
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
        setContentView(R.layout.activity_es);
        A1(this);
        G1(new ws6(n1()));
        C1(new wa3(n1()));
        this.mESInterface = ESInterface.INSTANCE.a(n1());
        View viewFindViewById = findViewById(R.id.es_sarathi_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        F1((RecyclerView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.lableService);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        z1((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        D1((LinearLayout) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.pb_es);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        E1((ProgressBar) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.dl_related_service);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        y1((TextView) viewFindViewById5);
        m1().setText(p1().b("label_driving_licence_related", "Driving Licence Related Services"));
        q1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EsActivity.t1(this.a, view);
            }
        });
        ESInterface eSInterface = this.mESInterface;
        if (eSInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mESInterface");
            eSInterface = null;
        }
        B1((xy1) new z(this, new uy1(new vy1(eSInterface))).a(xy1.class));
        if (a.a.a(this)) {
            r1().setVisibility(0);
            o1().h(String.valueOf(getIntent().getStringExtra("state_code")));
        } else {
            r1().setVisibility(8);
            Toast.makeText(getApplicationContext(), p1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
        o1().m().g(this, new mf4() { // from class: com.zepto.d32
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                EsActivity.u1(this.a, (EnableServiceResponse) obj);
            }
        });
        o1().p().g(this, new mf4() { // from class: com.zepto.e32
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                EsActivity.v1(this.a, (String) obj);
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

    public final ProgressBar r1() {
        ProgressBar progressBar = this.pb_es;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pb_es");
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

    public final void y1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dl_related_service = textView;
    }

    public final void z1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.lableService = textView;
    }
}
