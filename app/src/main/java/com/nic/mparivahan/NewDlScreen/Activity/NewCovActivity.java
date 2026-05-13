package com.nic.mparivahan.NewDlScreen.Activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.NewDlScreen.Activity.NewCovActivity;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlApplicationScreen;
import com.nic.mparivahan.NewDlScreen.Modal.CheckCovs;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingClassRequestModal;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolDetRequestModal;
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
import com.nic.mparivahan.NewDlScreen.Modal.SubmitDlResponseModal;
import com.nic.mparivahan.NewDlScreen.Modal.SubmittedDlDetailsModal;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.NewDLService;
import com.zepto.i9;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.n74;
import com.zepto.o74;
import com.zepto.pq;
import com.zepto.t84;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bS\u0010TJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003J\b\u0010\t\u001a\u00020\u0003H\u0003J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u001a\u0010\u0014\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R&\u0010.\u001a\u0012\u0012\u0004\u0012\u00020,0\u0005j\b\u0012\u0004\u0012\u00020,`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001bR&\u00101\u001a\u0012\u0012\u0004\u0012\u00020/0\u0005j\b\u0012\u0004\u0012\u00020/`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001bR\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010D\u001a\u0012\u0012\u0004\u0012\u00020B0\u0005j\b\u0012\u0004\u0012\u00020B`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\u001bR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010L\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010GR\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020E0\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010\u001bR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Activity/NewCovActivity;", "Lcom/zepto/pq;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "", "s1", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/NewDlScreen/Modal/LLDetailsResultModal;", "llDetails", "D1", "w1", "r1", "I1", "H1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/widget/CompoundButton;", "buttonView", "", "isChecked", "onCheckedChanged", "Lcom/zepto/i9;", "C", "Lcom/zepto/i9;", "binding", "Lkotlin/collections/ArrayList;", "D", "Ljava/util/ArrayList;", "Lcom/zepto/wa3;", "E", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "E1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "F", "Lcom/zepto/wl5;", "v1", "()Lcom/zepto/wl5;", "G1", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/nic/mparivahan/NewDlScreen/Modal/CheckCovs;", "G", "selectedServiceClass", "", "H", "selectedServiceId", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "u1", "()Landroid/app/ProgressDialog;", "F1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/t84;", "J", "Lcom/zepto/t84;", "viewModal", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/NewDLService;", "K", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/NewDLService;", "service", "Lcom/nic/mparivahan/NewDlScreen/Modal/DrivingSchoolDetRequestModal;", "L", "addedDSchoolData", "", "M", "Ljava/lang/String;", "selectedOrganValue", "N", "llNo", "O", "dob", "P", "selectedCovClassName", "Landroid/content/SharedPreferences;", "Q", "Landroid/content/SharedPreferences;", "pref", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NewCovActivity extends pq implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public i9 binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public t84 viewModal;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public NewDLService service;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public SharedPreferences pref;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ArrayList llDetails = new ArrayList();

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ArrayList selectedServiceClass = new ArrayList();

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList selectedServiceId = new ArrayList();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ArrayList addedDSchoolData = new ArrayList();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String selectedOrganValue = "Y";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String llNo = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ArrayList selectedCovClassName = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(SubmitDlResponseModal submitDlResponseModal) {
            try {
                if (NewCovActivity.this.u1().isShowing()) {
                    NewCovActivity.this.u1().dismiss();
                }
                if (Intrinsics.areEqual(submitDlResponseModal.getStatusDesc(), "success")) {
                    Toast.makeText(NewCovActivity.this, submitDlResponseModal.getMsg(), 0).show();
                    Intent intent = new Intent(NewCovActivity.this, (Class<?>) DlApplicationScreen.class);
                    ArrayList<SubmittedDlDetailsModal> submittedDlDetails = submitDlResponseModal.getSubmittedDlDetails();
                    Intrinsics.checkNotNull(submittedDlDetails);
                    intent.putExtra("appNumber", submittedDlDetails.get(0).getApplNo());
                    intent.putExtra("dobValue", submitDlResponseModal.getSubmittedDlDetails().get(0).getDob());
                    intent.putExtra("dlValue", NewCovActivity.this.llNo);
                    intent.putParcelableArrayListExtra("LLDetails", NewCovActivity.this.llDetails);
                    NewCovActivity.this.startActivity(intent);
                    NewCovActivity.this.finish();
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(submitDlResponseModal.getStatusDesc(), "failure", true)) {
                    ArrayList<SubmittedDlDetailsModal> submittedDlDetails2 = submitDlResponseModal.getSubmittedDlDetails();
                    Intrinsics.checkNotNull(submittedDlDetails2);
                    if (kt6.d(submittedDlDetails2.get(0).getIdMarkError())) {
                        Toast.makeText(NewCovActivity.this, submitDlResponseModal.getSubmittedDlDetails().get(0).getIdMarkError(), 0).show();
                        return;
                    }
                    if (kt6.d(submitDlResponseModal.getSubmittedDlDetails().get(0).getBloodGroupError())) {
                        Toast.makeText(NewCovActivity.this, submitDlResponseModal.getSubmittedDlDetails().get(0).getBloodGroupError(), 0).show();
                        return;
                    }
                    if (kt6.d(submitDlResponseModal.getSubmittedDlDetails().get(0).getFullNameError())) {
                        Toast.makeText(NewCovActivity.this, submitDlResponseModal.getSubmittedDlDetails().get(0).getFullNameError(), 0).show();
                    } else if (kt6.d(submitDlResponseModal.getSubmittedDlDetails().get(0).getMobileNumberError())) {
                        Toast.makeText(NewCovActivity.this, submitDlResponseModal.getSubmittedDlDetails().get(0).getMobileNumberError(), 0).show();
                    } else {
                        Toast.makeText(NewCovActivity.this, submitDlResponseModal.getStatusDesc().toString(), 0).show();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (NewCovActivity.this.u1().isShowing()) {
                    NewCovActivity.this.u1().dismiss();
                    NewCovActivity newCovActivity = NewCovActivity.this;
                    Toast.makeText(newCovActivity, newCovActivity.t1().b("service_is_not_present", "Something went wrong,Please try after some time!"), 0).show();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitDlResponseModal) obj);
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
            if (NewCovActivity.this.u1().isShowing()) {
                NewCovActivity.this.u1().dismiss();
                NewCovActivity newCovActivity = NewCovActivity.this;
                Toast.makeText(newCovActivity, newCovActivity.t1().b("service_is_not_present", "Something went wrong,Please try after some time!"), 0).show();
            }
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

    public static final void A1(NewCovActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void B1(NewCovActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) LLNoCheckActivity.class));
        this$0.finish();
    }

    public static final void C1(NewCovActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.selectedServiceClass.size() == 0) {
            Toast.makeText(this$0, this$0.t1().b("select_one_vehicle_class", this$0.getString(R.string.please_select_vehicle_class)), 0).show();
            return;
        }
        i9 i9Var = this$0.binding;
        if (i9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i9Var = null;
        }
        if (i9Var.J.isChecked()) {
            this$0.r1();
        } else {
            Toast.makeText(this$0, this$0.t1().b("plz_accept_term_conditions", this$0.getString(R.string.pls_enter_term_conditions)), 0).show();
        }
    }

    private final void D1(ArrayList llDetails) {
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getLlFromRTO1().get(0).getRtoName())) {
            i9 i9Var = this.binding;
            if (i9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i9Var = null;
            }
            i9Var.E.setText(((LLDetailsResultModal) llDetails.get(0)).getLlFromRTO1().get(0).getRtoName());
        } else {
            i9 i9Var2 = this.binding;
            if (i9Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i9Var2 = null;
            }
            i9Var2.E.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getLlFromState1().get(0).getLlFromState1Name())) {
            i9 i9Var3 = this.binding;
            if (i9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i9Var3 = null;
            }
            i9Var3.L.setText(((LLDetailsResultModal) llDetails.get(0)).getLlFromState1().get(0).getLlFromState1Name());
        } else {
            i9 i9Var4 = this.binding;
            if (i9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i9Var4 = null;
            }
            i9Var4.L.setText("NA");
        }
        if (((LLDetailsResultModal) llDetails.get(0)).getCheckCovs().size() > 0) {
            int size = ((LLDetailsResultModal) llDetails.get(0)).getCheckCovs().size();
            for (int i = 0; i < size; i++) {
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                CheckBox checkBox = new CheckBox(this);
                checkBox.setOnCheckedChangeListener(this);
                String covCode = ((LLDetailsResultModal) llDetails.get(0)).getCheckCovs().get(i).getCovCode();
                Intrinsics.checkNotNull(covCode);
                checkBox.setId(Integer.parseInt(covCode));
                checkBox.setText(((LLDetailsResultModal) llDetails.get(0)).getCheckCovs().get(i).getCovAbbrDesc());
                linearLayout.addView(checkBox);
                i9 i9Var5 = this.binding;
                if (i9Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    i9Var5 = null;
                }
                i9Var5.G.addView(linearLayout);
            }
        }
    }

    private final void H1() {
        i9 i9Var = this.binding;
        if (i9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i9Var = null;
        }
        i9Var.H.removeAllViews();
        this.selectedCovClassName = new ArrayList();
        int size = this.selectedServiceClass.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = this.selectedCovClassName;
            String covAbbrDesc = ((CheckCovs) this.selectedServiceClass.get(i)).getCovAbbrDesc();
            Intrinsics.checkNotNull(covAbbrDesc);
            arrayList.add(covAbbrDesc);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            TextView textView = new TextView(this);
            textView.setPadding(16, 5, 16, 5);
            textView.setTextColor(getColor(R.color.black));
            textView.setTextSize(16.0f);
            String covCode = ((CheckCovs) this.selectedServiceClass.get(i)).getCovCode();
            Intrinsics.checkNotNull(covCode);
            textView.setId(Integer.parseInt(covCode));
            textView.setText(((CheckCovs) this.selectedServiceClass.get(i)).getCovAbbrDesc());
            linearLayout.addView(textView);
            i9 i9Var2 = this.binding;
            if (i9Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i9Var2 = null;
            }
            i9Var2.H.addView(linearLayout);
        }
    }

    private final void I1() {
        try {
            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialog_show_vehicle_info);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            View viewFindViewById = dialog.findViewById(R.id.closeIv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            View viewFindViewById2 = dialog.findViewById(R.id.txtVehicleExplanation);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            ((TextView) viewFindViewById2).setText(t1().b("ll_info_explanation", getString(R.string.vehicle_explaination)));
            View viewFindViewById3 = dialog.findViewById(R.id.txtVehicleExplanation1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            ((TextView) viewFindViewById3).setText(t1().b("ll_info_non_transport", getString(R.string.non_transport_explaination)));
            View viewFindViewById4 = dialog.findViewById(R.id.txtVehicleExplanation2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            ((TextView) viewFindViewById4).setText(t1().b("ll_info_transport", getString(R.string.transport_explaination)));
            View viewFindViewById5 = dialog.findViewById(R.id.txtVehicleExplanation3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            ((TextView) viewFindViewById5).setText(t1().b("ll_info_light_motor", getString(R.string.light_vehicle_explaination)));
            View viewFindViewById6 = dialog.findViewById(R.id.txtVehicleExplanation4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            ((TextView) viewFindViewById6).setText(t1().b("ll_info_medium_motor", getString(R.string.medium_vehicle_explaination)));
            View viewFindViewById7 = dialog.findViewById(R.id.txtVehicleExplanation5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            ((TextView) viewFindViewById7).setText(t1().b("ll_info_heavy_motor", getString(R.string.heavy_vehicle_explaination)));
            ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y64
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewCovActivity.J1(dialog, view);
                }
            });
            dialog.show();
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setLayout(-1, -2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void J1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void r1() {
        t84 t84Var;
        try {
            u1().show();
            SharedPreferences sharedPreferences = this.pref;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pref");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString("addedDSchoolDetails", null);
            if (kt6.d(string)) {
                Type type = new TypeToken<List<? extends DrivingSchoolDetRequestModal>>() { // from class: com.nic.mparivahan.NewDlScreen.Activity.NewCovActivity$callSubmitApi$type$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                Object objFromJson = new Gson().fromJson(string, type);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.addedDSchoolData = (ArrayList) objFromJson;
            }
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.selectedCovClassName, ",", null, null, 0, null, null, 62, null);
            ArrayList arrayList = new ArrayList();
            int size = this.addedDSchoolData.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new DrivingClassRequestModal(((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(i)).getEnrollDate(), ((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(i)).getCovcd(), ((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(i)).getTrainTo(), ((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(i)).getCertDate(), ((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(i)).getCertNo(), ((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(i)).getEnrollNo(), ((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(i)).getDschoolCode(), ((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(i)).getTrainFrom()));
            }
            t84 t84Var2 = this.viewModal;
            if (t84Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModal");
                t84Var = null;
            } else {
                t84Var = t84Var2;
            }
            String str = this.llNo;
            String str2 = this.dob;
            String rtoCode = ((LLDetailsResultModal) this.llDetails.get(0)).getLlFromRTO1().get(0).getRtoCode();
            String llFromState1Code = ((LLDetailsResultModal) this.llDetails.get(0)).getLlFromState1().get(0).getLlFromState1Code();
            String fname = ((LLDetailsResultModal) this.llDetails.get(0)).getFname();
            String mname = ((LLDetailsResultModal) this.llDetails.get(0)).getMname();
            String lname = ((LLDetailsResultModal) this.llDetails.get(0)).getLname();
            String relationCode = ((LLDetailsResultModal) this.llDetails.get(0)).getRelationType().get(0).getRelationCode();
            String swdfName = ((LLDetailsResultModal) this.llDetails.get(0)).getSwdfName();
            String swdmName = ((LLDetailsResultModal) this.llDetails.get(0)).getSwdmName();
            String swdlName = ((LLDetailsResultModal) this.llDetails.get(0)).getSwdlName();
            String aadhaarNumber = ((LLDetailsResultModal) this.llDetails.get(0)).getAadhaarNumber();
            String newFullName = ((LLDetailsResultModal) this.llDetails.get(0)).getNewFullName();
            String strValueOf = String.valueOf(((LLDetailsResultModal) this.llDetails.get(0)).getGender().get(0).getGenderCode());
            String dateOfBirth = ((LLDetailsResultModal) this.llDetails.get(0)).getDateOfBirth();
            String placeOfBirth = ((LLDetailsResultModal) this.llDetails.get(0)).getPlaceOfBirth();
            String countryOfBirthCode = ((LLDetailsResultModal) this.llDetails.get(0)).getCountryOfBirth().get(0).getCountryOfBirthCode();
            String qualCode = ((LLDetailsResultModal) this.llDetails.get(0)).getEduQual().get(0).getQualCode();
            String bloodGroupCode = ((LLDetailsResultModal) this.llDetails.get(0)).getBloodGroup().get(0).getBloodGroupCode();
            String email = ((LLDetailsResultModal) this.llDetails.get(0)).getEmail();
            String mobileNumber = ((LLDetailsResultModal) this.llDetails.get(0)).getMobileNumber();
            String alternatemobileNumber = ((LLDetailsResultModal) this.llDetails.get(0)).getAlternatemobileNumber();
            String idMarks1 = ((LLDetailsResultModal) this.llDetails.get(0)).getIdMarks1();
            String idMarks2 = ((LLDetailsResultModal) this.llDetails.get(0)).getIdMarks2();
            String llFromState1Code2 = ((LLDetailsResultModal) this.llDetails.get(0)).getLlFromState1().get(0).getLlFromState1Code();
            String rtoCode2 = ((LLDetailsResultModal) this.llDetails.get(0)).getLlFromRTO1().get(0).getRtoCode();
            String presStateCode = ((LLDetailsResultModal) this.llDetails.get(0)).getPresState().get(0).getPresStateCode();
            String presDistCode = ((LLDetailsResultModal) this.llDetails.get(0)).getPresDistrict().get(0).getPresDistCode();
            String presSubDistCode = ((LLDetailsResultModal) this.llDetails.get(0)).getPresSubDistrict().get(0).getPresSubDistCode();
            String presPinCode = ((LLDetailsResultModal) this.llDetails.get(0)).getPresPinCode();
            String presHouseNo = ((LLDetailsResultModal) this.llDetails.get(0)).getPresHouseNo();
            String presVillageOrTown = ((LLDetailsResultModal) this.llDetails.get(0)).getPresVillageOrTown();
            String presStreet = ((LLDetailsResultModal) this.llDetails.get(0)).getPresStreet();
            String presVillCode = ((LLDetailsResultModal) this.llDetails.get(0)).getPresCity().get(0).getPresVillCode();
            String presLocation = ((LLDetailsResultModal) this.llDetails.get(0)).getPresLocation();
            String presSameAsPerm = ((LLDetailsResultModal) this.llDetails.get(0)).getPresSameAsPerm();
            String permStateCode = ((LLDetailsResultModal) this.llDetails.get(0)).getPermState().get(0).getPermStateCode();
            String permDistCode = ((LLDetailsResultModal) this.llDetails.get(0)).getPermDistrict().get(0).getPermDistCode();
            String permSubDistCode = ((LLDetailsResultModal) this.llDetails.get(0)).getPermSubDistrict().get(0).getPermSubDistCode();
            String permPinCode = ((LLDetailsResultModal) this.llDetails.get(0)).getPermPinCode();
            String permHouseNo = ((LLDetailsResultModal) this.llDetails.get(0)).getPermHouseNo();
            String permVillageOrTown = ((LLDetailsResultModal) this.llDetails.get(0)).getPermVillageOrTown();
            String permStreet = ((LLDetailsResultModal) this.llDetails.get(0)).getPermStreet();
            String permVillCode = ((LLDetailsResultModal) this.llDetails.get(0)).getPermCity().get(0).getPermVillCode();
            String permLocation = ((LLDetailsResultModal) this.llDetails.get(0)).getPermLocation();
            String presStayMonths = ((LLDetailsResultModal) this.llDetails.get(0)).getPresStayMonths();
            String presStayYears = ((LLDetailsResultModal) this.llDetails.get(0)).getPresStayYears();
            String age = ((LLDetailsResultModal) this.llDetails.get(0)).getAge();
            Boolean onlyEditAddressLL = ((LLDetailsResultModal) this.llDetails.get(0)).getOnlyEditAddressLL();
            Intrinsics.checkNotNull(onlyEditAddressLL);
            boolean zBooleanValue = onlyEditAddressLL.booleanValue();
            Boolean editAddressLL = ((LLDetailsResultModal) this.llDetails.get(0)).getEditAddressLL();
            Intrinsics.checkNotNull(editAddressLL);
            t84Var.p(str, str2, rtoCode, llFromState1Code, "", "", "0", fname, mname, lname, relationCode, swdfName, swdmName, swdlName, aadhaarNumber, newFullName, strValueOf, dateOfBirth, "", placeOfBirth, countryOfBirthCode, qualCode, bloodGroupCode, email, mobileNumber, alternatemobileNumber, idMarks1, idMarks2, llFromState1Code2, rtoCode2, presStateCode, presDistCode, presSubDistCode, presPinCode, presHouseNo, presVillageOrTown, presStreet, presVillCode, presLocation, presSameAsPerm, permStateCode, permDistCode, permSubDistCode, permPinCode, permHouseNo, permVillageOrTown, permStreet, permVillCode, permLocation, presStayMonths, presStayYears, age, zBooleanValue, editAddressLL.booleanValue(), strJoinToString$default, arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void s1() {
        if (getIntent().hasExtra("LLDetails")) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("LLDetails");
            Intrinsics.checkNotNull(parcelableArrayListExtra);
            this.llDetails = parcelableArrayListExtra;
        }
        if (getIntent().hasExtra("llNo")) {
            String stringExtra = getIntent().getStringExtra("llNo");
            Intrinsics.checkNotNull(stringExtra);
            this.llNo = stringExtra;
        }
        if (getIntent().hasExtra("dob")) {
            String stringExtra2 = getIntent().getStringExtra("dob");
            Intrinsics.checkNotNull(stringExtra2);
            this.dob = stringExtra2;
        }
        if (this.llDetails.size() > 0) {
            D1(this.llDetails);
        }
    }

    private final void w1() {
        G1(new wl5(this));
        E1(new wa3(this));
        F1(new ProgressDialog(this));
        u1().setMessage(t1().b("label_challan_please_wait", getString(R.string.please_wait)));
        u1().setCancelable(true);
        u1().setCanceledOnTouchOutside(true);
        i9 i9Var = this.binding;
        i9 i9Var2 = null;
        if (i9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i9Var = null;
        }
        i9Var.B.f.setText(v1().k());
        this.service = NewDLService.INSTANCE.a(this);
        NewDLService newDLService = this.service;
        if (newDLService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            newDLService = null;
        }
        this.viewModal = (t84) new z(this, new n74(new o74(newDLService))).a(t84.class);
        i9 i9Var3 = this.binding;
        if (i9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i9Var3 = null;
        }
        i9Var3.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCovActivity.x1(this.a, view);
            }
        });
        i9 i9Var4 = this.binding;
        if (i9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i9Var4 = null;
        }
        i9Var4.P.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.t64
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                NewCovActivity.y1(this.a, radioGroup, i);
            }
        });
        i9 i9Var5 = this.binding;
        if (i9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i9Var5 = null;
        }
        i9Var5.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCovActivity.z1(this.a, view);
            }
        });
        i9 i9Var6 = this.binding;
        if (i9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i9Var6 = null;
        }
        i9Var6.B.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCovActivity.A1(this.a, view);
            }
        });
        i9 i9Var7 = this.binding;
        if (i9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i9Var7 = null;
        }
        i9Var7.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCovActivity.B1(this.a, view);
            }
        });
        i9 i9Var8 = this.binding;
        if (i9Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            i9Var2 = i9Var8;
        }
        i9Var2.C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCovActivity.C1(this.a, view);
            }
        });
    }

    public static final void x1(NewCovActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) AddDrivingSchoolActivity.class);
        intent.putParcelableArrayListExtra("LLDetails", this$0.llDetails);
        intent.putParcelableArrayListExtra("addedCov", this$0.addedDSchoolData);
        this$0.startActivity(intent);
    }

    public static final void y1(NewCovActivity this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View viewFindViewById = this$0.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RadioButton radioButton = (RadioButton) viewFindViewById;
        if (radioButton.getId() == R.id.willingToDonate) {
            this$0.selectedOrganValue = "Y";
        } else if (radioButton.getId() == R.id.not_willing_to_donate) {
            this$0.selectedOrganValue = "N";
        }
    }

    public static final void z1(NewCovActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1();
    }

    public final void E1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void F1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void G1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        ArrayList arrayList = this.selectedServiceId;
        Intrinsics.checkNotNull(buttonView);
        if (arrayList.contains(Integer.valueOf(buttonView.getId()))) {
            this.selectedServiceId.remove(Integer.valueOf(buttonView.getId()));
            this.selectedServiceClass.remove(new CheckCovs(String.valueOf(buttonView.getId()), buttonView.getText().toString()));
        } else {
            this.selectedServiceId.add(Integer.valueOf(buttonView.getId()));
            this.selectedServiceClass.add(new CheckCovs(String.valueOf(buttonView.getId()), buttonView.getText().toString()));
        }
        i9 i9Var = null;
        if (this.selectedServiceClass.size() <= 0) {
            i9 i9Var2 = this.binding;
            if (i9Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i9Var2 = null;
            }
            i9Var2.H.setVisibility(8);
            i9 i9Var3 = this.binding;
            if (i9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                i9Var = i9Var3;
            }
            i9Var.I.setVisibility(8);
            return;
        }
        i9 i9Var4 = this.binding;
        if (i9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i9Var4 = null;
        }
        i9Var4.I.setVisibility(0);
        i9 i9Var5 = this.binding;
        if (i9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            i9Var = i9Var5;
        }
        i9Var.H.setVisibility(0);
        H1();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        i9 i9VarX = i9.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(i9VarX, "inflate(...)");
        this.binding = i9VarX;
        t84 t84Var = null;
        if (i9VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i9VarX = null;
        }
        setContentView(i9VarX.m());
        ta3.a aVar = ta3.a;
        i9 i9Var = this.binding;
        if (i9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i9Var = null;
        }
        aVar.t0(this, i9Var);
        SharedPreferences sharedPreferences = getSharedPreferences("AddVehicleClass", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.pref = sharedPreferences;
        s1();
        w1();
        t84 t84Var2 = this.viewModal;
        if (t84Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            t84Var2 = null;
        }
        t84Var2.n().g(this, new c(new a()));
        t84 t84Var3 = this.viewModal;
        if (t84Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
        } else {
            t84Var = t84Var3;
        }
        t84Var.m().g(this, new c(new b()));
    }

    public final wa3 t1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
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

    public final wl5 v1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }
}
