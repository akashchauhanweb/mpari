package com.nic.mparivahan.VahanServices.VahanView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.EgblityStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.vahanOnlineCheck;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanView.VahanSelectServiceScreen;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.lh;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.vh7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bc\u0010dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J \u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tJ\u001c\u0010\u0015\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0013H\u0007R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u001f\u001a\u0004\bM\u0010!\"\u0004\bN\u0010#R\"\u0010S\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u001f\u001a\u0004\bQ\u0010!\"\u0004\bR\u0010#R>\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0013j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010^\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\u001f\u001a\u0004\b\\\u0010!\"\u0004\b]\u0010#R$\u0010b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010\u001f\u001a\u0004\b`\u0010!\"\u0004\ba\u0010#¨\u0006e"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanSelectServiceScreen;", "Lcom/zepto/pq;", "", "u2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "", "checkedValue", "J1", "rc_number", "O1", "E2", "check_string", "D2", "Ljava/util/HashMap;", "serviceSelection_HashMap", "R1", "Lcom/zepto/lh;", "C", "Lcom/zepto/lh;", "S1", "()Lcom/zepto/lh;", "v2", "(Lcom/zepto/lh;)V", "binding", "D", "Ljava/lang/String;", "V1", "()Ljava/lang/String;", "y2", "(Ljava/lang/String;)V", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "E", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "W1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "z2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "U1", "()Landroid/app/ProgressDialog;", "x2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ld7;", "G", "Lcom/zepto/ld7;", "Z1", "()Lcom/zepto/ld7;", "C2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "H", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "X1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "A2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/zepto/vh7;", "I", "Lcom/zepto/vh7;", "Y1", "()Lcom/zepto/vh7;", "B2", "(Lcom/zepto/vh7;)V", "session", "J", "getServiceSelection", "setServiceSelection", "serviceSelection", "K", "getSelectedPages", "setSelectedPages", "selectedPages", "Lkotlin/collections/HashMap;", "L", "Ljava/util/HashMap;", "getServiceSelection_HashMap", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "M", "T1", "w2", "mobile_number", "N", "getOff_code", "setOff_code", "off_code", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVahanSelectServiceScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VahanSelectServiceScreen.kt\ncom/nic/mparivahan/VahanServices/VahanView/VahanSelectServiceScreen\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,901:1\n1549#2:902\n1620#2,3:903\n1549#2:906\n1620#2,3:907\n1549#2:910\n1620#2,3:911\n*S KotlinDebug\n*F\n+ 1 VahanSelectServiceScreen.kt\ncom/nic/mparivahan/VahanServices/VahanView/VahanSelectServiceScreen\n*L\n757#1:902\n757#1:903,3\n773#1:906\n773#1:907,3\n774#1:910\n774#1:911,3\n*E\n"})
public final class VahanSelectServiceScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public lh binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public vh7 session;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String mobile_number;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String serviceSelection = "0";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String selectedPages = "0";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String off_code = "0";

    public static final void F2(Dialog d, VahanSelectServiceScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public static final void K1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void L1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void M1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void N1(Dialog d, VahanSelectServiceScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.U1().show();
        this$0.Z1().i(this$0, String.valueOf(this$0.W1().getState_cd()));
    }

    public static final void P1(Dialog d, Context context, String rc_number, VahanSelectServiceScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(rc_number, "$rc_number");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(context, (Class<?>) VahanProcessWithAdhar.class);
        intent.putExtra("RC", rc_number);
        intent.putExtra("map", this$0.serviceSelection_HashMap);
        intent.putExtra("RcDetails", this$0.W1());
        intent.putExtra("off_code", this$0.off_code);
        context.startActivity(intent);
        this$0.finish();
    }

    public static final void Q1(Dialog d, Context context, String rc_number, VahanSelectServiceScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(rc_number, "$rc_number");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(context, (Class<?>) VahanGenerateOTPScreen.class);
        intent.putExtra("RC", rc_number);
        intent.putExtra("map", this$0.serviceSelection_HashMap);
        intent.putExtra("Mobile_no", this$0.T1());
        intent.putExtra("RcDetails", this$0.W1());
        intent.putExtra("off_code", this$0.off_code);
        context.startActivity(intent);
        this$0.finish();
    }

    public static final void a2(VahanSelectServiceScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            try {
                if (str.length() == 0) {
                    this$0.S1().p.setText(String.valueOf(this$0.W1().getRc_c_state()));
                    this$0.off_code = this$0.W1().getRc_off_cd();
                } else {
                    this$0.off_code = this$0.W1().getRc_off_cd();
                    this$0.S1().p.setText(String.valueOf(this$0.W1().getRc_c_state()));
                    this$0.w2(str.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else {
            this$0.S1().p.setText(String.valueOf(this$0.W1().getRc_c_state()));
            this$0.off_code = this$0.W1().getRc_off_cd();
        }
        this$0.Z1().P(this$0, this$0.V1());
    }

    public static final void b2(VahanSelectServiceScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1().dismiss();
        this$0.S1().o.setEnabled(false);
        this$0.E2(this$0, this$0.getString(R.string.service_unavable_please_try));
    }

    public static final void c2(VahanSelectServiceScreen this$0, EgblityStatus egblityStatus) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1().dismiss();
        try {
            if (egblityStatus.getIsduprc()) {
                this$0.S1().c.setVisibility(0);
            }
            if (egblityStatus.getIshpa()) {
                this$0.S1().d.setVisibility(0);
            }
            if (egblityStatus.getIshpc()) {
                this$0.S1().e.setVisibility(0);
            }
            if (egblityStatus.getIshpt()) {
                this$0.S1().f.setVisibility(0);
            }
            if (egblityStatus.getIsca()) {
                this$0.S1().b.setVisibility(0);
            }
            if (egblityStatus.getIsto()) {
                this$0.S1().l.setVisibility(8);
            }
            if (egblityStatus.getIsrcparticular()) {
                this$0.S1().h.setVisibility(0);
            }
            if (egblityStatus.getIsnoc()) {
                this$0.S1().g.setVisibility(0);
            }
        } catch (Exception unused) {
            this$0.S1().o.setEnabled(false);
            this$0.S1().o.setAlpha(0.5f);
        }
    }

    public static final void d2(VahanSelectServiceScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1().dismiss();
        Log.e("Result--> Error", str.toString());
        this$0.S1().o.setEnabled(false);
        this$0.S1().o.setAlpha(0.5f);
        this$0.E2(this$0, this$0.getString(R.string.service_unavable_please_try));
    }

    public static final void e2(VahanSelectServiceScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            if (z || !this$0.serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC)) {
                return;
            }
            this$0.serviceSelection_HashMap.remove(VContant.DUPLICATE_RC);
            return;
        }
        this$0.S1().d.setChecked(false);
        this$0.S1().e.setChecked(false);
        this$0.S1().f.setChecked(false);
        this$0.S1().b.setChecked(false);
        this$0.S1().l.setChecked(false);
        this$0.S1().h.setChecked(false);
        this$0.S1().g.setChecked(false);
        this$0.serviceSelection = "Issue of duplicate RC";
        this$0.selectedPages = VContant.DUPLICATE_RC_CODE;
        this$0.serviceSelection_HashMap.put(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
    }

    public static final void f2(VahanSelectServiceScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            if (z || !this$0.serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
                return;
            }
            this$0.serviceSelection_HashMap.remove(VContant.HYPOTHECATION_ADDITION);
            return;
        }
        this$0.S1().c.setChecked(false);
        this$0.S1().e.setChecked(false);
        this$0.S1().f.setChecked(false);
        this$0.S1().b.setChecked(false);
        this$0.S1().l.setChecked(false);
        this$0.S1().h.setChecked(false);
        this$0.S1().g.setChecked(false);
        this$0.serviceSelection = "Hypothecation addition";
        this$0.selectedPages = VContant.HYPOTHECATION_ADDITION_CODE;
        this$0.serviceSelection_HashMap.put(VContant.HYPOTHECATION_ADDITION, VContant.HYPOTHECATION_ADDITION_CODE);
    }

    public static final void g2(VahanSelectServiceScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            if (z || !this$0.serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
                return;
            }
            this$0.serviceSelection_HashMap.remove(VContant.HYPOTHECATION_CONTINUATION);
            return;
        }
        this$0.S1().c.setChecked(false);
        this$0.S1().d.setChecked(false);
        this$0.S1().f.setChecked(false);
        this$0.S1().b.setChecked(false);
        this$0.S1().l.setChecked(false);
        this$0.S1().h.setChecked(false);
        this$0.S1().g.setChecked(false);
        this$0.serviceSelection = "Hypothecation contribution";
        this$0.selectedPages = VContant.HYPOTHECATION_CONTINUATION_CODE;
        this$0.serviceSelection_HashMap.put(VContant.HYPOTHECATION_CONTINUATION, VContant.HYPOTHECATION_CONTINUATION_CODE);
    }

    public static final void h2(VahanSelectServiceScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            if (z || !this$0.serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
                return;
            }
            this$0.serviceSelection_HashMap.remove(VContant.HYPOTHICATION_TERMINATION);
            return;
        }
        this$0.S1().c.setChecked(false);
        this$0.S1().d.setChecked(false);
        this$0.S1().e.setChecked(false);
        this$0.S1().b.setChecked(false);
        this$0.S1().l.setChecked(false);
        this$0.S1().h.setChecked(false);
        this$0.S1().g.setChecked(false);
        this$0.serviceSelection = "Hypothecation termination";
        this$0.selectedPages = VContant.HYPOTHICATION_TERMINATION_CODE;
        this$0.serviceSelection_HashMap.put(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
    }

    public static final void i2(VahanSelectServiceScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            if (z || !this$0.serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
                return;
            }
            this$0.serviceSelection_HashMap.remove(VContant.CHANGE_OF_ADDRESS);
            return;
        }
        this$0.S1().c.setChecked(false);
        this$0.S1().d.setChecked(false);
        this$0.S1().e.setChecked(false);
        this$0.S1().f.setChecked(false);
        this$0.S1().l.setChecked(false);
        this$0.S1().h.setChecked(false);
        this$0.S1().g.setChecked(false);
        this$0.serviceSelection = "Change of address in RC";
        this$0.selectedPages = VContant.CHANGE_OF_ADDRESS_CODE;
        this$0.serviceSelection_HashMap.put(VContant.CHANGE_OF_ADDRESS, VContant.CHANGE_OF_ADDRESS_CODE);
    }

    public static final void j2(VahanSelectServiceScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            if (z || !this$0.serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
                return;
            }
            this$0.serviceSelection_HashMap.remove(VContant.TRANFER_OF_OWNERSHIP);
            return;
        }
        this$0.S1().c.setChecked(false);
        this$0.S1().d.setChecked(false);
        this$0.S1().e.setChecked(false);
        this$0.S1().f.setChecked(false);
        this$0.S1().b.setChecked(false);
        this$0.S1().h.setChecked(false);
        this$0.S1().g.setChecked(false);
        this$0.serviceSelection = "Transfer of ownership";
        this$0.selectedPages = VContant.TRANFER_OF_OWNERSHIP_CODE;
        this$0.serviceSelection_HashMap.put(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
    }

    public static final void k2(VahanSelectServiceScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            if (z || !this$0.serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR)) {
                return;
            }
            this$0.serviceSelection_HashMap.remove(VContant.RCPARTICULAR);
            return;
        }
        this$0.S1().c.setChecked(false);
        this$0.S1().d.setChecked(false);
        this$0.S1().e.setChecked(false);
        this$0.S1().f.setChecked(false);
        this$0.S1().b.setChecked(false);
        this$0.S1().l.setChecked(false);
        this$0.S1().h.setChecked(true);
        this$0.S1().g.setChecked(false);
        this$0.serviceSelection = "RC Particular";
        this$0.selectedPages = VContant.RCPARTICULAR_CODE;
        this$0.serviceSelection_HashMap.put(VContant.RCPARTICULAR, VContant.RCPARTICULAR_CODE);
    }

    public static final void l2(VahanSelectServiceScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            if (z || !this$0.serviceSelection_HashMap.containsKey(VContant.NOC)) {
                return;
            }
            this$0.serviceSelection_HashMap.remove(VContant.NOC);
            return;
        }
        this$0.S1().c.setChecked(false);
        this$0.S1().d.setChecked(false);
        this$0.S1().e.setChecked(false);
        this$0.S1().f.setChecked(false);
        this$0.S1().b.setChecked(false);
        this$0.S1().l.setChecked(false);
        this$0.S1().h.setChecked(false);
        this$0.serviceSelection = VContant.NOC;
        this$0.selectedPages = VContant.NOC_CODE;
        this$0.serviceSelection_HashMap.put(VContant.NOC, VContant.NOC_CODE);
    }

    public static final void m2(VahanSelectServiceScreen this$0, vahanOnlineCheck vahanonlinecheck) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.U1().dismiss();
            this$0.D2(vahanonlinecheck.getService_auth_mode().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void n2(VahanSelectServiceScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1().dismiss();
        this$0.E2(this$0, this$0.getString(R.string.service_unavable_please_try));
    }

    public static final void o2(VahanSelectServiceScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void p2(VahanSelectServiceScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u2();
    }

    public static final void q2(VahanSelectServiceScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1().show();
        String rc_chasi_no = this$0.W1().getRc_chasi_no();
        if (rc_chasi_no != null) {
            rc_chasi_no.subSequence(String.valueOf(this$0.W1().getRc_chasi_no()).length() - 5, String.valueOf(this$0.W1().getRc_chasi_no()).length());
        }
    }

    public static final void r2(VahanSelectServiceScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1().dismiss();
        if (str == null) {
            this$0.E2(this$0, this$0.getString(R.string.service_unavable_please_try));
            return;
        }
        try {
            if (!StringsKt__StringsJVMKt.equals(str, "200", true)) {
                this$0.E2(this$0, this$0.getString(R.string.service_unavable_please_try));
                return;
            }
            if (this$0.S1().c.getVisibility() != 0 || !this$0.S1().c.isChecked()) {
                if ((this$0.S1().l.getVisibility() != 0 || !this$0.S1().l.isChecked()) && ((this$0.S1().d.getVisibility() != 0 || !this$0.S1().d.isChecked()) && ((this$0.S1().f.getVisibility() != 0 || !this$0.S1().f.isChecked()) && ((this$0.S1().e.getVisibility() != 0 || !this$0.S1().e.isChecked()) && ((this$0.S1().b.getVisibility() != 0 || !this$0.S1().b.isChecked()) && ((this$0.S1().h.getVisibility() != 0 || !this$0.S1().h.isChecked()) && (this$0.S1().g.getVisibility() != 0 || !this$0.S1().g.isChecked()))))))) {
                    this$0.J1(this$0, "Unable to proceed your request, Please try after some time!", 0);
                    return;
                }
            }
            this$0.J1(this$0, "You have chosen only 1 service Click Add to select more. Click Proceed to move ahead with current selection.", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void s2(VahanSelectServiceScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1().dismiss();
        this$0.E2(this$0, str.toString());
    }

    public static final void t2(VahanSelectServiceScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.S1().c.getVisibility() == 0) {
            this$0.S1().c.setChecked(false);
        }
        if (this$0.S1().b.getVisibility() == 0) {
            this$0.S1().b.setChecked(false);
        }
        if (this$0.S1().l.getVisibility() == 0) {
            this$0.S1().l.setChecked(false);
        }
        if (this$0.S1().d.getVisibility() == 0) {
            this$0.S1().d.setChecked(false);
        }
        if (this$0.S1().e.getVisibility() == 0) {
            this$0.S1().e.setChecked(false);
        }
        if (this$0.S1().f.getVisibility() == 0) {
            this$0.S1().f.setChecked(false);
        }
        if (this$0.S1().h.getVisibility() == 0) {
            this$0.S1().h.setChecked(false);
        }
        if (this$0.S1().g.getVisibility() == 0) {
            this$0.S1().g.setChecked(false);
        }
    }

    private final void u2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void B2(vh7 vh7Var) {
        Intrinsics.checkNotNullParameter(vh7Var, "<set-?>");
        this.session = vh7Var;
    }

    public final void C2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void D2(String check_string) {
        Intrinsics.checkNotNullParameter(check_string, "check_string");
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsJVMKt.replace$default(StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsJVMKt.replace$default(check_string, Typography.less, ' ', false, 4, (Object) null)).toString(), Typography.greater, ' ', false, 4, (Object) null)).toString(), new String[]{"&"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt__StringsKt.trim((CharSequence) it.next()).toString());
            }
            if (arrayList.size() > 1) {
                String string = StringsKt__StringsKt.trim((CharSequence) arrayList.get(0)).toString();
                String string2 = StringsKt__StringsKt.trim((CharSequence) arrayList.get(1)).toString();
                Log.e("step41", string);
                Log.e("step42", string2);
                String string3 = StringsKt__StringsKt.trim((CharSequence) new Regex("\\s").replace(StringsKt__StringsJVMKt.replace$default(string, '(', ' ', false, 4, (Object) null), "")).toString();
                String string4 = StringsKt__StringsKt.trim((CharSequence) new Regex("\\s").replace(StringsKt__StringsJVMKt.replace$default(string3, ')', ' ', false, 4, (Object) null), "")).toString();
                String string5 = StringsKt__StringsKt.trim((CharSequence) new Regex("\\s").replace(StringsKt__StringsJVMKt.replace$default(string2, '(', ' ', false, 4, (Object) null), "")).toString();
                String string6 = StringsKt__StringsKt.trim((CharSequence) new Regex("\\s").replace(StringsKt__StringsJVMKt.replace$default(string5, ')', ' ', false, 4, (Object) null), "")).toString();
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default2, 10));
                Iterator it2 = listSplit$default2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString());
                }
                List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string6, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default3, 10));
                Iterator it3 = listSplit$default3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString());
                }
                Log.e("step43", string3);
                Log.e("step5", string4);
                Log.e("stepM4", string5);
                Log.e("stepM5", string6);
                if (arrayList2.contains("0") && arrayList3.contains("0")) {
                    Log.e("condition--> ", "condition-->1");
                    O1(this, V1());
                    return;
                }
                if (arrayList2.contains(StringsKt__StringsKt.trim((CharSequence) R1(this.serviceSelection_HashMap)).toString()) && arrayList3.contains(StringsKt__StringsKt.trim((CharSequence) R1(this.serviceSelection_HashMap)).toString())) {
                    Log.e("condition--> ", "condition-->2");
                    O1(this, V1());
                    return;
                }
                if (arrayList2.contains("0") && arrayList3.contains(StringsKt__StringsKt.trim((CharSequence) R1(this.serviceSelection_HashMap)).toString())) {
                    Log.e("condition--> ", "condition-->3");
                    O1(this, V1());
                    return;
                }
                if (arrayList2.contains(StringsKt__StringsKt.trim((CharSequence) R1(this.serviceSelection_HashMap)).toString()) && arrayList3.contains("0")) {
                    Log.e("condition--> ", "condition-->4");
                    O1(this, V1());
                    return;
                }
                if (arrayList2.contains("0") && !arrayList3.contains(StringsKt__StringsKt.trim((CharSequence) R1(this.serviceSelection_HashMap)).toString())) {
                    Log.e("condition--> ", "condition-->5");
                    Intent intent = new Intent(this, (Class<?>) VahanProcessWithAdhar.class);
                    intent.putExtra("RC", V1());
                    intent.putExtra("map", this.serviceSelection_HashMap);
                    intent.putExtra("RcDetails", W1());
                    intent.putExtra("off_code", this.off_code);
                    startActivity(intent);
                    finish();
                    return;
                }
                if (arrayList2.contains(StringsKt__StringsKt.trim((CharSequence) R1(this.serviceSelection_HashMap)).toString()) || !arrayList3.contains("0")) {
                    Log.e("condition--> ", "condition-->7");
                    return;
                }
                Log.e("condition--> ", "condition-->6");
                Intent intent2 = new Intent(this, (Class<?>) VahanGenerateOTPScreen.class);
                intent2.putExtra("RC", V1());
                intent2.putExtra("map", this.serviceSelection_HashMap);
                intent2.putExtra("Mobile_no", T1());
                intent2.putExtra("RcDetails", W1());
                intent2.putExtra("off_code", this.off_code);
                startActivity(intent2);
                finish();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void E2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pg7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanSelectServiceScreen.F2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void J1(Context context, String message, int checkedValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_msg_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.process);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.close);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.btnHolderLl);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.cancel);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById6;
        ((TextView) viewFindViewById3).setText(message);
        if (checkedValue == 0) {
            textView2.setVisibility(8);
            textView3.setVisibility(0);
            linearLayout.setVisibility(8);
        } else {
            linearLayout2.setVisibility(0);
            textView2.setVisibility(0);
            textView3.setVisibility(8);
            linearLayout.setVisibility(0);
            textView.setText("Add");
            textView.setBackground(getResources().getDrawable(R.drawable.background_shape_blue));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sg7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanSelectServiceScreen.K1(dialog, view);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tg7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanSelectServiceScreen.L1(dialog, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ug7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanSelectServiceScreen.M1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vg7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanSelectServiceScreen.N1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void O1(final Context context, final String rc_number) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.vahan_process_diloge);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.process_with_Adhar);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.process_with_mobile);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qg7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanSelectServiceScreen.P1(dialog, context, rc_number, this, view);
            }
        });
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rg7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanSelectServiceScreen.Q1(dialog, context, rc_number, this, view);
            }
        });
        dialog.show();
    }

    public final String R1(HashMap serviceSelection_HashMap) {
        Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
        return serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC) ? "3" : serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP) ? "500" : serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS) ? "4" : serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION) ? VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION) ? VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION) ? VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR) ? VContant.RCPARTICULAR_PURPOSE_CODE : "500";
    }

    public final lh S1() {
        lh lhVar = this.binding;
        if (lhVar != null) {
            return lhVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final String T1() {
        String str = this.mobile_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final ProgressDialog U1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String V1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails W1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService X1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final vh7 Y1() {
        vh7 vh7Var = this.session;
        if (vh7Var != null) {
            return vh7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ld7 Z1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_select_service_screen);
        lh lhVarC = lh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(lhVarC, "inflate(...)");
        v2(lhVarC);
        setContentView(S1().b());
        ta3.a.v2(this, S1());
        A2(VahanProService.INSTANCE.a(this));
        x2(new ProgressDialog(this));
        U1().setMessage("Please wait...");
        U1().setCancelable(false);
        U1().setCanceledOnTouchOutside(false);
        C2((ld7) new z(this, new kd7(new jd7(X1()))).a(ld7.class));
        y2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        z2((NrvDetails) serializableExtra);
        B2(new vh7(this));
        S1().q.setText(V1());
        S1().r.setText(VContant.INSTANCE.n(this, Y1()));
        Z1().x0().g(this, new mf4() { // from class: com.zepto.dg7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanSelectServiceScreen.a2(this.a, (String) obj);
            }
        });
        Z1().y0().g(this, new mf4() { // from class: com.zepto.fg7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanSelectServiceScreen.b2(this.a, (String) obj);
            }
        });
        Z1().c1().g(this, new mf4() { // from class: com.zepto.gg7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanSelectServiceScreen.m2(this.a, (vahanOnlineCheck) obj);
            }
        });
        Z1().d1().g(this, new mf4() { // from class: com.zepto.hg7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanSelectServiceScreen.n2(this.a, (String) obj);
            }
        });
        try {
            if (StringsKt__StringsJVMKt.equals(Y1().c(), VContant.DUPLICATE_RC_CODE, true)) {
                S1().c.setChecked(true);
                this.serviceSelection_HashMap.put(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(Y1().c(), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
                S1().d.setChecked(true);
                this.serviceSelection_HashMap.put(VContant.HYPOTHECATION_ADDITION, VContant.HYPOTHECATION_ADDITION_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(Y1().c(), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
                S1().e.setChecked(true);
                this.serviceSelection_HashMap.put(VContant.HYPOTHECATION_CONTINUATION, VContant.HYPOTHECATION_CONTINUATION_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(Y1().c(), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
                S1().f.setChecked(true);
                this.serviceSelection_HashMap.put(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(Y1().c(), VContant.CHANGE_OF_ADDRESS_CODE, true)) {
                S1().b.setChecked(true);
                this.serviceSelection_HashMap.put(VContant.CHANGE_OF_ADDRESS, VContant.CHANGE_OF_ADDRESS_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(Y1().c(), VContant.TRANFER_OF_OWNERSHIP_CODE, true)) {
                S1().l.setChecked(true);
                this.serviceSelection_HashMap.put(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(Y1().c(), VContant.RCPARTICULAR_CODE, true)) {
                S1().h.setChecked(true);
                this.serviceSelection_HashMap.put(VContant.RCPARTICULAR, VContant.RCPARTICULAR_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(Y1().c(), VContant.NOC_CODE, true)) {
                S1().g.setChecked(true);
                this.serviceSelection_HashMap.put(VContant.NOC, VContant.NOC_CODE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String state_cd = W1().getState_cd();
        if (state_cd == null || state_cd.length() == 0) {
            S1().p.setText("--");
        } else if (S1().p.getText().length() == 0) {
            S1().p.setText(String.valueOf(W1().getState_cd()));
        }
        S1().k.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ig7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanSelectServiceScreen.o2(this.a, view);
            }
        });
        S1().k.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jg7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanSelectServiceScreen.p2(this.a, view);
            }
        });
        S1().o.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kg7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanSelectServiceScreen.q2(this.a, view);
            }
        });
        Z1().n1().g(this, new mf4() { // from class: com.zepto.lg7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanSelectServiceScreen.r2(this.a, (String) obj);
            }
        });
        Z1().o1().g(this, new mf4() { // from class: com.zepto.mg7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanSelectServiceScreen.s2(this.a, (String) obj);
            }
        });
        S1().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ng7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanSelectServiceScreen.t2(this.a, view);
            }
        });
        Z1().c0().g(this, new mf4() { // from class: com.zepto.og7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanSelectServiceScreen.c2(this.a, (EgblityStatus) obj);
            }
        });
        Z1().d0().g(this, new mf4() { // from class: com.zepto.wg7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanSelectServiceScreen.d2(this.a, (String) obj);
            }
        });
        S1().c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.xg7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanSelectServiceScreen.e2(this.a, compoundButton, z);
            }
        });
        S1().d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.yg7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanSelectServiceScreen.f2(this.a, compoundButton, z);
            }
        });
        S1().e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.zg7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanSelectServiceScreen.g2(this.a, compoundButton, z);
            }
        });
        S1().f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ah7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanSelectServiceScreen.h2(this.a, compoundButton, z);
            }
        });
        S1().b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.bh7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanSelectServiceScreen.i2(this.a, compoundButton, z);
            }
        });
        S1().l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ch7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanSelectServiceScreen.j2(this.a, compoundButton, z);
            }
        });
        S1().h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.dh7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanSelectServiceScreen.k2(this.a, compoundButton, z);
            }
        });
        S1().g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.eg7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanSelectServiceScreen.l2(this.a, compoundButton, z);
            }
        });
    }

    public final void v2(lh lhVar) {
        Intrinsics.checkNotNullParameter(lhVar, "<set-?>");
        this.binding = lhVar;
    }

    public final void w2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final void x2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void y2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void z2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }
}
