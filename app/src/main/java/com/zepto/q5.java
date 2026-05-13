package com.zepto;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.AccidentReportDetails;
import com.nic.mparivahan.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bW\u0010XJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R*\u0010\u001f\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010#\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010*\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010S\u001a\b\u0012\u0004\u0012\u00020L0K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006Y"}, d2 = {"Lcom/zepto/q5;", "Lcom/zepto/sf2;", "Landroid/os/Bundle;", "savedInstanceState", "", "C0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "G0", "view", "b1", "Landroid/content/Context;", "context", "", "message", "k2", "Lcom/zepto/tf2;", "d0", "Lcom/zepto/tf2;", "_binding", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "e0", "Ljava/util/Calendar;", "b2", "()Ljava/util/Calendar;", "setCal1", "(Ljava/util/Calendar;)V", "cal1", "f0", "a2", "setCal", "cal", "g0", "Landroid/content/Context;", "c2", "()Landroid/content/Context;", "m2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "h0", "Landroid/app/ProgressDialog;", "g2", "()Landroid/app/ProgressDialog;", "q2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ws6;", "i0", "Lcom/zepto/ws6;", "h2", "()Lcom/zepto/ws6;", "r2", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/vf4;", "j0", "Lcom/zepto/vf4;", "f2", "()Lcom/zepto/vf4;", "p2", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "k0", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "e2", "()Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "o2", "(Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;)V", "mOffenceInterface", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Citizen/Models/MparCitizenAccident;", "l0", "Ljava/util/ArrayList;", "d2", "()Ljava/util/ArrayList;", "n2", "(Ljava/util/ArrayList;)V", "mListVal", "Z1", "()Lcom/zepto/tf2;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class q5 extends sf2 {

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public tf2 _binding;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public Calendar cal1 = Calendar.getInstance();

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public vf4 mOffenceViewModel;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public OffenceInterface mOffenceInterface;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ArrayList mListVal;

    public static final class a implements View.OnClickListener {
        public final /* synthetic */ d b;

        public a(d dVar) {
            this.b = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            new DatePickerDialog(q5.this.c2(), this.b, q5.this.getCal().get(1), q5.this.getCal().get(2), q5.this.getCal().get(5)).show();
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ c b;

        public b(c cVar) {
            this.b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            new DatePickerDialog(q5.this.c2(), this.b, q5.this.getCal1().get(1), q5.this.getCal1().get(2), q5.this.getCal1().get(5)).show();
        }
    }

    public static final class c implements DatePickerDialog.OnDateSetListener {
        public c() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            q5.this.getCal().set(1, i);
            q5.this.getCal().set(2, i2);
            q5.this.getCal().set(5, i3);
            q5.this.Z1().b.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(q5.this.getCal().getTime()));
        }
    }

    public static final class d implements DatePickerDialog.OnDateSetListener {
        public d() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            q5.this.getCal().set(1, i);
            q5.this.getCal().set(2, i2);
            q5.this.getCal().set(5, i3);
            q5.this.Z1().c.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(q5.this.getCal().getTime()));
        }
    }

    public static final void i2(q5 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CharSequence text = this$0.Z1().c.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            yf2 yf2VarE1 = this$0.E1();
            Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
            this$0.k2(yf2VarE1, "Please enter start date");
            return;
        }
        CharSequence text2 = this$0.Z1().b.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            yf2 yf2VarE12 = this$0.E1();
            Intrinsics.checkNotNullExpressionValue(yf2VarE12, "requireActivity(...)");
            this$0.k2(yf2VarE12, "Please enter end date");
        } else {
            this$0.q2(new ProgressDialog(this$0.E1()));
            this$0.g2().setMessage("Please wait...");
            this$0.g2().setCancelable(false);
            this$0.g2().setCanceledOnTouchOutside(false);
            this$0.f2().h(this$0.h2().k(), this$0.Z1().c.getText().toString(), this$0.Z1().b.getText().toString());
        }
    }

    public static final void j2(q5 this$0, AccidentReportDetails accidentReportDetails) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.g2().dismiss();
            if (Intrinsics.areEqual(accidentReportDetails.getStatusDesc(), "Success")) {
                this$0.Z1().e.setLayoutManager(new LinearLayoutManager(this$0.E1()));
                this$0.Z1().e.setAdapter(null);
                this$0.n2(accidentReportDetails.getMparCitizenAccidents());
                CollectionsKt___CollectionsJvmKt.reverse(this$0.d2());
                this$0.Z1().e.setAdapter(new w3(this$0.d2(), this$0.c2()));
            } else {
                this$0.g2().dismiss();
                this$0.Z1().e.setAdapter(null);
                yf2 yf2VarE1 = this$0.E1();
                Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
                this$0.k2(yf2VarE1, accidentReportDetails.getStatusDesc());
            }
        } catch (Exception unused) {
            this$0.g2().dismiss();
            yf2 yf2VarE12 = this$0.E1();
            Intrinsics.checkNotNullExpressionValue(yf2VarE12, "requireActivity(...)");
            this$0.k2(yf2VarE12, "Something went wrong\nPlease try after some time!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    @Override // com.zepto.sf2
    public void C0(Bundle savedInstanceState) {
        super.C0(savedInstanceState);
    }

    @Override // com.zepto.sf2
    public View G0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = tf2.c(inflater, container, false);
        return Z1().b();
    }

    public final tf2 Z1() {
        tf2 tf2Var = this._binding;
        Intrinsics.checkNotNull(tf2Var);
        return tf2Var;
    }

    /* JADX INFO: renamed from: a2, reason: from getter */
    public final Calendar getCal() {
        return this.cal;
    }

    @Override // com.zepto.sf2
    public void b1(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        yf2 yf2VarE1 = E1();
        Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
        m2(yf2VarE1);
        r2(new ws6(E1()));
        o2(OffenceInterface.INSTANCE.a(c2()));
        Z1().c.setOnClickListener(new a(new d()));
        Z1().b.setOnClickListener(new b(new c()));
        p2((vf4) new androidx.lifecycle.z(this, new uf4(new of4(e2()))).a(vf4.class));
        Z1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q5.i2(this.a, view2);
            }
        });
        yf2 yf2VarN = n();
        if (yf2VarN != null) {
            f2().E().g(yf2VarN, new mf4() { // from class: com.zepto.o5
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    q5.j2(this.a, (AccidentReportDetails) obj);
                }
            });
        }
        super.b1(view, savedInstanceState);
    }

    /* JADX INFO: renamed from: b2, reason: from getter */
    public final Calendar getCal1() {
        return this.cal1;
    }

    public final Context c2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ArrayList d2() {
        ArrayList arrayList = this.mListVal;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mListVal");
        return null;
    }

    public final OffenceInterface e2() {
        OffenceInterface offenceInterface = this.mOffenceInterface;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
        return null;
    }

    public final vf4 f2() {
        vf4 vf4Var = this.mOffenceViewModel;
        if (vf4Var != null) {
            return vf4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceViewModel");
        return null;
    }

    public final ProgressDialog g2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final ws6 h2() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void k2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q5.l2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void m2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void n2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mListVal = arrayList;
    }

    public final void o2(OffenceInterface offenceInterface) {
        Intrinsics.checkNotNullParameter(offenceInterface, "<set-?>");
        this.mOffenceInterface = offenceInterface;
    }

    public final void p2(vf4 vf4Var) {
        Intrinsics.checkNotNullParameter(vf4Var, "<set-?>");
        this.mOffenceViewModel = vf4Var;
    }

    public final void q2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void r2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }
}
