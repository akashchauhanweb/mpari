package com.nic.mparivahan.VahanServices.updateMobileNo;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileNoService;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanUpdateMobileActivity;
import com.zepto.ar6;
import com.zepto.mf4;
import com.zepto.mh;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.xq6;
import com.zepto.yq6;
import com.zepto.yy0;
import java.util.Calendar;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0015R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/nic/mparivahan/VahanServices/updateMobileNo/VahanUpdateMobileActivity;", "Lcom/zepto/pq;", "", "x1", "F1", "H1", "", "P1", "Landroid/content/Context;", "context", "", "it", "M1", "E1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/mh;", "C", "Lcom/zepto/mh;", "binding", "Lcom/zepto/ar6;", "D", "Lcom/zepto/ar6;", "w1", "()Lcom/zepto/ar6;", "L1", "(Lcom/zepto/ar6;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileNoService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileNoService;", "v1", "()Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileNoService;", "K1", "(Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileNoService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "dialog", "G", "Ljava/lang/String;", "getRegistrationDateEtString", "()Ljava/lang/String;", "setRegistrationDateEtString", "(Ljava/lang/String;)V", "registrationDateEtString", "H", "getRegistrationUptoEtString", "setRegistrationUptoEtString", "registrationUptoEtString", "Lcom/zepto/wa3;", "I", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "J1", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanUpdateMobileActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public mh binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ar6 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public UpdateMobileNoService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String registrationDateEtString = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String registrationUptoEtString = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wa3 languageSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(UpdateMobileUserDetails updateMobileUserDetails) {
            ProgressDialog progressDialog = VahanUpdateMobileActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = VahanUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            Intent intent = new Intent(VahanUpdateMobileActivity.this, (Class<?>) VahanConfirmUpdateMobileActivity.class);
            intent.putExtra("isAadharEnable", updateMobileUserDetails.getRenderAdharDtls());
            if (updateMobileUserDetails.getOwnerDetailEntity() != null && updateMobileUserDetails.getOwnerDetailEntity().size() > 0) {
                intent.putExtra("regNo", updateMobileUserDetails.getOwnerDetailEntity().get(0).getRegn_no());
                intent.putExtra("stateCd", updateMobileUserDetails.getOwnerDetailEntity().get(0).getState_cd());
                intent.putExtra("stateName", updateMobileUserDetails.getOwnerDetailEntity().get(0).getState_name());
                intent.putExtra("ownerName", updateMobileUserDetails.getOwnerDetailEntity().get(0).getOwner_name());
            }
            if (updateMobileUserDetails.getVtOwnerIdentitificationEntity() != null && updateMobileUserDetails.getVtOwnerIdentitificationEntity().size() > 0) {
                if (updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getMobile_no() != null) {
                    intent.putExtra("mobileNo", updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getMobile_no());
                } else {
                    intent.putExtra("mobileNo", "");
                }
                if (updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getAadhar_no() != null) {
                    intent.putExtra("aadharNo", updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getAadhar_no());
                } else {
                    intent.putExtra("aadharNo", "");
                }
                if (updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getEmail_id() != null) {
                    intent.putExtra("emailId", updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getEmail_id());
                } else {
                    intent.putExtra("emailId", "");
                }
            }
            VahanUpdateMobileActivity.this.startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UpdateMobileUserDetails) obj);
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
            ProgressDialog progressDialog = VahanUpdateMobileActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = VahanUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            VahanUpdateMobileActivity vahanUpdateMobileActivity = VahanUpdateMobileActivity.this;
            vahanUpdateMobileActivity.M1(vahanUpdateMobileActivity, str);
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

    public static final void A1(VahanUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.P1()) {
            ProgressDialog progressDialog = this$0.dialog;
            mh mhVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            ar6 ar6VarW1 = this$0.w1();
            mh mhVar2 = this$0.binding;
            if (mhVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar2 = null;
            }
            String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(mhVar2.h.getText())).toString();
            mh mhVar3 = this$0.binding;
            if (mhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar3 = null;
            }
            String string2 = StringsKt__StringsKt.trim((CharSequence) String.valueOf(mhVar3.c.getText())).toString();
            mh mhVar4 = this$0.binding;
            if (mhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar = mhVar4;
            }
            ar6VarW1.k(string, string2, StringsKt__StringsKt.trim((CharSequence) String.valueOf(mhVar.e.getText())).toString(), this$0.registrationDateEtString, this$0.registrationUptoEtString);
        }
    }

    public static final void B1(VahanUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void C1(VahanUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H1();
    }

    public static final void D1(VahanUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1();
    }

    private final void E1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void F1() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.aj7
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i4, int i5, int i6) {
                VahanUpdateMobileActivity.G1(objectRef, objectRef2, this, datePicker, i4, i5, i6);
            }
        }, i, i2, i3);
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(yy0.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(yy0.c(this, R.color.red_new));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void G1(Ref.ObjectRef dayStartString, Ref.ObjectRef dayStartMonth, VahanUpdateMobileActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        T tValueOf;
        T tValueOf2;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(dayStartString, "$dayStartString");
        Intrinsics.checkNotNullParameter(dayStartMonth, "$dayStartMonth");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (String.valueOf(i3).length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i3);
            tValueOf = sb.toString();
        } else {
            tValueOf = String.valueOf(i3);
        }
        dayStartString.element = tValueOf;
        int i4 = i2 + 1;
        if (String.valueOf(i4).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i4);
            tValueOf2 = sb2.toString();
        } else {
            tValueOf2 = String.valueOf(i4);
        }
        dayStartMonth.element = tValueOf2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        sb3.append('-');
        T t = dayStartMonth.element;
        String str4 = null;
        if (t == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
            str = null;
        } else {
            str = (String) t;
        }
        sb3.append(str);
        sb3.append('-');
        T t2 = dayStartString.element;
        if (t2 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str2 = null;
        } else {
            str2 = (String) t2;
        }
        sb3.append(str2);
        this$0.registrationDateEtString = sb3.toString();
        mh mhVar = this$0.binding;
        if (mhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar = null;
        }
        AppCompatEditText appCompatEditText = mhVar.i;
        StringBuilder sb4 = new StringBuilder();
        T t3 = dayStartString.element;
        if (t3 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str3 = null;
        } else {
            str3 = (String) t3;
        }
        sb4.append(str3);
        sb4.append('-');
        T t4 = dayStartMonth.element;
        if (t4 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
        } else {
            str4 = (String) t4;
        }
        sb4.append(str4);
        sb4.append('-');
        sb4.append(i);
        appCompatEditText.setText(sb4.toString());
    }

    private final void H1() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.zi7
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i4, int i5, int i6) {
                VahanUpdateMobileActivity.I1(objectRef, objectRef2, this, datePicker, i4, i5, i6);
            }
        }, i, i2, i3);
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(yy0.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(yy0.c(this, R.color.red_new));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I1(Ref.ObjectRef dayStartString, Ref.ObjectRef dayStartMonth, VahanUpdateMobileActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        T tValueOf;
        T tValueOf2;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(dayStartString, "$dayStartString");
        Intrinsics.checkNotNullParameter(dayStartMonth, "$dayStartMonth");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (String.valueOf(i3).length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i3);
            tValueOf = sb.toString();
        } else {
            tValueOf = String.valueOf(i3);
        }
        dayStartString.element = tValueOf;
        int i4 = i2 + 1;
        if (String.valueOf(i4).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i4);
            tValueOf2 = sb2.toString();
        } else {
            tValueOf2 = String.valueOf(i4);
        }
        dayStartMonth.element = tValueOf2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        sb3.append('-');
        T t = dayStartMonth.element;
        String str4 = null;
        if (t == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
            str = null;
        } else {
            str = (String) t;
        }
        sb3.append(str);
        sb3.append('-');
        T t2 = dayStartString.element;
        if (t2 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str2 = null;
        } else {
            str2 = (String) t2;
        }
        sb3.append(str2);
        this$0.registrationUptoEtString = sb3.toString();
        mh mhVar = this$0.binding;
        if (mhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar = null;
        }
        AppCompatEditText appCompatEditText = mhVar.m;
        StringBuilder sb4 = new StringBuilder();
        T t3 = dayStartString.element;
        if (t3 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str3 = null;
        } else {
            str3 = (String) t3;
        }
        sb4.append(str3);
        sb4.append('-');
        T t4 = dayStartMonth.element;
        if (t4 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
        } else {
            str4 = (String) t4;
        }
        sb4.append(str4);
        sb4.append('-');
        sb4.append(i);
        appCompatEditText.setText(sb4.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(Context context, String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        wa3 wa3Var = new wa3(context);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        textView.setText(wa3Var.b("btn_ok", "ok"));
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xi7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobileActivity.N1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yi7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobileActivity.O1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final boolean P1() {
        mh mhVar = this.binding;
        mh mhVar2 = null;
        if (mhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar = null;
        }
        Editable text = mhVar.h.getText();
        if (text != null && text.length() == 0) {
            mh mhVar3 = this.binding;
            if (mhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar3 = null;
            }
            mhVar3.h.setError(u1().b("PLEASE_ENTER_REG", getString(R.string.please_enter_reg_no)));
            mh mhVar4 = this.binding;
            if (mhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar4;
            }
            mhVar2.h.requestFocus();
            return false;
        }
        mh mhVar5 = this.binding;
        if (mhVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar5 = null;
        }
        if (String.valueOf(mhVar5.h.getText()).length() < 4) {
            mh mhVar6 = this.binding;
            if (mhVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar6 = null;
            }
            mhVar6.h.setError(u1().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 character with no special character"));
            mh mhVar7 = this.binding;
            if (mhVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar7;
            }
            mhVar2.h.requestFocus();
            return false;
        }
        mh mhVar8 = this.binding;
        if (mhVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar8 = null;
        }
        Editable text2 = mhVar8.c.getText();
        if (text2 != null && text2.length() == 0) {
            mh mhVar9 = this.binding;
            if (mhVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar9 = null;
            }
            mhVar9.c.setError(u1().b("PLEASE_ENTER_CHASSI", getString(R.string.please_enter_chassis_no)));
            mh mhVar10 = this.binding;
            if (mhVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar10;
            }
            mhVar2.c.requestFocus();
            return false;
        }
        mh mhVar11 = this.binding;
        if (mhVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar11 = null;
        }
        if (String.valueOf(mhVar11.c.getText()).length() < 5) {
            mh mhVar12 = this.binding;
            if (mhVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar12 = null;
            }
            mhVar12.c.setError(u1().b("INVALID_CHASSI", getString(R.string.invalid_chassis_no)));
            mh mhVar13 = this.binding;
            if (mhVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar13;
            }
            mhVar2.c.requestFocus();
            return false;
        }
        mh mhVar14 = this.binding;
        if (mhVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar14 = null;
        }
        Editable text3 = mhVar14.e.getText();
        if (text3 != null && text3.length() == 0) {
            mh mhVar15 = this.binding;
            if (mhVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar15 = null;
            }
            mhVar15.e.setError(u1().b("label_challan_enter_engine_no", getString(R.string.invalid_chassis_no)));
            mh mhVar16 = this.binding;
            if (mhVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar16;
            }
            mhVar2.e.requestFocus();
            return false;
        }
        mh mhVar17 = this.binding;
        if (mhVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar17 = null;
        }
        if (String.valueOf(mhVar17.e.getText()).length() < 5) {
            mh mhVar18 = this.binding;
            if (mhVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar18 = null;
            }
            mhVar18.e.setError(u1().b("INVALID_ENGINE", getString(R.string.invalid_engine_no)));
            mh mhVar19 = this.binding;
            if (mhVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar19;
            }
            mhVar2.e.requestFocus();
            return false;
        }
        mh mhVar20 = this.binding;
        if (mhVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar20 = null;
        }
        Editable text4 = mhVar20.i.getText();
        if (text4 != null && text4.length() == 0) {
            mh mhVar21 = this.binding;
            if (mhVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar21 = null;
            }
            mhVar21.i.setError(u1().b("REG_DATE", getString(R.string.please_enter_reg_date)));
            mh mhVar22 = this.binding;
            if (mhVar22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar22;
            }
            mhVar2.i.requestFocus();
            return false;
        }
        mh mhVar23 = this.binding;
        if (mhVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar23 = null;
        }
        Editable text5 = mhVar23.m.getText();
        if (text5 == null || text5.length() != 0) {
            return true;
        }
        mh mhVar24 = this.binding;
        if (mhVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar24 = null;
        }
        mhVar24.m.setError(u1().b("REG_UPTO", getString(R.string.please_enter_reg_upto)));
        mh mhVar25 = this.binding;
        if (mhVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            mhVar2 = mhVar25;
        }
        mhVar2.m.requestFocus();
        return false;
    }

    private final void x1() {
        mh mhVar = this.binding;
        mh mhVar2 = null;
        if (mhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar = null;
        }
        this.registrationDateEtString = String.valueOf(mhVar.i.getText());
        mh mhVar3 = this.binding;
        if (mhVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar3 = null;
        }
        this.registrationUptoEtString = String.valueOf(mhVar3.m.getText());
        L1((ar6) new z(this, new yq6(new xq6(v1()))).a(ar6.class));
        mh mhVar4 = this.binding;
        if (mhVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar4 = null;
        }
        mhVar4.i.setFocusable(0);
        mh mhVar5 = this.binding;
        if (mhVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar5 = null;
        }
        mhVar5.m.setFocusable(0);
        mh mhVar6 = this.binding;
        if (mhVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar6 = null;
        }
        mhVar6.n.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ri7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobileActivity.y1(this.a, view);
            }
        });
        mh mhVar7 = this.binding;
        if (mhVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar7 = null;
        }
        mhVar7.n.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.si7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobileActivity.z1(this.a, view);
            }
        });
        mh mhVar8 = this.binding;
        if (mhVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar8 = null;
        }
        mhVar8.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ti7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobileActivity.A1(this.a, view);
            }
        });
        mh mhVar9 = this.binding;
        if (mhVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar9 = null;
        }
        mhVar9.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ui7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobileActivity.B1(this.a, view);
            }
        });
        w1().h().g(this, new c(new a()));
        w1().g().g(this, new c(new b()));
        mh mhVar10 = this.binding;
        if (mhVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar10 = null;
        }
        mhVar10.m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vi7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobileActivity.C1(this.a, view);
            }
        });
        mh mhVar11 = this.binding;
        if (mhVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            mhVar2 = mhVar11;
        }
        mhVar2.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wi7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobileActivity.D1(this.a, view);
            }
        });
    }

    public static final void y1(VahanUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void z1(VahanUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1();
    }

    public final void J1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void K1(UpdateMobileNoService updateMobileNoService) {
        Intrinsics.checkNotNullParameter(updateMobileNoService, "<set-?>");
        this.retrofitService = updateMobileNoService;
    }

    public final void L1(ar6 ar6Var) {
        Intrinsics.checkNotNullParameter(ar6Var, "<set-?>");
        this.viewModel = ar6Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_update_mobile);
        mh mhVarC = mh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(mhVarC, "inflate(...)");
        this.binding = mhVarC;
        ProgressDialog progressDialog = null;
        if (mhVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVarC = null;
        }
        setContentView(mhVarC.b());
        ta3.a aVar = ta3.a;
        mh mhVar = this.binding;
        if (mhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar = null;
        }
        aVar.W2(this, mhVar);
        J1(new wa3(this));
        K1(UpdateMobileNoService.INSTANCE.a(this));
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        this.dialog = progressDialog2;
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog4 = this.dialog;
        if (progressDialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            progressDialog = progressDialog4;
        }
        progressDialog.setMessage(u1().b("label_challan_please_wait", "Please wait..."));
        x1();
    }

    public final wa3 u1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final UpdateMobileNoService v1() {
        UpdateMobileNoService updateMobileNoService = this.retrofitService;
        if (updateMobileNoService != null) {
            return updateMobileNoService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ar6 w1() {
        ar6 ar6Var = this.viewModel;
        if (ar6Var != null) {
            return ar6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
