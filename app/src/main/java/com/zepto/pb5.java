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
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.TimePicker;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetOffenceList;
import com.nic.mparivahan.Citizen.Models.GetStated;
import com.nic.mparivahan.Citizen.Models.MparOffence;
import com.nic.mparivahan.Citizen.Models.Name;
import com.nic.mparivahan.Citizen.Models.SubmitOffenceReport;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\"\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u0016\u0010 \u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010&R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010Q\u001a\n J*\u0004\u0018\u00010I0I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010X\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\bY\u0010&R\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR(\u0010k\u001a\b\u0012\u0004\u0012\u00020d0c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010q\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010&\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010&\u001a\u0004\bs\u0010n\"\u0004\bt\u0010pR(\u0010z\u001a\b\u0012\u0004\u0012\u00020v0c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010f\u001a\u0004\bx\u0010h\"\u0004\by\u0010jR\"\u0010~\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b{\u0010C\u001a\u0004\b|\u0010E\"\u0004\b}\u0010GR\u0016\u0010\u0081\u0001\u001a\u00020!8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0084\u0001"}, d2 = {"Lcom/zepto/pb5;", "Lcom/zepto/sf2;", "Lcom/zepto/tg4;", "", "message", "", "J2", "L2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "G0", "view", "b1", "X0", "Lcom/zepto/bk2;", "googleMap", "A", "", "requestCode", "resultCode", "Landroid/content/Intent;", "intent", "x0", "Landroid/widget/TextView;", "textView", "Landroid/content/Context;", "context", "u2", "Lcom/zepto/vg2;", "d0", "Lcom/zepto/vg2;", "_binding", "e0", "I", "REQUEST_CODE", "f0", "REQUEST_VIDEO_CAPTURE", "Lcom/zepto/vf4;", "g0", "Lcom/zepto/vf4;", "o2", "()Lcom/zepto/vf4;", "P2", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "h0", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "n2", "()Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "O2", "(Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;)V", "mOffenceInterface", "Lcom/zepto/ws6;", "i0", "Lcom/zepto/ws6;", "getSessionManager", "()Lcom/zepto/ws6;", "U2", "(Lcom/zepto/ws6;)V", "sessionManager", "j0", "Ljava/lang/String;", "p2", "()Ljava/lang/String;", "setMyLocation", "(Ljava/lang/String;)V", "myLocation", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "k0", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "l0", "Landroid/content/Context;", "m2", "()Landroid/content/Context;", "N2", "(Landroid/content/Context;)V", "mContext", "m0", "LOCATION_PERMISSION_CODE", "Landroid/app/ProgressDialog;", "n0", "Landroid/app/ProgressDialog;", "r2", "()Landroid/app/ProgressDialog;", "T2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Citizen/Models/MparOffence;", "o0", "Ljava/util/ArrayList;", "q2", "()Ljava/util/ArrayList;", "S2", "(Ljava/util/ArrayList;)V", "offencesList", "p0", "getMSelectedValue", "()I", "Q2", "(I)V", "mSelectedValue", "q0", "getOffenceId", "R2", "offenceId", "Lcom/nic/mparivahan/Citizen/Models/Name;", "r0", "s2", "V2", "stateList", "s0", "t2", "W2", "stateValue", "l2", "()Lcom/zepto/vg2;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class pb5 extends sf2 implements tg4 {

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public vg2 _binding;

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

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public ArrayList offencesList;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public int mSelectedValue;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public int offenceId;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public ArrayList stateList;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String stateValue;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public final int REQUEST_CODE = 200;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public final int REQUEST_VIDEO_CAPTURE = 1;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public final int LOCATION_PERMISSION_CODE = 23;

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            pb5.this.Q2(i);
            pb5 pb5Var = pb5.this;
            pb5Var.R2(((MparOffence) pb5Var.q2().get(i)).getOffenceId());
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
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (i == 0) {
                pb5.this.W2("Select State");
            } else {
                pb5 pb5Var = pb5.this;
                pb5Var.W2(((Name) pb5Var.s2().get(i)).getStateCode());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final void A2(pb5 this$0, View view) {
        mg2 mg2VarI0;
        dh2 dh2VarN;
        dh2 dh2VarO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        it0 it0Var = new it0();
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || (mg2VarI0 = yf2VarN.I0()) == null || (dh2VarN = mg2VarI0.n()) == null || (dh2VarO = dh2VarN.o(R.id.main_activity_fragmentContainer, it0Var)) == null) {
            return;
        }
        dh2VarO.h();
    }

    public static final void B2(pb5 this$0, View view) {
        mg2 mg2VarI0;
        dh2 dh2VarN;
        dh2 dh2VarO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        it0 it0Var = new it0();
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || (mg2VarI0 = yf2VarN.I0()) == null || (dh2VarN = mg2VarI0.n()) == null || (dh2VarO = dh2VarN.o(R.id.main_activity_fragmentContainer, it0Var)) == null) {
            return;
        }
        dh2VarO.h();
    }

    public static final void C2(final pb5 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        calendar.add(6, 1);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0.m2(), new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.db5
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i3, int i4, int i5) {
                pb5.D2(this.a, datePicker, i3, i4, i5);
            }
        }, calendar.get(5), i2, i);
        datePickerDialog.getDatePicker().setMinDate(calendar.getTimeInMillis());
        datePickerDialog.show();
    }

    public static final void D2(pb5 this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = this$0.l2().h;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append('-');
        sb.append(i2 + 1);
        sb.append('-');
        sb.append(i);
        textView.setText(sb.toString());
    }

    public static final void E2(pb5 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mSelectedValue == 0) {
            this$0.J2("Please select violation type");
            return;
        }
        Editable text = this$0.l2().k.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0 || this$0.l2().k.getText().length() < 4) {
            this$0.l2().k.requestFocus();
            this$0.J2(this$0.E1().getResources().getString(R.string.rc_text));
            return;
        }
        if (!new Regex("[a-zA-Z0-9]*").matches(this$0.l2().k.getText().toString())) {
            this$0.l2().k.requestFocus();
            this$0.J2(this$0.E1().getResources().getString(R.string.rc_text));
            return;
        }
        Editable text2 = this$0.l2().i.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            this$0.l2().i.requestFocus();
            this$0.J2("Please enter location");
            return;
        }
        if (Intrinsics.areEqual(this$0.t2(), this$0.E1().getResources().getString(R.string.select_state))) {
            this$0.J2("Please select state");
            return;
        }
        Editable text3 = this$0.l2().g.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            this$0.J2("Please enter comments");
            return;
        }
        this$0.T2(new ProgressDialog(this$0.E1()));
        this$0.r2().setMessage("Please wait...");
        this$0.r2().setCancelable(false);
        this$0.r2().setCanceledOnTouchOutside(false);
        Object systemService = this$0.E1().getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        if (!((LocationManager) systemService).isProviderEnabled("gps")) {
            this$0.L2("Your location is off\nPlease turn on your location");
            return;
        }
        new ki2(this$0.E1());
        if (this$0.p2() == null) {
            this$0.J2(this$0.E1().getResources().getString(R.string.location_not_find));
        } else if (Intrinsics.areEqual(this$0.p2(), this$0.E1().getResources().getString(R.string.location_not_find))) {
            this$0.J2(this$0.E1().getResources().getString(R.string.location_not_find));
        }
    }

    public static final void F2(pb5 this$0, SubmitOffenceReport submitOffenceReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r2().dismiss();
        if (Intrinsics.areEqual(submitOffenceReport.getStatusCode(), "TRV001")) {
            this$0.J2("Offence submitted successfully");
        } else {
            this$0.J2(submitOffenceReport.getStatusDesc());
        }
    }

    public static final void G2(pb5 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r2().dismiss();
        this$0.J2("Something went wrong\nPlease try after some time!");
    }

    public static final void H2(pb5 this$0, GetStated getStated) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (StringsKt__StringsJVMKt.equals(getStated.getStatusCode(), "MSTR001", true)) {
                this$0.r2().dismiss();
                ArrayList<Name> states = getStated.getStates();
                Intrinsics.checkNotNull(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Citizen.Models.Name>");
                this$0.V2(states);
                ArrayList arrayListS2 = this$0.s2();
                String string = this$0.E1().getResources().getString(R.string.select_state);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayListS2.add(0, new Name(string, "0", false));
                this$0.l2().q.setAdapter((SpinnerAdapter) new ok0(this$0.E1(), this$0.s2()));
            } else {
                this$0.r2().dismiss();
            }
        } catch (Exception e) {
            this$0.r2().dismiss();
            e.printStackTrace();
        }
    }

    public static final void I2(pb5 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r2().dismiss();
    }

    private final void J2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pb5.K2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K2(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void L2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pb5.M2(this.a, dialog, view);
            }
        });
        dialog.show();
    }

    public static final void M2(pb5 this$0, Dialog d, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        this$0.R1(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        d.dismiss();
    }

    public static final void v2(Calendar calendar, pb5 this$0, TimePicker timePicker, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        calendar.set(11, i);
        calendar.set(12, i2);
        this$0.l2().j.setText(new SimpleDateFormat("HH:mm", Locale.US).format(calendar.getTime()));
    }

    public static final void w2(pb5 this$0, TimePickerDialog.OnTimeSetListener timeSetListener, Calendar calendar, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(timeSetListener, "$timeSetListener");
        new TimePickerDialog(this$0.F1(), timeSetListener, calendar.get(11), calendar.get(12), true).show();
        this$0.l2().j.setText(calendar.getTime().toString());
    }

    public static final void x2(pb5 this$0, GetOffenceList getOffenceList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList<MparOffence> mparOffenceList = getOffenceList.getMparOffenceList();
        Intrinsics.checkNotNull(mparOffenceList, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Citizen.Models.MparOffence>");
        this$0.S2(mparOffenceList);
        this$0.q2().add(0, new MparOffence("Select violation", 0, 0, "0"));
        this$0.l2().b.setAdapter((SpinnerAdapter) new nf4(this$0.E1(), this$0.q2()));
    }

    public static final void y2(pb5 this$0, View view) {
        mg2 mg2VarI0;
        dh2 dh2VarN;
        dh2 dh2VarO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        jj6 jj6Var = new jj6();
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || (mg2VarI0 = yf2VarN.I0()) == null || (dh2VarN = mg2VarI0.n()) == null || (dh2VarO = dh2VarN.o(R.id.main_activity_fragmentContainer, jj6Var)) == null) {
            return;
        }
        dh2VarO.h();
    }

    public static final void z2(pb5 this$0, View view) {
        mg2 mg2VarI0;
        dh2 dh2VarN;
        dh2 dh2VarO;
        dh2 dh2VarG;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        jj6 jj6Var = new jj6();
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || (mg2VarI0 = yf2VarN.I0()) == null || (dh2VarN = mg2VarI0.n()) == null || (dh2VarO = dh2VarN.o(R.id.main_activity_fragmentContainer, jj6Var)) == null || (dh2VarG = dh2VarO.g(null)) == null) {
            return;
        }
        dh2VarG.h();
    }

    @Override // com.zepto.tg4
    public void A(bk2 googleMap) {
        Intrinsics.checkNotNullParameter(googleMap, "googleMap");
    }

    @Override // com.zepto.sf2
    public View G0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = vg2.c(inflater, container, false);
        return l2().b();
    }

    public final void N2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void O2(OffenceInterface offenceInterface) {
        Intrinsics.checkNotNullParameter(offenceInterface, "<set-?>");
        this.mOffenceInterface = offenceInterface;
    }

    public final void P2(vf4 vf4Var) {
        Intrinsics.checkNotNullParameter(vf4Var, "<set-?>");
        this.mOffenceViewModel = vf4Var;
    }

    public final void Q2(int i) {
        this.mSelectedValue = i;
    }

    public final void R2(int i) {
        this.offenceId = i;
    }

    public final void S2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.offencesList = arrayList;
    }

    public final void T2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void U2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void V2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.stateList = arrayList;
    }

    public final void W2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateValue = str;
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
        yf2 yf2VarE1 = E1();
        Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
        N2(yf2VarE1);
        U2(new ws6(E1()));
        OffenceInterface.Companion companion = OffenceInterface.INSTANCE;
        yf2 yf2VarE12 = E1();
        Intrinsics.checkNotNullExpressionValue(yf2VarE12, "requireActivity(...)");
        O2(companion.a(yf2VarE12));
        l2().p.a(savedInstanceState);
        l2().h.setText(new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(System.currentTimeMillis())));
        l2().j.setText(new SimpleDateFormat("HH:mm").format(Long.valueOf(System.currentTimeMillis())));
        EditText evTimePicker = l2().j;
        Intrinsics.checkNotNullExpressionValue(evTimePicker, "evTimePicker");
        Context contextF1 = F1();
        Intrinsics.checkNotNullExpressionValue(contextF1, "requireContext(...)");
        u2(evTimePicker, contextF1);
        P2((vf4) new androidx.lifecycle.z(this, new uf4(new of4(n2()))).a(vf4.class));
        T2(new ProgressDialog(E1()));
        r2().setMessage("Please wait...");
        r2().setCancelable(false);
        r2().setCanceledOnTouchOutside(false);
        o2().N().g(i0(), new mf4() { // from class: com.zepto.za5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                pb5.x2(this.a, (GetOffenceList) obj);
            }
        });
        l2().b.setOnItemSelectedListener(new a());
        l2().q.setOnItemSelectedListener(new b());
        l2().n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                pb5.y2(this.a, view2);
            }
        });
        l2().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ib5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                pb5.B2(this.a, view2);
            }
        });
        l2().h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                pb5.C2(this.a, view2);
            }
        });
        l2().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                pb5.E2(this.a, view2);
            }
        });
        o2().M().g(i0(), new mf4() { // from class: com.zepto.lb5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                pb5.F2(this.a, (SubmitOffenceReport) obj);
            }
        });
        o2().q().g(i0(), new mf4() { // from class: com.zepto.mb5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                pb5.G2(this.a, (String) obj);
            }
        });
        o2().R(VContant.MAINSCREEN);
        o2().z().g(E1(), new mf4() { // from class: com.zepto.nb5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                pb5.H2(this.a, (GetStated) obj);
            }
        });
        o2().r().g(E1(), new mf4() { // from class: com.zepto.ob5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                pb5.I2(this.a, (String) obj);
            }
        });
        l2().n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ab5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                pb5.z2(this.a, view2);
            }
        });
        l2().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                pb5.A2(this.a, view2);
            }
        });
    }

    public final vg2 l2() {
        vg2 vg2Var = this._binding;
        Intrinsics.checkNotNull(vg2Var);
        return vg2Var;
    }

    public final Context m2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final OffenceInterface n2() {
        OffenceInterface offenceInterface = this.mOffenceInterface;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
        return null;
    }

    public final vf4 o2() {
        vf4 vf4Var = this.mOffenceViewModel;
        if (vf4Var != null) {
            return vf4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceViewModel");
        return null;
    }

    public final String p2() {
        String str = this.myLocation;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myLocation");
        return null;
    }

    public final ArrayList q2() {
        ArrayList arrayList = this.offencesList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("offencesList");
        return null;
    }

    public final ProgressDialog r2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final ArrayList s2() {
        ArrayList arrayList = this.stateList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateList");
        return null;
    }

    public final String t2() {
        String str = this.stateValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateValue");
        return null;
    }

    public final void u2(TextView textView, Context context) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(context, "context");
        final Calendar calendar = Calendar.getInstance();
        final TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: com.zepto.bb5
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i2) {
                pb5.v2(calendar, this, timePicker, i, i2);
            }
        };
        l2().j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pb5.w2(this.a, onTimeSetListener, calendar, view);
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
