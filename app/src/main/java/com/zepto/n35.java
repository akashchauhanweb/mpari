package com.zepto;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity;
import com.zepto.n35;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n35 {
    public static final a a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.n35$a$a, reason: collision with other inner class name */
        public static final class CountDownTimerC0104a extends CountDownTimer {
            public final /* synthetic */ TextView a;
            public final /* synthetic */ Ref.ObjectRef b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ TextView d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CountDownTimerC0104a(TextView textView, Ref.ObjectRef objectRef, Context context, TextView textView2) {
                super(30000L, 1000L);
                this.a = textView;
                this.b = objectRef;
                this.c = context;
                this.d = textView2;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.d.setVisibility(0);
                this.a.setText("0");
                this.a.setVisibility(8);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                this.a.setText(((wa3) this.b.element).b("time_remaining", this.c.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
                this.d.setVisibility(8);
                this.a.setVisibility(0);
            }
        }

        public static final class b extends CountDownTimer {
            public final /* synthetic */ TextView a;
            public final /* synthetic */ Ref.ObjectRef b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ TextView d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TextView textView, Ref.ObjectRef objectRef, Context context, TextView textView2) {
                super(30000L, 1000L);
                this.a = textView;
                this.b = objectRef;
                this.c = context;
                this.d = textView2;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.d.setVisibility(0);
                this.a.setText("0");
                this.a.setVisibility(8);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                this.a.setText(((wa3) this.b.element).b("time_remaining", this.c.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
                this.d.setVisibility(8);
                this.a.setVisibility(0);
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void j(Dialog d, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            d.dismiss();
        }

        public static final void k(Dialog d, Context context, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            d.dismiss();
            context.startActivity(new Intent(context, (Class<?>) VahanUpdateMobiActivity.class));
        }

        public static final void n(EditText enterOtp, ImageView shownPin, View view) {
            Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
            Intrinsics.checkNotNullParameter(shownPin, "$shownPin");
            if (enterOtp.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                shownPin.setImageResource(R.drawable.pass_visible);
                enterOtp.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                shownPin.setImageResource(R.drawable.mvvm_visibility);
                enterOtp.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }

        public static final void o(ProgressDialog pDialog, p26 viewModel, String otpid, TextView time_text, Ref.ObjectRef langSession, Context context, TextView resendOtp, View view) {
            Intrinsics.checkNotNullParameter(pDialog, "$pDialog");
            Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
            Intrinsics.checkNotNullParameter(otpid, "$otpid");
            Intrinsics.checkNotNullParameter(time_text, "$time_text");
            Intrinsics.checkNotNullParameter(langSession, "$langSession");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
            new b(time_text, langSession, context, resendOtp).start();
            pDialog.show();
            viewModel.y(otpid);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void p(EditText enterOtp, Context context, Ref.ObjectRef langSession, Activity activity, ProgressDialog pDialog, p26 viewModel, String otpid, String rc, String docType, String dob, View view) {
            Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(langSession, "$langSession");
            Intrinsics.checkNotNullParameter(activity, "$activity");
            Intrinsics.checkNotNullParameter(pDialog, "$pDialog");
            Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
            Intrinsics.checkNotNullParameter(otpid, "$otpid");
            Intrinsics.checkNotNullParameter(rc, "$rc");
            Intrinsics.checkNotNullParameter(docType, "$docType");
            Intrinsics.checkNotNullParameter(dob, "$dob");
            String string = enterOtp.getText().toString();
            if (string.length() == 0) {
                Toast.makeText(context, ((wa3) langSession.element).b("label_log_entr_otp", context.getString(R.string.pls_enter_otp)), 0).show();
                return;
            }
            if (string.length() < 6) {
                Toast.makeText(context, ((wa3) langSession.element).b("label_log_entr_val_otp", "Please enter the valid OTP"), 0).show();
                return;
            }
            gd1.a.l(activity);
            if (pDialog.isShowing()) {
                pDialog.dismiss();
            }
            pDialog.show();
            viewModel.G(string, otpid, rc, docType, dob, context);
        }

        public static final void q(EditText enterOtp, View view) {
            Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
            enterOtp.setText("");
        }

        public static final void r(Dialog d, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            d.dismiss();
        }

        public static final void s(Dialog d, Context context, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            Intrinsics.checkNotNullParameter(context, "$context");
            d.dismiss();
            context.startActivity(new Intent(context, (Class<?>) VahanUpdateMobiActivity.class));
        }

        public final void i(final Context context, String str) {
            Intrinsics.checkNotNull(context);
            final Dialog dialog = new Dialog(context);
            wa3 wa3Var = new wa3(context);
            dialog.setContentView(R.layout.messagedig);
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = dialog.findViewById(R.id.close);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) viewFindViewById3;
            View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
            Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
            textView.setText(wa3Var.b("update_Mobile_No", "Update Mobile No"));
            textView2.setText(wa3Var.b("btn_dl_serv_close", "Close"));
            ((TextView) viewFindViewById).setText(str);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n35.a.j(dialog, view);
                }
            });
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n35.a.k(dialog, context, view);
                }
            });
            dialog.show();
        }

        public final int l(Context context, NrvDetails searchNrvDetails) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(searchNrvDetails, "searchNrvDetails");
            try {
                DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(context);
                Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
                NrvDetails nrvDetailsF0 = databaseHelperD0.F0(searchNrvDetails.getRc_regn_no());
                Intrinsics.checkNotNullExpressionValue(nrvDetailsF0, "getRCDetails(...)");
                String rc_tax_upto = searchNrvDetails.getRc_tax_upto();
                String rc_insurance_upto = searchNrvDetails.getRc_insurance_upto();
                NrvDetails nrvDetailsCopy = nrvDetailsF0.copy(((-133121) & 1) != 0 ? nrvDetailsF0.rc_blacklist_status : null, ((-133121) & 2) != 0 ? nrvDetailsF0.rc_body_type_desc : null, ((-133121) & 4) != 0 ? nrvDetailsF0.rc_c_state : null, ((-133121) & 8) != 0 ? nrvDetailsF0.rc_chasi_no : null, ((-133121) & 16) != 0 ? nrvDetailsF0.rc_color : null, ((-133121) & 32) != 0 ? nrvDetailsF0.rc_cubic_cap : null, ((-133121) & 64) != 0 ? nrvDetailsF0.rc_email_id : null, ((-133121) & 128) != 0 ? nrvDetailsF0.rc_eng_no : null, ((-133121) & 256) != 0 ? nrvDetailsF0.rc_f_name : null, ((-133121) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? nrvDetailsF0.rc_financed_from : null, ((-133121) & 1024) != 0 ? nrvDetailsF0.rc_financer : null, ((-133121) & 2048) != 0 ? nrvDetailsF0.rc_fit_upto : searchNrvDetails.getRc_fit_upto(), ((-133121) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? nrvDetailsF0.rc_fuel_cd : null, ((-133121) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? nrvDetailsF0.rc_fuel_desc : null, ((-133121) & 16384) != 0 ? nrvDetailsF0.rc_gvw : null, ((-133121) & 32768) != 0 ? nrvDetailsF0.rc_insurance_comp : null, ((-133121) & 65536) != 0 ? nrvDetailsF0.rc_insurance_policy_no : null, ((-133121) & 131072) != 0 ? nrvDetailsF0.rc_insurance_upto : rc_insurance_upto, ((-133121) & 262144) != 0 ? nrvDetailsF0.rc_maker_cd : null, ((-133121) & 524288) != 0 ? nrvDetailsF0.rc_maker_desc : null, ((-133121) & 1048576) != 0 ? nrvDetailsF0.rc_maker_model : null, ((-133121) & 2097152) != 0 ? nrvDetailsF0.rc_manu_month : null, ((-133121) & 4194304) != 0 ? nrvDetailsF0.rc_manu_month_yr : null, ((-133121) & 8388608) != 0 ? nrvDetailsF0.rc_manu_yr : null, ((-133121) & 16777216) != 0 ? nrvDetailsF0.rc_mobile_no : null, ((-133121) & 33554432) != 0 ? nrvDetailsF0.rc_ncrb_status : null, ((-133121) & 67108864) != 0 ? nrvDetailsF0.rc_no_cyl : null, ((-133121) & 134217728) != 0 ? nrvDetailsF0.rc_noc_details : null, ((-133121) & 268435456) != 0 ? nrvDetailsF0.rc_non_use_from : null, ((-133121) & 536870912) != 0 ? nrvDetailsF0.rc_non_use_status : null, ((-133121) & 1073741824) != 0 ? nrvDetailsF0.rc_non_use_to : null, ((-133121) & IntCompanionObject.MIN_VALUE) != 0 ? nrvDetailsF0.rc_norms_cd : null, ((-33591305) & 1) != 0 ? nrvDetailsF0.rc_norms_desc : null, ((-33591305) & 2) != 0 ? nrvDetailsF0.rc_np_issued_by : null, ((-33591305) & 4) != 0 ? nrvDetailsF0.rc_np_no : null, ((-33591305) & 8) != 0 ? nrvDetailsF0.rc_np_upto : searchNrvDetails.getRc_np_upto(), ((-33591305) & 16) != 0 ? nrvDetailsF0.rc_off_cd : null, ((-33591305) & 32) != 0 ? nrvDetailsF0.rc_owner_name : null, ((-33591305) & 64) != 0 ? nrvDetailsF0.rc_owner_sr : null, ((-33591305) & 128) != 0 ? nrvDetailsF0.rc_permanent_address : null, ((-33591305) & 256) != 0 ? nrvDetailsF0.rc_permit_issue_dt : null, ((-33591305) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? nrvDetailsF0.rc_permit_no : null, ((-33591305) & 1024) != 0 ? nrvDetailsF0.rc_permit_type : null, ((-33591305) & 2048) != 0 ? nrvDetailsF0.rc_permit_valid_from : null, ((-33591305) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? nrvDetailsF0.rc_permit_valid_upto : searchNrvDetails.getRc_permit_valid_upto(), ((-33591305) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? nrvDetailsF0.rc_present_address : null, ((-33591305) & 16384) != 0 ? nrvDetailsF0.rc_pucc_no : null, ((-33591305) & 32768) != 0 ? nrvDetailsF0.rc_pucc_upto : searchNrvDetails.getRc_pucc_upto(), ((-33591305) & 65536) != 0 ? nrvDetailsF0.rc_registered_at : null, ((-33591305) & 131072) != 0 ? nrvDetailsF0.rc_regn_dt : null, ((-33591305) & 262144) != 0 ? nrvDetailsF0.rc_regn_no : null, ((-33591305) & 524288) != 0 ? nrvDetailsF0.rc_regn_type : null, ((-33591305) & 1048576) != 0 ? nrvDetailsF0.rc_seat_cap : null, ((-33591305) & 2097152) != 0 ? nrvDetailsF0.rc_sleeper_cap : null, ((-33591305) & 4194304) != 0 ? nrvDetailsF0.rc_stand_cap : null, ((-33591305) & 8388608) != 0 ? nrvDetailsF0.rc_status : null, ((-33591305) & 16777216) != 0 ? nrvDetailsF0.rc_status_as_on : null, ((-33591305) & 33554432) != 0 ? nrvDetailsF0.rc_tax_upto : rc_tax_upto, ((-33591305) & 67108864) != 0 ? nrvDetailsF0.rc_unld_wt : null, ((-33591305) & 134217728) != 0 ? nrvDetailsF0.rc_vch_catg : null, ((-33591305) & 268435456) != 0 ? nrvDetailsF0.rc_vch_catg_desc : null, ((-33591305) & 536870912) != 0 ? nrvDetailsF0.rc_vh_class_cd : null, ((-33591305) & 1073741824) != 0 ? nrvDetailsF0.rc_vh_class_desc : null, ((-33591305) & IntCompanionObject.MIN_VALUE) != 0 ? nrvDetailsF0.rc_wheelbase : null, (7 & 1) != 0 ? nrvDetailsF0.state_cd : null, (7 & 2) != 0 ? nrvDetailsF0.rc_owner_desc : null, (7 & 4) != 0 ? nrvDetailsF0.stautsMessage : null);
                int iU0 = databaseHelperD0.U0(nrvDetailsCopy.getRc_regn_no(), nrvDetailsCopy);
                if (iU0 > 0) {
                    return iU0;
                }
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v9, types: [T, com.zepto.wa3] */
        public final Dialog m(final Activity activity, final Context context, String mobile_no, final p26 viewModel, final String otpid, final String rc, final String docType, final String dob, final ProgressDialog pDialog) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(otpid, "otpid");
            Intrinsics.checkNotNullParameter(rc, "rc");
            Intrinsics.checkNotNullParameter(docType, "docType");
            Intrinsics.checkNotNullParameter(dob, "dob");
            Intrinsics.checkNotNullParameter(pDialog, "pDialog");
            final Dialog dialog = new Dialog(context);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new wa3(context);
            dialog.setContentView(R.layout.validateforotpscreen);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.show();
            View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = dialog.findViewById(R.id.resendOtp);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            final TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = dialog.findViewById(R.id.showmpin);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
            final ImageView imageView2 = (ImageView) viewFindViewById3;
            View viewFindViewById4 = dialog.findViewById(R.id.submitOtp);
            Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) viewFindViewById4;
            View viewFindViewById5 = dialog.findViewById(R.id.enterOtp);
            Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
            final EditText editText = (EditText) viewFindViewById5;
            View viewFindViewById6 = dialog.findViewById(R.id.time_text);
            Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
            final TextView textView3 = (TextView) viewFindViewById6;
            View viewFindViewById7 = dialog.findViewById(R.id.txt_reset);
            Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView4 = (TextView) viewFindViewById7;
            View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
            Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView5 = (TextView) viewFindViewById8;
            View viewFindViewById9 = dialog.findViewById(R.id.disPlay);
            Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById10 = dialog.findViewById(R.id.enter_otp_txt);
            Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById11 = dialog.findViewById(R.id.update_mob);
            Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView6 = (TextView) viewFindViewById11;
            View viewFindViewById12 = dialog.findViewById(R.id.note_text);
            Intrinsics.checkNotNull(viewFindViewById12, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView7 = (TextView) viewFindViewById12;
            ((TextView) viewFindViewById10).setText(((wa3) objectRef.element).b("edit_enter_otp", context.getString(R.string.enter_otp)));
            ((TextView) viewFindViewById9).setText(((wa3) objectRef.element).b("otp_verification", context.getString(R.string.otp_verification)));
            textView2.setText(((wa3) objectRef.element).b("vahan_btn_submit", context.getString(R.string.submit)));
            textView4.setText(((wa3) objectRef.element).b("btn_reset", context.getString(R.string.reset)));
            textView.setText(((wa3) objectRef.element).b("label_resend_otp", context.getString(R.string.resend_otp)));
            editText.setHint(((wa3) objectRef.element).b("edit_enter_otp", context.getString(R.string.enter_otp)));
            if (docType.equals("RC")) {
                textView6.setText(((wa3) objectRef.element).b("update_Mobile_No", context.getString(R.string.update2)));
                textView7.setText(((wa3) objectRef.element).b("mobile_number_is_added", context.getString(R.string.mobile_correct_added)));
            } else {
                textView6.setVisibility(8);
                textView7.setVisibility(8);
            }
            int length = mobile_no.length();
            String strReplace = "";
            for (int i = 0; i < length; i++) {
                mobile_no.charAt(i);
                strReplace = new Regex("\\d(?=\\d{4})").replace(new Regex("[^0-9]").replace(mobile_no, ""), "X");
            }
            textView5.setText(((wa3) objectRef.element).b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)) + "\n+91 " + strReplace);
            new CountDownTimerC0104a(textView3, objectRef, context, textView).start();
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n35.a.n(editText, imageView2, view);
                }
            });
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n35.a.o(pDialog, viewModel, otpid, textView3, objectRef, context, textView, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n35.a.p(editText, context, objectRef, activity, pDialog, viewModel, otpid, rc, docType, dob, view);
                }
            });
            textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n35.a.q(editText, view);
                }
            });
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n35.a.r(dialog, view);
                }
            });
            textView6.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n35.a.s(dialog, context, view);
                }
            });
            return dialog;
        }
    }
}
