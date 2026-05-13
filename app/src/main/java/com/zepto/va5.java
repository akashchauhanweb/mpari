package com.zepto;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import com.google.android.gms.maps.model.LatLng;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.SubmitOffenceReport;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\be\u0010fJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\"\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0016\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fR\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010'R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010R\u001a\n K*\u0004\u0018\u00010J0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Y\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006g"}, d2 = {"Lcom/zepto/va5;", "Lcom/zepto/sf2;", "Lcom/zepto/tg4;", "", "message", "", "x2", "z2", "Landroid/os/Bundle;", "savedInstanceState", "C0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "G0", "view", "b1", "X0", "Lcom/zepto/bk2;", "googleMap", "A", "", "requestCode", "resultCode", "Landroid/content/Intent;", "intent", "x0", "Landroid/widget/TextView;", "textView", "Landroid/content/Context;", "context", "n2", "Lcom/zepto/ug2;", "d0", "Lcom/zepto/ug2;", "_binding", "e0", "I", "REQUEST_CODE", "f0", "REQUEST_VIDEO_CAPTURE", "Lcom/zepto/vf4;", "g0", "Lcom/zepto/vf4;", "j2", "()Lcom/zepto/vf4;", "C2", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "h0", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "i2", "()Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "B2", "(Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;)V", "mOffenceInterface", "Lcom/zepto/ws6;", "i0", "Lcom/zepto/ws6;", "m2", "()Lcom/zepto/ws6;", "E2", "(Lcom/zepto/ws6;)V", "sessionManager", "j0", "Ljava/lang/String;", "k2", "()Ljava/lang/String;", "setMyLocation", "(Ljava/lang/String;)V", "myLocation", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "k0", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "l0", "Landroid/content/Context;", "h2", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "m0", "Landroid/app/ProgressDialog;", "l2", "()Landroid/app/ProgressDialog;", "D2", "(Landroid/app/ProgressDialog;)V", "pDialog", "g2", "()Lcom/zepto/ug2;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class va5 extends sf2 implements tg4 {

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public ug2 _binding;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public vf4 mOffenceViewModel;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public OffenceInterface mOffenceInterface;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String myLocation;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public final int REQUEST_CODE = 200;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public final int REQUEST_VIDEO_CAPTURE = 1;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    public static final void A2(va5 this$0, Dialog d, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        this$0.R1(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        d.dismiss();
    }

    public static final void o2(Calendar calendar, va5 this$0, TimePicker timePicker, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        calendar.set(11, i);
        calendar.set(12, i2);
        this$0.g2().g.setText(new SimpleDateFormat("HH:mm", Locale.US).format(calendar.getTime()));
    }

    public static final void p2(va5 this$0, TimePickerDialog.OnTimeSetListener timeSetListener, Calendar calendar, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(timeSetListener, "$timeSetListener");
        new TimePickerDialog(this$0.F1(), timeSetListener, calendar.get(11), calendar.get(12), true).show();
        this$0.g2().g.setText(calendar.getTime().toString());
    }

    public static final void q2(va5 this$0, View view) {
        mg2 mg2VarI0;
        dh2 dh2VarN;
        dh2 dh2VarO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        q5 q5Var = new q5();
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || (mg2VarI0 = yf2VarN.I0()) == null || (dh2VarN = mg2VarI0.n()) == null || (dh2VarO = dh2VarN.o(R.id.main_activity_fragmentContainer, q5Var)) == null) {
            return;
        }
        dh2VarO.h();
    }

    public static final void r2(va5 this$0, View view) {
        mg2 mg2VarI0;
        dh2 dh2VarN;
        dh2 dh2VarO;
        dh2 dh2VarG;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        b4 b4Var = new b4();
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || (mg2VarI0 = yf2VarN.I0()) == null || (dh2VarN = mg2VarI0.n()) == null || (dh2VarO = dh2VarN.o(R.id.main_activity_fragmentContainer, b4Var)) == null || (dh2VarG = dh2VarO.g(null)) == null) {
            return;
        }
        dh2VarG.h();
    }

    public static final void s2(final va5 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        calendar.add(6, 1);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0.h2(), new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ra5
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i3, int i4, int i5) {
                va5.t2(this.a, datePicker, i3, i4, i5);
            }
        }, calendar.get(5), i2, i);
        datePickerDialog.getDatePicker().setMinDate(calendar.getTimeInMillis());
        datePickerDialog.show();
    }

    public static final void t2(va5 this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = this$0.g2().e;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append('-');
        sb.append(i2 + 1);
        sb.append('-');
        sb.append(i);
        textView.setText(sb.toString());
    }

    public static final void u2(va5 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.g2().h.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0 || this$0.g2().h.getText().length() < 4) {
            this$0.g2().h.requestFocus();
            this$0.x2(this$0.E1().getResources().getString(R.string.rc_text));
            return;
        }
        if (!new Regex("[a-zA-Z0-9]*").matches(this$0.g2().h.getText().toString())) {
            this$0.g2().h.requestFocus();
            this$0.x2(this$0.E1().getResources().getString(R.string.rc_text));
            return;
        }
        Editable text2 = this$0.g2().f.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            this$0.g2().f.requestFocus();
            this$0.x2("Please enter location");
            return;
        }
        Editable text3 = this$0.g2().d.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            this$0.x2("Please enter comments");
            return;
        }
        this$0.D2(new ProgressDialog(this$0.E1()));
        this$0.l2().setMessage("Please wait...");
        this$0.l2().setCancelable(false);
        this$0.l2().setCanceledOnTouchOutside(false);
        Object systemService = this$0.E1().getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        if (!((LocationManager) systemService).isProviderEnabled("gps")) {
            this$0.z2("Your location is off\nPlease turn on your location");
            return;
        }
        ki2 ki2Var = new ki2(this$0.E1());
        if (this$0.k2() == null) {
            this$0.x2(this$0.E1().getResources().getString(R.string.location_not_find));
            return;
        }
        if (Intrinsics.areEqual(this$0.k2(), this$0.E1().getResources().getString(R.string.location_not_find))) {
            this$0.x2(this$0.E1().getResources().getString(R.string.location_not_find));
            return;
        }
        String string = Settings.Secure.getString(this$0.h2().getContentResolver(), "android_id");
        vf4 vf4VarJ2 = this$0.j2();
        String strK = this$0.m2().k();
        String strK2 = this$0.k2();
        String strValueOf = String.valueOf(ki2Var.f);
        String string2 = this$0.g2().f.getText().toString();
        String strValueOf2 = String.valueOf(ki2Var.g);
        String string3 = this$0.g2().h.getText().toString();
        String string4 = this$0.g2().d.getText().toString();
        String strQ = this$0.m2().q();
        String strN = this$0.m2().n();
        Intrinsics.checkNotNull(string);
        vf4VarJ2.Y(strK, VContant.MAINSCREEN, strK2, strValueOf, string2, strValueOf2, string3, string4, strQ, strN, "", "", "", "", false, string, this$0.m2().l(), this$0.m2().e());
    }

    public static final void v2(va5 this$0, SubmitOffenceReport submitOffenceReport) {
        mg2 mg2VarI0;
        dh2 dh2VarN;
        dh2 dh2VarO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l2().dismiss();
        if (!Intrinsics.areEqual(submitOffenceReport.getStatusCode(), "ACCD001")) {
            this$0.x2(submitOffenceReport.getStatusDesc());
            return;
        }
        this$0.x2("Report submitted successfully");
        q5 q5Var = new q5();
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || (mg2VarI0 = yf2VarN.I0()) == null || (dh2VarN = mg2VarI0.n()) == null || (dh2VarO = dh2VarN.o(R.id.main_activity_fragmentContainer, q5Var)) == null) {
            return;
        }
        dh2VarO.h();
    }

    public static final void w2(va5 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l2().dismiss();
        this$0.x2("Something went wrong\nPlease try after some time!");
    }

    private final void x2(String message) {
        final Dialog dialog = new Dialog(E1());
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ta5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                va5.y2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y2(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void z2(String message) {
        final Dialog dialog = new Dialog(E1());
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sa5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                va5.A2(this.a, dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.tg4
    public void A(bk2 googleMap) {
        Intrinsics.checkNotNullParameter(googleMap, "googleMap");
        ki2 ki2Var = new ki2(E1());
        googleMap.a(new zp3().p(new LatLng(ki2Var.f, ki2Var.g)).q("location"));
        googleMap.b(ra0.a(new LatLng(ki2Var.f, ki2Var.g), 15.0f));
    }

    public final void B2(OffenceInterface offenceInterface) {
        Intrinsics.checkNotNullParameter(offenceInterface, "<set-?>");
        this.mOffenceInterface = offenceInterface;
    }

    @Override // com.zepto.sf2
    public void C0(Bundle savedInstanceState) {
        super.C0(savedInstanceState);
    }

    public final void C2(vf4 vf4Var) {
        Intrinsics.checkNotNullParameter(vf4Var, "<set-?>");
        this.mOffenceViewModel = vf4Var;
    }

    public final void D2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void E2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    @Override // com.zepto.sf2
    public View G0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = ug2.c(inflater, container, false);
        return g2().b();
    }

    @Override // com.zepto.sf2
    public void X0() {
        super.X0();
        new ki2(E1());
    }

    @Override // com.zepto.sf2
    public void b1(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b1(view, savedInstanceState);
        g2().n.a(savedInstanceState);
        E2(new ws6(E1()));
        OffenceInterface.Companion companion = OffenceInterface.INSTANCE;
        yf2 yf2VarE1 = E1();
        Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
        B2(companion.a(yf2VarE1));
        g2().e.setText(new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(System.currentTimeMillis())));
        g2().g.setText(new SimpleDateFormat("HH:mm").format(Long.valueOf(System.currentTimeMillis())));
        TextView evTimePicker = g2().g;
        Intrinsics.checkNotNullExpressionValue(evTimePicker, "evTimePicker");
        Context contextF1 = F1();
        Intrinsics.checkNotNullExpressionValue(contextF1, "requireContext(...)");
        n2(evTimePicker, contextF1);
        C2((vf4) new androidx.lifecycle.z(this, new uf4(new of4(i2()))).a(vf4.class));
        g2().k.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ka5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                va5.q2(this.a, view2);
            }
        });
        g2().l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ma5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                va5.r2(this.a, view2);
            }
        });
        g2().e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.na5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                va5.s2(this.a, view2);
            }
        });
        g2().o.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oa5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                va5.u2(this.a, view2);
            }
        });
        j2().K().g(i0(), new mf4() { // from class: com.zepto.pa5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                va5.v2(this.a, (SubmitOffenceReport) obj);
            }
        });
        j2().J().g(i0(), new mf4() { // from class: com.zepto.qa5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                va5.w2(this.a, (String) obj);
            }
        });
    }

    public final ug2 g2() {
        ug2 ug2Var = this._binding;
        Intrinsics.checkNotNull(ug2Var);
        return ug2Var;
    }

    public final Context h2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final OffenceInterface i2() {
        OffenceInterface offenceInterface = this.mOffenceInterface;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
        return null;
    }

    public final vf4 j2() {
        vf4 vf4Var = this.mOffenceViewModel;
        if (vf4Var != null) {
            return vf4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceViewModel");
        return null;
    }

    public final String k2() {
        String str = this.myLocation;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myLocation");
        return null;
    }

    public final ProgressDialog l2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final ws6 m2() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void n2(TextView textView, Context context) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(context, "context");
        final Calendar calendar = Calendar.getInstance();
        final TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: com.zepto.ua5
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i2) {
                va5.o2(calendar, this, timePicker, i, i2);
            }
        };
        g2().g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.la5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                va5.p2(this.a, onTimeSetListener, calendar, view);
            }
        });
    }

    @Override // com.zepto.sf2
    public void x0(int requestCode, int resultCode, Intent intent) {
        super.x0(requestCode, resultCode, intent);
        if (requestCode == this.REQUEST_VIDEO_CAPTURE && resultCode == -1 && intent != null) {
            intent.getData();
        }
    }
}
