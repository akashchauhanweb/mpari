package com.zepto;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.PayTaxActivity;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.VahanAlterationOfVehicle;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundingFeeActivity;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment;
import com.nic.mparivahan.VahanServices.Nominee.NomineeActivity;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAuthorizationPermit;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitMainScreen;
import com.nic.mparivahan.VahanServices.SpecialPermit.SPermitBasicDetailActivity;
import com.nic.mparivahan.VahanServices.TransferOfPermit.TransferOfPermit;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationContinuationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.RCReleaseActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TemporaryPermitActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateFitnessActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicatePermitActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcCancellationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcSurrenderActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.TOMultiSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity;
import com.nic.mparivahan.VahanServices.VahanView.VahanChangeOfAddress;
import com.nic.mparivahan.VahanServices.VahanView.VahanDetailsForRcParticulara;
import com.nic.mparivahan.VahanServices.VahanView.VahanRegistrationofR;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity;
import com.zepto.gz3;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gz3 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void h(Ref.ObjectRef dialog, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            ((Dialog) dialog.element).dismiss();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void i(Ref.ObjectRef dialog, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            ((Dialog) dialog.element).dismiss();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void l(Context context, Ref.ObjectRef dialog, View view) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            ((Activity) context).finish();
            ((Dialog) dialog.element).dismiss();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void m(Ref.ObjectRef dialog, Context context, HashMap serviceSelection_HashMap, boolean z, NrvDetails rcdetails, String aadhaarName, String aadhaarAddress, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "$serviceSelection_HashMap");
            Intrinsics.checkNotNullParameter(rcdetails, "$rcdetails");
            Intrinsics.checkNotNullParameter(aadhaarName, "$aadhaarName");
            Intrinsics.checkNotNullParameter(aadhaarAddress, "$aadhaarAddress");
            ((Dialog) dialog.element).dismiss();
            gz3.a.j(context, serviceSelection_HashMap, z, rcdetails, aadhaarName, aadhaarAddress);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void o(Context context, Ref.ObjectRef dialog, View view) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            ((Activity) context).finish();
            ((Dialog) dialog.element).dismiss();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void p(Ref.ObjectRef dialog, Context context, NrvDetails rcdetails, HashMap serviceSelection_HashMap, boolean z, String aadhaarName, String aadhaarAddress, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(rcdetails, "$rcdetails");
            Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "$serviceSelection_HashMap");
            Intrinsics.checkNotNullParameter(aadhaarName, "$aadhaarName");
            Intrinsics.checkNotNullParameter(aadhaarAddress, "$aadhaarAddress");
            ((Dialog) dialog.element).dismiss();
            Intent intent = new Intent(context, (Class<?>) TOMultiSelectionScreen.class);
            intent.putExtra("RC", rcdetails.getRc_regn_no());
            intent.putExtra("RcDetails", rcdetails);
            intent.putExtra("map", serviceSelection_HashMap);
            intent.putExtra("off_code", rcdetails.getRc_off_cd());
            intent.putExtra(VContant.NEXGEN_isFACELESS, z);
            intent.putExtra(VContant.NEXGEN_addahar_name, aadhaarName);
            intent.putExtra(VContant.NEXGEN_addahar_address, aadhaarAddress);
            context.startActivity(intent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [T, android.app.Dialog] */
        public final void g(Context context, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(context, "context");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? dialog = new Dialog(context);
            objectRef.element = dialog;
            dialog.requestWindowFeature(1);
            ((Dialog) objectRef.element).setContentView(R.layout.activity_my_custom_alert_diaolg);
            Window window = ((Dialog) objectRef.element).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) ((Dialog) objectRef.element).findViewById(R.id.btnClose);
            RecyclerView recyclerView = (RecyclerView) ((Dialog) objectRef.element).findViewById(R.id.service_list);
            TextView textView = (TextView) ((Dialog) objectRef.element).findViewById(R.id.rc_service);
            LinearLayout linearLayout = (LinearLayout) ((Dialog) objectRef.element).findViewById(R.id.okbuttondismiss);
            TextView textView2 = (TextView) ((Dialog) objectRef.element).findViewById(R.id.okbuttontextview);
            wa3 wa3Var = new wa3(context);
            textView.setText(wa3Var.b("rcServices", context.getString(R.string.rc_service)));
            textView2.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_text)));
            yn ynVar = new yn(context, arrayList);
            recyclerView.l0();
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(ynVar);
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.az3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gz3.a.h(objectRef, view);
                }
            });
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bz3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gz3.a.i(objectRef, view);
                }
            });
            ((Dialog) objectRef.element).show();
        }

        public final void j(Context context, HashMap serviceSelection_HashMap, boolean z, NrvDetails rcdetails, String aadhaarName, String aadhaarAddress) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
            Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
            Intrinsics.checkNotNullParameter(aadhaarName, "aadhaarName");
            Intrinsics.checkNotNullParameter(aadhaarAddress, "aadhaarAddress");
            Intent intent = serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC) ? new Intent(context, (Class<?>) VahanDuplicateRcActivity.class) : null;
            if (serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
                intent = new Intent(context, (Class<?>) VahanChangeOfAddress.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
                intent = new Intent(context, (Class<?>) HypothecationTerminationActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
                intent = new Intent(context, (Class<?>) HypothecationContinuationActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
                intent = new Intent(context, (Class<?>) HypothecationAdditionActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR)) {
                intent = new Intent(context, (Class<?>) VahanDetailsForRcParticulara.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.NOC)) {
                intent = new Intent(context, (Class<?>) VahanNocActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
                intent = new Intent(context, (Class<?>) HypothecationContinuationActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_FITNESS)) {
                intent = new Intent(context, (Class<?>) VahanDuplicateFitnessActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.RC_CANCALATION)) {
                intent = new Intent(context, (Class<?>) VahanRcCancellationActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.RC_SURRENDER)) {
                intent = new Intent(context, (Class<?>) VahanRcSurrenderActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_PERMIT)) {
                intent = new Intent(context, (Class<?>) VahanDuplicatePermitActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.PAY_TAX)) {
                intent = new Intent(context, (Class<?>) PayTaxActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.PAY_TAXASS)) {
                intent = new Intent(context, (Class<?>) PayTaxActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.RC_RELEASE)) {
                intent = new Intent(context, (Class<?>) RCReleaseActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.Temp_Permit)) {
                intent = new Intent(context, (Class<?>) TemporaryPermitActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
                intent = new Intent(context, (Class<?>) VahanTransferOfOwnerShipActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.NP_Permit)) {
                intent = new Intent(context, (Class<?>) RenewalOfNPAuthorizationPermit.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.PERMIT_RENEWAL)) {
                intent = new Intent(context, (Class<?>) RenewalOfPermitMainScreen.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.COMPOUND_FEE)) {
                intent = new Intent(context, (Class<?>) CompoundingFeeActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.Nominee_Addition)) {
                intent = new Intent(context, (Class<?>) NomineeActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.MISELL_PAYMENT)) {
                intent = new Intent(context, (Class<?>) MiscellaneousFeePayment.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.ALTERATION)) {
                intent = new Intent(context, (Class<?>) VahanAlterationOfVehicle.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.UPDATE_MOBILE)) {
                intent = new Intent(context, (Class<?>) VahanUpdateMobiActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.MULTI_SELECT_SERVICE)) {
                intent = new Intent(context, (Class<?>) VahanMultiSelectionScreen.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.SPEICAL_PERMIT)) {
                intent = new Intent(context, (Class<?>) SPermitBasicDetailActivity.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.RETENTION_REGISTRATION)) {
                intent = new Intent(context, (Class<?>) VahanRegistrationofR.class);
            }
            if (serviceSelection_HashMap.containsKey(VContant.TRANSFER_OF_PERMIT) || serviceSelection_HashMap.containsKey(VContant.TRANSFER_OF_PERMIT_DEATH_CASE) || serviceSelection_HashMap.containsKey(VContant.TRANSFER_OF_PERMIT_SURRENDER)) {
                intent = new Intent(context, (Class<?>) TransferOfPermit.class);
            }
            if (intent != null) {
                intent.putExtra("RC", rcdetails.getRc_regn_no());
            }
            if (intent != null) {
                intent.putExtra("RcDetails", rcdetails);
            }
            if (intent != null) {
                intent.putExtra("map", serviceSelection_HashMap);
            }
            if (intent != null) {
                intent.putExtra("off_code", rcdetails.getRc_off_cd());
            }
            if (intent != null) {
                intent.putExtra(VContant.NEXGEN_isFACELESS, z);
            }
            if (intent != null) {
                intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
            }
            if (intent != null) {
                intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
            }
            context.startActivity(intent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, android.app.Dialog] */
        public final void k(final Context context, ArrayList arrayList, final NrvDetails rcdetails, final HashMap serviceSelection_HashMap, final boolean z, final String aadhaarName, final String aadhaarAddress, String disPlayName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
            Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
            Intrinsics.checkNotNullParameter(aadhaarName, "aadhaarName");
            Intrinsics.checkNotNullParameter(aadhaarAddress, "aadhaarAddress");
            Intrinsics.checkNotNullParameter(disPlayName, "disPlayName");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? dialog = new Dialog(context);
            objectRef.element = dialog;
            dialog.requestWindowFeature(1);
            ((Dialog) objectRef.element).setContentView(R.layout.viewdoclist);
            Window window = ((Dialog) objectRef.element).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            RecyclerView recyclerView = (RecyclerView) ((Dialog) objectRef.element).findViewById(R.id.service_list);
            TextView textView = (TextView) ((Dialog) objectRef.element).findViewById(R.id.rc_service);
            LinearLayout linearLayout = (LinearLayout) ((Dialog) objectRef.element).findViewById(R.id.closeButton);
            LinearLayout linearLayout2 = (LinearLayout) ((Dialog) objectRef.element).findViewById(R.id.okbuttondismiss);
            TextView textView2 = (TextView) ((Dialog) objectRef.element).findViewById(R.id.okbuttontextview);
            TextView textView3 = (TextView) ((Dialog) objectRef.element).findViewById(R.id.service_name);
            TextView textView4 = (TextView) ((Dialog) objectRef.element).findViewById(R.id.notes);
            wa3 wa3Var = new wa3(context);
            textView.setText(wa3Var.b("required_doc_list", context.getString(R.string.requiredDoclist)));
            textView2.setText(wa3Var.b("button_proceed", context.getString(R.string.proceed)));
            textView4.setText(wa3Var.b("docListNot_dsc", context.getString(R.string.docListNot_dsc)));
            textView3.setText(disPlayName.toString());
            zn znVar = new zn(context, arrayList);
            recyclerView.l0();
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(znVar);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ez3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gz3.a.l(context, objectRef, view);
                }
            });
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fz3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gz3.a.m(objectRef, context, serviceSelection_HashMap, z, rcdetails, aadhaarName, aadhaarAddress, view);
                }
            });
            ((Dialog) objectRef.element).show();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, android.app.Dialog] */
        public final void n(final Context context, ArrayList arrayList, final NrvDetails rcdetails, final HashMap serviceSelection_HashMap, final boolean z, final String aadhaarName, final String aadhaarAddress, String disPlayName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
            Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
            Intrinsics.checkNotNullParameter(aadhaarName, "aadhaarName");
            Intrinsics.checkNotNullParameter(aadhaarAddress, "aadhaarAddress");
            Intrinsics.checkNotNullParameter(disPlayName, "disPlayName");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? dialog = new Dialog(context);
            objectRef.element = dialog;
            dialog.requestWindowFeature(1);
            ((Dialog) objectRef.element).setContentView(R.layout.viewdoclist);
            Window window = ((Dialog) objectRef.element).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            RecyclerView recyclerView = (RecyclerView) ((Dialog) objectRef.element).findViewById(R.id.service_list);
            TextView textView = (TextView) ((Dialog) objectRef.element).findViewById(R.id.rc_service);
            LinearLayout linearLayout = (LinearLayout) ((Dialog) objectRef.element).findViewById(R.id.closeButton);
            LinearLayout linearLayout2 = (LinearLayout) ((Dialog) objectRef.element).findViewById(R.id.okbuttondismiss);
            TextView textView2 = (TextView) ((Dialog) objectRef.element).findViewById(R.id.okbuttontextview);
            TextView textView3 = (TextView) ((Dialog) objectRef.element).findViewById(R.id.service_name);
            TextView textView4 = (TextView) ((Dialog) objectRef.element).findViewById(R.id.notes);
            wa3 wa3Var = new wa3(context);
            textView.setText(wa3Var.b("required_doc_list", context.getString(R.string.requiredDoclist)));
            textView2.setText(wa3Var.b("button_proceed", context.getString(R.string.proceed)));
            textView4.setText(wa3Var.b("docListNot_dsc", context.getString(R.string.docListNot_dsc)));
            textView3.setText(disPlayName.toString());
            zn znVar = new zn(context, arrayList);
            recyclerView.l0();
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(znVar);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cz3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gz3.a.o(context, objectRef, view);
                }
            });
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dz3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gz3.a.p(objectRef, context, rcdetails, serviceSelection_HashMap, z, aadhaarName, aadhaarAddress, view);
                }
            });
            ((Dialog) objectRef.element).show();
        }
    }
}
