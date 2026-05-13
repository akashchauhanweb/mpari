package com.zepto;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.va3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ta3 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void A(Context context, hd1 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.u0.setText(wa3Var.b("vehicle_alerts", "Vehicle Alerts"));
            binding.k0.setText(wa3Var.b("radio_btn_vehicle_no", "Vehicle Number"));
            binding.k.setText(wa3Var.b("fitness_valid_upto", "Fitness Valid Upto"));
            binding.b0.setText(wa3Var.b("tax_valid_upto", "Tax Valid Upto"));
            binding.s.setText(wa3Var.b("insurance_valid_upto", "Insurance Valid UpTo"));
            binding.H.setText(wa3Var.b("pucc_valid_upto", "PUCC Valid UpTo"));
            binding.j0.setText(wa3Var.b("permit_valid_upto", "Permit Valid UpTo"));
            binding.h0.setText(wa3Var.b("national_permit_no", "National Permit No."));
            binding.C.setText(wa3Var.b("tap_notify", "We will notify you 30 days before the any validity expiry."));
        }

        public final void A0(Context context, x8 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.Y.setText(wa3Var.b("label_virtual_dl", context.getString(R.string.virtual_dl)));
            binding.T.setText(wa3Var.b("vahan_state", context.getString(R.string.state)));
            binding.v.setText(wa3Var.b("last_update", context.getString(R.string.last_update)));
            binding.m.setText(wa3Var.b("holder_name", context.getString(R.string.driver_details_)));
            binding.n.setText(wa3Var.b("vahan_owner_name", context.getString(R.string.owner_name)));
            binding.M.setText(wa3Var.b("label_sdf", context.getString(R.string.relation)));
            binding.F.setText(wa3Var.b("label_dl_serv_present_addr", context.getString(R.string.present_address)));
            binding.D.setText(wa3Var.b("permanent_add_details", context.getString(R.string.permanent_address)));
            binding.s.setText(wa3Var.b("issue_date", context.getString(R.string.issue_date)));
            binding.a0.setText(wa3Var.b("makerTitle", context.getString(R.string.valid_upto_v3_)));
            binding.V.setText(wa3Var.b("makerTitle_t", context.getString(R.string.transport_validity)));
            binding.i.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            binding.b.setText(wa3Var.b("blood_group", context.getString(R.string.blood_group)));
            binding.c0.setText(wa3Var.b("vehicle_class", context.getString(R.string.vehicle_class)));
            binding.P.setText(wa3Var.b("vahan_rto", context.getString(R.string.rto)));
            binding.Q.setText(wa3Var.b("registeringAuthTitle", context.getString(R.string.registering_auth_l)));
            binding.r.setText(wa3Var.b("tap_to_check", context.getString(R.string.driving_licence_tap_text)));
            binding.e0.setText(wa3Var.b("driving_licence_impound", context.getString(R.string.driving_licence_impound)));
            binding.e0.setText(wa3Var.b("driving_licence_impound", context.getString(R.string.driving_licence_impound)));
            binding.K.setText(wa3Var.b("recent_challan", context.getString(R.string.recent_challan_details)));
            binding.X.setText(wa3Var.b("note2", context.getString(R.string.dl_note)));
            binding.y.setText(wa3Var.b("edit_mobile_no", "Mobile No."));
        }

        public final void A1(Context context, jb4 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.g.setText(wa3Var.b("add_NomnName", context.getString(R.string.nominee_name)));
            binding.i.setHint(wa3Var.b("enterAdd_NomnName", context.getString(R.string.enter_nominee_name)));
            binding.b.setText(wa3Var.b("Add_NomnWithRelation", context.getString(R.string.relation_with_nominee)));
            binding.e.setText(wa3Var.b("Add_NomnDate", context.getString(R.string.nomination_date)));
            binding.f.setText(wa3Var.b("edit_enter_dob", context.getString(R.string.dd_mm_yyyy)));
            binding.d.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.c.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void A2(Context context, eh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.q.i.setText(wa3Var.b("label_dl_serv_update_mob", context.getString(R.string.update_mobile_no_1)));
            binding.r.setText(wa3Var.b("update_Mobile_No", context.getString(R.string.update_mobile_no)));
            binding.c.setText(wa3Var.b("enter_aadhaar_no", context.getString(R.string.enter_aadhaar_no)));
            binding.b.setHint(wa3Var.b("enter_aadhaar_no", context.getString(R.string.enter_aadhaar_no)));
            binding.m.setHint(wa3Var.b("enter_name_as_per_aadhar", context.getString(R.string.enter_name_as_per_aadhar)));
            binding.l.setText(wa3Var.b("enter_mobile_as_per_aadhar", context.getString(R.string.enter_mobile_as_per_aadhar)));
            binding.f.setHint(wa3Var.b("enter_mobile_as_per_aadhar", context.getString(R.string.enter_mobile_as_per_aadhar)));
            binding.h.setText(wa3Var.b("enter_new_mobile_no", context.getString(R.string.enter_new_mobile_no)));
            binding.g.setHint(wa3Var.b("enter_new_mobile_no", context.getString(R.string.enter_new_mobile_no)));
            binding.d.setText(wa3Var.b("agree_terms_cond", context.getString(R.string.agree_terms_cond)));
            binding.j.setText(wa3Var.b("notes", context.getString(R.string.notes)));
            binding.i.setText(wa3Var.b("dl_serv_note", context.getString(R.string.new_note)));
            binding.s.setText(wa3Var.b("update_Mobile_No", context.getString(R.string.update_mobile_no)));
            binding.e.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void B(Context context, h6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.T.setText(wa3Var.b("fancyNo_RegnNo", context.getString(R.string.reg_no)));
            binding.d.setText(wa3Var.b("fancyNo_AckNo", context.getString(R.string.acknowlegement_no)));
            binding.E.setText(wa3Var.b("cp_receipt_number", context.getString(R.string.receipt_no)));
            binding.y.setText(wa3Var.b("vahan_owner_name", context.getString(R.string.owner_name)));
            binding.r.setText(wa3Var.b("fancyNo_fatherName", context.getString(R.string.father_name)));
            binding.v.setText(wa3Var.b("label_dl_serv_mob_no", context.getString(R.string.mobile_no)));
            binding.g.setText(wa3Var.b("address", context.getString(R.string.address_l)));
            binding.B.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.O.setText(wa3Var.b("label_challan_state", context.getString(R.string.state)));
            binding.L.setText(wa3Var.b("vahan_rto", context.getString(R.string.rto)));
            binding.I.setText(wa3Var.b("fancyNo_ReserveEmdPrice", context.getString(R.string.reserve_emd_price)));
            binding.m.setText(wa3Var.b("fancyNo_finalAuctionPrice", context.getString(R.string.final_auction_price)));
            binding.p.setText(wa3Var.b("fancyNo_BookingDate", context.getString(R.string.booking_date)));
            binding.j.setText(wa3Var.b("fancyNo_AllotmentType", context.getString(R.string.allotment_type)));
            binding.R.setText(wa3Var.b("btn_challan_status", context.getString(R.string.status)));
        }

        public final void B0(Context context, va dms) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dms, "dms");
            wa3 wa3Var = new wa3(context);
            dms.L.b.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            dms.L.c.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            dms.L.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            dms.L.d.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            dms.L.f.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            dms.Y.setText(wa3Var.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            dms.P.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
            dms.U.setText(wa3Var.b("label_dl_serv_appl_no", context.getString(R.string.app_number)));
            dms.T.setText(wa3Var.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_details)));
            dms.S.setText(wa3Var.b("label_dl_serv_appl_date", context.getString(R.string.app_date)));
            dms.W.setText(wa3Var.b("label_name", context.getString(R.string.your_name)));
            dms.X.setText(wa3Var.b("label_sdf", context.getString(R.string.sdo_of)));
            dms.Q.setText(wa3Var.b("title_dl_serv_upload_req_doc", context.getString(R.string.upload)));
            dms.R.setText(wa3Var.b("title_dl_serv_allow_file_size", context.getString(R.string.allow_file_types)));
            dms.Z.setText(wa3Var.b("btn_dl_serv_upload_doc", context.getString(R.string.upload_doc)));
            dms.V.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
        }

        public final void B1(Context context, yb4 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.k.setText(wa3Var.b("vahan_registration_no", context.getString(R.string.registration_no)));
            binding.h.setHint(wa3Var.b("vahan_enter_registration_no", context.getString(R.string.enter_registration_no)));
            binding.b.setText(wa3Var.b("lbl_vahan_chassisNo_full", context.getString(R.string.chassis_no_full)));
            binding.c.setHint(wa3Var.b("vahan_enter_chassis_no", context.getString(R.string.enter_chasis_no)));
            binding.d.setText(wa3Var.b("lbl_vahan_engineNo_full", context.getString(R.string.engine_no_full)));
            binding.e.setHint(wa3Var.b("lbl_vahan_enter_engine_no", context.getString(R.string.enter_engine_no)));
            binding.j.setText(wa3Var.b("registration_date", context.getString(R.string.registration_dt)));
            binding.i.setHint(wa3Var.b("edit_enter_dob", context.getString(R.string.dd_mm_yyyy)));
            binding.l.setText(wa3Var.b("lbl_vahan_registration_upto_date", context.getString(R.string.registration_upto_date)));
            binding.m.setHint(wa3Var.b("edit_enter_dob", context.getString(R.string.dd_mm_yyyy)));
            binding.g.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.f.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void B2(Context context, r45 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.K0.setText(wa3Var.b("vehicle_details", context.getString(R.string.vehicle_details)));
            binding.v.setText(wa3Var.b("owner_details", context.getString(R.string.owner_details)));
            binding.c0.setText(wa3Var.b("vahan_owner_name", context.getString(R.string.owner_name)));
            binding.y0.setText(wa3Var.b("relation", context.getString(R.string.relation)));
            binding.C0.setText(wa3Var.b("as_per_aadhar", context.getString(R.string.as_per_aadhar)));
            binding.d0.setText(wa3Var.b("vahan_owner_name", context.getString(R.string.owner_name)));
            binding.d.setText(wa3Var.b("current_address", context.getString(R.string.current_add)));
            binding.B0.setText(wa3Var.b("current_address", context.getString(R.string.current_add)));
            binding.y.setText(wa3Var.b("vehicle_details", context.getString(R.string.vehicle_details)));
            binding.H0.setText(wa3Var.b("vehicle_class", context.getString(R.string.vehicle_class)));
            binding.G0.setText(wa3Var.b("vehicle_details", context.getString(R.string.vehicle_category)));
            binding.P.setText(wa3Var.b("maker_name", context.getString(R.string.maker_name)));
            binding.N.setText(wa3Var.b("maker_model", context.getString(R.string.maker_model)));
            binding.w0.setText(wa3Var.b("registration_date", context.getString(R.string.registration_date)));
            binding.r.setText(wa3Var.b("fuel_type", context.getString(R.string.fuel_type)));
            binding.a0.setText(wa3Var.b("norms_description", context.getString(R.string.norms_description)));
            binding.p.setText(wa3Var.b("fitness_valid_upto", context.getString(R.string.fitness_valid_upto)));
            binding.z0.setText(wa3Var.b("tax_valid_upto", context.getString(R.string.tax_valid_upto)));
            binding.x.setText(wa3Var.b("pucc_details", context.getString(R.string.pucc_details)));
            binding.u0.setText(wa3Var.b("pucc_valid_upto", context.getString(R.string.pucc_valid_upto)));
            binding.v0.setHint(wa3Var.b("pucc_valid_upto", context.getString(R.string.enter_pucc_valid_upto)));
            binding.t.setText(wa3Var.b("insurance_details", context.getString(R.string.insurance_details)));
            binding.C.setText(wa3Var.b("insurance_policy_no", context.getString(R.string.insurance_policy_no)));
            binding.D.setText(wa3Var.b("enter_insurance_policy_number", context.getString(R.string.enter_insurance_policy_number)));
            binding.A.setText(wa3Var.b("insurance_company_name", context.getString(R.string.insurance_company_name)));
            binding.z.setText(wa3Var.b("insurance_company", context.getString(R.string.insurance_company)));
            binding.E.setText(wa3Var.b("insurance_valid_upto", context.getString(R.string.insurance_valid_upto)));
            binding.F.setText(wa3Var.b("insurance_valid_upto", context.getString(R.string.insurance_valid_upto)));
            binding.u.setText(wa3Var.b("financer_details", context.getString(R.string.financer_details)));
            binding.l.setText(wa3Var.b("financed_from", context.getString(R.string.financed_from)));
            binding.w.setText(wa3Var.b("permit_details", context.getString(R.string.permit_details)));
            binding.j0.setText(wa3Var.b("permit_no", context.getString(R.string.permit_no)));
            binding.k0.setHint(wa3Var.b("rc_Surr_enter_PermitNo", context.getString(R.string.enter_permit_no)));
            binding.l0.setText(wa3Var.b("permit_type", context.getString(R.string.permit_type)));
            binding.m0.setHint(wa3Var.b("enter_permit_type", context.getString(R.string.enter_permit_type)));
            binding.h0.setText(wa3Var.b("permit_issue_date", context.getString(R.string.permit_issue_date)));
            binding.i0.setHint(wa3Var.b("permit_issue_date", context.getString(R.string.permit_issue_date)));
            binding.o0.setText(wa3Var.b("permit_valid_from", context.getString(R.string.permit_valid_from)));
            binding.p0.setHint(wa3Var.b("enter_permit_valid_from", context.getString(R.string.enter_permit_valid_from)));
            binding.q0.setText(wa3Var.b("permit_valid_upto", context.getString(R.string.permit_valid_upto)));
            binding.p0.setHint(wa3Var.b("enter_permit_valid_from", context.getString(R.string.enter_permit_valid_from)));
            binding.S.setText(wa3Var.b("national_permit_no", context.getString(R.string.national_permit_no)));
            binding.T.setHint(wa3Var.b("rc_Surr_enter_PermitNo", context.getString(R.string.enter_permit_no)));
            binding.Q.setText(wa3Var.b("national_permit_issued_by", context.getString(R.string.national_permit_issued_by)));
            binding.R.setHint(wa3Var.b("enter_permit_issued_by", context.getString(R.string.enter_permit_issued_by)));
            binding.V.setText(wa3Var.b("national_permit_valid_upto", context.getString(R.string.national_permit_valid_upto)));
            binding.U.setHint(wa3Var.b("permit_valid_upto", context.getString(R.string.permit_valid_upto)));
            binding.W.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void C(Context context, i6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.b.setText(wa3Var.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
            binding.h.setHint(wa3Var.b("enter_FancyRecpNo", context.getString(R.string.enter_receipt_no)));
            binding.f.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.d.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void C0(Context context, db binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.c.setText(wa3Var.b("cp_for_state", context.getString(R.string.for_state)));
            binding.h.setText(wa3Var.b("fancyNo_SelectStateName", context.getString(R.string.select_state_name)));
            binding.l.setText(wa3Var.b("label_challan_vehicle_no", context.getString(R.string.vehicle_no)));
            binding.k.setHint(wa3Var.b("label_challan_enter_vehicle_no", context.getString(R.string.enter_vehicle_number)));
            binding.f.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.d.setText(wa3Var.b("vahan_get_details", context.getString(R.string.get_details)));
        }

        public final void C1(Context context, oh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.o.setText(wa3Var.b("button_verify", context.getString(R.string.verify)));
            binding.l.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            binding.n.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.otp_sent)));
            binding.f.setHint(wa3Var.b("edit_mobile_no", context.getString(R.string.otp_sent)));
            binding.q.setText(wa3Var.b("label_wait_otp", context.getString(R.string.wait_for_otp)));
            binding.m.setText(wa3Var.b("label_refresh_close", context.getString(R.string.ref_close)));
            binding.o.setText(wa3Var.b("label_get_otp", context.getString(R.string.verify)));
            binding.k.setText(wa3Var.b("label_get_otp", context.getString(R.string.did_not_get_otp)));
            binding.i.setText(wa3Var.b("label_resend_otp", context.getString(R.string.resend_otp)));
            binding.c.setText(wa3Var.b("button_verify", context.getString(R.string.verify)));
        }

        public final void C2(Context context, gb binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.f.setText(wa3Var.b("logo_reprint_receipt", context.getString(R.string.reprint_receipt)));
            binding.b.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            binding.j.setHint(wa3Var.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            binding.l.setHint(wa3Var.b("vahan_enter_registration_no", context.getString(R.string.enter_registration_no)));
            binding.h.setText(wa3Var.b("vahan_registration_no", context.getString(R.string.registration_no)));
            binding.d.setText(wa3Var.b("vahan_chassis_no_last_five", context.getString(R.string.chasis_no_last5_digits)));
            binding.k.setHint(wa3Var.b("vahan_enter_chassis_no", context.getString(R.string.enter_chassis_no)));
            binding.g.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.e.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void D(Context context, ch binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.L.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.M.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.g.setText(wa3Var.b("altVh_bodyType", context.getString(R.string.body_type)));
            binding.f.setHint(wa3Var.b("altVh_bodyType", context.getString(R.string.body_type)));
            binding.D.setText(wa3Var.b("altVh_seatCap", context.getString(R.string.seating_capacity)));
            binding.C.setHint(wa3Var.b("altVh_seatCap", context.getString(R.string.seating_capacity)));
            binding.H.setText(wa3Var.b("altVh_standCap", context.getString(R.string.standing_capacity)));
            binding.G.setHint(wa3Var.b("altVh_standCap", context.getString(R.string.standing_capacity)));
            binding.F.setText(wa3Var.b("altVh_sleeperCap", context.getString(R.string.sleeper_capacity)));
            binding.E.setHint(wa3Var.b("altVh_sleeperCap", context.getString(R.string.sleeper_capacity)));
            binding.x.setText(wa3Var.b("altVh_noCylnd", context.getString(R.string.no_of_cylinders)));
            binding.w.setHint(wa3Var.b("altVh_noCylnd", context.getString(R.string.no_of_cylinders)));
            binding.K.setText(wa3Var.b("altVh_UnladenWght", context.getString(R.string.unladen_weight_kg)));
            binding.J.setHint(wa3Var.b("altVh_UnladenWght", context.getString(R.string.unladen_weight_kg)));
            binding.t.setText(wa3Var.b("altVh_LadenWght", context.getString(R.string.laden_weight_kg)));
            binding.s.setHint(wa3Var.b("altVh_LadenWght", context.getString(R.string.laden_weight_kg)));
            binding.r.setText(wa3Var.b("altVh_HorsePower", context.getString(R.string.horse_power)));
            binding.q.setHint(wa3Var.b("altVh_HorsePower", context.getString(R.string.horse_power)));
            binding.n.setText(wa3Var.b("altVh_Fuel", context.getString(R.string.fuel)));
            binding.j.setText(wa3Var.b("altVh_Color", context.getString(R.string.color)));
            binding.i.setHint(wa3Var.b("altVh_Color", context.getString(R.string.color)));
            binding.Q.setText(wa3Var.b("altVh_Wheelbase", context.getString(R.string.wheelbase)));
            binding.P.setHint(wa3Var.b("altVh_Wheelbase", context.getString(R.string.wheelbase)));
            binding.l.setText(wa3Var.b("altVh_CubicCap", context.getString(R.string.cubic_capacity)));
            binding.k.setHint(wa3Var.b("altVh_CubicCap", context.getString(R.string.cubic_capacity)));
            binding.c.setText(wa3Var.b("altVh_AcFitted", context.getString(R.string.ac_fitted)));
            binding.e.setText(wa3Var.b("altVh_AudioFitted", context.getString(R.string.audio_fitted)));
            binding.O.setText(wa3Var.b("altVh_VideoFitted", context.getString(R.string.video_fitted)));
            binding.p.setText(wa3Var.b("altVh_Heigthmm", context.getString(R.string.height_mm)));
            binding.o.setHint(wa3Var.b("altVh_Heigthmm", context.getString(R.string.height_mm)));
            binding.v.setText(wa3Var.b("altVh_Lengthmm", context.getString(R.string.length_mm)));
            binding.u.setHint(wa3Var.b("altVh_Lengthmm", context.getString(R.string.length_mm)));
            binding.S.setText(wa3Var.b("altVh_Widthmm", context.getString(R.string.width_mm)));
            binding.R.setHint(wa3Var.b("altVh_Widthmm", context.getString(R.string.width_mm)));
            binding.h.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
        }

        public final void D0(Context context, eb binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.f.setText(wa3Var.b("label_challan_vehicle_no", context.getString(R.string.vehicle_no)));
            binding.b.setText(wa3Var.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
        }

        public final void D1(Context context, ng payTax) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(payTax, "payTax");
            wa3 wa3Var = new wa3(context);
            payTax.m.setText(wa3Var.b("vahan_owner_name", context.getString(R.string.owner_name)));
            payTax.X.setText(wa3Var.b("view_vehicle_details", "View Vehicle Details"));
            payTax.w.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            payTax.N.setText(wa3Var.b("vehicle_no", "Vehicle No.:") + ' ');
            AppCompatTextView appCompatTextView = payTax.X;
            appCompatTextView.setPaintFlags(appCompatTextView.getPaintFlags() | 8);
            payTax.T.setText(wa3Var.b("vehicle_class", context.getString(R.string.owner_name)));
            payTax.q.setText(wa3Var.b("permit_type", context.getString(R.string.permit_type)));
            payTax.I.setText(wa3Var.b("lbl_tax_from", context.getString(R.string.tax_from_date)));
            payTax.K.setText(wa3Var.b("tax_upto", context.getString(R.string.tax_upto)));
            payTax.v.setText(wa3Var.b("receipt_date", context.getString(R.string.receipt_date)));
            payTax.b.setText(wa3Var.b("calculate_tax_details", context.getString(R.string.calculate_tax_details)));
            payTax.A.setText(wa3Var.b("enter_the_no_of_m_y_q", context.getString(R.string.select_no_of_m_y_q)));
            payTax.c.setText(wa3Var.b("calculate_tax", context.getString(R.string.calculate_tax)));
            payTax.s.setText(wa3Var.b("label_challan_please_wait", context.getString(R.string.please_wait)));
            payTax.Q.setText(wa3Var.b("user_charges", context.getString(R.string.user_charges)));
            payTax.R.setText(wa3Var.b("user_charges", context.getString(R.string.user_charges)));
            payTax.L.setText(wa3Var.b("transaction_charges", context.getString(R.string.transaction_charges)));
            payTax.M.setText(wa3Var.b("transaction_charges", context.getString(R.string.transaction_charges)));
            payTax.P.setText(wa3Var.b("final_amount", context.getString(R.string.final_amount)));
            payTax.f.setText(wa3Var.b("final_amount", context.getString(R.string.final_amount)));
            payTax.O.setText(wa3Var.b("vahan_amount", context.getString(R.string.amount)));
        }

        public final void D2(Context context, lb binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.q.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.r.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.j.i.setText(wa3Var.b("duplicate_FitnessCert", context.getString(R.string.duplicate_fitness)));
            binding.k.setText(wa3Var.b("apply_for_duplicate_fitness_certificate", context.getString(R.string.apply_for_duplicate_fitness_certificate)));
            binding.n.setText(wa3Var.b("label_dl_serv_reason", context.getString(R.string.vahan_reason)));
            binding.p.setText(wa3Var.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            binding.d.setHint(wa3Var.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            binding.l.setText(wa3Var.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            binding.c.setHint(wa3Var.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            binding.m.setText(wa3Var.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            binding.f.setHint(wa3Var.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            binding.o.setText(wa3Var.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            binding.h.setHint(wa3Var.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            binding.b.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
        }

        public final void E(Context context, n6 ad) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ad, "ad");
            wa3 wa3Var = new wa3(context);
            ad.h.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no_mend)));
            ad.c.setHint(wa3Var.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            ad.i.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            ad.b.setHint(wa3Var.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            ad.l.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            ad.d.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void E0(Context context, fb binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.M.i.setText(wa3Var.b("label_view_forms", context.getString(R.string.view_forms)));
            binding.L.setText(wa3Var.b("no_forms_available", context.getString(R.string.no_forms_available)));
            binding.c.setText(wa3Var.b("download_form_22", context.getString(R.string.download_form_22)));
            binding.w.setText(wa3Var.b("download_from_14", context.getString(R.string.download_from_14)));
            binding.e.setText(wa3Var.b("download_form_26", context.getString(R.string.download_form_26)));
            binding.x.setText(wa3Var.b("download_From_28", context.getString(R.string.download_From_28)));
            binding.h.setText(wa3Var.b("download_form_29", context.getString(R.string.download_form_29)));
            binding.j.setText(wa3Var.b("download_form_30", context.getString(R.string.download_form_30)));
            binding.l.setText(wa3Var.b("download_form_31", context.getString(R.string.download_form_31)));
            binding.n.setText(wa3Var.b("download_form_32", context.getString(R.string.download_form_32)));
            binding.y.setText(wa3Var.b("download_from_33", context.getString(R.string.download_from_33)));
            binding.q.setText(wa3Var.b("download_form_34", context.getString(R.string.download_form_34)));
            binding.s.setText(wa3Var.b("download_form_35", context.getString(R.string.download_form_35)));
            binding.u.setText(wa3Var.b("download_form_36", context.getString(R.string.download_form_36)));
        }

        public final void E1(Context context, xa ps) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ps, "ps");
            wa3 wa3Var = new wa3(context);
            ps.T.c.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            ps.T.d.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            ps.T.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            ps.T.e.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            ps.T.b.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            ps.z0.setText(wa3Var.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            ps.b0.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
            ps.m0.setText(wa3Var.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_details)));
            ps.n0.setText(wa3Var.b("label_dl_serv_appl_no", context.getString(R.string.app_number)));
            ps.l0.setText(wa3Var.b("label_dl_serv_appl_date", context.getString(R.string.application_date)));
            ps.q0.setText(wa3Var.b("label_name", context.getString(R.string.application_date)));
            ps.U.setText(wa3Var.b("label_sdf", context.getString(R.string.sdo_of)));
            ps.o0.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            ps.w0.setText(wa3Var.b("vahan_rto", context.getString(R.string.rto)));
            ps.p0.setText(wa3Var.b("label_Instructions", context.getString(R.string.instructions)));
            ps.r0.setText(wa3Var.b("label_instructions_one", context.getString(R.string.step1)));
            ps.t0.setText(wa3Var.b("label_instructions_three", context.getString(R.string.step3)));
            ps.u0.setText(wa3Var.b("label_instructions_two", context.getString(R.string.step2)));
            ps.x0.setText(wa3Var.b("label_spec_ps", context.getString(R.string.spec_ps)));
            ps.s0.setText(wa3Var.b("label_photo_dimensions", context.getString(R.string.val_one)));
            ps.v0.setText(wa3Var.b("label_upload_clear_photo", context.getString(R.string.val_two)));
            ps.e0.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            ps.h0.setText(wa3Var.b("label_app_photo", context.getString(R.string.applicant_photo)));
            ps.f0.setText(wa3Var.b("label_capture", context.getString(R.string.capture)));
            ps.g0.setText(wa3Var.b("label_gallery", context.getString(R.string.gallery)));
            ps.j0.setText(wa3Var.b("label_capture", context.getString(R.string.capture)));
            ps.k0.setText(wa3Var.b("label_gallery", context.getString(R.string.gallery)));
            ps.B0.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
        }

        public final void E2(Context context, fh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.t.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.u.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.m.i.setText(wa3Var.b("duplicate_Permit", context.getString(R.string.duplicate_permit_certificate)));
            binding.b.setText(wa3Var.b("apply_for_duplicate_permit", context.getString(R.string.apply_for_duplicate_permit_certificate)));
            binding.p.setText(wa3Var.b("label_dl_serv_reason", ""));
            binding.s.setText(wa3Var.b("required_document", context.getString(R.string.required_document)));
            binding.q.setText(wa3Var.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            binding.i.setHint(wa3Var.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            binding.r.setText(wa3Var.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            binding.e.setHint(wa3Var.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            binding.n.setText(wa3Var.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            binding.d.setHint(wa3Var.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            binding.o.setText(wa3Var.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            binding.g.setHint(wa3Var.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            binding.c.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
        }

        public final void F(Context context, l6 ad) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ad, "ad");
            wa3 wa3Var = new wa3(context);
            ad.h.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            ad.i.setHint(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            ad.f.setHint(wa3Var.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_number_hint)));
            ad.g.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            ad.c.setText(wa3Var.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void F0(Context context, hb cl_dup) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cl_dup, "cl_dup");
            wa3 wa3Var = new wa3(context);
            cl_dup.I.setText(wa3Var.b("view_cl_det", context.getString(R.string.view_cl_details)));
            cl_dup.w.setHint(wa3Var.b("label_dl_serv_reason", context.getString(R.string.enter_reason_to_duplicate_cl)));
            cl_dup.H.setText(wa3Var.b("reason_apply_dup_cl", context.getString(R.string.reason_to_duplicate_cl)));
            cl_dup.C.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            cl_dup.y.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void F1(Context context, ue sw) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sw, "sw");
            wa3 wa3Var = new wa3(context);
            sw.h.setText(wa3Var.b("vehicle_no", context.getString(R.string.vehicle_no)));
            sw.g.setHint(wa3Var.b("enter_rc_no_for_pending_transaction", context.getString(R.string.enter_vehicle_no)));
            sw.c.setHint(wa3Var.b("vahan_chassis_no_last_five", context.getString(R.string.chassis_no_last_5_digits)));
            sw.d.setText(wa3Var.b("vahan_chassis_no_last_five", context.getString(R.string.chassis_no_last_5_digits)));
            sw.b.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void F2(Context context, c47 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.s.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.t.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.m.setText(wa3Var.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            binding.k.i.setText(wa3Var.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            binding.l.setText(wa3Var.b("lbl_Fill_detail", context.getString(R.string.vahan_details_duplicate_rc)));
            binding.p.setText(wa3Var.b("label_dl_serv_reason", ""));
            binding.q.setText(wa3Var.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            binding.i.setHint(wa3Var.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            binding.r.setText(wa3Var.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            binding.d.setHint(wa3Var.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            binding.n.setText(wa3Var.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            binding.c.setHint(wa3Var.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            binding.o.setText(wa3Var.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            binding.f.setHint(wa3Var.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            binding.b.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.g.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.g.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.g.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.g.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void G(Context context, mc ad) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ad, "ad");
            wa3 wa3Var = new wa3(context);
            ad.m.setText(wa3Var.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_name)));
            ad.f.setText(wa3Var.b("label_dl_serv_father_name", context.getString(R.string.father_name)));
            ad.d.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            ad.g.setText(wa3Var.b("appl_gender", context.getString(R.string.app_gender)));
            ad.b.setText(wa3Var.b("age_in_year", context.getString(R.string.age)));
            ad.p.setText(wa3Var.b("slot_date", context.getString(R.string.slot_date)));
            ad.q.setText(wa3Var.b("slot_time", context.getString(R.string.slot_time)));
            ad.n.setText(wa3Var.b("button_proceed", context.getString(R.string.proceed)));
            ad.i.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
        }

        public final void G0(Context context, jb dl_duplicate) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dl_duplicate, "dl_duplicate");
            wa3 wa3Var = new wa3(context);
            dl_duplicate.O.b.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            dl_duplicate.O.c.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            dl_duplicate.O.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            dl_duplicate.O.d.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            dl_duplicate.O.f.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            dl_duplicate.X.setText(wa3Var.b("label_dl_serv_enter_reas_manul", context.getString(R.string.enter_reason)));
            dl_duplicate.z.setHint(wa3Var.b("label_dl_serv_reason", context.getString(R.string.reason)));
            dl_duplicate.Y.setText(wa3Var.b("label_app_category", context.getString(R.string.app_category)));
            dl_duplicate.U.setText(wa3Var.b("title_dl_serv_detail_duplicate", context.getString(R.string.details_for_duplicate_dl)));
            dl_duplicate.Z.setText(wa3Var.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            dl_duplicate.W.setText(wa3Var.b("label_dl_serv_reason", context.getString(R.string.reason)));
            dl_duplicate.E.setHint(wa3Var.b("edit_dl_serv_sel_reason", context.getString(R.string.sel_rsn)));
            dl_duplicate.V.setText(wa3Var.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            dl_duplicate.a0.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            dl_duplicate.M.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            dl_duplicate.N.setHint(wa3Var.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
            dl_duplicate.G.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            dl_duplicate.P.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void G1(Context context, ve binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.p.setText(wa3Var.b("virtual_registration_certificate", context.getString(R.string.virtual_registration_certificate)));
            binding.d.setText(wa3Var.b("my_rc", context.getString(R.string.my_rc)));
            binding.n.setText(wa3Var.b("label_shared_rc", context.getString(R.string.shared_rc)));
            binding.k.setText(wa3Var.b("label_dl_search", context.getString(R.string.received_rc)));
        }

        public final void G2(Context context, b23 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.t.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.u.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.n.setText(wa3Var.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            binding.l.i.setText(wa3Var.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            binding.m.setText(wa3Var.b("lbl_Fill_detail", context.getString(R.string.vahan_details_duplicate_rc)));
            binding.q.setText(wa3Var.b("label_dl_serv_reason", ""));
            binding.r.setText(wa3Var.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            binding.i.setHint(wa3Var.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            binding.s.setText(wa3Var.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            binding.d.setHint(wa3Var.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            binding.o.setText(wa3Var.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            binding.c.setHint(wa3Var.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            binding.p.setText(wa3Var.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            binding.f.setHint(wa3Var.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            binding.b.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.g.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.g.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.g.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.g.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void H(Context context, o6 ad) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ad, "ad");
            wa3 wa3Var = new wa3(context);
            ad.w.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            ad.d.setText(wa3Var.b("vahan_application_name", context.getString(R.string.applicant_name)));
            ad.f.setText(wa3Var.b("lbl_dob", context.getString(R.string.date_of_birth)));
            ad.L.setText(wa3Var.b("label_appl_status_rto_code", "RTO Code"));
            ad.G.setText(wa3Var.b("vahan_rto_name", context.getString(R.string.rto_name_2)));
            ad.O.setText(wa3Var.b("label_transaction_s_applied", context.getString(R.string.transaction_s_applied)));
            ad.P.setText(wa3Var.b("label_transaction_status", context.getString(R.string.transaction_status)));
        }

        public final void H0(Context context, nb ll_dup) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ll_dup, "ll_dup");
            wa3 wa3Var = new wa3(context);
            ll_dup.I.setText(wa3Var.b("view_ll", context.getString(R.string.view_ll_details)));
            ll_dup.w.setHint(wa3Var.b("label_dl_serv_reason", context.getString(R.string.enter_reason_to_duplicate_cl)));
            ll_dup.H.setText(wa3Var.b("reason_app_duplicate_ll", context.getString(R.string.reason_to_duplicate_ll)));
            ll_dup.C.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            ll_dup.y.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void H1(Context context, ye cl_renewal) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cl_renewal, "cl_renewal");
            wa3 wa3Var = new wa3(context);
            cl_renewal.H.setText(wa3Var.b("view_cl_det", context.getString(R.string.view_cl_details)));
            cl_renewal.G.setText(wa3Var.b("reason_apply_dup_cl", context.getString(R.string.renewal_cl_app)));
            cl_renewal.x.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            cl_renewal.y.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void H2(Context context, b23 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.t.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.u.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.n.setText(wa3Var.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            binding.l.i.setText(wa3Var.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            binding.m.setText(wa3Var.b("lbl_Fill_detail", context.getString(R.string.vahan_details_duplicate_rc)));
            binding.q.setText(wa3Var.b("label_dl_serv_reason", ""));
            binding.r.setText(wa3Var.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            binding.i.setHint(wa3Var.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            binding.s.setText(wa3Var.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            binding.d.setHint(wa3Var.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            binding.o.setText(wa3Var.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            binding.c.setHint(wa3Var.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            binding.p.setText(wa3Var.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            binding.f.setHint(wa3Var.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            binding.b.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.g.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.g.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.g.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.g.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void I(Context context, p6 appStatus) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appStatus, "appStatus");
            wa3 wa3Var = new wa3(context);
            appStatus.b.setHint(wa3Var.b("edit_dl_serv_dob", "Enter Date of Birth"));
            appStatus.i.setText(wa3Var.b("lbl_dob", "Date of Birth"));
            appStatus.h.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            appStatus.c.setHint(wa3Var.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            appStatus.l.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            appStatus.d.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void I0(Context context, tb ela) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ela, "ela");
            wa3 wa3Var = new wa3(context);
            ela.h0.setText(wa3Var.b("label_dl_serv_present_addr", context.getString(R.string.present_address_sarthi)));
            ela.l0.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state_coa)));
            ela.z.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            ela.b0.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district_coa)));
            ela.y.setHint(wa3Var.b("edit_dl_serv_selc_district", context.getString(R.string.select_district)));
            ela.p0.setText(wa3Var.b("label_dl_serv_block", context.getString(R.string.taluka_block)));
            ela.x.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            ela.a0.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.town)));
            ela.M.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            ela.d0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            ela.L.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            ela.n0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            ela.P.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            ela.f0.setText(wa3Var.b("label_loc_mark", context.getString(R.string.landmark_coa)));
            ela.N.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            ela.j0.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode_coa)));
            ela.O.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            ela.X.setText(wa3Var.b("check_dl_serv_same_curr_addr", context.getString(R.string.same_as_curr_add)));
            ela.i0.setText(wa3Var.b("title_dl_serv_new_perm_addr", context.getString(R.string.perm_add_det)));
            ela.m0.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state_coa)));
            ela.G.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            ela.q0.setText(wa3Var.b("label_dl_serv_block", context.getString(R.string.taluka_block)));
            ela.E.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            ela.J.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            ela.I.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.taluka)));
            ela.H.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            ela.e0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            ela.A.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            ela.o0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            ela.D.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            ela.g0.setText(wa3Var.b("label_loc_mark", context.getString(R.string.landmark_coa)));
            ela.B.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            ela.k0.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode_coa)));
            ela.w.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
            ela.C.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            ela.Y.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.next)));
            ela.r0.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            ela.Q.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.duration_stay_sarthi)));
            ela.t0.setHint(wa3Var.b("year_txt", context.getString(R.string.year)));
            ela.V.setHint(wa3Var.b("month_txt", context.getString(R.string.month)));
        }

        public final void I1(Context context, ba dl_renewal) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dl_renewal, "dl_renewal");
            wa3 wa3Var = new wa3(context);
            dl_renewal.H.b.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            dl_renewal.H.c.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            dl_renewal.H.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            dl_renewal.H.d.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            dl_renewal.H.f.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            dl_renewal.Z.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit_the_request_to)));
            dl_renewal.c0.setText(wa3Var.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            dl_renewal.Y.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state)));
            dl_renewal.X.setText(wa3Var.b("label_dl_serv_rto", context.getString(R.string.rto)));
            dl_renewal.Q.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            dl_renewal.b0.setText(wa3Var.b("label_app_category", context.getString(R.string.app_category)));
        }

        public final void I2(Context context, d07 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            SpannableString spannableString = new SpannableString(wa3Var.b("redirect_link_to_application_status", context.getString(R.string.redirect_link_to_application_status)));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            binding.b.setText(spannableString);
            binding.f.setText(wa3Var.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
            binding.e.setText(wa3Var.b("label_home", context.getString(R.string.home)));
        }

        public final void J(Context context, q6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.b.setText(wa3Var.b("fancyNo_AckNo", context.getString(R.string.acknowledgement_no)));
            binding.h.setHint(wa3Var.b("fancyNo_enterAckNo", context.getString(R.string.enter_acknowledgement_no)));
            binding.f.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.d.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void J0(Context context, vb el_ap) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(el_ap, "el_ap");
            wa3 wa3Var = new wa3(context);
            el_ap.x.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            el_ap.B.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob_sarthi)));
            el_ap.A.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            el_ap.z.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            el_ap.w.setHint(wa3Var.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            el_ap.C.setHint(wa3Var.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
        }

        public final void J1(Context context, ha dl_replace) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dl_replace, "dl_replace");
            wa3 wa3Var = new wa3(context);
            dl_replace.I.b.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            dl_replace.I.c.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            dl_replace.I.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            dl_replace.I.d.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            dl_replace.I.f.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            dl_replace.P.setText(wa3Var.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            dl_replace.Q.setText(wa3Var.b("label_app_category", context.getString(R.string.app_category)));
            dl_replace.N.setText(wa3Var.b("declaration", context.getString(R.string.declaration)));
            dl_replace.O.setText(wa3Var.b("no_input_required", context.getString(R.string.no_input_req)));
            dl_replace.w.setText(wa3Var.b("i_here_by_declare", context.getString(R.string.rep_declaration)));
            dl_replace.R.setText(wa3Var.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            dl_replace.A.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            dl_replace.J.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            dl_replace.S.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            dl_replace.G.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            dl_replace.w.setText(wa3Var.b("i_here_by_declare", context.getString(R.string.rep_declaration)));
            dl_replace.H.setHint(wa3Var.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
        }

        public final void J2(Context context, hh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.p.setText(wa3Var.b("pay_tax", ""));
            binding.h.setText(wa3Var.b("enter_vehicle_no", context.getString(R.string.enter_vehicle_no)));
            binding.c.setText(wa3Var.b("my_vehicles", context.getString(R.string.my_vehicles)));
            binding.d.setText(wa3Var.b("other_new_vehicle", context.getString(R.string.other_new_vehicle)));
            binding.r.setText(wa3Var.b("vehicle_no", context.getString(R.string.vehicle_no)));
            binding.e.setText(wa3Var.b("vahan_chassis_no_last_five", context.getString(R.string.chassis_no_last_five_digits)));
            binding.s.setHint(wa3Var.b("enter_rc_no_for_pending_transaction", context.getString(R.string.enter_rc_no_for_pending_transaction)));
            binding.f.setHint(wa3Var.b("enter_last_five_digits", context.getString(R.string.enter_last_five_digits)));
            binding.j.setText(wa3Var.b("notes", context.getString(R.string.notes)));
            binding.i.setText(wa3Var.b("dl_serv_note", context.getString(R.string.new_note)));
            binding.m.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.b.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            binding.l.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void K(Context context, r6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.c.setHint(wa3Var.b("label_search", context.getString(R.string.search)));
            binding.e.setText(wa3Var.b("label_search", context.getString(R.string.search)));
        }

        public final void K0(Context context, qz1 elp) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(elp, "elp");
            wa3 wa3Var = new wa3(context);
            elp.J.setText(wa3Var.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            elp.E.setText(wa3Var.b("selelcted_class_vehicle", context.getString(R.string.selected_following_learner_class)));
            elp.I.setText(wa3Var.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            elp.L.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            elp.B.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            elp.w.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
            elp.A.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            elp.G.setText(wa3Var.b("here_by_declare", context.getString(R.string.self_declartion)));
            elp.C.setHint(wa3Var.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
        }

        public final void K1(Context context, rf binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.f.setText(wa3Var.b("lbl_State_Name", context.getString(R.string.state_name)));
            binding.i.setText(wa3Var.b("vahan_rto", context.getString(R.string.rto)));
            binding.b.setText(wa3Var.b("btn_challan_get_details", context.getString(R.string.get_details)));
        }

        public final void K2(Context context, hh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.p.setText(wa3Var.b("pay_tax", ""));
            binding.h.setText(wa3Var.b("enter_vehicle_no", context.getString(R.string.enter_vehicle_no)));
            binding.c.setText(wa3Var.b("my_vehicles", context.getString(R.string.my_vehicles)));
            binding.d.setText(wa3Var.b("other_new_vehicle", context.getString(R.string.other_new_vehicle)));
            binding.r.setText(wa3Var.b("vehicle_no", context.getString(R.string.vehicle_no)));
            binding.e.setText(wa3Var.b("vahan_chassis_no_last_five", context.getString(R.string.chassis_no_last_five_digits)));
            binding.s.setHint(wa3Var.b("enter_rc_no_for_pending_transaction", context.getString(R.string.enter_rc_no_for_pending_transaction)));
            binding.f.setHint(wa3Var.b("enter_last_five_digits", context.getString(R.string.enter_last_five_digits)));
            binding.j.setText(wa3Var.b("notes", context.getString(R.string.notes)));
            binding.i.setText(wa3Var.b("dl_serv_note", context.getString(R.string.new_note)));
            binding.m.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.b.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            binding.l.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void L(Context context, s6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.f.setText(wa3Var.b("lbl_State_Name", context.getString(R.string.state_name)));
            binding.j.setText(wa3Var.b("vahan_rto", context.getString(R.string.rto)));
            binding.b.setText(wa3Var.b("btn_challan_get_details", context.getString(R.string.get_details)));
        }

        public final void L0(Context context, qb el_otp) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(el_otp, "el_otp");
            wa3 wa3Var = new wa3(context);
            el_otp.c.setText(wa3Var.b("label_dl_serv_appl_no", context.getString(R.string.application_no)));
            el_otp.i.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            el_otp.h.setHint(wa3Var.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_no)));
            el_otp.d.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
            el_otp.e.setText(wa3Var.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void L1(Context context, bb mBnding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mBnding, "mBnding");
            wa3 wa3Var = new wa3(context);
            mBnding.g.f.setText(wa3Var.b("Driving_Licence_Transactions", "Driving Licence Transactions"));
            mBnding.q.setText(wa3Var.b("label_challan_dl_number", "Driving Licence No."));
            mBnding.h.setText(wa3Var.b("label_dl_serv_appl_no", "Application Number"));
            mBnding.d.setText(wa3Var.b("vahan_application_date", "Application Date"));
            mBnding.o.setText(wa3Var.b("lbl_Receipt_No", "Receipt Number"));
            mBnding.n.setText(wa3Var.b("receipt_date", "Receipt Date"));
            mBnding.b.setText(wa3Var.b("vahan_amount", "Amount"));
            mBnding.p.setText(wa3Var.b("label_transaction_name", "Transaction Name"));
        }

        public final void L2(Context context, pa7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.X.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.Y.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.O.setText(wa3Var.b("no_objection_certificate_noc", context.getString(R.string.vahan_noc)));
            binding.F.i.setText(wa3Var.b("no_objection_certificate_noc", context.getString(R.string.vahan_noc)));
            binding.t.setText(wa3Var.b("hypothecation_option", context.getString(R.string.hypothecation_option)));
            binding.f.setText(wa3Var.b("vahan_continuation_of_hypothecation", context.getString(R.string.vahan_continuation_of_hypothecation)));
            binding.E.setText(wa3Var.b("vahan_termination_of_hypothecation", context.getString(R.string.vahan_termination_of_hypothecation)));
            binding.P.setText(wa3Var.b("vahan_reason_for_taking_noc", context.getString(R.string.vahan_reason_for_taking_noc)));
            binding.Q.setText(wa3Var.b("vahan_state_to", context.getString(R.string.vahan_state_to)));
            binding.J.setText(wa3Var.b("vahan_authority_to", context.getString(R.string.vahan_authority_to)));
            binding.w.setText(wa3Var.b("ncrb_clearance_no", context.getString(R.string.ncrb_clearance_no)));
            binding.x.setHint(wa3Var.b("enter_the_ncrb_clearance_no", context.getString(R.string.enter_the_ncrb_clearance_no)));
            binding.H.setText(wa3Var.b("transferee_name", context.getString(R.string.transferee_name)));
            binding.G.setHint(wa3Var.b("enter_the_transferee_name", context.getString(R.string.enter_the_transferee_name)));
            binding.o.setText(wa3Var.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            binding.N.setText(wa3Var.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            binding.M.setText(wa3Var.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            binding.L.setText(wa3Var.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            binding.K.setText(wa3Var.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            binding.k.setText(wa3Var.b("finance_upto_date", context.getString(R.string.finance_upto_date)));
            binding.j.setText(wa3Var.b("select_date", context.getString(R.string.select_date)));
            binding.p.setText(wa3Var.b("vahan_hypothecation_termination_details", context.getString(R.string.vahan_hypothecation_termination_details)));
            binding.U.setText(wa3Var.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            binding.S.setText(wa3Var.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            binding.R.setText(wa3Var.b("vahan_term_branch_add", context.getString(R.string.vahan_term_branch_add)));
            binding.T.setText(wa3Var.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            binding.e.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.z.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.z.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.z.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.z.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void M(Context context, t6 mBnding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mBnding, "mBnding");
            wa3 wa3Var = new wa3(context);
            mBnding.y.setText(wa3Var.b("Challan_Transactions", "Challan Transactions"));
            mBnding.B.setText(wa3Var.b("radio_btn_challan_no", "Challan No."));
            mBnding.f.setText(wa3Var.b("label_challan_date", "Challan Date"));
            mBnding.d.setText(wa3Var.b("label_challan_amount", "Challan Amount"));
            mBnding.k.setText(wa3Var.b("label_challan_status", "Challan Status"));
            mBnding.j.setText(wa3Var.b("label_challan_state", "Challan State"));
            mBnding.b.setText(wa3Var.b("vahan_amount", "Amount"));
            mBnding.A.setText(wa3Var.b("vahan_transaction_id", "Transaction ID"));
            mBnding.v.setText(wa3Var.b("lbl_Receipt_No", "Receipt Number"));
            mBnding.t.setText(wa3Var.b("paymentDate", "Payment Date"));
            mBnding.D.setText(wa3Var.b("radio_btn_vehicle_no", "Vehicle Number"));
            mBnding.n.setText(wa3Var.b("radio_btn_dl_no", "Driving Licence Number"));
        }

        public final void M0(Context context, rb elp) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(elp, "elp");
            wa3 wa3Var = new wa3(context);
            elp.V.setText(wa3Var.b("appl_name", context.getString(R.string.name_of_applicant_ll)));
            elp.y.setHint(wa3Var.b("first_name", context.getString(R.string.first_name)));
            elp.F.setHint(wa3Var.b("middle_name", context.getString(R.string.middle_name)));
            elp.C.setHint(wa3Var.b("last_name", context.getString(R.string.last_name)));
            elp.e0.setText(wa3Var.b("full_name", context.getString(R.string.full_name_as_per_record_ll)));
            elp.f0.setHint(wa3Var.b("enter_full_name", context.getString(R.string.new_full_name)));
            elp.p0.setText(wa3Var.b("label_relation", context.getString(R.string.relation_ll)));
            elp.z.setHint(wa3Var.b("first_name", context.getString(R.string.first_name)));
            elp.G.setHint(wa3Var.b("middle_name", context.getString(R.string.middle_name)));
            elp.D.setHint(wa3Var.b("last_name", context.getString(R.string.last_name)));
            elp.g0.setHint(wa3Var.b("appl_gender", context.getString(R.string.gender)));
            elp.I.setText(wa3Var.b("appl_female", context.getString(R.string.female)));
            elp.K.setText(wa3Var.b("appl_male", context.getString(R.string.male)));
            elp.L.setText(wa3Var.b("appl_trans", context.getString(R.string.transgender)));
            elp.Y.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            elp.Z.setHint(wa3Var.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            elp.S.setText(wa3Var.b("age_in_year", context.getString(R.string.age)));
            elp.m0.setText(wa3Var.b("label_dl_serv_birth_place", context.getString(R.string.birthplace_ll)));
            elp.W.setText(wa3Var.b("country_birth", context.getString(R.string.country_birth_ll)));
            elp.o0.setText(wa3Var.b("education_qualification", context.getString(R.string.education_qualification_ll)));
            elp.X.setText(wa3Var.b("blood_group", context.getString(R.string.blood_group_sarthi)));
            elp.h0.setText(wa3Var.b("blood_group", context.getString(R.string.landline_number_sarthi)));
            elp.a0.setText(wa3Var.b("Email_id", context.getString(R.string.email_id)));
            elp.T.setText(wa3Var.b("alt_mob_number", context.getString(R.string.alt_mobile_no)));
            elp.c0.setText(wa3Var.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_mob_number_ll)));
            elp.j0.setText(wa3Var.b("id_marks_ll", context.getString(R.string.id_marks_ll)));
            elp.N.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            elp.A.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
            elp.w.setHint(wa3Var.b("age_in_year", context.getString(R.string.age)));
            elp.n0.setHint(wa3Var.b("label_dl_serv_birth_place", context.getString(R.string.birthplace)));
            elp.U.setHint(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            elp.d0.setHint(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            elp.k0.setHint(wa3Var.b("ident_mark_1", context.getString(R.string.identification_mark_1)));
            elp.l0.setHint(wa3Var.b("ident_mark_2", context.getString(R.string.identification_mark_2)));
        }

        public final void M1(Context context, ag binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            if (StringsKt__StringsJVMKt.equals(wa3Var.b("dl_search_txt", context.getString(R.string.dl_search_txt)), "driving Licence Search", true)) {
                binding.F.setText("Driving Licence Search");
            } else {
                binding.F.setText(wa3Var.b("dl_search_txt", context.getString(R.string.dl_search_txt)));
            }
            binding.s.setText(wa3Var.b("label_dl_holder_name", context.getString(R.string.owner_name_for_dl)));
            binding.I.setText(wa3Var.b("vehicle_class", context.getString(R.string.vehicle_class)));
            binding.H.setText(wa3Var.b("vehicle_class", context.getString(R.string.vehicle_class)));
            binding.t.setText(wa3Var.b("issue_date", context.getString(R.string.issue_date)));
            binding.h.setText(wa3Var.b("makerTitle", context.getString(R.string.valid_upto_v3)));
            binding.l.setText(wa3Var.b("registeringAuthTitle", context.getString(R.string.rto_code_l)));
            binding.m.setText(wa3Var.b("registeringAuthTitle", context.getString(R.string.registering_auth_l)));
            binding.D.setText(wa3Var.b("vehicle_impound", context.getString(R.string.vehicle_impound)));
            binding.u.setText(wa3Var.b("tap_to_check", context.getString(R.string.driving_licence_tap_text)));
            binding.q.setText(wa3Var.b("create_a_virtual_dl", context.getString(R.string.create_a_virtual_dl)));
            binding.v.setText(wa3Var.b("label_view_challan", context.getString(R.string.view_challan)));
            binding.n.setText(wa3Var.b("valid_till_trans", context.getString(R.string.transportValidity)));
        }

        public final void M2(Context context, gh binding, AppCompatButton reset, AppCompatButton generate) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(reset, "reset");
            Intrinsics.checkNotNullParameter(generate, "generate");
            wa3 wa3Var = new wa3(context);
            binding.t.setText(wa3Var.b("vehicle_no", context.getString(R.string.vehicle_number)));
            binding.e.setText(wa3Var.b("lbl_registered_mobile_no", "Registered Mobile No."));
            binding.s.setText(wa3Var.b("update_Mobile_No", context.getString(R.string.update2)));
            binding.g.setText(wa3Var.b("mobile_number_is_added", context.getString(R.string.mobile_correct_added)));
            reset.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            generate.setText(wa3Var.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
            binding.j.setText(wa3Var.b("vehicle_service", context.getString(R.string.vehicle_service)));
            SpannableString spannableString = new SpannableString(wa3Var.b("title_dl_serv_terms_cond", context.getString(R.string.agree_terms_cond)));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            binding.b.setText(spannableString);
        }

        public final String N(Context context, String service_code, String serve_value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(service_code, "service_code");
            Intrinsics.checkNotNullParameter(serve_value, "serve_value");
            wa3 wa3Var = new wa3(context);
            return service_code.equals("111") ? String.valueOf(wa3Var.b("label_challan_status", serve_value)) : service_code.equals("112") ? String.valueOf(wa3Var.b("label_challan_payment", serve_value)) : service_code.equals("113") ? String.valueOf(wa3Var.b("label_verify_challan_payment", serve_value)) : service_code.equals("114") ? String.valueOf(wa3Var.b("label_challan_download", serve_value)) : service_code.equals("115") ? String.valueOf(wa3Var.b("View_Payment_Receipt", serve_value)) : serve_value;
        }

        public final void N0(Context context, uy3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.m.setText(wa3Var.b("title_security_mpin", context.getString(R.string.sec_pin)));
            binding.p.setText(wa3Var.b("title_security_mpin", context.getString(R.string.sec_pin)));
            binding.s.setText(wa3Var.b("label_verify_otp", context.getString(R.string.verify_otp)));
            binding.e.setHint(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
            binding.t.setText(wa3Var.b("label_wait_otp", context.getString(R.string.wait_for_otp)));
            binding.o.setText(wa3Var.b("label_refresh_close", context.getString(R.string.ref_close)));
            binding.r.setText(wa3Var.b("button_verify", context.getString(R.string.verify)));
            binding.n.setText(wa3Var.b("label_get_otp", context.getString(R.string.did_not_get_otp)));
            binding.i.setText(wa3Var.b("label_resend_otp", context.getString(R.string.resend_otp)));
        }

        public final void N1(Context context, dg binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.o0.setText(wa3Var.b("vehicle_impound", context.getString(R.string.vehicle_impound)));
            binding.m0.setText(wa3Var.b("sez_doc_details", context.getString(R.string.seizure_doc_details)));
            binding.p.setText(wa3Var.b("rc_hyptotichated", context.getString(R.string.hpt)));
            binding.q0.setText(wa3Var.b("vehicle_search", "Vehicle Search"));
            binding.h0.setText(wa3Var.b("radio_btn_vehicle_no", "Vehicle Number"));
            binding.g0.setText(wa3Var.b("label_challan_owner_name", "Owner Name"));
            binding.W.setText(wa3Var.b(va3.a.l0(), "Registering Authority"));
            binding.t0.setText(wa3Var.b("vehicle_class", "Vehicle Class"));
            binding.D.setText(wa3Var.b("fuel_type", "Fuel Type"));
            binding.Y.setText(wa3Var.b("vehicle_age", "Vehicle Age"));
            binding.l0.setText(wa3Var.b("vehicle_status", "Vehicle Status"));
            binding.i0.setText(wa3Var.b("vehicle_impound_status", "Tap to Check the Vehicle Impound and Seizure Document Status"));
            binding.r0.setText(wa3Var.b("registration_date", "Registration Date"));
            binding.l.setText(wa3Var.b("fitness_valid_upto", "Fitness Valid Upto"));
            binding.b0.setText(wa3Var.b("tax_valid_upto", "Tax Valid Upto"));
            binding.r.setText(wa3Var.b("insurance_valid_upto", "Insurance Valid UpTo"));
            binding.N.setText(wa3Var.b("pucc_valid_upto", "PUCC Valid UpTo"));
            binding.L.setText(wa3Var.b("permit_valid_upto", "Permit Valid UpTo"));
            binding.G.setText(wa3Var.b("national_permit_no", "National Permit No."));
            binding.F.setText(wa3Var.b("national_permit_valid_upto", "National Permit Valid Upto."));
            binding.f.setText(wa3Var.b("create_vir_rc", "Create Virtual RC"));
            binding.g.setText(wa3Var.b("label_view_challan", "View Challan"));
            binding.P.setText(wa3Var.b("emmission_norm_lbl", "Emission Norm"));
            binding.f0.setText(wa3Var.b("black_list_status", context.getString(R.string.black_list_status)));
            binding.c.setText(wa3Var.b("aitpnumber", context.getString(R.string.aitpPermitno)));
            binding.d.setText(wa3Var.b("aitpValidUpTo", context.getString(R.string.aitpPermit)));
        }

        public final void N2(Context context, jh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.g.setText(wa3Var.b("label_dl_serv_enter_otp", context.getString(R.string.enter_otp)));
            binding.f.setHint(wa3Var.b("label_dl_serv_enter_otp", context.getString(R.string.enter_otp)));
            binding.p.setText(wa3Var.b("vahan_resend_otp", context.getString(R.string.resend_otp)));
            binding.y.setText(wa3Var.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
            binding.w.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.q.setText(wa3Var.b("vehicle_service", context.getString(R.string.vehicle_service)));
            binding.A.setText(wa3Var.b("vehicle_number", context.getString(R.string.vehicle_number)));
            binding.h.setText(wa3Var.b("please_enter_aadhaar", context.getString(R.string.please_enter_aadhaar)));
            binding.c.setText(wa3Var.b("aadhar_no", context.getString(R.string.aadhar_no)));
            binding.C.setText(wa3Var.b("vid", context.getString(R.string.vid)));
            binding.i.setHint(wa3Var.b("enter_aadhaar_number", context.getString(R.string.enter_aadhaar_number)));
            SpannableString spannableString = new SpannableString(wa3Var.b("agree_with_aadhar_terms", context.getString(R.string.agree_with_aadhar_terms)));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            binding.t.setText(spannableString);
            binding.g.setText(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
            binding.f.setHint(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
            binding.p.setText(wa3Var.b("resend_otp", context.getString(R.string.resend_otp)));
            binding.l.setText(wa3Var.b("notes", context.getString(R.string.notes)));
            binding.j.setText(wa3Var.b("faceless_services", context.getString(R.string.faceless_services)));
            binding.B.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.x.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.b.setText(wa3Var.b("aadharBasedEkyc", context.getString(R.string.addherTitle)));
        }

        public final void O(Context context, zd0 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            AppCompatTextView appCompatTextView = binding.j;
            va3.a aVar = va3.a;
            appCompatTextView.setText(wa3Var.b(aVar.d(), "Change MPIN"));
            binding.e.setHint(wa3Var.b(aVar.s(), context.getString(R.string.enter_old_mpin)));
            binding.d.setHint(wa3Var.b(aVar.r(), context.getString(R.string.enter_new_mpin)));
            binding.c.setHint(wa3Var.b(aVar.h(), context.getString(R.string.confirm_new_mpin)));
            binding.b.setText(wa3Var.b(aVar.d(), "Change MPIN"));
        }

        public final void O0(Context context, r9 dl_extract) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dl_extract, "dl_extract");
            wa3 wa3Var = new wa3(context);
            dl_extract.J.b.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            dl_extract.J.c.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            dl_extract.J.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            dl_extract.J.d.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            dl_extract.J.f.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            dl_extract.R.setText(wa3Var.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            dl_extract.N.setText(wa3Var.b("title_dl_serv_detail_extr", context.getString(R.string.extract_dl_details)));
            dl_extract.P.setText(wa3Var.b("label_dl_serv_reason", context.getString(R.string.reason)));
            dl_extract.B.setHint(wa3Var.b("edit_dl_serv_sel_reason", context.getString(R.string.sel_rsn)));
            dl_extract.D.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            dl_extract.K.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void O1(Context context, yw5 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.w.setText(wa3Var.b("toApplBySeller", "Application by Seller"));
            binding.t.setText(wa3Var.b("toApplByBuyer", "Application by Buyer"));
        }

        public final void O2(Context context, c55 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.j.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.k.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.b.setText(wa3Var.b("apply_for_rc_cancellation", context.getString(R.string.apply_for_rc_cancellation)));
            binding.g.i.setText(wa3Var.b("rc_cancellation", context.getString(R.string.rc_cancellation)));
            binding.h.setText(wa3Var.b("rc_cancellation_date", context.getString(R.string.rc_cancellation_date)));
            binding.d.setHint(wa3Var.b("rc_cancellation_date", context.getString(R.string.rc_cancellation_date)));
            binding.i.setText(wa3Var.b("label_dl_serv_reason", context.getString(R.string.vahan_reason)));
            binding.f.setHint(wa3Var.b("label_dl_serv_reason", context.getString(R.string.vahan_reason)));
            binding.c.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
        }

        public final String P(Context context, String serve_value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(serve_value, "serve_value");
            wa3 wa3Var = new wa3(context);
            if (serve_value.equals("View Fee Receipt")) {
                return String.valueOf(wa3Var.b("label_view_fee_Receipt", serve_value));
            }
            if (serve_value.equals("902")) {
                return String.valueOf(wa3Var.b("lbl_Verify_Payment_Status", serve_value));
            }
            if (StringsKt__StringsJVMKt.equals(serve_value, "Hypothecation Addition", true)) {
                return String.valueOf(wa3Var.b("hypothecation_addition", serve_value));
            }
            if (StringsKt__StringsJVMKt.equals(serve_value, "Hypothecation Termination", true)) {
                return String.valueOf(wa3Var.b("hypothecation_termination", serve_value));
            }
            if (StringsKt__StringsJVMKt.equals(serve_value, "Hypothecation Continuation", true)) {
                return String.valueOf(wa3Var.b("hypothecation_continuation", serve_value));
            }
            if (serve_value.equals("RC Particulars against Fee")) {
                return String.valueOf(wa3Var.b("lbl_rc_particular_against_fee", serve_value));
            }
            if (StringsKt__StringsJVMKt.equals(serve_value, "Change of Address in RC", true)) {
                return String.valueOf(wa3Var.b("change_of_address_in_rc2", serve_value));
            }
            if (StringsKt__StringsJVMKt.equals(serve_value, "No Objection Certificate (NOC)", true)) {
                return String.valueOf(wa3Var.b("no_objection_certificate_noc", serve_value));
            }
            if (serve_value.equals("104")) {
                return String.valueOf(wa3Var.b("update_Mobile_No", serve_value));
            }
            if (StringsKt__StringsJVMKt.equals(serve_value, "Issue of Duplicate RC", true)) {
                return String.valueOf(wa3Var.b("issue_of_duplicate_rc", serve_value));
            }
            if (serve_value.equals("Dispose Application")) {
                return String.valueOf(wa3Var.b("vahan_dispose_application", serve_value));
            }
            if (!serve_value.equals("Application Status") && !serve_value.equals("Application Status")) {
                return serve_value.equals("View Forms") ? String.valueOf(wa3Var.b("label_view_forms", serve_value)) : serve_value.equals(context.getString(R.string.duplicate_fitness)) ? String.valueOf(wa3Var.b("duplicate_FitnessCert", context.getString(R.string.duplicate_fitness))) : StringsKt__StringsJVMKt.equals(serve_value, "Duplicate Permit Certificate", true) ? String.valueOf(wa3Var.b("duplicate_Permit", context.getString(R.string.duplicate_permit_certificate))) : StringsKt__StringsJVMKt.equals(serve_value, "RC Surrender", true) ? String.valueOf(wa3Var.b("rc_Surrender", context.getString(R.string.rc_surrender))) : StringsKt__StringsJVMKt.equals(serve_value, "RC Cancellation", true) ? String.valueOf(wa3Var.b("rc_cancellation", "RC Cancellation")) : StringsKt__StringsJVMKt.equals(serve_value, "Pay Tax", true) ? String.valueOf(wa3Var.b("pay_TaxService", "Pay Tax")) : StringsKt__StringsJVMKt.equals(serve_value, "Tax Assessment", true) ? String.valueOf(wa3Var.b("tax_Assessment", "Tax Assessment")) : StringsKt__StringsJVMKt.equals(serve_value, "RC Release", true) ? String.valueOf(wa3Var.b("rc_release", "RC Release")) : StringsKt__StringsJVMKt.equals(serve_value, "Temporary Permit", true) ? String.valueOf(wa3Var.b("temporary_permit", "Temporary Permit")) : StringsKt__StringsJVMKt.equals(serve_value, "Renewal of NP Authorization Permit", true) ? String.valueOf(wa3Var.b("renewalNpAuthorization_Permit", "Renewal of NP Authorization Permit")) : StringsKt__StringsJVMKt.equals(serve_value, "Permit Renewal", true) ? String.valueOf(wa3Var.b("rp_header_title", "Permit Renewal")) : StringsKt__StringsJVMKt.equals(serve_value, "Transfer of Ownership", true) ? String.valueOf(wa3Var.b("toSellerBuyer", "Transfer of Ownership")) : StringsKt__StringsJVMKt.equals(serve_value, "Alteration of Vehicle", true) ? String.valueOf(wa3Var.b("altVh_ServiceName", "Alteration of Vehicle")) : StringsKt__StringsJVMKt.equals(serve_value, "Miscellaneous Fee Payment", true) ? String.valueOf(wa3Var.b("misc_FeePayment", "Miscellaneous Fee Payment")) : StringsKt__StringsJVMKt.equals(serve_value, "Compounding Fee Payment", true) ? String.valueOf(wa3Var.b("comp_FeePayment", "Compounding Fee Payment")) : StringsKt__StringsJVMKt.equals(serve_value, "Addition of Nominee", true) ? String.valueOf(wa3Var.b("to_nominee_header", "Addition of Nominee")) : StringsKt__StringsJVMKt.equals(serve_value, "Update Mobile No", true) ? String.valueOf(wa3Var.b("label_dl_serv_update_mob", "Update Mobile No")) : StringsKt__StringsJVMKt.equals(serve_value, "RC Services", true) ? String.valueOf(wa3Var.b("rcServices", "RC Services")) : StringsKt__StringsJVMKt.equals(serve_value, "Special Permit", true) ? String.valueOf(wa3Var.b("specialPermit", "Special Permit")) : serve_value;
            }
            return String.valueOf(wa3Var.b("label_application_status", serve_value));
        }

        public final void P0(Context context, xb binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.e.setText(wa3Var.b("lbl_State_Name", context.getString(R.string.state_name)));
            binding.b.setText(wa3Var.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
            binding.h.setHint(wa3Var.b("enter_FancyRecpNo", context.getString(R.string.enter_receipt_no)));
            binding.c.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void P1(Context context, uz5 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.m.i.setText(wa3Var.b("label_setting", "Settings"));
            binding.o.setText(wa3Var.b(va3.a.d(), "Change MPIN"));
            binding.k.setText(wa3Var.b("delete_account", "Delete My Account"));
        }

        public final void P2(Context context, we binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.l.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.m.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.j.i.setText(wa3Var.b("rc_release", context.getString(R.string.rc_release)));
            binding.k.setText(wa3Var.b("release_details", context.getString(R.string.release_details)));
            binding.i.setText(wa3Var.b("release_date", context.getString(R.string.release_date)));
            binding.f.setHint(wa3Var.b("release_date", context.getString(R.string.release_date)));
            binding.g.setText(wa3Var.b("file_reference_no", context.getString(R.string.file_reference_no)));
            binding.g.setText(wa3Var.b("file_reference_no", context.getString(R.string.file_reference_no)));
            binding.e.setHint(wa3Var.b("file_reference_no", context.getString(R.string.file_reference_no)));
            binding.b.setText(wa3Var.b("approved_by", context.getString(R.string.approved_by)));
            binding.d.setHint(wa3Var.b("approved_by", context.getString(R.string.approved_by)));
            binding.c.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void Q(Context context, w6 cn) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cn, "cn");
            wa3 wa3Var = new wa3(context);
            cn.P.setText(wa3Var.b("view_cl_det", context.getString(R.string.view_cl_details)));
            cn.N.setText(wa3Var.b("label_dl_serv_reason", context.getString(R.string.reason)));
            cn.M.setText(wa3Var.b("new_name", context.getString(R.string.new_name)));
            cn.R.setText(wa3Var.b("first_name", context.getString(R.string.first_name)));
            cn.S.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.first_name)));
            cn.b0.setText(wa3Var.b("middle_name", context.getString(R.string.middle_name)));
            cn.c0.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            cn.X.setText(wa3Var.b("last_name", context.getString(R.string.last_name)));
            cn.Y.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            cn.T.setText(wa3Var.b("full_name", context.getString(R.string.full_name_txt)));
            cn.U.setHint(wa3Var.b("enter_full_name", context.getString(R.string.enter_full_name_as_per_record)));
            cn.e0.setText(wa3Var.b("relation", context.getString(R.string.relation_is)));
            cn.Q.setText(wa3Var.b("first_name", context.getString(R.string.first_name)));
            cn.d0.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.first_name)));
            cn.Z.setText(wa3Var.b("middle_name", context.getString(R.string.middle_name)));
            cn.a0.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            cn.V.setText(wa3Var.b("last_name", context.getString(R.string.last_name)));
            cn.W.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            cn.G.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            cn.A.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void Q0(Context context, yb binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.g.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            binding.A.setText(wa3Var.b("btn_pay_now", context.getString(R.string.pay_now)));
            binding.I.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_number)));
            binding.J.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.d.setText(wa3Var.b("description", context.getString(R.string.description)));
            binding.w.setText(wa3Var.b("service_charges", context.getString(R.string.service_charges)));
            binding.f.setText(wa3Var.b("fee_amount", context.getString(R.string.fee_amount)));
            binding.l.setText(wa3Var.b("fine_amount", context.getString(R.string.fine_amount)));
            binding.E.setText(wa3Var.b("total_amount", context.getString(R.string.total_amount)));
            binding.n.setText(wa3Var.b("new_current_address", context.getString(R.string.new_current_address)));
            binding.o.setText(wa3Var.b("new_permanent_address", context.getString(R.string.new_permanent_address)));
            binding.z.setText(wa3Var.b("skip", context.getString(R.string.skip)));
            binding.t.h.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.t.e.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.t.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.t.g.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void Q1(Context context, hg binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.m.setText(wa3Var.b("label_shared_rc", context.getString(R.string.shared_rc)));
            binding.f.setHint(wa3Var.b("enter_the_mobile_number", context.getString(R.string.enter_the_mobile_number)));
            binding.j.setText(wa3Var.b("label_shared_rc", context.getString(R.string.shared_rc)));
        }

        public final void Q2(Context context, kh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.s.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.t.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.p.i.setText(wa3Var.b("rc_Surrender", context.getString(R.string.rc_surrender)));
            binding.q.setText(wa3Var.b("apply_for_rc_surrender", context.getString(R.string.apply_for_rc_surrender)));
            binding.r.setText(wa3Var.b("label_dl_serv_reason", context.getString(R.string.vahan_reason)));
            binding.k.setHint(wa3Var.b("label_dl_serv_reason", context.getString(R.string.vahan_reason)));
            binding.h.setText(wa3Var.b("rp_optional_details", context.getString(R.string.optional_details)));
            binding.l.setText(wa3Var.b("vahan_label_rc", context.getString(R.string.rc)));
            binding.g.setText(wa3Var.b("fitness_certificate", context.getString(R.string.fitness_certificate)));
            binding.i.setText(wa3Var.b("rc_Surrender_Permit", context.getString(R.string.permit)));
            binding.b.setText(wa3Var.b("applying_for_tax_exemption", context.getString(R.string.applying_for_tax_exemption)));
            binding.m.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            binding.n.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            binding.c.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.f.setHint(wa3Var.b("enter_rc_serial_no", "Enter rc serial no."));
            binding.d.setHint(wa3Var.b("enter_fitness_certificate_no", "Enter Fitness certificate no"));
            binding.e.setHint(wa3Var.b("rc_Surr_enter_PermitNo", "Enter permit no"));
        }

        public final void R(Context context, g7 cn) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cn, "cn");
            wa3 wa3Var = new wa3(context);
            cn.p.b.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            cn.p.c.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            cn.p.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            cn.p.d.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            cn.p.f.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            cn.J.setText(wa3Var.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            cn.x.setText(wa3Var.b("label_dl_serv_reason", context.getString(R.string.reason)));
            cn.w.setText(wa3Var.b("new_name", context.getString(R.string.new_name)));
            cn.B.setText(wa3Var.b("first_name", context.getString(R.string.first_name)));
            cn.e.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.first_name)));
            cn.H.setText(wa3Var.b("middle_name", context.getString(R.string.middle_name)));
            cn.m.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            cn.F.setText(wa3Var.b("last_name", context.getString(R.string.last_name)));
            cn.i.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            cn.C.setText(wa3Var.b("full_name", context.getString(R.string.full_name_txt)));
            cn.D.setHint(wa3Var.b("enter_full_name", context.getString(R.string.enter_full_name_as_per_record)));
            cn.I.setText(wa3Var.b("relation", context.getString(R.string.relation_is)));
            cn.A.setText(wa3Var.b("first_name", context.getString(R.string.first_name)));
            cn.r.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.first_name)));
            cn.G.setText(wa3Var.b("middle_name", context.getString(R.string.middle_name)));
            cn.t.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            cn.E.setText(wa3Var.b("last_name", context.getString(R.string.last_name)));
            cn.s.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            cn.q.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            cn.h.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void R0(Context context, ly3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.f.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            binding.y.setText(wa3Var.b("btn_pay_now", context.getString(R.string.pay_now)));
            binding.G.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_number)));
            binding.H.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.v.setText(wa3Var.b("service_charges", context.getString(R.string.service_charges)));
            binding.e.setText(wa3Var.b("fee_amount", context.getString(R.string.fee_amount)));
            binding.k.setText(wa3Var.b("fine_amount", context.getString(R.string.fine_amount)));
            binding.C.setText(wa3Var.b("total_amount", context.getString(R.string.total_amount)));
            binding.m.setText(wa3Var.b("new_current_address", context.getString(R.string.new_current_address)));
            binding.n.setText(wa3Var.b("new_permanent_address", context.getString(R.string.new_permanent_address)));
            binding.x.setText(wa3Var.b("skip", context.getString(R.string.skip)));
            binding.s.h.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.s.e.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.s.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.s.g.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void R1(Context context, yy3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.h.setText(wa3Var.b("title_sign_in_to", context.getString(R.string.sing_in_into)));
            binding.i.setText(wa3Var.b("title_your_account", context.getString(R.string.your_account)));
            binding.f.setText(wa3Var.b("title_sign_desc", context.getString(R.string.sign_in_txt)));
            binding.b.setText(wa3Var.b("label_signin", context.getString(R.string.sing_in)));
            binding.g.setText(wa3Var.b("btn_new_mparivahan", context.getString(R.string.new_to_app)));
            binding.c.setText(wa3Var.b("title_create_account", context.getString(R.string.creat_acc)));
        }

        public final void R2(Context context, af binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.w.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.x.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.d.setText(wa3Var.b("authorization_details", context.getString(R.string.authorization_details)));
            binding.r.setText(wa3Var.b("previous_permit_no", context.getString(R.string.previous_permit_no)));
            binding.q.setHint(wa3Var.b("enter_previous_permit_no", context.getString(R.string.enter_previous_permit_no)));
            binding.s.setHint(wa3Var.b("enter_previous_registration_no", context.getString(R.string.enter_previous_registration_no)));
            binding.t.setText(wa3Var.b("previous_registration_no", context.getString(R.string.previous_registration_no)));
            binding.n.setText(wa3Var.b("previous_authorization_upto", context.getString(R.string.previous_authorization_upto)));
            binding.k.setHint(wa3Var.b("enter_previous_authorization_order_no", context.getString(R.string.enter_previous_authorization_order_no)));
            binding.j.setText(wa3Var.b("previous_authorization_form", context.getString(R.string.previous_authorization_form)));
            binding.i.setHint(wa3Var.b("enter_previous_authorization_form", context.getString(R.string.enter_previous_authorization_form)));
            binding.j.setText(wa3Var.b("previous_authorization_form", context.getString(R.string.previous_authorization_form)));
            binding.i.setHint(wa3Var.b("enter_previous_authorization_form", context.getString(R.string.enter_previous_authorization_form)));
            binding.p.setText(wa3Var.b("previous_issuing_date", context.getString(R.string.previous_issuing_date)));
            binding.o.setHint(wa3Var.b("enter_previous_issuing_date", context.getString(R.string.enter_previous_issuing_date)));
            binding.h.setText(wa3Var.b("previous_authorization_upto", context.getString(R.string.period_details)));
            binding.e.setHint(wa3Var.b("enter_authorization_upto", context.getString(R.string.enter_authorization_upto)));
            binding.c.setText(wa3Var.b("allotment_office", context.getString(R.string.allotment_office)));
            binding.b.setHint(wa3Var.b("enter_allotment_office", context.getString(R.string.enter_allotment_office)));
            binding.g.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.m.setHint(wa3Var.b("enter_previous_authorization_upto", context.getString(R.string.enter_previous_authorization_upto)));
            binding.f.setText(wa3Var.b("authorization_upto", context.getString(R.string.authorization_upto)));
            binding.l.setText(wa3Var.b("previous_authorization_order_no", context.getString(R.string.previous_authorization_order_no)));
        }

        public final void S(Context context, y6 cn) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cn, "cn");
            wa3 wa3Var = new wa3(context);
            cn.L.setText(wa3Var.b("view_ll", context.getString(R.string.view_ll_details)));
            cn.K.setText(wa3Var.b("label_dl_serv_reason", "Reason") + " * ");
            cn.I.setText(wa3Var.b("new_name", context.getString(R.string.new_name)));
            cn.N.setText(wa3Var.b("first_name", "First Name") + " * ");
            cn.O.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.first_name)));
            cn.X.setText(wa3Var.b("middle_name", context.getString(R.string.middle_name)));
            cn.Y.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            cn.T.setText(wa3Var.b("last_name", "Last Name"));
            cn.U.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            cn.P.setText(wa3Var.b("full_name", context.getString(R.string.full_name_txt)));
            cn.Q.setHint(wa3Var.b("enter_full_name", context.getString(R.string.enter_full_name_as_per_record)));
            cn.a0.setText(wa3Var.b("relation", "Relation") + " * ");
            cn.M.setText(wa3Var.b("first_name", "First Name") + " * ");
            cn.Z.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.first_name)));
            cn.V.setText(wa3Var.b("middle_name", context.getString(R.string.middle_name)));
            cn.W.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            cn.R.setText(wa3Var.b("last_name", "Last Name"));
            cn.S.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            cn.E.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            cn.y.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final String S0(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            wa3 wa3Var = new wa3(context);
            return StringsKt__StringsJVMKt.equals$default(wa3Var.d(), "gujarati", false, 2, null) ? "બાયોમેટ્રિક સાથે લોગિન કરો" : StringsKt__StringsJVMKt.equals$default(wa3Var.d(), "bengali", false, 2, null) ? "বায়োমেট্রিক দিয়ে লগইন করুন" : StringsKt__StringsJVMKt.equals$default(wa3Var.d(), "hindi", false, 2, null) ? "बायोमेट्रिक से लॉगिन करें" : StringsKt__StringsJVMKt.equals$default(wa3Var.d(), "tamil", false, 2, null) ? "பயோமெட்ரிக் மூலம் உள்நுழைக" : StringsKt__StringsJVMKt.equals$default(wa3Var.d(), "malayalam", false, 2, null) ? "ബയോമെട്രിക് ഉപയോഗിച്ച് ലോഗിൻ ചെയ്യുക" : "Login with Biometric";
        }

        public final void S1(Context context, xy3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.g.setText(S0(context));
            binding.t.setText(wa3Var.b("title_sign_in_to", context.getString(R.string.sing_in_into)));
            EditText editText = binding.j;
            va3.a aVar = va3.a;
            editText.setHint(wa3Var.b(aVar.n(), context.getString(R.string.six_pin)));
            binding.s.setText(wa3Var.b(aVar.b(), "Generate MPIN"));
            binding.i.setHint(wa3Var.b("label_log_entr_mob_no", "Enter the Mobile Number"));
            binding.u.setText(wa3Var.b("title_your_account", context.getString(R.string.your_account)));
            binding.d.setText(wa3Var.b("label_another_account", context.getString(R.string.use_another)));
            binding.f.setText(wa3Var.b("label_forgot_mpin", context.getString(R.string.forgot_pin)));
            binding.r.setText(wa3Var.b("butt_signin_mpin", context.getString(R.string.sign_in_pin)));
            binding.q.setText(wa3Var.b("label_dont_account", context.getString(R.string.dont_have_account)));
            binding.o.setText(wa3Var.b("label_signup", context.getString(R.string.sign_up)));
        }

        public final void S2(Context context, cf binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.j.setText(wa3Var.b("rp_previousPermit_detail", context.getString(R.string.previous_permit_details)));
            binding.I.i.setText(wa3Var.b("Renewal_Permit", "Renewal of State Permit"));
            binding.p.setText(wa3Var.b("rp_previousPermit_detail", context.getString(R.string.permit_no)));
            binding.o.setHint(wa3Var.b("rc_Surr_enter_PermitNo", context.getString(R.string.enter_permit_no)));
            binding.t.setText(wa3Var.b("permit_valid_from", context.getString(R.string.permit_valid_from)));
            binding.s.setHint(wa3Var.b("enter_permit_valid_from", context.getString(R.string.enter_permit_valid_from)));
            binding.v.setText(wa3Var.b("permit_valid_upto", context.getString(R.string.permit_valid_upto)));
            binding.u.setHint(wa3Var.b("enter_permit_valid_upto", context.getString(R.string.enter_permit_valid_upto)));
            binding.q.setText(wa3Var.b("permit_type", context.getString(R.string.permit_type)));
            binding.m.setText(wa3Var.b("rp_permitCategory", context.getString(R.string.permit_category)));
            binding.M.setText(wa3Var.b("rp_mode", context.getString(R.string.yearly_mode)));
            binding.l.setText(wa3Var.b("temp_select_period", context.getString(R.string.period)));
            binding.k.setText(wa3Var.b("temp_select_period", context.getString(R.string.period)));
            binding.b.setText(wa3Var.b("allotment_office", context.getString(R.string.allotment_office)));
            binding.G.setText(wa3Var.b("services_type", context.getString(R.string.services_type)));
            binding.i.setText(wa3Var.b("temp_NatureGoodsCarried", context.getString(R.string.nature_of_goods_to_be_carried)));
            binding.f.setText(wa3Var.b("temp_Goods", context.getString(R.string.goods)));
            binding.d.setHint(wa3Var.b("temp_Goods_DetailsDesc", context.getString(R.string.goods_detail_if_goods_is_other_please_mention_here)));
            binding.x.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.g.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final String T(Context context, String service_code, String serve_value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(service_code, "service_code");
            Intrinsics.checkNotNullParameter(serve_value, "serve_value");
            wa3 wa3Var = new wa3(context);
            return service_code.equals("2002") ? String.valueOf(wa3Var.b("fancyNo_AvailableStatus", serve_value)) : service_code.equals("2003") ? String.valueOf(wa3Var.b("fancyNo_AucStatus", serve_value)) : service_code.equals("2004") ? String.valueOf(wa3Var.b("FancyNo_FeeReceipt", serve_value)) : service_code.equals("2005") ? String.valueOf(wa3Var.b("fancyNo_ViewAllotmentLetter", serve_value)) : service_code.equals("2001") ? String.valueOf(wa3Var.b("pucc_header_download", serve_value)) : service_code.equals("2007") ? String.valueOf(wa3Var.b("checkPostReceiptStatus", serve_value)) : service_code.equals("2008") ? String.valueOf(wa3Var.b("cp_header_download_receipt", serve_value)) : service_code.equals("2006") ? String.valueOf(wa3Var.b("fancyNo_ShowAuctionStatus", serve_value)) : serve_value;
        }

        public final void T0(Context context, zb hillreg) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(hillreg, "hillreg");
            wa3 wa3Var = new wa3(context);
            hillreg.L.b.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            hillreg.L.c.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            hillreg.L.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            hillreg.L.d.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            hillreg.L.f.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            hillreg.O.setText(wa3Var.b("endor_to_drive", context.getString(R.string.endor_to_drive)));
            hillreg.R.setText(wa3Var.b("certificate_number", context.getString(R.string.certificate_number)));
            hillreg.x.setHint(wa3Var.b("enter_certificate_number", context.getString(R.string.enter_certificate_number)));
            hillreg.T.setText(wa3Var.b("doi", context.getString(R.string.issue_date)));
            hillreg.U.setHint(wa3Var.b("enter_issue_date", context.getString(R.string.enter_issue_date)));
            hillreg.Y.setText(wa3Var.b("valid_to_date", context.getString(R.string.valid_to_date)));
            hillreg.X.setHint(wa3Var.b("valid_to_date", context.getString(R.string.valid_to_date)));
            hillreg.Q.setText(wa3Var.b("issued_by", context.getString(R.string.issued_by)));
            hillreg.P.setText(wa3Var.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            hillreg.a0.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            hillreg.J.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            hillreg.K.setHint(wa3Var.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
            hillreg.E.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            hillreg.N.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            hillreg.Z.setText(wa3Var.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
        }

        public final void T1(Context context, na slot) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(slot, "slot");
            wa3 wa3Var = new wa3(context);
            slot.z.setText(wa3Var.b("label_avaialble", context.getString(R.string.app_details)));
            slot.H.setText(wa3Var.b("label_app_booking_successfully", context.getString(R.string.app_booking_successful)));
            slot.I.setText(wa3Var.b("label_app_date", context.getString(R.string.app_date)));
            slot.J.setText(wa3Var.b("label_app_time", context.getString(R.string.app_time)));
            slot.A.setText(wa3Var.b("view_slip", context.getString(R.string.app_slip)));
            slot.E.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void T2(Context context, bf binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.r.i.setText(wa3Var.b("Renewal_Permit", "Renewal of State Permit"));
            binding.b.setText(wa3Var.b("rp_previousPermit_detail", context.getString(R.string.previous_permit_details)));
            binding.u.setText(wa3Var.b("within_gujarat", context.getString(R.string.within_gujarat)));
            binding.j.setText(wa3Var.b("rp_otherArea", context.getString(R.string.other_area)));
            binding.d.setText(wa3Var.b("rp_otherArea", context.getString(R.string.area_selected)));
            binding.i.setText(wa3Var.b("rp_optional_details", context.getString(R.string.optional_details)));
            binding.g.setText(wa3Var.b("rp_parking_title", context.getString(R.string.parking_place)));
            binding.f.setHint(wa3Var.b("rp_parking", context.getString(R.string.enter_parking_place)));
            binding.m.setText(wa3Var.b("rp_purpose_title", context.getString(R.string.purpose_of_journey)));
            binding.l.setHint(wa3Var.b("rp_purpose_journey", context.getString(R.string.enter_purpose_of_journey)));
            binding.o.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.h.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final String U(Context context, String service_code, String serve_value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(service_code, "service_code");
            Intrinsics.checkNotNullParameter(serve_value, "serve_value");
            wa3 wa3Var = new wa3(context);
            return service_code.equals("901") ? String.valueOf(wa3Var.b("label_view_fee_Receipt", serve_value)) : service_code.equals("902") ? String.valueOf(wa3Var.b("lbl_Verify_Payment_Status", serve_value)) : service_code.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE) ? String.valueOf(wa3Var.b("hypothecation_addition", serve_value)) : service_code.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE) ? String.valueOf(wa3Var.b("hypothecation_termination", serve_value)) : service_code.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE) ? String.valueOf(wa3Var.b("hypothecation_continuation", serve_value)) : service_code.equals(VContant.RCPARTICULAR_PURPOSE_CODE) ? String.valueOf(wa3Var.b("lbl_rc_particular_against_fee", serve_value)) : service_code.equals("4") ? String.valueOf(wa3Var.b("change_of_address_in_rc2", serve_value)) : service_code.equals(VContant.NOC_PURPOSE_CODE) ? String.valueOf(wa3Var.b("no_objection_certificate_noc", serve_value)) : service_code.equals("104") ? String.valueOf(wa3Var.b("update_Mobile_No", serve_value)) : service_code.equals("3") ? String.valueOf(wa3Var.b("issue_of_duplicate_rc", serve_value)) : service_code.equals("102") ? String.valueOf(wa3Var.b("vahan_dispose_application", serve_value)) : service_code.equals("103") ? String.valueOf(wa3Var.b("label_application_status", serve_value)) : service_code.equals("903") ? String.valueOf(wa3Var.b("label_view_forms", serve_value)) : service_code.equals(VContant.DUPLICATE_FITNESS_PURPOSE_CODE) ? String.valueOf(wa3Var.b("duplicate_FitnessCert", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.DUPLICATE_PERMIT_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("duplicate_Permit", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.RC_SURRENDER_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("rc_Surrender", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.RC_CACELLATION_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("rc_cancellation", serve_value)) : (StringsKt__StringsJVMKt.equals(service_code, VContant.Tax_PURPOSE_CODE, true) || StringsKt__StringsJVMKt.equals(service_code, "101", true)) ? String.valueOf(wa3Var.b("pay_TaxService", serve_value)) : StringsKt__StringsJVMKt.equals(serve_value, "Tax Assessment", true) ? String.valueOf(wa3Var.b("tax_Assessment", "Tax Assessment")) : StringsKt__StringsJVMKt.equals(service_code, VContant.RC_RELEASE_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("rc_release", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.TempPermit_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("temporary_permit", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.RenewalNpAuthorization_CODE, true) ? String.valueOf(wa3Var.b("renewalNpAuthorization_Permit", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("rp_header_title", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("toSellerBuyer", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.ALTERATION_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("altVh_ServiceName", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.MISELL_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("misc_FeePayment", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.NOMINEE_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("to_nominee_header", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, "907", true) ? String.valueOf(wa3Var.b("download_Noc", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, "904", true) ? String.valueOf(wa3Var.b("btn_Download_Appointment_Slip", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.MULTISERVICE_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("multipleServices", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, "910", true) ? String.valueOf(wa3Var.b("download_fitness_cert", serve_value)) : StringsKt__StringsJVMKt.equals(service_code, VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("comp_FeePayment", serve_value)) : serve_value;
        }

        public final void U0(Context context, f67 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.F.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.G.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.z.setText(wa3Var.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            binding.t.i.setText(wa3Var.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            binding.k.setText(wa3Var.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            binding.E.setText(wa3Var.b("lbl_Type", context.getString(R.string.vahan_type)));
            binding.y.setText(wa3Var.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            binding.x.setText(wa3Var.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            binding.w.setText(wa3Var.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            binding.v.setText(wa3Var.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            binding.l.setText(wa3Var.b("vahan_hypothecation_continuation_details", context.getString(R.string.vahan_hypothecation_continuation_details)));
            binding.D.setText(wa3Var.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            binding.B.setText(wa3Var.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            binding.A.setText(wa3Var.b("vahan_term_branch_add", context.getString(R.string.vahan_term_branch_add)));
            binding.C.setText(wa3Var.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            binding.d.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.q.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.q.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.q.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.q.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void U1(Context context, fa slot) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(slot, "slot");
            wa3 wa3Var = new wa3(context);
            slot.N.c.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            slot.N.d.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            slot.N.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            slot.N.e.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            slot.N.b.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            slot.x.setText(wa3Var.b("label_avaialble", context.getString(R.string.available)));
            slot.z.setText(wa3Var.b("label_booked", context.getString(R.string.booked)));
            slot.G.setText(wa3Var.b("label_holiday", context.getString(R.string.holiday)));
            slot.M.setText(wa3Var.b("label_yet_to_open", context.getString(R.string.yet_to_open)));
        }

        public final void U2(Context context, le6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.P.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.Q.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.N.setText(wa3Var.b("allotment_office", context.getString(R.string.allotment_office)));
            binding.L.setText(wa3Var.b("temp_period_Mode", context.getString(R.string.period_mode)));
            binding.M.setText(wa3Var.b("temp_select_period", context.getString(R.string.period)));
            binding.J.setText(wa3Var.b("temp_validFrmDate", context.getString(R.string.valid_from_date)));
            binding.e.setText(wa3Var.b("temp_validFrmDate", context.getString(R.string.valid_from_date)));
            binding.F.setText(wa3Var.b("temp_trvelFrom", context.getString(R.string.travel_from)));
            binding.E.setHint(wa3Var.b("temp_trvelFrom", context.getString(R.string.travel_from)));
            binding.H.setText(wa3Var.b("temp_trvelUpTo", context.getString(R.string.travel_upto)));
            binding.G.setHint(wa3Var.b("temp_trvelUpTo", context.getString(R.string.travel_upto)));
            binding.H.setText(wa3Var.b("temp_trvelUpTo", context.getString(R.string.travel_upto)));
            binding.n.setText(wa3Var.b("temp_NatureGoodsCarried", context.getString(R.string.nature_of_goods_to_be_carried)));
            binding.h.setText(wa3Var.b("temp_Goods", context.getString(R.string.goods)));
            binding.f.setText(wa3Var.b("temp_Goods_DetailsDesc", context.getString(R.string.goods_details_if_goods_is_other_please_mention_here)));
            binding.i.setHint(wa3Var.b("temp_Goods_DetailsDesc", context.getString(R.string.goods_details)));
            binding.w.setText(wa3Var.b("temp_Goods_DetailPlaceHolder", context.getString(R.string.goods_details)));
            binding.z.setHint(wa3Var.b("temp_RouteDesc", context.getString(R.string.route_description)));
            binding.u.setText(wa3Var.b("temp_PurposeJourney", context.getString(R.string.purpose_of_journey)));
            binding.y.setText(wa3Var.b("temp_routLength", context.getString(R.string.route_length)));
            binding.x.setHint(wa3Var.b("temp_routLength", context.getString(R.string.route_length)));
            binding.C.setText(wa3Var.b("temp_ServiceType", context.getString(R.string.services_types)));
            binding.c.setText(wa3Var.b("add_passanger_list", context.getString(R.string.add_passanger_list)));
            binding.d.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.R.setText(wa3Var.b("view_added_passanger", context.getString(R.string.view_added_passanger)));
            binding.K.setText(wa3Var.b("temp_validUptoDate", context.getString(R.string.valid_upto_date)));
            binding.O.setText(wa3Var.b("temp_validUptoDate", context.getString(R.string.valid_upto_date)));
        }

        public final void V(Context context, e7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.c.setText(wa3Var.b("btn_ok", context.getString(R.string.text_ok)));
            binding.b.setText(wa3Var.b("change_of_address_in_rc", context.getString(R.string.change_of_address_in_rc)));
        }

        public final void V0(Context context, hs2 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.G.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.H.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.A.setText(wa3Var.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            binding.u.i.setText(wa3Var.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            binding.k.setText(wa3Var.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            binding.F.setText(wa3Var.b("lbl_Type", context.getString(R.string.vahan_type)));
            binding.z.setText(wa3Var.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            binding.y.setText(wa3Var.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            binding.x.setText(wa3Var.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            binding.w.setText(wa3Var.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            binding.l.setText(wa3Var.b("vahan_hypothecation_continuation_details", context.getString(R.string.vahan_hypothecation_continuation_details)));
            binding.E.setText(wa3Var.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            binding.C.setText(wa3Var.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            binding.B.setText(wa3Var.b("vahan_term_branch_add", context.getString(R.string.vahan_term_branch_add)));
            binding.D.setText(wa3Var.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            binding.d.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.q.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.q.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.q.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.q.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void V1(Context context, wh7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.p.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.n.setText(wa3Var.b("friday_13_november", context.getString(R.string.friday_13_november)));
            binding.k.setText(wa3Var.b("selected_date", context.getString(R.string.selected_date)));
            binding.h.setText(wa3Var.b("view_Details", context.getString(R.string.view_Details)));
            binding.e.b.setText(wa3Var.b("label_avaialble", "Available"));
            binding.e.c.setText(wa3Var.b("label_booked", "Booked"));
            binding.e.d.setText(wa3Var.b("label_holiday", "Holiday"));
            binding.m.i.setText(wa3Var.b("lbl_Book_Appointment", "Book Appointment"));
        }

        public final void V2(Context context, e67 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.z.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.A.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.x.setText(wa3Var.b("lbl_Hypothecation_Addition", context.getString(R.string.vahan_hypothecation_addition)));
            binding.r.i.setText(wa3Var.b("lbl_Hypothecation_Addition", context.getString(R.string.vahan_hypothecation_addition)));
            binding.w.setText(wa3Var.b("lbl_Hypothecation_Addition_Details", context.getString(R.string.vahan_hypothecation_add_details)));
            binding.y.setText(wa3Var.b("lbl_Type", context.getString(R.string.vahan_type)));
            binding.v.setText(wa3Var.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            binding.h.setHint(wa3Var.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            binding.u.setText(wa3Var.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            binding.g.setHint(wa3Var.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            binding.t.setText(wa3Var.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            binding.j.setText(wa3Var.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            binding.i.setHint(wa3Var.b("lbl_Enter_the_House_no", context.getString(R.string.enter_the_house_no)));
            binding.C.setText(wa3Var.b("village_town_city", context.getString(R.string.village_town_city)));
            binding.B.setHint(wa3Var.b("lbl_Enter_the_Village_Town_City", context.getString(R.string.enter_the_village_town_city)));
            binding.m.setText(wa3Var.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            binding.l.setHint(wa3Var.b("lbl_Enter_the_Landmark_Police_station", context.getString(R.string.enter_the_landmark_police_station)));
            binding.q.setText(wa3Var.b("vahan_state", context.getString(R.string.state)));
            binding.e.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district)));
            binding.n.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.d.setHint(wa3Var.b("lbl_Enter_the_pincode", context.getString(R.string.enter_the_pincode)));
            binding.s.setText(wa3Var.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            binding.f.setHint(wa3Var.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            binding.b.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.o.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.o.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.o.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.o.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void W(Context context, h7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.h.f.setText(wa3Var.b("checkPostReceiptStatus", context.getString(R.string.verify_check_post_details)));
            binding.E.setText(wa3Var.b("lbl_State_Name", context.getString(R.string.state_name)));
            binding.F.setText(wa3Var.b("vahan_owner_name", context.getString(R.string.owner_name)));
            binding.N.setText(wa3Var.b("vehicle_no", context.getString(R.string.vehicle_no)));
            binding.u.setText(wa3Var.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
            binding.l.setText(wa3Var.b("paymentDate", context.getString(R.string.payment_date)));
            binding.K.setText(wa3Var.b("vehicle_class", context.getString(R.string.vehicle_class)));
            binding.I.setText(wa3Var.b("cp_vehicle_type", context.getString(R.string.vehcile_type)));
            binding.g.setText(wa3Var.b("vahan_chassis_no", context.getString(R.string.chasis_no)));
            binding.x.setText(wa3Var.b("lbl_tax_from", context.getString(R.string.tax_from)));
            binding.D.setText(wa3Var.b("tax_upto", context.getString(R.string.tax_upto)));
            binding.d.setText(wa3Var.b("vahan_amount", context.getString(R.string.amount)));
            binding.A.setText(wa3Var.b("tax_mode", context.getString(R.string.tax_mode)));
            binding.o.setText(wa3Var.b("cp_payment_mode", context.getString(R.string.payment_mode)));
            binding.r.setText(wa3Var.b("vahan_payment_status", context.getString(R.string.payment_status)));
        }

        public final void W0(Context context, hs2 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.G.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.H.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.A.setText(wa3Var.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            binding.u.i.setText(wa3Var.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            binding.k.setText(wa3Var.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            binding.F.setText(wa3Var.b("lbl_Type", context.getString(R.string.vahan_type)));
            binding.z.setText(wa3Var.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            binding.y.setText(wa3Var.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            binding.x.setText(wa3Var.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            binding.w.setText(wa3Var.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            binding.l.setText(wa3Var.b("vahan_hypothecation_continuation_details", context.getString(R.string.vahan_hypothecation_continuation_details)));
            binding.E.setText(wa3Var.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            binding.C.setText(wa3Var.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            binding.B.setText(wa3Var.b("vahan_term_branch_add", context.getString(R.string.vahan_term_branch_add)));
            binding.D.setText(wa3Var.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            binding.d.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.q.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.q.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.q.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.q.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void W1(Context context, xh7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.f.setText(wa3Var.b("download_appointment_receipt", context.getString(R.string.download_appointment_receipt)));
            binding.c.setText(wa3Var.b("label_home", context.getString(R.string.home)));
            binding.g.i.setText(wa3Var.b("download_appointment_receipt", "Download Appointment Receipt"));
        }

        public final void W2(Context context, mh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.n.i.setText(wa3Var.b("label_dl_serv_update_mob", context.getString(R.string.update_mobile_no)));
            binding.k.setText(wa3Var.b("vahan_registration_no", context.getString(R.string.registration_no)));
            binding.h.setHint(wa3Var.b("vahan_enter_registration_no", context.getString(R.string.enter_registration_no)));
            binding.b.setText(wa3Var.b("chassis_no_full", context.getString(R.string.chassis_no_full)));
            binding.c.setHint(wa3Var.b("vahan_enter_chassis_no", context.getString(R.string.enter_chasis_no)));
            binding.d.setText(wa3Var.b("engine_no_full", context.getString(R.string.engine_no_full)));
            binding.e.setHint(wa3Var.b("lbl_vahan_enter_engine_no", context.getString(R.string.enter_engine_no)));
            binding.j.setText(wa3Var.b("registration_date", context.getString(R.string.registration_dt)));
            binding.i.setHint(wa3Var.b("dd_mm_yyyy", context.getString(R.string.dd_mm_yyyy)));
            binding.l.setText(wa3Var.b("add_NomineeRegUptoDate", context.getString(R.string.regFitValidUpto)));
            binding.m.setHint(wa3Var.b("dd_mm_yyyy", context.getString(R.string.dd_mm_yyyy)));
            binding.o.setText(wa3Var.b("updateMobile_HintMsg", context.getString(R.string.update_mobile_hint)));
            binding.g.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.f.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void X(Context context, i7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.k.i.setText(wa3Var.b("checkPostReceiptStatus", context.getString(R.string.verify_check_post_details)));
            binding.e.setText(wa3Var.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
            binding.n.setText(wa3Var.b("label_challan_vehicle_no", context.getString(R.string.vehicle_no)));
            binding.d.setHint(wa3Var.b("enter_FancyRecpNo", context.getString(R.string.enter_receipt_no)));
            binding.i.setText(wa3Var.b("cp_for_state", context.getString(R.string.for_state)));
            binding.b.setHint(wa3Var.b("enter_vehicle_no", context.getString(R.string.enter_vehicle_no)));
            binding.c.setText(wa3Var.b("vahan_get_details", context.getString(R.string.get_details)));
        }

        public final void X0(Context context, g67 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.H.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.I.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.B.setText(wa3Var.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            binding.v.i.setText(wa3Var.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            binding.m.setText(wa3Var.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            binding.G.setText(wa3Var.b("lbl_Type", context.getString(R.string.vahan_type)));
            binding.A.setText(wa3Var.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            binding.z.setText(wa3Var.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            binding.y.setText(wa3Var.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            binding.x.setText(wa3Var.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            binding.n.setText(wa3Var.b("vahan_hypothecation_termination_details", context.getString(R.string.vahan_hypothecation_termination_details)));
            binding.F.setText(wa3Var.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            binding.D.setText(wa3Var.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            binding.E.setText(wa3Var.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            binding.d.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.s.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.s.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.s.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.s.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void X1(Context context, ig binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.q.setText(wa3Var.b("Emergency_Service", "Emergency Service"));
            binding.d.setText(wa3Var.b("create_ep", "Create Emergency Profile"));
            binding.u.setText(wa3Var.b("quick_access", "For quick access during an emergency, add emergency contact"));
            binding.v.setText(wa3Var.b("manage_contact", "Manage Contact"));
            binding.s.setText(wa3Var.b("Call_Ambulance", "Call Ambulance"));
            binding.w.setText(wa3Var.b("tap_102", "Tap here to dial 102"));
            binding.x.setText(wa3Var.b("tap_contacts", "Tap To Notify Contacts"));
        }

        public final void X2(Context context, ih2 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.b0.setText(wa3Var.b("vahan_owner_name", context.getString(R.string.owner_name)));
            binding.c0.setText(wa3Var.b("vahan_owner_name", context.getString(R.string.owner_name)));
            binding.b.setText(wa3Var.b("btn_dl_serv_close", context.getString(R.string.close)));
            binding.I0.setText(wa3Var.b("vehicle_details", context.getString(R.string.vehicle_details)));
            binding.v.setText(wa3Var.b("owner_details", context.getString(R.string.owner_details)));
            binding.b0.setText(wa3Var.b("vahan_owner_name", context.getString(R.string.owner_name)));
            binding.w0.setText(wa3Var.b("relation", context.getString(R.string.relation)));
            binding.A0.setText(wa3Var.b("as_per_aadhar", context.getString(R.string.as_per_aadhar)));
            binding.c0.setText(wa3Var.b("vahan_owner_name", context.getString(R.string.owner_name)));
            binding.d.setText(wa3Var.b("current_address", context.getString(R.string.current_add)));
            binding.y.setText(wa3Var.b("vehicle_details", context.getString(R.string.vehicle_details)));
            binding.F0.setText(wa3Var.b("vehicle_class", context.getString(R.string.vehicle_class)));
            binding.E0.setText(wa3Var.b("vehicle_details", context.getString(R.string.vehicle_category)));
            binding.P.setText(wa3Var.b("maker_name", context.getString(R.string.maker_name)));
            binding.N.setText(wa3Var.b("maker_model", context.getString(R.string.maker_model)));
            binding.u0.setText(wa3Var.b("registration_date", context.getString(R.string.registration_date)));
            binding.r.setText(wa3Var.b("fuel_type", context.getString(R.string.fuel_type)));
            binding.Z.setText(wa3Var.b("norms_description", context.getString(R.string.norms_description)));
            binding.p.setText(wa3Var.b("fitness_valid_upto", context.getString(R.string.fitness_valid_upto)));
            binding.x0.setText(wa3Var.b("tax_valid_upto", context.getString(R.string.tax_valid_upto)));
            binding.x.setText(wa3Var.b("pucc_details", context.getString(R.string.pucc_details)));
            binding.s0.setText(wa3Var.b("pucc_valid_upto", context.getString(R.string.pucc_valid_upto)));
            binding.t.setText(wa3Var.b("insurance_details", context.getString(R.string.insurance_details)));
            binding.C.setText(wa3Var.b("insurance_policy_no", context.getString(R.string.insurance_policy_no)));
            binding.A.setText(wa3Var.b("insurance_company_name", context.getString(R.string.insurance_company_name)));
            binding.E.setText(wa3Var.b("insurance_valid_upto", context.getString(R.string.insurance_valid_upto)));
            binding.u.setText(wa3Var.b("financer_details", context.getString(R.string.financer_details)));
            binding.l.setText(wa3Var.b("financed_from", context.getString(R.string.financed_from)));
            binding.w.setText(wa3Var.b("permit_details", context.getString(R.string.permit_details)));
            binding.i0.setText(wa3Var.b("permit_no", context.getString(R.string.permit_no)));
            binding.k0.setText(wa3Var.b("permit_type", context.getString(R.string.permit_type)));
            binding.g0.setText(wa3Var.b("permit_issue_date", context.getString(R.string.permit_issue_date)));
            binding.n0.setText(wa3Var.b("permit_valid_from", context.getString(R.string.permit_valid_from)));
            binding.p0.setText(wa3Var.b("permit_valid_upto", context.getString(R.string.permit_valid_upto)));
            binding.S.setText(wa3Var.b("national_permit_no", context.getString(R.string.national_permit_no)));
            binding.Q.setText(wa3Var.b("national_permit_issued_by", context.getString(R.string.national_permit_issued_by)));
            binding.V.setText(wa3Var.b("national_permit_valid_upto", context.getString(R.string.national_permit_valid_upto)));
        }

        public final void Y(Context context, j7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.j.i.setText(wa3Var.b("checkPostReceiptStatus", context.getString(R.string.verify_check_post_details)));
            binding.e.setHint(wa3Var.b("enter_FancyRecpNo", context.getString(R.string.enter_receipt_number)));
            binding.g.setText(wa3Var.b("label_search", context.getString(R.string.search)));
            binding.k.setText(wa3Var.b("total_checkpost_status", context.getString(R.string.total_checkpost_status)));
            binding.c.setText(wa3Var.b("total_checkpost_status", context.getString(R.string.no_checkpost_receipt_found)));
        }

        public final void Y0(Context context, nr2 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.I.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.J.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.C.setText(wa3Var.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            binding.w.i.setText(wa3Var.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            binding.m.setText(wa3Var.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            binding.H.setText(wa3Var.b("lbl_Type", context.getString(R.string.vahan_type)));
            binding.B.setText(wa3Var.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            binding.A.setText(wa3Var.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            binding.z.setText(wa3Var.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            binding.y.setText(wa3Var.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            binding.n.setText(wa3Var.b("vahan_hypothecation_termination_details", context.getString(R.string.vahan_hypothecation_termination_details)));
            binding.G.setText(wa3Var.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            binding.E.setText(wa3Var.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            binding.F.setText(wa3Var.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            binding.d.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.s.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.s.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.s.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.s.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void Y1(Context context, ud st) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(st, "st");
            wa3 wa3Var = new wa3(context);
            st.E.setText(wa3Var.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
            st.D.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void Y2(Context context, uy3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.p.setText(wa3Var.b("button_verify", context.getString(R.string.verify)));
            binding.m.setText(wa3Var.b("title_security_mpin", context.getString(R.string.sec_pin)));
            binding.s.setText(wa3Var.b("label_verify_otp", context.getString(R.string.verify_otp)));
            binding.e.setHint(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
            binding.t.setText(wa3Var.b("label_wait_otp", context.getString(R.string.wait_for_otp)));
            binding.o.setText(wa3Var.b("label_refresh_close", context.getString(R.string.ref_close)));
            binding.r.setText(wa3Var.b("button_verify", context.getString(R.string.verify)));
            binding.n.setText(wa3Var.b("label_get_otp", context.getString(R.string.did_not_get_otp)));
            binding.i.setText(wa3Var.b("label_resend_otp", context.getString(R.string.resend_otp)));
            binding.r.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void Z(Context context, m7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.Q.setText(wa3Var.b("personal_details", context.getString(R.string.personal_details)));
            binding.p0.setText(wa3Var.b(va3.a.L(), context.getString(R.string.name)));
            binding.g0.setText(wa3Var.b("label_dl_serv_father_name", context.getString(R.string.father_name)));
            binding.m0.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            binding.c0.setText(wa3Var.b("blood_group", context.getString(R.string.blood_group)));
            binding.a0.setText(wa3Var.b("address", context.getString(R.string.address)));
            binding.V.setText(wa3Var.b("licence_details", context.getString(R.string.licence_details)));
            binding.i0.setText(wa3Var.b("licence_details", context.getString(R.string.conductor_driving_license_numb)));
            binding.k0.setText(wa3Var.b("validity_nt", context.getString(R.string.validity)));
            binding.d0.setText(wa3Var.b("issue_date", context.getString(R.string.doi)));
            binding.f0.setText(wa3Var.b("stay_duration", "Duration of stay at present Address") + " * ");
            binding.r0.setHint(wa3Var.b("year_txt", context.getString(R.string.year)));
            binding.o0.setHint(wa3Var.b("month_txt", context.getString(R.string.month)));
            binding.Z.setText(wa3Var.b("mother_name", "Mother Name"));
            binding.E.setHint(wa3Var.b("enter_mother_name", context.getString(R.string.enter_mother_name)));
            binding.W.setText(wa3Var.b("mar_status", "Marital Status") + " * ");
            binding.Y.setText(wa3Var.b("appl_religion", "Religion") + " * ");
            binding.R.setText(wa3Var.b("label_dl_serv_birth_place", "Birth Place") + " * ");
            binding.F.setHint(wa3Var.b("edit_dl_serv_enter_birth_plac", context.getString(R.string.enterbirthplace)));
            binding.S.setText(wa3Var.b("category", "Category") + " * ");
            binding.X.setText(wa3Var.b("lbl_Police_Station", "Police Station") + " * ");
            binding.U.setText(wa3Var.b("lbl_Police_Station", "Criminal History") + " * ");
            binding.A.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
            binding.B.setText(wa3Var.b("button_proceed", context.getString(R.string.proceed)));
        }

        public final void Z0(Context context, nr2 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.I.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.J.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.C.setText(wa3Var.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            binding.w.i.setText(wa3Var.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            binding.m.setText(wa3Var.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            binding.H.setText(wa3Var.b("lbl_Type", context.getString(R.string.vahan_type)));
            binding.B.setText(wa3Var.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            binding.A.setText(wa3Var.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            binding.z.setText(wa3Var.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            binding.y.setText(wa3Var.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            binding.n.setText(wa3Var.b("vahan_hypothecation_termination_details", context.getString(R.string.vahan_hypothecation_termination_details)));
            binding.G.setText(wa3Var.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            binding.E.setText(wa3Var.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            binding.F.setText(wa3Var.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            binding.d.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.s.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.s.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.s.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.s.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void Z1(Context context, fe nominee) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(nominee, "nominee");
            wa3 wa3Var = new wa3(context);
            nominee.c.setText(wa3Var.b("to_nominee_header", context.getString(R.string.add_nominee_detail_s)));
            nominee.e.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            nominee.d.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            nominee.G.setText(wa3Var.b("add_NomnName", context.getString(R.string.nominee_name)));
            nominee.s.setHint(wa3Var.b("enterAdd_NomnName", context.getString(R.string.enter_nominee_name)));
            nominee.F.setText(wa3Var.b("to_nominee_relation", context.getString(R.string.select_relation_with_nominee)));
            nominee.E.setText(wa3Var.b("to_nomineeDOB_title", context.getString(R.string.nominee_date_of_birth)));
            nominee.q.setText(wa3Var.b("to_nominee_dob", context.getString(R.string.enter_nominee_date_of_birth)));
        }

        public final void Z2(Context context, oh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.o.setText(wa3Var.b("button_verify", context.getString(R.string.verify)));
            binding.l.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            binding.n.setText(wa3Var.b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)));
            binding.f.setHint(wa3Var.b("edit_enter_otp", context.getString(R.string.otp_sent)));
            binding.q.setText(wa3Var.b("label_wait_otp", context.getString(R.string.wait_for_otp)));
            binding.m.setText(wa3Var.b("label_refresh_close", context.getString(R.string.ref_close)));
            binding.k.setText(wa3Var.b("label_get_otp", context.getString(R.string.did_not_get_otp)));
            binding.i.setText(wa3Var.b("label_resend_otp", context.getString(R.string.resend_otp)));
            binding.c.setText(wa3Var.b("button_verify", context.getString(R.string.verify)));
        }

        public final void a(Context context, c6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.l.setText(wa3Var.b("cs_repAccdntReport", context.getString(R.string.register_report)));
            binding.k.setText(wa3Var.b("cs_dashboard", context.getString(R.string.dashboard)));
            binding.m.setText(wa3Var.b("cs_repAccdnt_regaccHistory", "Reported Accident History"));
            binding.p.setText(wa3Var.b("cs_repAccdnt_lastRepAccdnt", "Last Accident Report"));
            binding.o.setText(wa3Var.b("cs_repAccdnt_AccdntID", "Accident ID"));
            binding.t.setText(wa3Var.b("vehicle_number", context.getString(R.string.vehicle_number)));
            binding.u.setText(wa3Var.b("cs_DateTime", "Date &amp; Time"));
            binding.s.setText(wa3Var.b("btn_challan_status", context.getString(R.string.status)));
            binding.q.setText(wa3Var.b("cs_Location", context.getString(R.string.location_txt)));
            binding.z.setText(wa3Var.b("view_details", "View Details"));
        }

        public final void a0(Context context, o7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.e0.setText(wa3Var.b("personal_details", context.getString(R.string.personal_details)));
            binding.W.setText(wa3Var.b(va3.a.L(), context.getString(R.string.name)));
            binding.U.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            binding.d0.setText(wa3Var.b("label_dl_serv_permn_addr", context.getString(R.string.permanent_address)));
            binding.X.setText(wa3Var.b("con_lic_info", context.getString(R.string.coi)));
            binding.c0.setText(wa3Var.b("validity_nt", context.getString(R.string.validity)));
            binding.a0.setText(wa3Var.b("label_dl_serv_issue_authority", context.getString(R.string.issue_authority)));
            binding.b0.setText(wa3Var.b("label_challan_pay_status", context.getString(R.string.status)));
            binding.b0.setText(wa3Var.b("label_challan_pay_status", context.getString(R.string.status)));
            binding.N.setText(wa3Var.b("btn_dl_serv_close", context.getString(R.string.close)));
        }

        public final void a1(Context context, cc idp) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(idp, "idp");
            wa3 wa3Var = new wa3(context);
            idp.i0.b.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            idp.i0.c.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            idp.i0.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            idp.i0.d.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            idp.i0.f.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            idp.l0.setText(wa3Var.b("label_international_driv_permit", context.getString(R.string.international_driving_permit)));
            idp.j0.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            idp.T.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            idp.K0.setText(wa3Var.b("label_app_category", context.getString(R.string.app_category)));
            idp.L0.setText(wa3Var.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            idp.V.setText(wa3Var.b("label_dl_serv_rto", context.getString(R.string.rto)));
            idp.r0.setText(wa3Var.b("label_dl_serv_birth_place", context.getString(R.string.birth_place)));
            idp.U.setHint(wa3Var.b("edit_dl_serv_enter_birth_plac", context.getString(R.string.enter_birth_place)));
            idp.q0.setText(wa3Var.b("label_dl_serv_birth_country", context.getString(R.string.birth_country)));
            idp.E.setHint(wa3Var.b("edit_dl_serv_selc_country", context.getString(R.string.select_country)));
            idp.F0.setText(wa3Var.b("label_dl_serv_pass_no", context.getString(R.string.passport_no)));
            idp.g0.setHint(wa3Var.b("edit_dl_serv_enter_pass_no", context.getString(R.string.select_possport)));
            idp.H0.setText(wa3Var.b("label_dl_serv_valid_upto", context.getString(R.string.pass_valid_to)));
            idp.h0.setHint(wa3Var.b("edit_dl_serv_selc_pass_valid", context.getString(R.string.select_possport_val)));
            idp.D0.setText(wa3Var.b("label_dl_serv_disqu_dl_drive", context.getString(R.string.txt_issue_international_disquilified_for_dl)));
            idp.Y.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            idp.W.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            idp.B.setHint(wa3Var.b("label_dl_serv_what_reason", context.getString(R.string.if_so_what_reason)));
            idp.C0.setText(wa3Var.b("label_dl_serv_barred_curr_count_drive", context.getString(R.string.txt_iidp_reasonSecond)));
            idp.b0.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            idp.X.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            idp.D.setHint(wa3Var.b("label_dl_serv_what_reason", context.getString(R.string.if_so_what_reason)));
            idp.t0.setText(wa3Var.b("label_dl_serv_count_visa_grant", context.getString(R.string.country_for_which_visa_is_granted)));
            idp.H.setHint(wa3Var.b("edit_dl_serv_selc_country", context.getString(R.string.select_country)));
            idp.G.setText(wa3Var.b("label_dl_serv_click_restr_countr", context.getString(R.string.click_here_to_view_the_list_of_restricted_countries)));
            idp.I0.setText(wa3Var.b("label_dl_serv_visa_no", context.getString(R.string.rep_declaration)));
            idp.M0.setHint(wa3Var.b("edit_dl_serv_enter_visa_no", context.getString(R.string.visa_no)));
            idp.J0.setText(wa3Var.b("label_dl_serv_valid_upto", context.getString(R.string.valid_upto_v2)));
            idp.N0.setHint(wa3Var.b("edit_dl_serv_selc_visa_valid", context.getString(R.string.select_visa_val)));
            idp.u0.setText(wa3Var.b("label_dl_serv_cov_grades_idp", context.getString(R.string.cov_grades_for_which_idp_is_requested)));
            idp.F.setHint(wa3Var.b("edit_dl_serv_selc_cov_grade", context.getString(R.string.select_cov_val)));
            idp.x.setText(wa3Var.b("check_dl_serv_im_indian_embas", context.getString(R.string.indian_amb)));
            idp.y0.setText(wa3Var.b("label_dl_serv_indian_embas_name", context.getString(R.string.ind_emm_name)));
            idp.Q.setHint(wa3Var.b("edit_dl_serv_enter_ind_embas_name", context.getString(R.string.enter_indian_amb)));
            idp.z0.setText(wa3Var.b("label_dl_serv_embas_place", context.getString(R.string.ind_emm_place)));
            idp.R.setHint(wa3Var.b("edit_dl_serv_enter_embas_place", context.getString(R.string.enter_indian_amb_place)));
            idp.A0.setText(wa3Var.b("label_dl_serv_fore_nat_mob_no", context.getString(R.string.for_nat_mn)));
            idp.O.setHint(wa3Var.b("edit_dl_serv_enter_fore_mob_no", context.getString(R.string.enter_indian_amb_number)));
            idp.w0.setText(wa3Var.b("Email_id", context.getString(R.string.idp_email)));
        }

        public final void a2(Context context, xa2 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.g.setText(wa3Var.b("label_challan_no_trans_found", "No transaction found"));
            binding.h.setText(wa3Var.b(va3.a.W(), "There is no Transaction (s) found \n for your account"));
        }

        public final void a3(Context context, sr7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.d.i.setText(wa3Var.b("label_view_challan", context.getString(R.string.view_challan)));
            binding.c.setText(wa3Var.b("label_no_challan_found", context.getString(R.string.no_challan_found)));
        }

        public final void b(Context context, d6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            TextView textView = binding.l;
            va3.a aVar = va3.a;
            textView.setText(wa3Var.b(aVar.L(), context.getString(R.string.name)));
            binding.k.setText(wa3Var.b("Email_id", context.getString(R.string.email_id)));
            binding.j.setText(wa3Var.b("cs_FeedbackDesc", "Description ( Max 250 Characters )"));
            binding.d.setHint(wa3Var.b(aVar.B(), "Enter feedback ( Minimum 30 Characters )"));
            binding.c.setText(wa3Var.b("cs_EnterFeedback", "Send Feedback"));
        }

        public final void b0(Context context, pd binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.o.setText(wa3Var.b("conductor_licence_no", context.getString(R.string.conductor_driving_license_number)));
            binding.p.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            binding.i.setHint(wa3Var.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_number_hint)));
            binding.b.setText(wa3Var.b("title_dl_serv_terms_cond", context.getString(R.string.agree_terms_cond)));
            binding.j.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.d.setText(wa3Var.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void b1(Context context, ic binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.y.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state)));
            binding.x.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            binding.w.setText(wa3Var.b("label_dl_serv_rto", context.getString(R.string.rto)));
            binding.B.setText(wa3Var.b("submit_without_aadhar", context.getString(R.string.submit_without_aadhaar_authentication)));
            binding.A.setText(wa3Var.b("submit_with_aadhar", context.getString(R.string.submit_via_aadhaar_authentication)));
            binding.r.setText(wa3Var.b("applicant_mob_no", "Applicant Mobile No."));
            binding.q.setHint(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            binding.t.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.n.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.l.setText(wa3Var.b("enter_adhar_vid", context.getString(R.string.enter_adhar_vid)));
            binding.d.setText(wa3Var.b("aadhar_no", context.getString(R.string.aadhar_no)));
            binding.z.setText(wa3Var.b("vid", context.getString(R.string.vid)));
            binding.m.setHint(wa3Var.b("enter_id_no", context.getString(R.string.enter_vid)));
            binding.e.setHint(wa3Var.b("adhar_terms", context.getString(R.string.agree_with_aadhar_terms)));
        }

        public final void b2(Context context, ah binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            MyTextView myTextView = binding.K;
            va3.a aVar = va3.a;
            myTextView.setText(wa3Var.b(aVar.Z0(), "View Profile"));
            binding.g.setText(wa3Var.b(aVar.m(), "Edit Profile"));
            binding.r.setText(wa3Var.b("edit_mobile_no", "Mobile No."));
            binding.E.setText(wa3Var.b("label_name", "Name"));
            binding.A.setText(wa3Var.b("Email_id", "Email Id"));
            binding.x.setText(wa3Var.b("vahan_state", "State"));
            binding.G.g.setText(wa3Var.b("my_profile", "My Profile"));
        }

        public final void b3(Context context, kt7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.r0.setText(wa3Var.b("v_dl_l", context.getString(R.string.v_r_d)));
            binding.A.setText(wa3Var.b("indian_lic", context.getString(R.string.indian_lic)));
            binding.G.setText(wa3Var.b("issue_date", context.getString(R.string.issue_date)));
            binding.S.setText(wa3Var.b("validity_nt", context.getString(R.string.validity_nt)));
            binding.q0.setText(wa3Var.b("validity_nt", context.getString(R.string.validity)));
            binding.O.setText(wa3Var.b("label_name", context.getString(R.string.name)));
            binding.d0.setText(wa3Var.b("label_sdf", context.getString(R.string.relation)));
            binding.c.setText(wa3Var.b("address", context.getString(R.string.address)));
            binding.y.setText(wa3Var.b("date_of_birth", context.getString(R.string.dob)));
            binding.x.setText(wa3Var.b("date_of_birth", context.getString(R.string.dob)));
            binding.f.setText(wa3Var.b("blood_group", context.getString(R.string.blood_group)));
            binding.f.setText(wa3Var.b("Licensing_authority", context.getString(R.string.registering_auth_l)));
            binding.s0.setText(wa3Var.b("vehicle_class", context.getString(R.string.vehicle_class)));
            binding.H.setText(wa3Var.b("issue_date", context.getString(R.string.issue_date)));
            binding.b.setText(wa3Var.b("aadhaarNo", context.getString(R.string.aadhaar_no)));
            binding.d.setText(wa3Var.b("authority_sign", context.getString(R.string.authority_sign)));
            binding.h.setText(wa3Var.b("My_Virtual_RC", context.getString(R.string.My_Virtual_RC)));
            binding.i.setText(wa3Var.b("My_Virtual_DL", context.getString(R.string.My_Virtual_DL)));
            binding.f0.setText(wa3Var.b("share", context.getString(R.string.menu_share)));
            binding.I.setText(wa3Var.b("label_virtual_documents", "Virtual Documents"));
            binding.h0.setText(wa3Var.b("label_shared_rc", context.getString(R.string.shared_rc)));
            binding.b0.setText(wa3Var.b("label_received_rc", context.getString(R.string.received_rc)));
            binding.N.setText(wa3Var.b("my_rc", context.getString(R.string.my_rc)));
        }

        public final void c(Context context, e6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.l.setText(wa3Var.b("cs_repAccdntReport", context.getString(R.string.register_report)));
            binding.k.setText(wa3Var.b("cs_dashboard", context.getString(R.string.dashboard)));
            binding.m.setText(wa3Var.b("reported_acc_history", "Reported Accident History"));
            binding.o.setText(wa3Var.b("cs_repAccdnt_History", "Accident Report History"));
            binding.f.setHint(wa3Var.b("cs_repAccdnt_His_StartDate", "Start Date"));
            binding.e.setHint(wa3Var.b("cs_repAccdnt_His_EndDate", "End Date"));
            binding.p.setHint(wa3Var.b("cs_show", "Show"));
        }

        public final void c0(Context context, z7 ps) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ps, "ps");
            wa3 wa3Var = new wa3(context);
            ps.R.c.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            ps.R.d.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            ps.R.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            ps.R.e.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            ps.R.b.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            ps.X.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
            ps.i0.setText(wa3Var.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_details)));
            ps.j0.setText(wa3Var.b("label_dl_serv_appl_no", context.getString(R.string.app_number)));
            ps.h0.setText(wa3Var.b("label_dl_serv_appl_date", context.getString(R.string.application_date)));
            ps.m0.setText(wa3Var.b("label_name", context.getString(R.string.application_date)));
            ps.S.setText(wa3Var.b("label_sdf", context.getString(R.string.sdo_of)));
            ps.k0.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            ps.s0.setText(wa3Var.b("vahan_rto", context.getString(R.string.rto)));
            ps.l0.setText(wa3Var.b("label_Instructions", context.getString(R.string.instructions)));
            ps.n0.setText(wa3Var.b("label_instructions_one", context.getString(R.string.step1)));
            ps.p0.setText(wa3Var.b("label_instructions_three", context.getString(R.string.step3)));
            ps.q0.setText(wa3Var.b("label_instructions_two", context.getString(R.string.step2)));
            ps.t0.setText(wa3Var.b("label_spec_ps", context.getString(R.string.spec_ps)));
            ps.o0.setText(wa3Var.b("label_photo_dimensions", context.getString(R.string.val_one)));
            ps.r0.setText(wa3Var.b("label_upload_clear_photo", context.getString(R.string.val_two)));
            ps.a0.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            ps.d0.setText(wa3Var.b("label_app_photo", context.getString(R.string.applicant_photo)));
            ps.b0.setText(wa3Var.b("label_capture", context.getString(R.string.capture)));
            ps.c0.setText(wa3Var.b("label_gallery", context.getString(R.string.gallery)));
            ps.f0.setText(wa3Var.b("label_capture", context.getString(R.string.capture)));
            ps.g0.setText(wa3Var.b("label_gallery", context.getString(R.string.gallery)));
            ps.w0.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
        }

        public final void c1(Context context, jc binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.h0.setText(wa3Var.b("label_dl_serv_present_addr", context.getString(R.string.present_address_sarthi)));
            binding.l0.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state_coa)) + " *");
            binding.z.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            binding.b0.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district_coa)) + " *");
            binding.y.setHint(wa3Var.b("edit_dl_serv_selc_district", context.getString(R.string.select_district)));
            binding.p0.setText(wa3Var.b("select_taluka_sarthi", context.getString(R.string.select_taluka_sarthi)) + " *");
            binding.x.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            binding.a0.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.town)));
            binding.M.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            binding.d0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            binding.L.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            binding.n0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            binding.P.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            binding.f0.setText(wa3Var.b("label_loc_mark", context.getString(R.string.landmark_coa)) + " *");
            binding.N.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            binding.j0.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode_coa)) + " *");
            binding.O.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            binding.X.setText(wa3Var.b("check_dl_serv_same_curr_addr", context.getString(R.string.same_as_curr_add)));
            binding.i0.setText(wa3Var.b("permanent_address", context.getString(R.string.perm_add_det)));
            binding.m0.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state_coa)) + " *");
            binding.G.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            binding.c0.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district_coa)) + " *");
            binding.F.setHint(wa3Var.b("edit_dl_serv_selc_district", context.getString(R.string.select_district)));
            binding.q0.setText(wa3Var.b("select_taluka_sarthi", context.getString(R.string.select_taluka_sarthi)) + " *");
            binding.E.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            binding.J.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            binding.I.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.taluka)));
            binding.H.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            binding.e0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            binding.A.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            binding.o0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            binding.D.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            binding.g0.setText(wa3Var.b("label_loc_mark", context.getString(R.string.landmark_coa)) + " *");
            binding.B.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            binding.k0.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode_coa)) + " *");
            binding.w.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
            binding.C.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            binding.Y.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.next)));
            binding.r0.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            binding.Q.setText(wa3Var.b("stay_duration", context.getString(R.string.duration_stay_sarthi)));
            binding.t0.setHint(wa3Var.b("year_txt", context.getString(R.string.year)));
            binding.V.setHint(wa3Var.b("month_txt", context.getString(R.string.month)));
        }

        public final void c2(Context context, bx binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.e.i.setText(wa3Var.b("label_application_status", "Application Status"));
            binding.d.setText(wa3Var.b("vahan_application_no", "Application Number"));
            binding.p.setText(wa3Var.b("radio_btn_vehicle_no", "Vehicle Number"));
            binding.b.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            binding.j.setText(wa3Var.b("vahan_registration_no", context.getString(R.string.registration_no)));
            binding.f.setText(wa3Var.b("lbl_vahan_chassisNo_full", "Enter Full Chassis No."));
            binding.i.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.g.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            binding.l.setHint(wa3Var.b(va3.a.E(), "Enter application no."));
            binding.n.setHint(wa3Var.b("vahan_enter_registration_no", context.getString(R.string.enter_registration_no)));
            binding.m.setHint(wa3Var.b("vahan_enter_chassis_no", "Enter chassis no."));
        }

        public final void c3(Context context, xh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            MyTextView myTextView = binding.A0;
            va3.a aVar = va3.a;
            myTextView.setText(wa3Var.b(aVar.L(), context.getString(R.string.name)));
            binding.i.setText(wa3Var.b("vahan_chassis_no", "Chassis No."));
            binding.m.setText(wa3Var.b("vahan_engine_no", "Engine No."));
            binding.c0.setText(wa3Var.b(aVar.J(), "Model Name"));
            binding.R0.setText(wa3Var.b(aVar.W0(), "Vehicle Description"));
            binding.k.setText(wa3Var.b("color", "Color"));
            binding.r0.setText(wa3Var.b(aVar.p0(), "Seat Capacity"));
            binding.u0.setText(wa3Var.b(aVar.z0(), "Standing Capacity"));
            binding.o.setText(wa3Var.b(aVar.v(), "Financier"));
            binding.w.setText(wa3Var.b("insurance_company", "Insurance Company"));
            binding.z.setText(wa3Var.b("insurance_policy_no", "Insurance Policy No."));
            binding.o0.setText(wa3Var.b(aVar.l0(), "Registering Authority"));
            binding.E0.setText(wa3Var.b("permit_valid_upto", "Permit Valid UpTo"));
            binding.C0.setText(wa3Var.b("national_permit_valid_upto", "National Permit Valid UpTo"));
            binding.O0.setText(wa3Var.b("label_virtual_rc", context.getString(R.string.virtual_rc)));
            binding.D0.setText(wa3Var.b("owner_details", context.getString(R.string.owner_details)));
            binding.m0.setText(wa3Var.b("relation", context.getString(R.string.relation)));
            binding.a0.setText(wa3Var.b("maker_name", context.getString(R.string.rc_maker_desc)));
            binding.k0.setText(wa3Var.b("registration_date", context.getString(R.string.registration_dt)));
            binding.w0.setText(wa3Var.b("tax_valid_upto", context.getString(R.string.valid_upto_t)));
            binding.P0.setText(wa3Var.b("vehicle_class", context.getString(R.string.vehicle_class)));
            binding.R0.setText(wa3Var.b(aVar.W0(), context.getString(R.string.vehicle_desc)));
            binding.s.setText(wa3Var.b("fuel_type", context.getString(R.string.fuel_type)));
            binding.k.setText(wa3Var.b("color", context.getString(R.string.color)));
            binding.A.setText(wa3Var.b("insurance_valid_upto", context.getString(R.string.insurance_valid_upto)));
            binding.q.setText(wa3Var.b("fitness_valid_upto", context.getString(R.string.fitness_up)));
            binding.V.setText(wa3Var.b("pucc_no", context.getString(R.string.pucc_number)));
            binding.W.setText(wa3Var.b("pucc_valid_upto", context.getString(R.string.pucc)));
            binding.B0.setText(wa3Var.b("national_permit_no", context.getString(R.string.national_permit_new)));
            binding.C0.setText(wa3Var.b("national_permit_valid_upto", context.getString(R.string.national_permit_upto)));
            binding.z0.setText(wa3Var.b("black_list_status", context.getString(R.string.black_list_status)));
            binding.v.setText(wa3Var.b("vehicle_impound_status", context.getString(R.string.tap_check_impound)));
            binding.M0.setText(wa3Var.b("vehicle_impound", context.getString(R.string.vehicle_impound)));
            binding.N0.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            binding.K0.setText(wa3Var.b("seizure_doc_details", context.getString(R.string.seizure_doc_details)));
            binding.N.setText(wa3Var.b("notes_new", context.getString(R.string.notes_new)));
            binding.O.setText(wa3Var.b("note1", context.getString(R.string.note1)));
            binding.h.setText(wa3Var.b("SAVE_AND_RETURN", context.getString(R.string.save_and_return)));
            binding.d0.setText(wa3Var.b("emmission_norm_lbl", "Emission Norm"));
            binding.e.setText(wa3Var.b("aitpnumber", context.getString(R.string.aitpPermitno)));
            binding.f.setText(wa3Var.b("aitpValidUpTo", context.getString(R.string.aitpPermit)));
            binding.Q.setText(wa3Var.b("ownershipHeader", context.getString(R.string.ownerShipType)));
            binding.J.setText(wa3Var.b("edit_mobile_no", "Mobile No"));
        }

        public final void d(Context context, f6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.q.setText(wa3Var.b("cs_repAccdntReport", context.getString(R.string.register_report)));
            binding.p.setText(wa3Var.b("cs_dashboard", context.getString(R.string.dashboard)));
            binding.r.setText(wa3Var.b("reported_acc_history", "Reported Accident History"));
            binding.y.setText(wa3Var.b("cs_note", "Note: Video size must be equal or less than 8 MB"));
            binding.B.setText(wa3Var.b("cs_repAccdnt_vehicleNo", "Vehicle No. (Max. 10 Characters)"));
            binding.x.setText(wa3Var.b("cs_repAccdnt_acdntLocation", "Accident Location (Max. 250 Characters)"));
            binding.w.setText(wa3Var.b("cs_date", "Date"));
            binding.A.setText(wa3Var.b("cs_time", "Time"));
            binding.z.setText(wa3Var.b("vahan_state", "State"));
            binding.v.setText(wa3Var.b("cs_repAccdnt_comment", "Comment (Max. 500 Characters)"));
            binding.u.setText(wa3Var.b("cs_regBtnTitle", "Register"));
        }

        public final void d0(Context context, b8 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.f.setText(wa3Var.b("label_dl_serv_req_sub_state", context.getString(R.string.current_state)));
            binding.g.setText(wa3Var.b("label_dl_serv_req_sub_rto", context.getString(R.string.current_rto)));
            binding.h.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            binding.i.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void d1(Context context, be binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.V.setText(wa3Var.b("name_of_applicant", context.getString(R.string.name_of_applicant_ll)));
            binding.y.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.enter_first_name)));
            binding.F.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            binding.C.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            binding.e0.setText(wa3Var.b("full_name_as_per_records", context.getString(R.string.full_name_txt)));
            binding.f0.setHint(wa3Var.b("enter_full_name_as_record", context.getString(R.string.enter_full_name_as_per_record)));
            binding.p0.setText(wa3Var.b("label_relation", context.getString(R.string.relation_is)) + " *");
            binding.z.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.enter_first_name)));
            binding.G.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            binding.D.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            binding.g0.setText(wa3Var.b("appl_gender", context.getString(R.string.gender)) + " *");
            binding.I.setText(wa3Var.b("appl_female", context.getString(R.string.female)));
            binding.K.setText(wa3Var.b("appl_male", context.getString(R.string.male)));
            binding.L.setText(wa3Var.b("appl_trans", context.getString(R.string.transgender)));
            binding.Y.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob_txt)) + " *");
            binding.Z.setText(wa3Var.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            binding.m0.setText(wa3Var.b("place_of_birth", context.getString(R.string.ll_birthplace)));
            binding.n0.setHint(wa3Var.b("place_of_birth", context.getString(R.string.ll_birthplace)));
            binding.W.setText(wa3Var.b("country_of_birth", context.getString(R.string.country_birth_ll)));
            binding.o0.setText(wa3Var.b("education_qualification", context.getString(R.string.education_qualification_ll)) + " *");
            binding.X.setText(wa3Var.b("blood_group", context.getString(R.string.blood_group_sarthi)) + " *");
            binding.h0.setText(wa3Var.b("landline_number", context.getString(R.string.landline_number_sarthi)));
            binding.a0.setText(wa3Var.b("Email_id", context.getString(R.string.email_id)));
            binding.b0.setHint(wa3Var.b("enter_email_id", context.getString(R.string.enter_email)));
            binding.T.setText(wa3Var.b("applicant_mob_no", context.getString(R.string.applicant_mobile_no)) + " *");
            binding.U.setHint(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            binding.c0.setText(wa3Var.b("emergency_mobile_no", context.getString(R.string.emergency_mob_number_ll)));
            binding.d0.setHint(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            binding.j0.setText(wa3Var.b("id_marks_ll", context.getString(R.string.id_marks_ll)));
            binding.k0.setHint(wa3Var.b("ident_mark_1", context.getString(R.string.ll_identification_mark_1)));
            binding.l0.setHint(wa3Var.b("ident_mark_2", context.getString(R.string.identification_mark_2)));
            binding.A.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
            binding.N.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void d2(Context context, db3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.k.i.setText(wa3Var.b("label_application_status", "Application Status"));
            binding.j.setText(wa3Var.b("vahan_application_no", "Application Number"));
            binding.i.setText(wa3Var.b("label_applicant_name", "Applicant Name"));
            binding.e.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            binding.f.setText(wa3Var.b("label_dl_serv_appl_date", context.getString(R.string.application_date)));
            binding.F.setText(wa3Var.b("vahan_registration_no", context.getString(R.string.registration_no)));
            binding.P.setText(wa3Var.b("lbl_State_Name", context.getString(R.string.state_name)));
            binding.I.setText(wa3Var.b("vahan_rto_name", context.getString(R.string.rto)));
            binding.W.setText(wa3Var.b("label_transaction_s_applied", context.getString(R.string.transaction_s_applied)));
            binding.X.setText(wa3Var.b("label_transaction_status", context.getString(R.string.transaction_status)));
            binding.s.setText(wa3Var.b("vahan_fee_payment", context.getString(R.string.fee_payment)));
            binding.a0.setText(wa3Var.b("vahan_upload_document", context.getString(R.string.upload_doc)));
            binding.K.setText(wa3Var.b("vahan_slot_booking", context.getString(R.string.slot_booking)));
            binding.u.setText(wa3Var.b("label_challan_pending", context.getString(R.string.pending_1)));
            binding.O.setText(wa3Var.b("label_challan_pending", context.getString(R.string.pending_1)));
            binding.e0.setText(wa3Var.b("label_challan_pending", context.getString(R.string.pending_1)));
            binding.L.setText(wa3Var.b("lbl_Book_Appointment", context.getString(R.string.slot1)));
            binding.q.setText(wa3Var.b("btn_pay_now", context.getString(R.string.paynow)));
            binding.Z.setText(wa3Var.b("vahan_upload_document", context.getString(R.string.update_doc1)));
        }

        public final void e(Context context, e9 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.E.setText(wa3Var.b("lrng_lic_number", context.getString(R.string.ll_driving_license_number)));
            binding.A.setHint(wa3Var.b("edit_ll_number_text", context.getString(R.string.enter_ll_driving_license_number)));
            binding.z.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            binding.x.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.y.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.B.setHint(wa3Var.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
        }

        public final void e0(Context context, c8 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.w.setText(wa3Var.b("enter_con_lic_number", context.getString(R.string.enter_conductor_driving_license_number)));
            binding.G.setText(wa3Var.b("conductor_licence_no", context.getString(R.string.conductor_driving_license_number)));
            binding.A.setHint(wa3Var.b("enter_con_lic_number", context.getString(R.string.enter_conductor_driving_license_number)));
            binding.B.setHint(wa3Var.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            binding.z.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            binding.x.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.y.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void e1(Context context, de binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.x.setText(wa3Var.b("label_app_category", context.getString(R.string.app_category)) + " *");
            binding.c0.setText(wa3Var.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            binding.U.setText(wa3Var.b("selelcted_class_vehicle", context.getString(R.string.selected_following_learner_class)));
            binding.w.setText(wa3Var.b("dl_add_driving_school", context.getString(R.string.add_driving_school)));
            binding.b0.setText(wa3Var.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            binding.f0.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            binding.Q.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            binding.W.setText(wa3Var.b("here_by_declare", context.getString(R.string.self_declartion)));
            binding.B.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
            binding.P.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.R.setHint(wa3Var.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
        }

        public final void e2(Context context, aw1 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.e.i.setText(wa3Var.b("download_appointment_receipt", "Download Appointment Slip"));
            binding.b.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            binding.i.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.g.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            binding.n.setHint(wa3Var.b(va3.a.E(), "Enter application no."));
        }

        public final void f(Context context, qg binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.j.setText(wa3Var.b("cs_TrafficReport", "Register Complaint"));
            binding.i.setText(wa3Var.b("cs_dashboard", context.getString(R.string.dashboard)));
            binding.h.setText(wa3Var.b("cs_TrafficReportCompHistory", context.getString(R.string.comp_history)));
            binding.m.setText(wa3Var.b("cs_trafficReport_lastRepViolation", "Last Reported Violation"));
            binding.r.setText(wa3Var.b("cs_repAccdnt_AccdntID", "Violation ID"));
            binding.p.setText(wa3Var.b("vehicle_number", context.getString(R.string.vehicle_number)));
            binding.q.setText(wa3Var.b("cs_DateTime", "Date & Time"));
            binding.o.setText(wa3Var.b("btn_challan_status", context.getString(R.string.status)));
            binding.l.setText(wa3Var.b("cs_Location", context.getString(R.string.location_txt)));
            binding.w.setText(wa3Var.b("view_details", "View Details"));
            binding.n.setText(wa3Var.b("Statistics", "Statistics"));
        }

        public final void f0(Context context, g8 slot) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(slot, "slot");
            wa3 wa3Var = new wa3(context);
            slot.L.c.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            slot.L.d.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            slot.L.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            slot.L.e.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            slot.L.b.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            slot.x.setText(wa3Var.b("label_avaialble", context.getString(R.string.available)));
            slot.z.setText(wa3Var.b("label_booked", context.getString(R.string.booked)));
            slot.G.setText(wa3Var.b("label_holiday", context.getString(R.string.holiday)));
            slot.K.setText(wa3Var.b("label_yet_to_open", context.getString(R.string.yet_to_open)));
        }

        public final void f1(Context context, xc dms) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dms, "dms");
            wa3 wa3Var = new wa3(context);
            dms.J.b.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            dms.J.c.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            dms.J.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            dms.J.d.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            dms.J.f.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            dms.L.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
            dms.Q.setText(wa3Var.b("label_dl_serv_appl_no", context.getString(R.string.app_number)));
            dms.P.setText(wa3Var.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_details)));
            dms.O.setText(wa3Var.b("label_dl_serv_appl_date", context.getString(R.string.app_date)));
            dms.S.setText(wa3Var.b("label_name", context.getString(R.string.your_name)));
            dms.T.setText(wa3Var.b("label_sdf", context.getString(R.string.sdo_of)));
            dms.M.setText(wa3Var.b("title_dl_serv_upload_req_doc", context.getString(R.string.upload)));
            dms.N.setText(wa3Var.b("title_dl_serv_allow_file_size", context.getString(R.string.allow_file_types)));
            dms.U.setText(wa3Var.b("btn_dl_serv_upload_doc", context.getString(R.string.upload_doc)));
            dms.R.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
        }

        public final void f2(Context context, fb3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.b.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            binding.h.setText(wa3Var.b("vahan_registration_no", context.getString(R.string.registration_no)));
            binding.d.setText(wa3Var.b("vahan_chassis_no_last_five", context.getString(R.string.chasis_no_last5_digits)));
            binding.g.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.e.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            binding.j.setHint(wa3Var.b(va3.a.E(), "Enter application no."));
            binding.l.setHint(wa3Var.b("vahan_enter_registration_no", context.getString(R.string.enter_registration_no)));
            binding.k.setHint(wa3Var.b("vahan_enter_chassis_no", "Enter chassis no."));
        }

        public final void g(Context context, rg binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.l.setText(wa3Var.b(va3.a.L(), context.getString(R.string.name)));
            binding.k.setText(wa3Var.b("Email_id", context.getString(R.string.email_id)));
            binding.j.setText(wa3Var.b("cs_FeedbackDesc", "Description ( Max 250 Characters )"));
            binding.b.setText(wa3Var.b("cs_sendFeedback", "Send Feedback"));
        }

        public final void g0(Context context, i8 clsl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(clsl, "clsl");
            wa3 wa3Var = new wa3(context);
            clsl.E.setText(wa3Var.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
            clsl.D.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void g1(Context context, vc binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.a0.setText(wa3Var.b("lbl_dob", context.getString(R.string.date_of_birth)));
            binding.S.setText(wa3Var.b("blood_group", context.getString(R.string.blood_group_text)));
            binding.g0.setText(wa3Var.b("personal_details", context.getString(R.string.personal_details)));
            binding.X.setText(wa3Var.b("ll_holder_name", context.getString(R.string.ll_holder_name)));
            binding.b0.setText(wa3Var.b("label_dl_serv_father_name", context.getString(R.string.father_name)));
            binding.V.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            binding.m0.setText(wa3Var.b("blood_group", context.getString(R.string.blood_group_text)));
            binding.f0.setText(wa3Var.b("label_dl_serv_permn_addr", context.getString(R.string.permanent_address)));
            binding.Y.setText(wa3Var.b("ll_info", context.getString(R.string.ll_information)));
            binding.e0.setText(wa3Var.b("validity_nt", context.getString(R.string.validity)));
            binding.Z.setText(wa3Var.b("issue_date", context.getString(R.string.issue_date)));
            binding.c0.setText(wa3Var.b("label_dl_serv_last_endor_rto", context.getString(R.string.last_rto)));
            binding.d0.setText(wa3Var.b("label_dl_serv_last_endor_state", context.getString(R.string.last_state)));
            binding.T.setText(wa3Var.b("title_dl_serv_class_vehicle", context.getString(R.string.class_vehicle)));
            binding.M.setText(wa3Var.b("btn_dl_serv_close", context.getString(R.string.close)));
        }

        public final void g2(Context context, s17 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.p.setText(wa3Var.b("vahan_upload_document", "Upload Document"));
            binding.i.setText(wa3Var.b("btn_dl_serv_next", "Next"));
            binding.n.setText(wa3Var.b("title_dl_serv_upload_req_doc", "Upload Required Documents"));
            binding.b.setText(wa3Var.b("vahan_application_no", "Application Number"));
            binding.o.setText(wa3Var.b("title_dl_serv_allow_file_size", "Allow file types (JPEG/JPG/PDF) and Maximum File Size is 200KB."));
            binding.c.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.c.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.c.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.c.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void h(Context context, sg binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.j.setText(wa3Var.b("cs_TrafficReport", "Register Complaint"));
            binding.i.setText(wa3Var.b("cs_dashboard", context.getString(R.string.dashboard)));
            binding.h.setText(wa3Var.b("cs_TrafficReportCompHistory", context.getString(R.string.comp_history)));
            binding.l.setText(wa3Var.b("cs_TrafficReportCompHistory", "Complaint History"));
            binding.c.setHint(wa3Var.b("cs_repAccdnt_His_StartDate", "Start Date"));
            binding.b.setHint(wa3Var.b("cs_repAccdnt_His_EndDate", "End Date"));
            binding.n.setText(wa3Var.b("cs_show", "Show"));
        }

        public final void h0(Context context, m8 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            TextView textView = binding.h.g;
            va3.a aVar = va3.a;
            textView.setText(wa3Var.b(aVar.g0(), "Raise a complaint"));
            binding.p.setHint(wa3Var.b("radio_btn_vehicle_no", "Vehicle Number"));
            binding.b.setHint(wa3Var.b("label_dl_serv_appl_no", "Application Number"));
            binding.l.setHint(wa3Var.b(aVar.t(), "Enter Remarks"));
            binding.c.setText(wa3Var.b(aVar.a(), "Attach"));
            binding.d.setText(wa3Var.b(aVar.g0(), "Raise a complaint"));
        }

        public final void h1(Context context, ad binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.o.setText(wa3Var.b("ll_number_text", context.getString(R.string.enter_ll_driving_license)));
            binding.p.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            binding.i.setHint(wa3Var.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_number_hint)));
            binding.b.setText(wa3Var.b("title_dl_serv_terms_cond", context.getString(R.string.agree_terms_cond)));
            binding.j.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.d.setText(wa3Var.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void h2(Context context, r97 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.p.setText(wa3Var.b("vahan_upload_document", "Upload Document"));
            binding.h.setText(wa3Var.b("btn_dl_serv_next", "Next"));
            binding.m.setText(wa3Var.b("title_dl_serv_upload_req_doc", "Upload Required Documents"));
            binding.b.setText(wa3Var.b("vahan_application_no", "Application Number"));
            binding.n.setText(wa3Var.b("title_dl_serv_allow_file_size", "Allow file types (JPEG/JPG/PDF) and Maximum File Size is 200KB."));
            binding.c.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.c.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.c.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.c.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void i(Context context, tg binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.j.setText(wa3Var.b("cs_TrafficReport", "Register Complaint"));
            binding.i.setText(wa3Var.b("cs_dashboard", context.getString(R.string.dashboard)));
            binding.h.setText(wa3Var.b("cs_TrafficReportCompHistory", context.getString(R.string.comp_history)));
            binding.l.setText(wa3Var.b("cs_TrafficReportCompHistory", "Complaint History"));
            binding.c.setHint(wa3Var.b("cs_repAccdnt_His_StartDate", "Start Date"));
            binding.b.setHint(wa3Var.b("cs_repAccdnt_His_EndDate", "End Date"));
            binding.n.setText(wa3Var.b("cs_show", "Show"));
        }

        public final void i0(Context context, n8 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.o.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.p.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.b.setText(wa3Var.b("fee_amount", context.getString(R.string.fee_amount)));
            binding.g.setText(wa3Var.b("fine_amount", context.getString(R.string.fine_amount)));
            binding.k.setText(wa3Var.b("total_amount", context.getString(R.string.total_amount)));
            binding.j.setText(wa3Var.b("btn_pay_now", context.getString(R.string.pay_now)));
        }

        public final void i1(Context context, hd ps) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ps, "ps");
            wa3 wa3Var = new wa3(context);
            ps.R.c.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            ps.R.d.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            ps.R.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            ps.R.e.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            ps.R.b.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            ps.X.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
            ps.i0.setText(wa3Var.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_details)));
            ps.j0.setText(wa3Var.b("label_dl_serv_appl_no", context.getString(R.string.app_number)));
            ps.h0.setText(wa3Var.b("label_dl_serv_appl_date", context.getString(R.string.application_date)));
            ps.m0.setText(wa3Var.b("label_name", context.getString(R.string.application_date)));
            ps.S.setText(wa3Var.b("label_sdf", context.getString(R.string.sdo_of)));
            ps.k0.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            ps.s0.setText(wa3Var.b("vahan_rto", context.getString(R.string.rto)));
            ps.l0.setText(wa3Var.b("label_Instructions", context.getString(R.string.instructions)));
            ps.n0.setText(wa3Var.b("label_instructions_one", context.getString(R.string.step1)));
            ps.p0.setText(wa3Var.b("label_instructions_three", context.getString(R.string.step3)));
            ps.q0.setText(wa3Var.b("label_instructions_two", context.getString(R.string.step2)));
            ps.t0.setText(wa3Var.b("label_spec_ps", context.getString(R.string.spec_ps)));
            ps.o0.setText(wa3Var.b("label_photo_dimensions", context.getString(R.string.val_one)));
            ps.r0.setText(wa3Var.b("label_upload_clear_photo", context.getString(R.string.val_two)));
            ps.a0.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            ps.d0.setText(wa3Var.b("label_app_photo", context.getString(R.string.applicant_photo)));
            ps.b0.setText(wa3Var.b("label_capture", context.getString(R.string.capture)));
            ps.c0.setText(wa3Var.b("label_gallery", context.getString(R.string.gallery)));
            ps.f0.setText(wa3Var.b("label_capture", context.getString(R.string.capture)));
            ps.g0.setText(wa3Var.b("label_gallery", context.getString(R.string.gallery)));
            ps.w0.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
        }

        public final void i2(Context context, aw1 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.e.i.setText(wa3Var.b("download_forms", "Download Forms"));
            binding.b.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            binding.i.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.g.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            binding.n.setHint(wa3Var.b(va3.a.E(), "Enter application no."));
        }

        public final void j(Context context, df binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.v.setText(wa3Var.b("cs_TrafficReport", "Register Complaint"));
            binding.u.setText(wa3Var.b("cs_dashboard", context.getString(R.string.dashboard)));
            binding.t.setText(wa3Var.b("cs_TrafficReportCompHistory", context.getString(R.string.comp_history)));
            binding.D.setText(wa3Var.b("cs_note", "Note: Video size must be equal or less than 8 MB"));
            binding.G.setText(wa3Var.b("cs_repAccdnt_vehicleNo", "Vehicle No. (Max. 10 Characters)"));
            binding.C.setText(wa3Var.b("cs_tr_OffenceLocation", "Offence Location"));
            binding.B.setText(wa3Var.b("cs_date", "Date"));
            binding.F.setText(wa3Var.b("cs_time", "Time"));
            binding.E.setText(wa3Var.b("vahan_state", "State"));
            binding.A.setText(wa3Var.b("cs_repAccdnt_comment", "Comment (Max. 500 Characters)"));
            binding.f.setText(wa3Var.b("cs_regBtnTitle", "Register"));
            binding.H.setText(wa3Var.b("cs_TrfReportViolType", "Violation Type"));
        }

        public final void j0(Context context, q8 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            TextView textView = binding.q.g;
            va3.a aVar = va3.a;
            textView.setText(wa3Var.b(aVar.y(), "Help & Support"));
            binding.k.setText(wa3Var.b(aVar.A(), "For any query regarding NextGen mParivahan app, Please contact us."));
            binding.p.setText(wa3Var.b(aVar.z(), "Please call us at"));
            binding.j.setText(wa3Var.b(aVar.B(), "Write to us at"));
            binding.n.setText(wa3Var.b(aVar.g0(), "Raise a complaint"));
        }

        public final void j1(Context context, jd binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.F.setText(wa3Var.b("label_dl_serv_req_sub_state", context.getString(R.string.current_state)));
            binding.G.setText(wa3Var.b("label_dl_serv_req_sub_rto", context.getString(R.string.current_rto)));
            binding.H.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            binding.I.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
            binding.C.setText(wa3Var.b("last_end_rto", context.getString(R.string.last_rto)));
            binding.D.setText(wa3Var.b("label_dl_serv_last_endor_state", context.getString(R.string.last_state)));
        }

        public final String j2(Context context, String service_code, String serve_value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(service_code, "service_code");
            Intrinsics.checkNotNullParameter(serve_value, "serve_value");
            wa3 wa3Var = new wa3(context);
            return service_code.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE) ? String.valueOf(wa3Var.b("hypothecation_addition", context.getString(R.string.hypothecation_addition))) : service_code.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE) ? String.valueOf(wa3Var.b("hypothecation_termination", "Hypothecation Termination")) : service_code.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE) ? String.valueOf(wa3Var.b("hypothecation_continuation", context.getString(R.string.hypothecation_continuation))) : service_code.equals("4") ? String.valueOf(wa3Var.b("change_of_address_in_rc2", context.getString(R.string.change_of_address))) : service_code.equals(VContant.NOC_PURPOSE_CODE) ? String.valueOf(wa3Var.b("no_objection_certificate_noc", serve_value)) : service_code.equals("3") ? String.valueOf(wa3Var.b("issue_of_duplicate_rc", "Issue of Duplicate RC")) : StringsKt__StringsJVMKt.equals(service_code, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true) ? StringsKt__StringsJVMKt.equals(serve_value, "SM", true) ? String.valueOf(wa3Var.b("toSellerHeader", context.getString(R.string.transfer_of_ownership_seller))) : String.valueOf(wa3Var.b("toSellerBuyer", context.getString(R.string.transfer_of_ownership))) : StringsKt__StringsJVMKt.equals(serve_value, "S", true) ? String.valueOf(wa3Var.b("toSellerHeader", context.getString(R.string.transfer_of_ownership_seller))) : StringsKt__StringsJVMKt.equals(serve_value, "B", true) ? String.valueOf(wa3Var.b("toBuyerHeader", context.getString(R.string.transfer_of_ownership))) : " ";
        }

        public final void k(Context context, vh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.j.setText(wa3Var.b("vehicle_no", context.getString(R.string.vehicle_no)));
            binding.i.setText(wa3Var.b("btn_challan_status", context.getString(R.string.status)));
            binding.h.setText(wa3Var.b("cs_Location", context.getString(R.string.location_txt)));
            binding.b.setText(wa3Var.b("cs_sendFeedback", "Send Feedback"));
        }

        public final void k0(Context context, s8 ac) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ac, "ac");
            wa3 wa3Var = new wa3(context);
            ac.J0.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state)));
            ac.K0.setText(wa3Var.b("label_dl_serv_rto", context.getString(R.string.rto)));
            ac.L0.setText(wa3Var.b("personal_details", context.getString(R.string.personal_details)));
            ac.x0.setText(wa3Var.b("first_name", context.getString(R.string.first_name)));
            ac.H0.setText(wa3Var.b("relation", context.getString(R.string.relation_is)));
            ac.M0.setText(wa3Var.b("relation", context.getString(R.string.relative_name)));
            ac.E0.setText(wa3Var.b("appl_gender", context.getString(R.string.gender)));
            ac.U.setText(wa3Var.b("appl_male", context.getString(R.string.male)));
            ac.Q.setText(wa3Var.b("appl_female", context.getString(R.string.female)));
            ac.B0.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob_txt)));
            ac.y0.setText(wa3Var.b("birth_place", context.getString(R.string.birth_place)));
            ac.C0.setText(wa3Var.b("education_qualification", context.getString(R.string.education_qualification)));
            ac.z0.setText(wa3Var.b("blood_group", context.getString(R.string.blood_group)));
            ac.D0.setText(wa3Var.b("Email_id", context.getString(R.string.email_id)));
            ac.F0.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_number_txt)));
            ac.w0.setText(wa3Var.b("alt_mob_number", context.getString(R.string.alt_mobile_no)));
            ac.A0.setText(wa3Var.b("label_dl_serv_present_addr", context.getString(R.string.present_address)));
            ac.t0.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state)));
            ac.i0.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district_coa)));
            ac.v0.setText(wa3Var.b("label_dl_serv_block", context.getString(R.string.taluka_block)));
            ac.j0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            ac.u0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            ac.k0.setText(wa3Var.b("label_loc_mark", context.getString(R.string.landmark_coa)));
            ac.s0.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode_coa)));
            ac.G0.setText(wa3Var.b("label_dl_serv_permn_addr", context.getString(R.string.permanent_address)));
            ac.l0.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state)));
            ac.m0.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district_coa)));
            ac.r0.setText(wa3Var.b("label_dl_serv_block", context.getString(R.string.taluka_block)));
            ac.n0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            ac.q0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            ac.o0.setText(wa3Var.b("label_loc_mark", context.getString(R.string.landmark_coa)));
            ac.p0.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode_coa)));
            ac.A.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void k1(Context context, rc binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.w.setText(wa3Var.b("ll_number_text", context.getString(R.string.enter_ll_driving_license)));
            binding.G.setText(wa3Var.b("lrng_lic_number", context.getString(R.string.ll_driving_license_number)));
            binding.A.setHint(wa3Var.b("edit_ll_number_text", context.getString(R.string.enter_ll_driving_license_number)));
            binding.z.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            binding.x.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.y.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final String k2(Context context, String service_code, String serve_value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(service_code, "service_code");
            Intrinsics.checkNotNullParameter(serve_value, "serve_value");
            wa3 wa3Var = new wa3(context);
            return service_code.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE) ? String.valueOf(wa3Var.b("hypothecation_addition", context.getString(R.string.hypothecation_addition))) : service_code.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE) ? String.valueOf(wa3Var.b("hypothecation_termination", "Hypothecation Termination")) : service_code.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE) ? String.valueOf(wa3Var.b("hypothecation_continuation", context.getString(R.string.hypothecation_continuation))) : service_code.equals("4") ? String.valueOf(wa3Var.b("change_of_address_in_rc2", context.getString(R.string.change_of_address))) : service_code.equals(VContant.NOC_PURPOSE_CODE) ? String.valueOf(wa3Var.b("no_objection_certificate_noc", serve_value)) : service_code.equals("3") ? String.valueOf(wa3Var.b("issue_of_duplicate_rc", "Issue of Duplicate RC")) : StringsKt__StringsJVMKt.equals(service_code, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true) ? String.valueOf(wa3Var.b("to_header_title", context.getString(R.string.transfer_of_ownership))) : " ";
        }

        public final void l(Context context, uh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.h.setText(wa3Var.b("vehicle_no", context.getString(R.string.vehicle_no)));
            binding.g.setText(wa3Var.b("btn_challan_status", context.getString(R.string.status)));
            binding.f.setText(wa3Var.b("cs_Location", context.getString(R.string.location_txt)));
            binding.c.setText(wa3Var.b("cs_sendFeedback", "Send Feedback"));
        }

        public final void l0(Context context, zy3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.s.setText(wa3Var.b("title_create_new", context.getString(R.string.create_account)));
            binding.t.setText(wa3Var.b("title_fast_easy", context.getString(R.string.fast_easy)));
            binding.f.setHint(wa3Var.b("edit_full_name", context.getString(R.string.full_name)));
            binding.g.setHint(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            binding.h.setHint(wa3Var.b("edit_securityMpin", context.getString(R.string.set_six_pin)));
            binding.u.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.r.setText(wa3Var.b("label_already_account", context.getString(R.string.already_have_account)));
            binding.n.setText(wa3Var.b("label_signin", context.getString(R.string.sign_in)));
            binding.p.setText(wa3Var.b("label_privacy_policy", context.getString(R.string.agree_terms)));
        }

        public final void l1(Context context, kd slot) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(slot, "slot");
            wa3 wa3Var = new wa3(context);
            slot.z.setText(wa3Var.b("label_avaialble", context.getString(R.string.app_details)));
            slot.H.setText(wa3Var.b("label_app_booking_successfully", context.getString(R.string.app_booking_successful)));
            slot.I.setText(wa3Var.b("label_app_date", context.getString(R.string.app_date)));
            slot.J.setText(wa3Var.b("label_app_time", context.getString(R.string.app_time)));
            slot.A.setText(wa3Var.b("label_yet_to_open", context.getString(R.string.app_slip)));
            slot.E.setText(wa3Var.b("label_yet_to_open", context.getString(R.string.next)));
        }

        public final void l2(Context context, aw1 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.e.i.setText(wa3Var.b("download_Noc", "NOC Download"));
            binding.b.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            binding.i.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.g.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            binding.n.setHint(wa3Var.b(va3.a.E(), "Enter application no."));
        }

        public final void m(Context context, j6 vd) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vd, "vd");
            wa3 wa3Var = new wa3(context);
            vd.n.setText(wa3Var.b("label_dl_serv_appl_no", context.getString(R.string.application_no)));
            vd.d.setText(wa3Var.b("vahan_application_name", context.getString(R.string.applicant_name)));
            vd.f.setText(wa3Var.b("lbl_dob", context.getString(R.string.date_of_birth)));
            vd.s.setText(wa3Var.b("label_appl_status_rto_code", "RTO Code"));
            vd.q.setText(wa3Var.b("vahan_rto_name", context.getString(R.string.rto_name_2)));
            vd.u.setText(wa3Var.b("label_transaction_s_applied", context.getString(R.string.transaction_s_applied)));
            vd.i.setText(wa3Var.b("button_proceed", context.getString(R.string.proceed)));
            vd.h.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void m0(Context context, wy3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.j.setText(wa3Var.b("title_create_new", context.getString(R.string.create_new)));
            binding.l.setText(wa3Var.b("title_secu_mpin", context.getString(R.string.sec_pin_)));
            EditText editText = binding.e;
            va3.a aVar = va3.a;
            editText.setHint(wa3Var.b(aVar.n(), context.getString(R.string.six_pin)));
            binding.c.setHint(wa3Var.b(aVar.i(), context.getString(R.string.confirm_six_pin)));
            binding.k.setText(wa3Var.b("edit_enter_mpin", context.getString(R.string.please_enter_pin)));
            binding.m.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void m1(Context context, pc slot) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(slot, "slot");
            wa3 wa3Var = new wa3(context);
            slot.L.c.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            slot.L.d.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            slot.L.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            slot.L.e.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            slot.L.b.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            slot.x.setText(wa3Var.b("label_avaialble", context.getString(R.string.available)));
            slot.z.setText(wa3Var.b("label_booked", context.getString(R.string.booked)));
            slot.G.setText(wa3Var.b("label_holiday", context.getString(R.string.holiday)));
            slot.K.setText(wa3Var.b("label_yet_to_open", context.getString(R.string.yet_to_open)));
        }

        public final void m2(Context context, ih binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.d.setText(wa3Var.b("vahan_application_no", "Application Number"));
            binding.b.setText(wa3Var.b("vahan_amount", context.getString(R.string.amount)));
            binding.n.setText(wa3Var.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
            binding.j.setText(wa3Var.b("label_challan_owner_name", context.getString(R.string.owner_name)));
            binding.q.setText(wa3Var.b("vahan_registration_no", context.getString(R.string.registration_no)));
            binding.f.setText(wa3Var.b("btn_Download_Fee_Receipt", "Download Fee Receipt"));
            binding.g.setText(wa3Var.b("View_Forms", "View Forms"));
            binding.i.setText(wa3Var.b("btn_dl_serv_next", "Next"));
        }

        public final void n(Context context, k6 vd) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vd, "vd");
            wa3 wa3Var = new wa3(context);
            vd.b.setHint(wa3Var.b("edit_dl_serv_dob", "Enter Date of Birth"));
            vd.i.setText(wa3Var.b("lbl_dob", "Date of Birth"));
            vd.h.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no_mend)));
            vd.c.setHint(wa3Var.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            vd.l.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            vd.d.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void n0(Context context, d31 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.q.setText(wa3Var.b("create_vir_rc", context.getString(R.string.create_virtual_rc)));
            binding.p.setText(wa3Var.b("vehicle_no", context.getString(R.string.vehicle_no)));
            binding.g.setHint(wa3Var.b("enter_rc_no_for_pending_transaction", context.getString(R.string.enter_rc_no_for_pending_transaction)));
            binding.l.setText(wa3Var.b("vahan_chassis_no_last_five", context.getString(R.string.chassis_no_last_5_digits)));
            binding.d.setHint(wa3Var.b("enter_last_five_digits", context.getString(R.string.enter_last_five_digits)));
            binding.m.setText(wa3Var.b("label_challan_engine_no", context.getString(R.string.engine_no_last_5_digits)));
            binding.f.setHint(wa3Var.b("enter_last_five_digits", context.getString(R.string.enter_last_five_digits)));
            binding.e.setText(wa3Var.b("ADD_MY_VEHICLE_S", context.getString(R.string.add_my_vehicle_s)));
            binding.o.setText(wa3Var.b("MY_VIRTUAL_RC_S", context.getString(R.string.my_virtual_rc_s)));
            binding.k.setText(wa3Var.b("alert", context.getString(R.string.alert)));
        }

        public final void n1(Context context, nc clsl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(clsl, "clsl");
            wa3 wa3Var = new wa3(context);
            clsl.F.setText(wa3Var.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
            clsl.E.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void n2(Context context, f7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.E.setText(wa3Var.b("vehicle_no", context.getString(R.string.vehicle_no)));
            binding.k.setText(wa3Var.b("current_address", context.getString(R.string.current_address)));
            binding.i.setText(wa3Var.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            binding.h.setHint(wa3Var.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            binding.G.setText(wa3Var.b("village_town_city", context.getString(R.string.village_town_city)));
            binding.f.setHint(wa3Var.b("village_town_city", context.getString(R.string.village_town_city)));
            binding.j.setText(wa3Var.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            binding.c.setHint(wa3Var.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            binding.z.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.d.setHint(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.C.setText(wa3Var.b("vahan_state", context.getString(R.string.state)));
            binding.g.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district)));
            binding.B.setText(wa3Var.b("same_as_current_address", context.getString(R.string.same_as_current_address)));
            binding.y.setText(wa3Var.b("permanent_address", "Permanent Address"));
            binding.p.setText(wa3Var.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            binding.o.setHint(wa3Var.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            binding.x.setText(wa3Var.b("village_town_city", context.getString(R.string.village_town_city)));
            binding.w.setHint(wa3Var.b("village_town_city", context.getString(R.string.village_town_city)));
            binding.r.setText(wa3Var.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            binding.q.setHint(wa3Var.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            binding.t.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district)));
            binding.n.setHint(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.u.setText(wa3Var.b("vahan_state", context.getString(R.string.state)));
            binding.g.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district)));
            binding.l.setText(wa3Var.b("btn_dl_serv_next", "Next"));
            binding.A.setText(wa3Var.b("to_btn_previous", "Previous"));
        }

        public final void o(Context context, wh vd) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vd, "vd");
            vd.e.setText(new wa3(context).b("upload_doc_list", context.getString(R.string.uploaded_doc_list)));
        }

        public final void o0(Context context, y8 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.E.setText(wa3Var.b("delet_account", context.getString(R.string.deleting_account)));
            binding.A.setText(wa3Var.b("deleteAcctInfoTv", context.getString(R.string.delete_account_info)));
            binding.C.setText(wa3Var.b("deleteVirtualRcDlTv", context.getString(R.string.delete_virtual_rc_dl)));
            binding.z.setText(wa3Var.b("deleteAccountButton", context.getString(R.string.delete_account)));
        }

        public final void o1(Context context, nd binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.l.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.g.setText(wa3Var.b("misc_feeTobePaid", context.getString(R.string.miscellaneous_fee_to_be_paid)));
            binding.d.setText(wa3Var.b("fee_amount", context.getString(R.string.fee_amount)));
            binding.c.setHint(wa3Var.b("misc_EnterFee", context.getString(R.string.enter_fee_amount)));
            binding.f.setText(wa3Var.b("fine_amount", context.getString(R.string.fine_amount)));
            binding.e.setHint(wa3Var.b("misc_EnterFine", context.getString(R.string.enter_fine_amount)));
            binding.k.setText(wa3Var.b("total_amount", context.getString(R.string.total_amount)));
            binding.j.setHint(wa3Var.b("total_amount", context.getString(R.string.total_amount)));
            binding.h.setText(wa3Var.b("misc_FeeNote", context.getString(R.string.note_please_enter_the_fee_details_to_be_paid)));
            binding.b.setText(wa3Var.b("btn_pay_now", context.getString(R.string.pay_now)));
        }

        public final void o2(Context context, nh mBnding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mBnding, "mBnding");
            wa3 wa3Var = new wa3(context);
            mBnding.f.f.setText(wa3Var.b("Vehicle_Transactions", "Vehicle Transactions"));
            mBnding.p.setText(wa3Var.b("radio_btn_vehicle_no", "Vehicle Number"));
            mBnding.g.setText(wa3Var.b("label_dl_serv_appl_no", "Application Number"));
            mBnding.d.setText(wa3Var.b("vahan_application_date", "Application Date"));
            mBnding.n.setText(wa3Var.b("lbl_Receipt_No", "Receipt Number"));
            mBnding.m.setText(wa3Var.b("receipt_date", "Receipt Date"));
            mBnding.b.setText(wa3Var.b("vahan_amount", "Amount"));
            mBnding.o.setText(wa3Var.b("vahan_transaction_name", "Transaction Name"));
        }

        public final void p(Context context, dz5 sw) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sw, "sw");
            wa3 wa3Var = new wa3(context);
            sw.b.setHint(wa3Var.b("edit_dl_serv_dob", "Enter Date of Birth"));
            sw.i.setText(wa3Var.b("lbl_dob", "Date of Birth"));
            sw.h.setText(wa3Var.b("vahan_application_name", context.getString(R.string.application_no_mend)));
            sw.c.setHint(wa3Var.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            sw.l.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            sw.d.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void p0(Context context, la dl_ack) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dl_ack, "dl_ack");
            wa3 wa3Var = new wa3(context);
            dl_ack.y.setText(wa3Var.b("btn_dl_serv_downl_ackno", context.getString(R.string.download_ack)));
            dl_ack.L.setText(wa3Var.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
            dl_ack.K.setText(wa3Var.b("label_view_forms", context.getString(R.string.view_forms)));
            dl_ack.G.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void p1(Context context, o8 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.R.setText(wa3Var.b("label_dl_serv_new_mob_no", context.getString(R.string.new_mobile)));
            binding.D.setHint(wa3Var.b("enter_new_mobile_no", context.getString(R.string.enter_new_mobile_no)));
            binding.z.setText(wa3Var.b("confirm_new_mob", context.getString(R.string.confirm_new_mob)));
            binding.y.setHint(wa3Var.b("enter_confirm_new_mob", context.getString(R.string.enter_confirm_new_mob)));
            binding.G.setText(wa3Var.b("label_dl_serv_reason", context.getString(R.string.vahan_reason)));
            binding.H.setHint(wa3Var.b("label_dl_serv_reason", context.getString(R.string.enter_reason_to_duplicate_cl)));
            binding.x.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            binding.I.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void p2(Context context, gi7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.D.setText(wa3Var.b("vehicle_no", context.getString(R.string.vehicle_no)));
            binding.j.g.setText(wa3Var.b("toSellerBuyer", "Transfer of OwnerShip"));
            binding.e.setText(wa3Var.b("to_newOwner_srNo", "New Owner Serial No."));
            binding.d.setHint(wa3Var.b("to_newOwner_srNo", "New Owner Serial No."));
            binding.u.setText(wa3Var.b("to_purpose", "Purpose"));
            binding.q.setText(wa3Var.b("to_ownership_type", "Ownership Type"));
            binding.l.setText(wa3Var.b("to_owner_category", "New Owner Category"));
            binding.n.setText(wa3Var.b("to_newOwner_name_buyer", "New Owner Name(Buyer)"));
            binding.m.setHint(wa3Var.b("to_newOwner_name_buyer", "Enter new Owner Name(Buyer)"));
            binding.g.setText(wa3Var.b("to_father_name", "Father/Husband Name"));
            binding.f.setHint(wa3Var.b("to_father_name", "Father/Husband Name"));
            binding.A.setText(wa3Var.b("to_sale_amount", "Sale Amount"));
            binding.z.setHint(wa3Var.b("to_sale_amount", "Sale Amount"));
            binding.C.setText(wa3Var.b("to_sale_date", "Sale Date"));
            binding.B.setHint(wa3Var.b("to_sale_date", "Sale Date"));
            binding.i.setText(wa3Var.b("to_mobile_buyer", "Mobile No. (Buyer)"));
            binding.h.setHint(wa3Var.b("to_mobile_buyer", "Mobile No. (Buyer)"));
            binding.s.setText(wa3Var.b("to_pan_number", "PAN Number"));
            binding.r.setHint(wa3Var.b("to_pan_number", "PAN Number"));
            binding.c.setText(wa3Var.b("Email_id", "Email ID"));
            binding.b.setHint(wa3Var.b("Email_id", "Email ID"));
            binding.o.setText(wa3Var.b("btn_dl_serv_next", "Next"));
            binding.v.setText(wa3Var.b("btn_reset", "Reset"));
        }

        public final void q(Context context, zv5 sw) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sw, "sw");
            wa3 wa3Var = new wa3(context);
            sw.d.setText(wa3Var.b("vahan_application_no", context.getString(R.string.application_no)));
            sw.i.setText(wa3Var.b("label_applicant_name", context.getString(R.string.applicant_name)));
            sw.g.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            sw.f.setText(wa3Var.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_no)));
            sw.m.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
        }

        public final void q0(Context context, c9 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.h0.setText(wa3Var.b("current_address", context.getString(R.string.current_address)));
            binding.l0.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state_coa)));
            binding.b0.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district_coa)));
            binding.p0.setText(wa3Var.b("select_state_rto", context.getString(R.string.taluka_block_sarthi)));
            binding.r0.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            binding.a0.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.town)));
            binding.d0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            binding.n0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            binding.f0.setText(wa3Var.b("label_loc_mark", context.getString(R.string.landmark_sarthi)));
            binding.j0.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode_coa)));
            binding.Q.setText(wa3Var.b("stay_duration", context.getString(R.string.duration_stay_sarthi)));
            binding.t0.setHint(wa3Var.b("year_txt", context.getString(R.string.year)));
            binding.V.setHint(wa3Var.b("month_txt", context.getString(R.string.month)));
            binding.i0.setText(wa3Var.b("permanent_address", context.getString(R.string.permanent_address_sarthi)));
            binding.m0.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state_coa)));
            binding.c0.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district_coa)));
            binding.q0.setText(wa3Var.b("select_state_rto", context.getString(R.string.taluka_block_sarthi)));
            binding.J.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            binding.I.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.town)));
            binding.e0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            binding.o0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            binding.g0.setText(wa3Var.b("label_loc_mark", context.getString(R.string.landmark_sarthi)));
            binding.k0.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode_coa)));
            binding.Y.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void q1(Context context, od binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.l.setText(wa3Var.b("title_dl_serv_no", context.getString(R.string.driving_license_no)));
            binding.d.setText(wa3Var.b("enter_adhar_vid", context.getString(R.string.enter_adhar_vid)));
            binding.b.setText(wa3Var.b("aadhar_no", context.getString(R.string.aadhar_no)));
            binding.p.setText(wa3Var.b("vid", context.getString(R.string.vid)));
            binding.g.setHint(wa3Var.b("enter_aadhaar_number", context.getString(R.string.enter_aadhaar_number)));
            SpannableString spannableString = new SpannableString(wa3Var.b("agree_with_aadhar_terms", context.getString(R.string.agree_with_aadhar_terms)));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            binding.c.setText(spannableString);
            binding.n.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.o.setText(wa3Var.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void q2(Context context, om6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.E.setText(wa3Var.b("vehicle_no", context.getString(R.string.vehicle_no)));
            binding.e.setText(wa3Var.b("to_newOwner_srNo", "New Owner Serial No."));
            binding.d.setHint(wa3Var.b("to_newOwner_srNo", "New Owner Serial No."));
            binding.t.setText(wa3Var.b("to_purpose", "Purpose"));
            binding.p.setText(wa3Var.b("to_ownership_type", "Ownership Type"));
            binding.k.setText(wa3Var.b("to_owner_category", "New Owner Category"));
            binding.m.setText(wa3Var.b("to_newOwner_name_buyer", "New Owner Name(Buyer)"));
            binding.l.setHint(wa3Var.b("to_newOwner_name_buyer", "Enter new Owner Name(Buyer)"));
            binding.g.setText(wa3Var.b("to_father_name", "Father/Husband Name"));
            binding.f.setHint(wa3Var.b("to_father_name", "Father/Husband Name"));
            binding.A.setText(wa3Var.b("to_sale_amount", "Sale Amount"));
            binding.z.setHint(wa3Var.b("to_sale_amount", "Sale Amount"));
            binding.C.setText(wa3Var.b("to_sale_date", "Sale Date"));
            binding.B.setHint(wa3Var.b("to_sale_date", "Sale Date"));
            binding.i.setText(wa3Var.b("to_mobile_buyer", "Mobile No. (Buyer)"));
            binding.h.setHint(wa3Var.b("to_mobile_buyer", "Mobile No. (Buyer)"));
            binding.r.setText(wa3Var.b("to_pan_number", "PAN Number"));
            binding.q.setHint(wa3Var.b("to_pan_number", "PAN Number"));
            binding.c.setText(wa3Var.b("Email_id", "Email ID"));
            binding.b.setHint(wa3Var.b("Email_id", "Email ID"));
            binding.n.setText(wa3Var.b("btn_dl_serv_next", "Next"));
            binding.v.setText(wa3Var.b("btn_reset", "Reset"));
        }

        public final void r(Context context, fz5 sw) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sw, "sw");
            wa3 wa3Var = new wa3(context);
            sw.h.setText(wa3Var.b("title_dl_serv_no", context.getString(R.string.driving_license_no)));
            sw.i.setText(wa3Var.b("title_dl_serv_no", context.getString(R.string.driving_license_no)));
            sw.i.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            sw.f.setHint(wa3Var.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_no)));
            sw.g.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
            sw.c.setText(wa3Var.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void r0(Context context, vf dl_dob) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dl_dob, "dl_dob");
            wa3 wa3Var = new wa3(context);
            dl_dob.r.b.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            dl_dob.r.c.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            dl_dob.r.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            dl_dob.r.d.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            dl_dob.r.f.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            dl_dob.y.setText(wa3Var.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            dl_dob.d.setText(wa3Var.b("change_dob_text", context.getString(R.string.change_of_dob_dl)));
            dl_dob.v.setText(wa3Var.b("label_dl_serv_reason", context.getString(R.string.reason)));
            dl_dob.g.setText(wa3Var.b("lbl_dob", context.getString(R.string.date_of_birth)));
            dl_dob.e.setHint(wa3Var.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            dl_dob.u.setText(wa3Var.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            dl_dob.z.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            dl_dob.p.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            dl_dob.q.setHint(wa3Var.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
            dl_dob.s.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            dl_dob.l.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void r1(Context context, v9 mobupdate2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mobupdate2, "mobupdate2");
            wa3 wa3Var = new wa3(context);
            mobupdate2.O.setText(wa3Var.b("title_dl_serv_no", context.getString(R.string.driving_license_no)));
            mobupdate2.z.setHint(wa3Var.b("label_challan_enter_dl_no", context.getString(R.string.enter_driving_license_no)));
            mobupdate2.w.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            mobupdate2.G.setHint(wa3Var.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile)));
            mobupdate2.S.setText(wa3Var.b("label_dl_serv_enter_otp", context.getString(R.string.enter_otp)));
            mobupdate2.A.setHint(wa3Var.b("label_dl_serv_enter_otp", context.getString(R.string.enter_otp)));
            mobupdate2.I.setHint(wa3Var.b("vahan_resend_otp", context.getString(R.string.resend_otp)));
            mobupdate2.M.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            mobupdate2.J.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
            mobupdate2.I.setText(wa3Var.b("vahan_resend_otp", context.getString(R.string.resend_otp)));
        }

        public final void r2(Context context, sh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.g.g.setText(wa3Var.b("lbl_Verify_Payment_Status", "Verify Payment Status"));
            binding.l.setText(wa3Var.b("vahan_application_no", "Application Number"));
            binding.c.setText(wa3Var.b("vahan_application_no", "Application Number"));
            binding.i.setText(wa3Var.b("vahan_registration_no", "Registration Number"));
            binding.b.setText(wa3Var.b("vahan_chassis_no_last_five", "Chassis No. (Last 5 digits)"));
            binding.d.setText(wa3Var.b("vahan_get_details", context.getString(R.string.get_details)));
            binding.f.setHint(wa3Var.b(va3.a.E(), "Enter application no."));
            binding.e.setHint(wa3Var.b("vahan_enter_chassis_no", "Enter chassis no."));
        }

        public final void s(Context context, g6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.b.setText(wa3Var.b("Emergency_Service", "Add Alarm"));
            binding.q.setText(wa3Var.b("create_ep", "Manage your emergency contacts"));
            binding.o.setText(wa3Var.b("add_emergency_contact", "Create Emergency Profile"));
            binding.p.setText(wa3Var.b("i_can_help", "I can help best during critical moments if I have someone to reach out to. Go ahead and tap the (+) button to add someone."));
            binding.l.setText(wa3Var.b("Emergency_Contact", "Emergency Contact"));
        }

        public final void s0(Context context, pq1 dl_holder_details) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dl_holder_details, "dl_holder_details");
            wa3 wa3Var = new wa3(context);
            dl_holder_details.h0.setText(wa3Var.b("title_dl_serv_personal_info", context.getString(R.string.personal_info)));
            dl_holder_details.Y.setText(wa3Var.b("title_dl_serv_information", context.getString(R.string.dl_info)));
            dl_holder_details.T.setText(wa3Var.b("title_dl_serv_class_vehicle", context.getString(R.string.class_vehicle)));
            dl_holder_details.M.setText(wa3Var.b("btn_dl_serv_close", context.getString(R.string.close)));
            dl_holder_details.X.setText(wa3Var.b("label_dl_holder_name", context.getString(R.string.driver_details_)));
            dl_holder_details.b0.setText(wa3Var.b("label_dl_serv_father_name", context.getString(R.string.father_name)));
            dl_holder_details.g0.setText(wa3Var.b("label_dl_serv_permn_addr", context.getString(R.string.permanent_address)));
            dl_holder_details.a0.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            dl_holder_details.S.setText(wa3Var.b("blood_group", context.getString(R.string.blood_group)));
            dl_holder_details.Z.setText(wa3Var.b("label_dl_serv_issue_date", context.getString(R.string.dl_issue_date)));
            dl_holder_details.f0.setText(wa3Var.b("label_dl_serv_nt_valid_upto", context.getString(R.string.nt_valid_upto)));
            dl_holder_details.c0.setText(wa3Var.b("label_dl_serv_issue_authority", context.getString(R.string.issue_authority)));
            dl_holder_details.l0.setText(wa3Var.b("label_dl_serv_tr_valid_upto", context.getString(R.string.tr_valid_upto)));
            dl_holder_details.e0.setText(wa3Var.b("label_dl_serv_last_endor_state", context.getString(R.string.last_state)));
            dl_holder_details.d0.setText(wa3Var.b("label_dl_serv_last_endor_rto", context.getString(R.string.last_rto)));
        }

        public final void s1(Context context, tf mobupdate) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mobupdate, "mobupdate");
            wa3 wa3Var = new wa3(context);
            mobupdate.G.setText(wa3Var.b("update_Mobile_No", context.getString(R.string.update_mobile)));
            mobupdate.J.setText(wa3Var.b("label_dl_serv_old_mob_no", context.getString(R.string.old_mobile)));
            mobupdate.I.setText(wa3Var.b("label_dl_serv_new_mob_no", context.getString(R.string.new_mobile)));
            mobupdate.C.setHint(wa3Var.b("edit_dl_serv_mob_no", context.getString(R.string.new_mobile)));
            mobupdate.K.setText(wa3Var.b("label_dl_serv_rem_rea", context.getString(R.string.vahan_remark)));
            mobupdate.E.setHint(wa3Var.b("edit_dl_serv_enter_reason", context.getString(R.string.enter_reason)));
            mobupdate.H.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            mobupdate.w.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
        }

        public final void s2(Context context, jw2 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.A.setText(wa3Var.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            binding.B.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.y.setText(wa3Var.b("lbl_Hypothecation_Addition", context.getString(R.string.vahan_hypothecation_addition)));
            binding.s.i.setText(wa3Var.b("lbl_Hypothecation_Addition", context.getString(R.string.vahan_hypothecation_addition)));
            binding.x.setText(wa3Var.b("lbl_Hypothecation_Addition_Details", context.getString(R.string.vahan_hypothecation_add_details)));
            binding.z.setText(wa3Var.b("lbl_Type", context.getString(R.string.vahan_type)));
            binding.w.setText(wa3Var.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            binding.h.setHint(wa3Var.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            binding.v.setText(wa3Var.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            binding.g.setHint(wa3Var.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            binding.u.setText(wa3Var.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            binding.j.setText(wa3Var.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            binding.i.setHint(wa3Var.b("lbl_Enter_the_House_no", context.getString(R.string.enter_the_house_no)));
            binding.D.setText(wa3Var.b("village_town_city", context.getString(R.string.village_town_city)));
            binding.C.setHint(wa3Var.b("lbl_Enter_the_Village_Town_City", context.getString(R.string.enter_the_village_town_city)));
            binding.m.setText(wa3Var.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            binding.l.setHint(wa3Var.b("lbl_Enter_the_Landmark_Police_station", context.getString(R.string.enter_the_landmark_police_station)));
            binding.q.setText(wa3Var.b("vahan_state", context.getString(R.string.state)));
            binding.e.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district)));
            binding.n.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.d.setHint(wa3Var.b("lbl_Enter_the_pincode", context.getString(R.string.enter_the_pincode)));
            binding.t.setText(wa3Var.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            binding.f.setHint(wa3Var.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            binding.b.setText(wa3Var.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            binding.o.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.o.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.o.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.o.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void t(Context context, r8 ac) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ac, "ac");
            wa3 wa3Var = new wa3(context);
            ac.h.setText(wa3Var.b("vahan_application_name", context.getString(R.string.application_no_mend)));
            ac.c.setHint(wa3Var.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            ac.i.setText(wa3Var.b("lbl_dob", "Date of Birth"));
            ac.b.setHint(wa3Var.b("edit_dl_serv_dob", "Enter Date of Birth"));
            ac.l.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            ac.d.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void t0(Context context, i9 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.M.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state)));
            binding.F.setText(wa3Var.b("label_dl_serv_rto", context.getString(R.string.rto)));
            binding.O.setText(wa3Var.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            binding.I.setText(wa3Var.b("selelcted_class_vehicle", context.getString(R.string.selected_following_learner_class)));
            binding.w.setText(wa3Var.b("dl_add_driving_school", context.getString(R.string.add_driving_school)));
            binding.N.setText(wa3Var.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            binding.Q.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            binding.D.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            binding.K.setText(wa3Var.b("here_by_declare", context.getString(R.string.self_declartion)));
            binding.z.setText(wa3Var.b("button_cancel", context.getString(R.string.cancel)));
            binding.C.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void t1(Context context, View root) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(root, "root");
            try {
                wa3 wa3Var = new wa3(context);
                View viewFindViewById = root.findViewById(R.id.welcome);
                Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById2 = root.findViewById(R.id.trans_services);
                Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById3 = root.findViewById(R.id.my_docs);
                Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewFindViewById3;
                View viewFindViewById4 = root.findViewById(R.id.cit_sen);
                Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById5 = root.findViewById(R.id.inf_Serv);
                Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) viewFindViewById5;
                View viewFindViewById6 = root.findViewById(R.id.txt_ts);
                Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView3 = (TextView) viewFindViewById6;
                View viewFindViewById7 = root.findViewById(R.id.txt_md);
                Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView4 = (TextView) viewFindViewById7;
                View viewFindViewById8 = root.findViewById(R.id.txt_cs);
                Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView5 = (TextView) viewFindViewById8;
                View viewFindViewById9 = root.findViewById(R.id.txt_is);
                Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView6 = (TextView) viewFindViewById9;
                View viewFindViewById10 = root.findViewById(R.id.virtual_rc_textview);
                Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView7 = (TextView) viewFindViewById10;
                View viewFindViewById11 = root.findViewById(R.id.nodocument);
                Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView8 = (TextView) viewFindViewById11;
                View viewFindViewById12 = root.findViewById(R.id.virtual_dl_textview);
                Intrinsics.checkNotNull(viewFindViewById12, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView9 = (TextView) viewFindViewById12;
                View viewFindViewById13 = root.findViewById(R.id.txt_process);
                Intrinsics.checkNotNull(viewFindViewById13, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById14 = root.findViewById(R.id.home);
                Intrinsics.checkNotNull(viewFindViewById14, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById15 = root.findViewById(R.id.payment);
                Intrinsics.checkNotNull(viewFindViewById15, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById16 = root.findViewById(R.id.documents);
                Intrinsics.checkNotNull(viewFindViewById16, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById17 = root.findViewById(R.id.settings);
                Intrinsics.checkNotNull(viewFindViewById17, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById18 = root.findViewById(R.id.my_virtual_rc);
                Intrinsics.checkNotNull(viewFindViewById18, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById19 = root.findViewById(R.id.my_virtual_dl);
                Intrinsics.checkNotNull(viewFindViewById19, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById20 = root.findViewById(R.id.alerts_title);
                Intrinsics.checkNotNull(viewFindViewById20, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById21 = root.findViewById(R.id.about_nexgen);
                Intrinsics.checkNotNull(viewFindViewById21, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView10 = (TextView) viewFindViewById21;
                View viewFindViewById22 = root.findViewById(R.id.txt_virtual_rc);
                Intrinsics.checkNotNull(viewFindViewById22, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView11 = (TextView) viewFindViewById22;
                View viewFindViewById23 = root.findViewById(R.id.txt_virtual_dl);
                Intrinsics.checkNotNull(viewFindViewById23, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView12 = (TextView) viewFindViewById23;
                View viewFindViewById24 = root.findViewById(R.id.txt_shared_rc);
                Intrinsics.checkNotNull(viewFindViewById24, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView13 = (TextView) viewFindViewById24;
                View viewFindViewById25 = root.findViewById(R.id.txt_rcv_rc);
                Intrinsics.checkNotNull(viewFindViewById25, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView14 = (TextView) viewFindViewById25;
                View viewFindViewById26 = root.findViewById(R.id.txt_rc_search);
                Intrinsics.checkNotNull(viewFindViewById26, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView15 = (TextView) viewFindViewById26;
                View viewFindViewById27 = root.findViewById(R.id.txt_dl_search);
                Intrinsics.checkNotNull(viewFindViewById27, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView16 = (TextView) viewFindViewById27;
                View viewFindViewById28 = root.findViewById(R.id.txt_dup_rc);
                Intrinsics.checkNotNull(viewFindViewById28, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView17 = (TextView) viewFindViewById28;
                View viewFindViewById29 = root.findViewById(R.id.txt_ht);
                Intrinsics.checkNotNull(viewFindViewById29, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView18 = (TextView) viewFindViewById29;
                View viewFindViewById30 = root.findViewById(R.id.txt_too);
                Intrinsics.checkNotNull(viewFindViewById30, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView19 = (TextView) viewFindViewById30;
                View viewFindViewById31 = root.findViewById(R.id.txt_rc_pert);
                Intrinsics.checkNotNull(viewFindViewById31, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView20 = (TextView) viewFindViewById31;
                View viewFindViewById32 = root.findViewById(R.id.txt_coa);
                Intrinsics.checkNotNull(viewFindViewById32, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView21 = (TextView) viewFindViewById32;
                View viewFindViewById33 = root.findViewById(R.id.txt_hp_end);
                Intrinsics.checkNotNull(viewFindViewById33, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView22 = (TextView) viewFindViewById33;
                View viewFindViewById34 = root.findViewById(R.id.txt_hc);
                Intrinsics.checkNotNull(viewFindViewById34, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView23 = (TextView) viewFindViewById34;
                View viewFindViewById35 = root.findViewById(R.id.txt_noc);
                Intrinsics.checkNotNull(viewFindViewById35, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView24 = (TextView) viewFindViewById35;
                View viewFindViewById36 = root.findViewById(R.id.about_licence);
                Intrinsics.checkNotNull(viewFindViewById36, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView25 = (TextView) viewFindViewById36;
                View viewFindViewById37 = root.findViewById(R.id.txt_renewal);
                Intrinsics.checkNotNull(viewFindViewById37, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView26 = (TextView) viewFindViewById37;
                View viewFindViewById38 = root.findViewById(R.id.txt_dup_dl);
                Intrinsics.checkNotNull(viewFindViewById38, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView27 = (TextView) viewFindViewById38;
                View viewFindViewById39 = root.findViewById(R.id.txt_coa_dl);
                Intrinsics.checkNotNull(viewFindViewById39, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView28 = (TextView) viewFindViewById39;
                View viewFindViewById40 = root.findViewById(R.id.txt_idp);
                Intrinsics.checkNotNull(viewFindViewById40, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView29 = (TextView) viewFindViewById40;
                View viewFindViewById41 = root.findViewById(R.id.txt_dl_extract);
                Intrinsics.checkNotNull(viewFindViewById41, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView30 = (TextView) viewFindViewById41;
                View viewFindViewById42 = root.findViewById(R.id.txt_replace_dl);
                Intrinsics.checkNotNull(viewFindViewById42, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView31 = (TextView) viewFindViewById42;
                View viewFindViewById43 = root.findViewById(R.id.txt_renewal2);
                Intrinsics.checkNotNull(viewFindViewById43, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView32 = (TextView) viewFindViewById43;
                View viewFindViewById44 = root.findViewById(R.id.txt_dup_dl2);
                Intrinsics.checkNotNull(viewFindViewById44, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView33 = (TextView) viewFindViewById44;
                View viewFindViewById45 = root.findViewById(R.id.aod);
                Intrinsics.checkNotNull(viewFindViewById45, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView34 = (TextView) viewFindViewById45;
                View viewFindViewById46 = root.findViewById(R.id.txt_idp2);
                Intrinsics.checkNotNull(viewFindViewById46, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView35 = (TextView) viewFindViewById46;
                View viewFindViewById47 = root.findViewById(R.id.txt_idp3);
                Intrinsics.checkNotNull(viewFindViewById47, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView36 = (TextView) viewFindViewById47;
                View viewFindViewById48 = root.findViewById(R.id.txt_dl_extract2);
                Intrinsics.checkNotNull(viewFindViewById48, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView37 = (TextView) viewFindViewById48;
                View viewFindViewById49 = root.findViewById(R.id.txt_dl_extract3);
                Intrinsics.checkNotNull(viewFindViewById49, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView38 = (TextView) viewFindViewById49;
                View viewFindViewById50 = root.findViewById(R.id.txt_replace_dl2);
                Intrinsics.checkNotNull(viewFindViewById50, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView39 = (TextView) viewFindViewById50;
                View viewFindViewById51 = root.findViewById(R.id.about_na);
                Intrinsics.checkNotNull(viewFindViewById51, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView40 = (TextView) viewFindViewById51;
                View viewFindViewById52 = root.findViewById(R.id.txt_notification);
                Intrinsics.checkNotNull(viewFindViewById52, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView41 = (TextView) viewFindViewById52;
                View viewFindViewById53 = root.findViewById(R.id.txt_advisory);
                Intrinsics.checkNotNull(viewFindViewById53, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView42 = (TextView) viewFindViewById53;
                View viewFindViewById54 = root.findViewById(R.id.txt_draft_not);
                Intrinsics.checkNotNull(viewFindViewById54, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView43 = (TextView) viewFindViewById54;
                View viewFindViewById55 = root.findViewById(R.id.view_more);
                Intrinsics.checkNotNull(viewFindViewById55, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView44 = (TextView) viewFindViewById55;
                View viewFindViewById56 = root.findViewById(R.id.view_more_2);
                Intrinsics.checkNotNull(viewFindViewById56, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView45 = (TextView) viewFindViewById56;
                View viewFindViewById57 = root.findViewById(R.id.all_forms);
                Intrinsics.checkNotNull(viewFindViewById57, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView46 = (TextView) viewFindViewById57;
                View viewFindViewById58 = root.findViewById(R.id.txt_dl);
                Intrinsics.checkNotNull(viewFindViewById58, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView47 = (TextView) viewFindViewById58;
                View viewFindViewById59 = root.findViewById(R.id.m_v_d);
                Intrinsics.checkNotNull(viewFindViewById59, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView48 = (TextView) viewFindViewById59;
                View viewFindViewById60 = root.findViewById(R.id.permit);
                Intrinsics.checkNotNull(viewFindViewById60, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView49 = (TextView) viewFindViewById60;
                View viewFindViewById61 = root.findViewById(R.id.v_r);
                Intrinsics.checkNotNull(viewFindViewById61, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView50 = (TextView) viewFindViewById61;
                View viewFindViewById62 = root.findViewById(R.id.vehicle_recall);
                Intrinsics.checkNotNull(viewFindViewById62, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView51 = (TextView) viewFindViewById62;
                View viewFindViewById63 = root.findViewById(R.id.tr_text);
                Intrinsics.checkNotNull(viewFindViewById63, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView52 = (TextView) viewFindViewById63;
                View viewFindViewById64 = root.findViewById(R.id.ts_text);
                Intrinsics.checkNotNull(viewFindViewById64, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView53 = (TextView) viewFindViewById64;
                View viewFindViewById65 = root.findViewById(R.id.doc_text);
                Intrinsics.checkNotNull(viewFindViewById65, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView54 = (TextView) viewFindViewById65;
                View viewFindViewById66 = root.findViewById(R.id.doc_text2);
                Intrinsics.checkNotNull(viewFindViewById66, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView55 = (TextView) viewFindViewById66;
                View viewFindViewById67 = root.findViewById(R.id.is_text);
                Intrinsics.checkNotNull(viewFindViewById67, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView56 = (TextView) viewFindViewById67;
                View viewFindViewById68 = root.findViewById(R.id.is_text2);
                Intrinsics.checkNotNull(viewFindViewById68, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView57 = (TextView) viewFindViewById68;
                View viewFindViewById69 = root.findViewById(R.id.ld_text);
                Intrinsics.checkNotNull(viewFindViewById69, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView58 = (TextView) viewFindViewById69;
                View viewFindViewById70 = root.findViewById(R.id.vd_text);
                Intrinsics.checkNotNull(viewFindViewById70, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView59 = (TextView) viewFindViewById70;
                View viewFindViewById71 = root.findViewById(R.id.ap_text);
                Intrinsics.checkNotNull(viewFindViewById71, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView60 = (TextView) viewFindViewById71;
                View viewFindViewById72 = root.findViewById(R.id.act_text);
                Intrinsics.checkNotNull(viewFindViewById72, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView61 = (TextView) viewFindViewById72;
                View viewFindViewById73 = root.findViewById(R.id.fee_text);
                Intrinsics.checkNotNull(viewFindViewById73, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView62 = (TextView) viewFindViewById73;
                View viewFindViewById74 = root.findViewById(R.id.fee_text2);
                Intrinsics.checkNotNull(viewFindViewById74, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView63 = (TextView) viewFindViewById74;
                View viewFindViewById75 = root.findViewById(R.id.fee_text3);
                Intrinsics.checkNotNull(viewFindViewById75, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView64 = (TextView) viewFindViewById75;
                View viewFindViewById76 = root.findViewById(R.id.manual_text);
                Intrinsics.checkNotNull(viewFindViewById76, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView65 = (TextView) viewFindViewById76;
                View viewFindViewById77 = root.findViewById(R.id.faq_text);
                Intrinsics.checkNotNull(viewFindViewById77, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView66 = (TextView) viewFindViewById77;
                View viewFindViewById78 = root.findViewById(R.id.about_vehicle);
                Intrinsics.checkNotNull(viewFindViewById78, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById79 = root.findViewById(R.id.pay_tax_text);
                Intrinsics.checkNotNull(viewFindViewById79, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) viewFindViewById20).setText(wa3Var.b("view_alert", "Alerts"));
                ((TextView) viewFindViewById18).setText(wa3Var.b("My_Virtual_RC", context.getString(R.string.My_Virtual_RC)));
                ((TextView) viewFindViewById19).setText(wa3Var.b("My_Virtual_DL", context.getString(R.string.My_Virtual_DL)));
                ((TextView) viewFindViewById17).setText(wa3Var.b("label_setting", context.getString(R.string.settings)));
                ((TextView) viewFindViewById16).setText(wa3Var.b("documents", context.getString(R.string.documents)));
                ((TextView) viewFindViewById15).setText(wa3Var.b("logo_challan_payment", VContant.PAYMENT));
                ((TextView) viewFindViewById14).setText(wa3Var.b("label_home", "Home"));
                ((TextView) viewFindViewById13).setText(wa3Var.b("avail_soon", "Available Soon\n(Under Development)"));
                ((TextView) viewFindViewById).setText(wa3Var.b("welcome", "Welcome"));
                ((TextView) viewFindViewById2).setText(wa3Var.b("trans_services", context.getString(R.string.trans_services)));
                textView.setText(wa3Var.b("my_docs", context.getString(R.string.my_docs)));
                textView2.setText(wa3Var.b("inf_Serv", context.getString(R.string.inf_Serv)));
                textView3.setText(wa3Var.b("trans_services", context.getString(R.string.trans_services)));
                textView4.setText(wa3Var.b("txt_md", context.getString(R.string.txt_md)));
                textView5.setText(wa3Var.b("txt_md", context.getString(R.string.virtual_documents)));
                textView6.setText(wa3Var.b("txt_is", context.getString(R.string.inf_Serv)));
                textView8.setText(wa3Var.b("txt_is", context.getString(R.string.no_doc)));
                textView7.setText(wa3Var.b("label_virtual_rc", context.getString(R.string.virtual_rc)));
                textView9.setText(wa3Var.b("label_virtual_dl", context.getString(R.string.virtual_dl)));
                textView52.setText(wa3Var.b("label_transport_services", "Transport Services"));
                textView53.setText(wa3Var.b("label_transport_services", "Transport Services"));
                textView54.setText(wa3Var.b("label_my_documents", "My Documents"));
                textView55.setText(wa3Var.b("label_my_documents", "My Documents"));
                textView56.setText(wa3Var.b("label_informational_services", "Informational Services"));
                textView57.setText(wa3Var.b("label_informational_services", "Informational Services"));
                textView58.setText(wa3Var.b("logo_dl_details", "Driving Licence Details"));
                textView59.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
                textView60.setText(wa3Var.b("About_Permit", "About Permit"));
                textView61.setText(wa3Var.b("Act_Rules_Policies", "Act, Rules & Policies"));
                textView62.setText(wa3Var.b("Fees_User_Charges", "Fees & User Charges"));
                textView63.setText(wa3Var.b("License_Related_Fees_and_Charges", "License Related Fees and Charges"));
                textView64.setText(wa3Var.b("License_Related_Fees_and_Charges", "License Related Fees and Charges"));
                textView65.setText(wa3Var.b("faq_text", "FAQ"));
                ((TextView) viewFindViewById78).setText(wa3Var.b("label_about_vehicle", "About Vehicle"));
                textView66.setText(wa3Var.b("manual", "Manual"));
                ((TextView) viewFindViewById79).setText(wa3Var.b("label_pay_tax", "Pay Your Tax"));
                textView34.setText(wa3Var.b("Addition_of_Class", "Addition_of_Class"));
                textView10.setText(wa3Var.b("about_nexgen", "About NextGen mParivahan"));
                textView11.setText(wa3Var.b("label_virtual_rc", context.getString(R.string.virtual_rc)));
                textView12.setText(wa3Var.b("label_virtual_dl", context.getString(R.string.virtual_dl)));
                textView13.setText(wa3Var.b("label_shared_rc", context.getString(R.string.share_rc)));
                textView14.setText(wa3Var.b("label_received_rc", context.getString(R.string.received_rc)));
                textView15.setText(wa3Var.b("label_rc_search", context.getString(R.string.rc_switch)));
                textView16.setText(wa3Var.b("label_dl_search", context.getString(R.string.dl_switch)));
                textView17.setText(wa3Var.b("label_duplicate_rc", context.getString(R.string.duplicate_rc)));
                textView18.setText(wa3Var.b("label_hypothetication_termination", context.getString(R.string.vahan_hypothecation_termination)));
                textView19.setText(wa3Var.b("label_transfer_ownership", "Transfer of Ownership"));
                textView20.setText(wa3Var.b("rc_perticular", context.getString(R.string.rc_pert)));
                textView21.setText(wa3Var.b("label_change_of_address", context.getString(R.string.change_of_address)));
                textView22.setText(wa3Var.b("Hypothetication_endorsement", context.getString(R.string.hp_endorsment)));
                textView23.setText(wa3Var.b("label_hypothetication_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
                textView24.setText(wa3Var.b("label_noc", context.getString(R.string.vahan_noc)));
                textView25.setText(wa3Var.b("label_about_licence", "About Licence"));
                textView26.setText(wa3Var.b("title_dl_serv_renewal", context.getString(R.string.renewal_dl)));
                textView27.setText(wa3Var.b("title_dl_serv_duplicate_dl", context.getString(R.string.i_o_dl)));
                textView28.setText(wa3Var.b("label_coa_in_dl", context.getString(R.string.change_Add)));
                textView29.setText(wa3Var.b("label_international_driv_permit", context.getString(R.string.international_driving_permit)));
                textView30.setText(wa3Var.b("label_dl_extract", context.getString(R.string.dlextract)));
                textView31.setText(wa3Var.b("label_dl_replacement", context.getString(R.string.rep_of_dl)));
                textView32.setText(wa3Var.b("title_dl_serv_renewal", context.getString(R.string.renewal_dl)));
                textView33.setText(wa3Var.b("title_dl_serv_duplicate_dl", context.getString(R.string.i_o_dl)));
                textView35.setText(wa3Var.b("label_international_driv_permit", context.getString(R.string.international_driving_permit)));
                textView36.setText(wa3Var.b("label_international_driv_permit", context.getString(R.string.international_driving_permit)));
                textView37.setText(wa3Var.b("label_dl_extract", context.getString(R.string.dlextract)));
                textView38.setText(wa3Var.b("label_dl_extract", context.getString(R.string.dlextract)));
                textView39.setText(wa3Var.b("label_dl_replacement", context.getString(R.string.rep_of_dl)));
                textView40.setText(wa3Var.b("label_notifications", context.getString(R.string.notifications)));
                textView41.setText(wa3Var.b("label_notifications", context.getString(R.string.notifications)));
                textView42.setText(wa3Var.b("advisory", context.getString(R.string.advisory_new)));
                textView43.setText(wa3Var.b("Draft_Notifications", context.getString(R.string.draft_not)));
                textView44.setText(wa3Var.b("label_view_more", context.getString(R.string.view_more)));
                textView45.setText(wa3Var.b("label_view_more", context.getString(R.string.view_more)));
                textView46.setText(wa3Var.b("ALL_FORMS", context.getString(R.string.rep_of_dl)));
                textView47.setText(wa3Var.b("label_challan_status", context.getString(R.string.driving_license)));
                textView48.setText(wa3Var.b("motor_vehicle_dealers", context.getString(R.string.m_v_d)));
                textView49.setText(wa3Var.b("permit", context.getString(R.string.permit)));
                textView50.setText(wa3Var.b("vehicle_registration", context.getString(R.string.v_reg)));
                textView51.setText(wa3Var.b("label_dl_replacement", context.getString(R.string.v_r)));
            } catch (Exception unused) {
            }
        }

        public final void t2(Context context, ky3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.b.setText(wa3Var.b("change_of_address_in_rc", context.getString(R.string.change_of_address_in_rc)));
            binding.c.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_text)));
        }

        public final void u(Context context, u8 ac) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ac, "ac");
            wa3 wa3Var = new wa3(context);
            ac.m0.setText(wa3Var.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            ac.z.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            ac.T.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void u0(Context context, op5 dl_mob) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dl_mob, "dl_mob");
            wa3 wa3Var = new wa3(context);
            dl_mob.y.setText(wa3Var.b("title_dl_serv_no", context.getString(R.string.driving_license_no)));
            dl_mob.c.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            dl_mob.A.setText(wa3Var.b("label_dl_serv_update_mob", context.getString(R.string.update2)));
            dl_mob.n.setHint(wa3Var.b("label_mb", context.getString(R.string.enter_mobile_number)));
            dl_mob.b.setText(wa3Var.b("title_dl_serv_terms_cond", context.getString(R.string.agree_terms_cond)));
            dl_mob.t.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            dl_mob.h.setText(wa3Var.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void u1(Context context, l94 mBnding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mBnding, "mBnding");
            wa3 wa3Var = new wa3(context);
            mBnding.I.i.setText(wa3Var.b("txt_md", context.getString(R.string.txt_md)));
            mBnding.C.setText(wa3Var.b("Vehicle_Search_History", "Vehicle Search History"));
            mBnding.z.setText(wa3Var.b("Driving_Licence_Search_History", "Driving Licence Search History"));
            mBnding.J.setText(wa3Var.b("Vehicle_Transactions", "Vehicle Transactions"));
            mBnding.p.setText(wa3Var.b("Driving_Licence_Transactions", "Driving Licence Transactions"));
            mBnding.i.setText(wa3Var.b("Challan_Transactions", "Challan Transactions"));
        }

        public final void u2(Context context, my3 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            SpannableString spannableString = new SpannableString(wa3Var.b("rcServices", context.getString(R.string.rc_service)));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            binding.f.i.setText(spannableString);
            binding.h.setText(wa3Var.b("selectServiceToApply", context.getString(R.string.selectservice)));
            binding.d.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.c.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void v(Context context, p9 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.D.setText(wa3Var.b("vehicle_class_training", context.getString(R.string.class_of_vehicle_for_which_training_taken)));
            binding.X.setHint(wa3Var.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            binding.Q.setText(wa3Var.b("state_school_list", context.getString(R.string.state_wise_driving_school)));
            binding.G.setHint(wa3Var.b("select_d_school", context.getString(R.string.select_d_school)));
            binding.L.setText(wa3Var.b("enrollment_no", context.getString(R.string.enrollment_no)));
            binding.K.setHint(wa3Var.b("enter_enrollement_no", context.getString(R.string.enter_enrollment_no)));
            binding.I.setText(wa3Var.b("enrollement_date", context.getString(R.string.enrollment_date)));
            binding.H.setHint(wa3Var.b("enter_enrollement_date", context.getString(R.string.enter_enrollment_date)));
            binding.C.setText(wa3Var.b("certificate_no", context.getString(R.string.certificate_no)));
            binding.B.setHint(wa3Var.b("enter_certificate_number", context.getString(R.string.enter_certificate_number)));
            binding.A.setText(wa3Var.b("certificate_date", context.getString(R.string.certificate_date)));
            binding.z.setHint(wa3Var.b("enter_certificate_date", context.getString(R.string.enter_certificate_date)));
            binding.U.setText(wa3Var.b("trained_from", context.getString(R.string.trained_from)));
            binding.T.setHint(wa3Var.b("enter_trained_from", context.getString(R.string.enter_trained_from)));
            binding.W.setText(wa3Var.b("trained_to", context.getString(R.string.trained_to)));
            binding.V.setHint(wa3Var.b("enter_trained_to", context.getString(R.string.enter_trained_to)));
            binding.N.setText(wa3Var.b("save_add_more", context.getString(R.string.save_add_more)));
            binding.O.setText(wa3Var.b("label_save", context.getString(R.string.save)));
            binding.y.setText(wa3Var.b("btn_go_back", context.getString(R.string.back)));
        }

        public final void v0(Context context, x9 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.i0.setText(wa3Var.b("personal_details", context.getString(R.string.personal_details)));
            binding.U.setText(wa3Var.b("name_of_applicant", context.getString(R.string.name_of_applicant_ll)));
            binding.z.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.enter_first_name)));
            binding.B.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            binding.A.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            binding.T.setText(wa3Var.b("full_name_as_per_records", context.getString(R.string.full_name_txt)));
            binding.a0.setHint(wa3Var.b("enter_full_name_as_record", context.getString(R.string.enter_full_name_as_per_record)));
            binding.g0.setText(wa3Var.b("label_relation", context.getString(R.string.relation_is)));
            binding.j0.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.enter_first_name)));
            binding.l0.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            binding.k0.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            binding.b0.setText(wa3Var.b("appl_gender", context.getString(R.string.gender)));
            binding.L.setText(wa3Var.b("appl_female", context.getString(R.string.female)));
            binding.O.setText(wa3Var.b("appl_male", context.getString(R.string.male)));
            binding.R.setText(wa3Var.b("appl_trans", context.getString(R.string.transgender)));
            binding.X.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob_txt)));
            binding.x.setText(wa3Var.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            binding.V.setText(wa3Var.b("birth_place", context.getString(R.string.birth_place)));
            binding.C.setHint(wa3Var.b("edit_dl_serv_enter_birth_plac", context.getString(R.string.enter_birth_place)));
            binding.h0.setText(wa3Var.b("country_of_birth", context.getString(R.string.country_birth_ll)));
            binding.E.setHint(wa3Var.b("edit_dl_serv_selc_country", context.getString(R.string.select_country)));
            binding.Y.setText(wa3Var.b("education_qualification", context.getString(R.string.education_qualification)));
            binding.W.setText(wa3Var.b("blood_group", context.getString(R.string.blood_group)));
            binding.Z.setText(wa3Var.b("Email_id", context.getString(R.string.email_id)));
            binding.G.setHint(wa3Var.b("enter_email_id", context.getString(R.string.enter_email)));
            binding.e0.setText(wa3Var.b("edit_mobile_no", context.getString(R.string.mobile_number_txt)));
            binding.J.setHint(wa3Var.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_number_hint)));
            binding.S.setText(wa3Var.b("emergency_mobile_no", context.getString(R.string.emergency_mob_number_ll)));
            binding.y.setHint(wa3Var.b("enter_alt_mob_number", context.getString(R.string.enter_alt_mobile_number_hint)));
            binding.y.setHint(wa3Var.b("enter_alt_mob_number", context.getString(R.string.enter_alt_mobile_number_hint)));
            binding.y.setHint(wa3Var.b("enter_alt_mob_number", context.getString(R.string.enter_alt_mobile_number_hint)));
            binding.c0.setText(wa3Var.b("id_marks_ll", context.getString(R.string.id_marks_ll)));
            binding.d0.setText(wa3Var.b("ident_mark_2", context.getString(R.string.identification_mark_2)));
            binding.w.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void v1(Context context, rd binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            TextView textView = binding.o;
            va3.a aVar = va3.a;
            textView.setText(wa3Var.b(aVar.D0(), "Nearest Pollution Checking Centre"));
            binding.q.setText(wa3Var.b(aVar.E0(), "Nearest RTO"));
            binding.k.setText(wa3Var.b(aVar.B0(), "Nearest Fuel Pump"));
            binding.n.setText(wa3Var.b(aVar.C0(), "Nearest Hospital"));
            binding.p.setText(wa3Var.b(aVar.Y0(), "View map"));
            binding.r.setText(wa3Var.b(aVar.Y0(), "View map"));
            binding.l.setText(wa3Var.b(aVar.Y0(), "View map"));
            binding.m.setText(wa3Var.b(aVar.Y0(), "View map"));
            binding.j.g.setText(wa3Var.b("near_by", "Near By"));
        }

        public final void v2(Context context, lh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.r.setText(wa3Var.b("vehicle_service", context.getString(R.string.vehicle_service)));
            binding.s.setText(wa3Var.b("vehicle_number", context.getString(R.string.vehicle_number)));
            binding.q.setText(wa3Var.b("vehicle_number", context.getString(R.string.vehicle_number)));
            binding.j.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state)));
            binding.i.setText(wa3Var.b("label_dl_serv_rto", context.getString(R.string.rto)));
            binding.c.setText(wa3Var.b("issue_of_duplicate_rc", context.getString(R.string.issue_of_duplicate_rc)));
            binding.b.setText(wa3Var.b("change_of_address_in_rc", context.getString(R.string.change_of_address_in_rc)));
            binding.l.setText(wa3Var.b("label_transfer_ownership", context.getString(R.string.transfer_of_ownership)));
            binding.h.setText(wa3Var.b("label_rc_particular", context.getString(R.string.rc_particular)));
            binding.o.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
            binding.m.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            binding.d.setText(wa3Var.b("hypothecation_addition", context.getString(R.string.hypothecation_addition)));
            binding.f.setText(wa3Var.b("hypothecation_termination", context.getString(R.string.hypothecation_termination)));
            binding.e.setText(wa3Var.b("hypothecation_continuation", context.getString(R.string.hypothecation_continuation)));
            binding.g.setText(wa3Var.b("no_objection_certificate_noc", context.getString(R.string.no_objection_certificate_noc)));
        }

        public final void w(Context context, p9 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.D.setText(wa3Var.b("vehicle_class_training", context.getString(R.string.class_of_vehicle_for_which_training_taken)));
            binding.X.setHint(wa3Var.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            binding.Q.setText(wa3Var.b("state_school_list", context.getString(R.string.state_wise_driving_school)));
            binding.G.setHint(wa3Var.b("select_d_school", context.getString(R.string.select_d_school)));
            binding.L.setText(wa3Var.b("enrollment_no", context.getString(R.string.enrollment_no)));
            binding.K.setHint(wa3Var.b("enter_enrollement_no", context.getString(R.string.enter_enrollment_no)));
            binding.I.setText(wa3Var.b("enrollement_date", context.getString(R.string.enrollment_date)));
            binding.H.setHint(wa3Var.b("enter_enrollement_date", context.getString(R.string.enter_enrollment_date)));
            binding.C.setText(wa3Var.b("certificate_no", context.getString(R.string.certificate_no)));
            binding.B.setHint(wa3Var.b("enter_certificate_number", context.getString(R.string.enter_certificate_number)));
            binding.A.setText(wa3Var.b("certificate_date", context.getString(R.string.certificate_date)));
            binding.z.setHint(wa3Var.b("enter_certificate_date", context.getString(R.string.enter_certificate_date)));
            binding.U.setText(wa3Var.b("trained_from", context.getString(R.string.trained_from)));
            binding.T.setHint(wa3Var.b("enter_trained_from", context.getString(R.string.enter_trained_from)));
            binding.W.setText(wa3Var.b("trained_to", context.getString(R.string.trained_to)));
            binding.V.setHint(wa3Var.b("enter_trained_to", context.getString(R.string.enter_trained_to)));
            binding.N.setText(wa3Var.b("save_add_more", context.getString(R.string.save_add_more)));
            binding.O.setText(wa3Var.b("label_save", context.getString(R.string.save)));
            binding.y.setText(wa3Var.b("btn_go_back", context.getString(R.string.back)));
        }

        public final void w0(Context context, tq1 dl_Service_list) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dl_Service_list, "dl_Service_list");
            wa3 wa3Var = new wa3(context);
            dl_Service_list.z.setText(wa3Var.b("label_dl_serv_last_endor_state", context.getString(R.string.last_state)));
            dl_Service_list.y.setText(wa3Var.b("label_dl_serv_last_endor_rto", context.getString(R.string.last_rto)));
            dl_Service_list.B.setText(wa3Var.b("label_dl_serv_req_sub_state", context.getString(R.string.current_state)));
            dl_Service_list.C.setText(wa3Var.b("label_dl_serv_req_sub_rto", context.getString(R.string.current_rto)));
            dl_Service_list.D.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            dl_Service_list.E.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void w1(Context context, sd cl_one) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cl_one, "cl_one");
            wa3 wa3Var = new wa3(context);
            cl_one.k0.setText(wa3Var.b("label_dl_serv_state", "State") + " * ");
            cl_one.l0.setText(wa3Var.b("label_dl_serv_rto", "RTO Name") + " * ");
            cl_one.m0.setText(wa3Var.b("personal_details", context.getString(R.string.personal_details)));
            cl_one.V.setText(wa3Var.b("first_name", "First Name") + " * ");
            cl_one.B.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.enter_first_name)));
            cl_one.X.setText(wa3Var.b("middle_name", context.getString(R.string.middle_name)));
            cl_one.D.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            cl_one.W.setText(wa3Var.b("last_name", "Last Name"));
            cl_one.C.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            cl_one.i0.setText(wa3Var.b("relation", context.getString(R.string.relation)));
            cl_one.n0.setText(wa3Var.b("first_name", "First Name") + " * ");
            cl_one.o0.setHint(wa3Var.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.enter_first_name)));
            cl_one.r0.setText(wa3Var.b("middle_name", context.getString(R.string.middle_name)));
            cl_one.s0.setHint(wa3Var.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            cl_one.p0.setText(wa3Var.b("last_name", "Last Name"));
            cl_one.q0.setHint(wa3Var.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            cl_one.d0.setText(wa3Var.b("appl_gender", context.getString(R.string.gender)) + " * ");
            cl_one.N.setText(wa3Var.b("appl_male", context.getString(R.string.male)));
            cl_one.K.setText(wa3Var.b("appl_female", context.getString(R.string.female)));
            cl_one.T.setText(wa3Var.b("appl_trans", context.getString(R.string.transgender)));
            cl_one.a0.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob_txt)) + " * ");
            cl_one.Y.setText(wa3Var.b("birth_place", "Birth Place") + " * ");
            cl_one.j0.setText(wa3Var.b("appl_religion", "Religion") + " * ");
            cl_one.b0.setText(wa3Var.b("education_qualification", "Education Qualification") + " * ");
            cl_one.Z.setText(wa3Var.b("blood_group", "Blood Group") + " * ");
            cl_one.h0.setText(wa3Var.b("phone_number", context.getString(R.string.phone_number1)));
            cl_one.J.setHint(wa3Var.b("enter_phone_number", context.getString(R.string.enter_phone_no)));
            cl_one.c0.setText(wa3Var.b("Email_id", context.getString(R.string.email_id)));
            cl_one.F.setHint(wa3Var.b("enter_email_id", context.getString(R.string.enter_email)));
            cl_one.g0.setText(wa3Var.b("edit_mobile_no", "Mobile No.") + " * ");
            cl_one.I.setHint(wa3Var.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_number_hint)));
            cl_one.U.setText(wa3Var.b("alt_mob_number", context.getString(R.string.alt_mobile_no)));
            cl_one.A.setHint(wa3Var.b("enter_alt_mob_number", context.getString(R.string.enter_alt_mobile_number_hint)));
            cl_one.e0.setText(wa3Var.b("MARK_ONE", "Identification Mark 1"));
            cl_one.f0.setText(wa3Var.b("MARK_TWO", "Identification Mark 2"));
            cl_one.G.setHint(wa3Var.b("MARK_TWO", context.getString(R.string.enter_identification_mark_1)));
            cl_one.H.setHint(wa3Var.b("MARK_TWO", context.getString(R.string.enter_identification_mark_1)));
            cl_one.w.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void w2(Context context, dh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.o.setText(wa3Var.b("title_dl_serv_exist_addr", context.getString(R.string.existing_address)));
            binding.P.setText(wa3Var.b("label_dl_serv_valid_from", context.getString(R.string.valid_from)));
            binding.t.setText(wa3Var.b("title_dl_serv_new_curr_addr_detail", context.getString(R.string.new_current_address_details)));
            binding.L.setText(wa3Var.b("vahan_state", context.getString(R.string.state)));
            binding.k.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district)));
            binding.G.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.u.setText(wa3Var.b("title_dl_serv_new_perm_addr", context.getString(R.string.new_permanent_address_details)));
            binding.M.setText(wa3Var.b("vahan_state", context.getString(R.string.state)));
            binding.k.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district)));
            binding.G.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.S.setText(wa3Var.b("vehicle_no_dlyyxx0000", ""));
            binding.T.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.O.i.setText(wa3Var.b("change_of_address_in_rc2", context.getString(R.string.change_of_address_in_rc2)));
            binding.o.setText(wa3Var.b("existing_address", context.getString(R.string.existing_address)));
            binding.e.setText(wa3Var.b("current_address", context.getString(R.string.current_address)));
            binding.w.setText(wa3Var.b("permanent_address", context.getString(R.string.permanent_address)));
            binding.x.setText(wa3Var.b("permanent_address", context.getString(R.string.permanent_address)));
            binding.Q.setHint(wa3Var.b("select_date", context.getString(R.string.select_date)));
            binding.s.setText(wa3Var.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            binding.U.setText(wa3Var.b("village_town_city", context.getString(R.string.village_town_city)));
            binding.J.setText(wa3Var.b("same_as_current_address", context.getString(R.string.same_as_current_address)));
            binding.q.setText(wa3Var.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            binding.p.setText(wa3Var.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            binding.V.setText(wa3Var.b("village_town_city", "Village/Town/City"));
            binding.r.setText(wa3Var.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            binding.M.setText(wa3Var.b("vahan_state", context.getString(R.string.state)));
            binding.l.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district)));
            binding.H.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.N.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.I.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.I.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.I.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.I.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void x(Context context, c7 cl_coa) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cl_coa, "cl_coa");
            wa3 wa3Var = new wa3(context);
            cl_coa.C0.setText(wa3Var.b("view_cl_det", context.getString(R.string.view_cl_details)));
            cl_coa.m0.setText(wa3Var.b("title_dl_serv_exist_curr_addr", context.getString(R.string.existing_current_address)));
            cl_coa.n0.setText(wa3Var.b("title_dl_serv_exist_perm_addr", context.getString(R.string.existing_permanent_address)));
            cl_coa.w0.setText(wa3Var.b("label_dl_serv_state", "State") + " * ");
            cl_coa.y.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            cl_coa.k0.setText(wa3Var.b("label_dl_serv_district", "District") + " * ");
            cl_coa.x.setHint(wa3Var.b("edit_dl_serv_selc_district", context.getString(R.string.select_district)));
            cl_coa.A0.setText(wa3Var.b("label_dl_serv_block", "Taluka / Block") + " * ");
            cl_coa.w.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            cl_coa.i0.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.town)));
            cl_coa.L.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            cl_coa.o0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            cl_coa.K.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            cl_coa.y0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            cl_coa.O.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            cl_coa.q0.setText(wa3Var.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            cl_coa.M.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            cl_coa.u0.setText(wa3Var.b("label_dl_serv_pincode", "Pincode") + " * ");
            cl_coa.N.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            cl_coa.S.setText(wa3Var.b("title_dl_serv_new_curr_addr_detail", context.getString(R.string.new_current_address_details)));
            cl_coa.g0.setText(wa3Var.b("check_dl_serv_same_curr_addr", context.getString(R.string.same_as_curr_add)));
            cl_coa.t0.setText(wa3Var.b("title_dl_serv_new_perm_addr", context.getString(R.string.perm_add_det)));
            cl_coa.t0.setText(wa3Var.b("title_dl_serv_new_perm_addr", context.getString(R.string.perm_add_det)));
            cl_coa.x0.setText(wa3Var.b("label_dl_serv_state", "State") + " * ");
            cl_coa.F.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            cl_coa.l0.setText(wa3Var.b("label_dl_serv_district", "District") + " * ");
            cl_coa.E.setHint(wa3Var.b("edit_dl_serv_selc_district", context.getString(R.string.select_district)));
            cl_coa.B0.setText(wa3Var.b("label_dl_serv_block", "Taluka / Block") + " * ");
            cl_coa.D.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            cl_coa.I.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            cl_coa.H.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.taluka)));
            cl_coa.G.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            cl_coa.p0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            cl_coa.z.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            cl_coa.z0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            cl_coa.C.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            cl_coa.r0.setText(wa3Var.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            cl_coa.A.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            cl_coa.v0.setText(wa3Var.b("label_dl_serv_pincode", "Pincode") + " * ");
            cl_coa.B.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            cl_coa.h0.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.next)));
            cl_coa.s0.setText(wa3Var.b("current_add_details", context.getString(R.string.current_address_details)));
            cl_coa.D0.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            cl_coa.h0.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.next)));
        }

        public final void x0(Context context, ja dl_main_binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dl_main_binding, "dl_main_binding");
            wa3 wa3Var = new wa3(context);
            dl_main_binding.w.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            dl_main_binding.x.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            dl_main_binding.G.setText(wa3Var.b("title_dl_serv_go_aval", context.getString(R.string.go_for_available_services)));
            dl_main_binding.Q.setText(wa3Var.b("title_dl_services", context.getString(R.string.driving_license_services)));
            dl_main_binding.D.setText(wa3Var.b("lbl_dob", context.getString(R.string.date_of_birth)));
            dl_main_binding.O.setText(wa3Var.b("title_dl_serv_no", context.getString(R.string.driving_license_no)));
            dl_main_binding.y.setText(wa3Var.b("title_dl_serv_my_dl", context.getString(R.string.driving_license_services)));
            dl_main_binding.A.setText(wa3Var.b("title_dl_serv_enter_dl", context.getString(R.string.other_driving_license)));
            dl_main_binding.z.setText(wa3Var.b("title_dl_serv_enter_dl", context.getString(R.string.other_driving_license)));
            dl_main_binding.P.setText(wa3Var.b("label_note", context.getString(R.string.notes)));
            dl_main_binding.M.setText(wa3Var.b("dl_serv_note", context.getString(R.string.new_note)));
            dl_main_binding.H.setHint(wa3Var.b("title_dl_serv_enter_dl", context.getString(R.string.enter_driving_license_no)));
            dl_main_binding.F.setHint(wa3Var.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            dl_main_binding.B.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
            dl_main_binding.C.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void x1(Context context, wd clf) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(clf, "clf");
            wa3 wa3Var = new wa3(context);
            clf.V.setText(wa3Var.b("first_aid_Details", context.getString(R.string.first_aid_details)));
            clf.U.setText(wa3Var.b("fa_issuing_name", "FA Issuing Institution Name") + " * ");
            clf.C.setHint(wa3Var.b("enter_in", context.getString(R.string.institute_name)));
            clf.P.setText(wa3Var.b("certification_number", "Certification No.") + " * ");
            clf.y.setHint(wa3Var.b("enter_certification_no", context.getString(R.string.enter_certification_no)));
            clf.Y.setText(wa3Var.b("place_of_issued", "Place of Issued") + " * ");
            clf.E.setHint(wa3Var.b("enter_place_issue", context.getString(R.string.enter_place_of_issued)));
            clf.X.setText(wa3Var.b("issue_date", "Issue Date") + " * ");
            clf.b0.setText(wa3Var.b("is_it_perm", context.getString(R.string.is_it_permanent)));
            clf.K.setText(wa3Var.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            clf.F.setText(wa3Var.b("radio_dl_serv_no", context.getString(R.string.no)));
            clf.Z.setText(wa3Var.b("medical_fitt_details", context.getString(R.string.medical_fitness_details)));
            clf.W.setText(wa3Var.b("fitness_Cert_no", "Fitness Certificate No.") + " * ");
            clf.D.setHint(wa3Var.b("enter_fitness_certificate", context.getString(R.string.enter_fitness_cert_no)));
            clf.S.setText(wa3Var.b("doc_name", "Doctor Name") + " * ");
            clf.A.setHint(wa3Var.b("enter_doc_name", context.getString(R.string.enter_doc_name)));
            clf.T.setText(wa3Var.b("doctor_registeration", context.getString(R.string.doc_reg_no)));
            clf.B.setHint(wa3Var.b("enter_doc_reg_no", context.getString(R.string.reg_num_hint)));
            clf.Q.setText(wa3Var.b("clinic_name_place", "Clinic Name and Place") + " * ");
            clf.z.setHint(wa3Var.b("enter_clinic_np", context.getString(R.string.enter_clinic_name_place)));
            clf.a0.setText(wa3Var.b("issue_date", "Issue Date") + " * ");
            clf.L.setText(wa3Var.b("enter_issue_date", context.getString(R.string.enter_issue_date)));
            clf.R.setText(wa3Var.b("declaration", context.getString(R.string.declaration)));
            clf.c0.setText(wa3Var.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            clf.x.setText(wa3Var.b("cl_submit_dec", context.getString(R.string.cl_declaration)));
            clf.w.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void x2(Context context, ki0 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.o.setText(wa3Var.b("title_dl_serv_exist_addr", context.getString(R.string.existing_address)));
            binding.Q.setText(wa3Var.b("label_dl_serv_valid_from", context.getString(R.string.valid_from)));
            binding.t.setText(wa3Var.b("title_dl_serv_new_curr_addr_detail", context.getString(R.string.new_current_address_details)));
            binding.L.setText(wa3Var.b("vahan_state", context.getString(R.string.state)));
            binding.k.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district)));
            binding.G.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.u.setText(wa3Var.b("title_dl_serv_new_perm_addr", context.getString(R.string.new_permanent_address_details)));
            binding.M.setText(wa3Var.b("vahan_state", context.getString(R.string.state)));
            binding.k.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district)));
            binding.G.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.T.setText(wa3Var.b("vehicle_no_dlyyxx0000", ""));
            binding.U.setText(wa3Var.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            binding.P.i.setText(wa3Var.b("change_of_address_in_rc2", context.getString(R.string.change_of_address_in_rc2)));
            binding.o.setText(wa3Var.b("existing_address", context.getString(R.string.existing_address)));
            binding.e.setText(wa3Var.b("current_address", context.getString(R.string.current_address)));
            binding.w.setText(wa3Var.b("permanent_address", context.getString(R.string.permanent_address)));
            binding.x.setText(wa3Var.b("permanent_address", context.getString(R.string.permanent_address)));
            binding.R.setHint(wa3Var.b("select_date", context.getString(R.string.select_date)));
            binding.s.setText(wa3Var.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            binding.V.setText(wa3Var.b("village_town_city", context.getString(R.string.village_town_city)));
            binding.J.setText(wa3Var.b("same_as_current_address", context.getString(R.string.same_as_current_address)));
            binding.q.setText(wa3Var.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            binding.p.setText(wa3Var.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            binding.W.setText(wa3Var.b("village_town_city", "Village/Town/City"));
            binding.r.setText(wa3Var.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            binding.M.setText(wa3Var.b("vahan_state", context.getString(R.string.state)));
            binding.l.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district)));
            binding.H.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            binding.O.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
            binding.I.g.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
            binding.I.d.setText(wa3Var.b("logo_dl_fee_details", "Fee Details"));
            binding.I.c.setText(wa3Var.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            binding.I.f.setText(wa3Var.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void y(Context context, a7 dl_coa) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dl_coa, "dl_coa");
            wa3 wa3Var = new wa3(context);
            dl_coa.n0.b.setText(wa3Var.b("logo_dl_details", context.getString(R.string.dl_det)));
            dl_coa.n0.c.setText(wa3Var.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            dl_coa.n0.g.setText(wa3Var.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            dl_coa.n0.d.setText(wa3Var.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            dl_coa.n0.f.setText(wa3Var.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            dl_coa.P0.setText(wa3Var.b("label_app_category", context.getString(R.string.app_category)));
            dl_coa.Q0.setText(wa3Var.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            dl_coa.w0.setText(wa3Var.b("title_dl_serv_exist_addr", context.getString(R.string.existing_address)));
            dl_coa.x0.setText(wa3Var.b("title_dl_serv_exist_curr_addr", context.getString(R.string.existing_current_address)));
            dl_coa.y0.setText(wa3Var.b("title_dl_serv_exist_perm_addr", context.getString(R.string.existing_permanent_address)));
            dl_coa.I0.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state_coa)));
            dl_coa.y.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            dl_coa.u0.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district_coa)));
            dl_coa.x.setHint(wa3Var.b("edit_dl_serv_selc_district", context.getString(R.string.select_district)));
            dl_coa.M0.setText(wa3Var.b("label_dl_serv_block", context.getString(R.string.taluka_block)));
            dl_coa.w.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            dl_coa.t0.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.town)));
            dl_coa.M.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            dl_coa.z0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            dl_coa.L.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            dl_coa.K0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            dl_coa.P.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            dl_coa.B0.setText(wa3Var.b("label_loc_mark", context.getString(R.string.landmark_coa)));
            dl_coa.N.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            dl_coa.G0.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode_coa)));
            dl_coa.O.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            dl_coa.W.setText(wa3Var.b("title_dl_serv_new_curr_addr_detail", context.getString(R.string.new_current_address_details)));
            dl_coa.p0.setText(wa3Var.b("check_dl_serv_same_curr_addr", context.getString(R.string.same_as_curr_add)));
            dl_coa.E0.setText(wa3Var.b("title_dl_serv_new_perm_addr", context.getString(R.string.perm_add_det)));
            dl_coa.E0.setText(wa3Var.b("title_dl_serv_new_perm_addr", context.getString(R.string.perm_add_det)));
            dl_coa.J0.setText(wa3Var.b("label_dl_serv_state", context.getString(R.string.state_coa)));
            dl_coa.G.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            dl_coa.v0.setText(wa3Var.b("label_dl_serv_district", context.getString(R.string.district_coa)));
            dl_coa.F.setHint(wa3Var.b("edit_dl_serv_selc_district", context.getString(R.string.select_district)));
            dl_coa.N0.setText(wa3Var.b("label_dl_serv_block", context.getString(R.string.taluka_block)));
            dl_coa.E.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            dl_coa.J.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            dl_coa.I.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.taluka)));
            dl_coa.H.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            dl_coa.A0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            dl_coa.A.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            dl_coa.L0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            dl_coa.D.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            dl_coa.C0.setText(wa3Var.b("label_loc_mark", context.getString(R.string.landmark_coa)));
            dl_coa.B.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            dl_coa.H0.setText(wa3Var.b("label_dl_serv_pincode", context.getString(R.string.pincode_coa)));
            dl_coa.C.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            dl_coa.s0.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.next)));
            dl_coa.D0.setText(wa3Var.b("current_add_details", context.getString(R.string.current_address_details)));
            dl_coa.R0.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
        }

        public final void y0(Context context, k9 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.T.setText(wa3Var.b("v_d_l_c", context.getString(R.string.v_d_l_c)));
            binding.e.setText(wa3Var.b("label_search", context.getString(R.string.search)));
            binding.y.setText(wa3Var.b("rc_dashboard", "RC Dashboard"));
            binding.x.setText(wa3Var.b("dl_dashboard", "DL Dashboard"));
            binding.k.setText(wa3Var.b("dl_number", "DL Number"));
            binding.q.setHint(wa3Var.b("label_challan_enter_dl_no", "Enter Driving Licence No"));
            binding.m.setText(wa3Var.b("lbl_dob", "Date of Birth"));
            binding.N.setText(wa3Var.b("label_search", "Search"));
            binding.r.setText(wa3Var.b("holder_name", context.getString(R.string.owner_name_for_dl)));
            binding.d0.setText(wa3Var.b("vehicle_class", context.getString(R.string.vehicle_class)));
            binding.t.setText(wa3Var.b("issue_date", context.getString(R.string.issue_date)));
            binding.z.setText(wa3Var.b("makerTitle", context.getString(R.string.valid_upto_v3)));
            binding.L.setText(wa3Var.b("registeringAuthTitle", context.getString(R.string.registering_auth_l)));
            binding.K.setText(wa3Var.b("registeringAuthTitle", context.getString(R.string.rto_code_l)));
            binding.O.setText(wa3Var.b("registeringAuthTitle", context.getString(R.string.driving_licence_tap_text)));
            binding.b.setText(wa3Var.b("add_to_dash", context.getString(R.string.add_to_dl)));
            binding.d.setText(wa3Var.b("label_view_challan", context.getString(R.string.view_challan)));
            binding.P.setText(wa3Var.b("tr_valid", context.getString(R.string.view_challan)));
            binding.S.setText(wa3Var.b("not_create_v_dl", context.getString(R.string.v_r_d_not)));
            binding.V.setText(wa3Var.b("not_create_v_dl", context.getString(R.string.v_dl11)));
            binding.H.setText(wa3Var.b("recent_search", context.getString(R.string.recent_search)));
            binding.U.setText(wa3Var.b("clear_all", context.getString(R.string.clear_all)));
        }

        public final void y1(Context context, yd cl_coa) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cl_coa, "cl_coa");
            wa3 wa3Var = new wa3(context);
            cl_coa.k0.setText(wa3Var.b("title_dl_serv_exist_curr_addr", context.getString(R.string.existing_current_address)));
            cl_coa.l0.setText(wa3Var.b("title_dl_serv_exist_perm_addr", context.getString(R.string.existing_permanent_address)));
            cl_coa.u0.setText(wa3Var.b("label_dl_serv_state", "State") + " * ");
            cl_coa.y.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            cl_coa.i0.setText(wa3Var.b("label_dl_serv_district", "District") + " * ");
            cl_coa.x.setHint(wa3Var.b("edit_dl_serv_selc_district", context.getString(R.string.select_district)));
            cl_coa.y0.setText(wa3Var.b("label_dl_serv_block", "Taluka / Block") + " * ");
            cl_coa.w.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            cl_coa.h0.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.town)));
            cl_coa.L.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            cl_coa.m0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            cl_coa.K.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            cl_coa.w0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            cl_coa.O.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            cl_coa.o0.setText(wa3Var.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            cl_coa.M.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            cl_coa.s0.setText(wa3Var.b("label_dl_serv_pincode", "Pincode") + " * ");
            cl_coa.N.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            cl_coa.S.setText(wa3Var.b("title_dl_serv_new_curr_addr_detail", context.getString(R.string.new_current_address_details)));
            cl_coa.f0.setText(wa3Var.b("check_dl_serv_same_curr_addr", context.getString(R.string.same_as_curr_add)));
            cl_coa.r0.setText(wa3Var.b("title_dl_serv_new_perm_addr", context.getString(R.string.perm_add_det)));
            cl_coa.r0.setText(wa3Var.b("title_dl_serv_new_perm_addr", context.getString(R.string.perm_add_det)));
            cl_coa.v0.setText(wa3Var.b("label_dl_serv_state", "State") + " * ");
            cl_coa.F.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            cl_coa.j0.setText(wa3Var.b("label_dl_serv_district", "District") + " * ");
            cl_coa.E.setHint(wa3Var.b("edit_dl_serv_selc_district", context.getString(R.string.select_district)));
            cl_coa.z0.setText(wa3Var.b("label_dl_serv_block", "Taluka / Block") + " * ");
            cl_coa.D.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            cl_coa.I.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            cl_coa.H.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.taluka)));
            cl_coa.G.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            cl_coa.n0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            cl_coa.z.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            cl_coa.x0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            cl_coa.C.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            cl_coa.p0.setText(wa3Var.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            cl_coa.A.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            cl_coa.t0.setText(wa3Var.b("label_dl_serv_pincode", "Pincode") + " * ");
            cl_coa.B.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            cl_coa.g0.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.next)));
            cl_coa.q0.setText(wa3Var.b("current_add_details", context.getString(R.string.current_address_details)));
            cl_coa.A0.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            cl_coa.g0.setText(wa3Var.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void y2(Context context, e7 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.b.setText(wa3Var.b("change_of_address_in_rc", context.getString(R.string.change_of_address_in_rc)));
            binding.c.setText(wa3Var.b("btn_ok", context.getString(R.string.text_ok)));
        }

        public final void z(Context context, u6 ll_coa) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ll_coa, "ll_coa");
            wa3 wa3Var = new wa3(context);
            ll_coa.C0.setText(wa3Var.b("view_ll", context.getString(R.string.view_ll_details)));
            ll_coa.m0.setText(wa3Var.b("title_dl_serv_exist_curr_addr", context.getString(R.string.existing_current_address)));
            ll_coa.n0.setText(wa3Var.b("title_dl_serv_exist_perm_addr", context.getString(R.string.existing_permanent_address)));
            ll_coa.w0.setText(wa3Var.b("label_dl_serv_state", "State") + " * ");
            ll_coa.y.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            ll_coa.k0.setText(wa3Var.b("label_dl_serv_district", "District") + " * ");
            ll_coa.x.setHint(wa3Var.b("edit_dl_serv_selc_district", context.getString(R.string.select_district)));
            ll_coa.A0.setText(wa3Var.b("label_dl_serv_block", "Taluka / Block") + " * ");
            ll_coa.w.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            ll_coa.i0.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.town)));
            ll_coa.L.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            ll_coa.o0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            ll_coa.K.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            ll_coa.y0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            ll_coa.O.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            ll_coa.q0.setText(wa3Var.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            ll_coa.M.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            ll_coa.u0.setText(wa3Var.b("label_dl_serv_pincode", "Pincode") + " * ");
            ll_coa.N.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            ll_coa.S.setText(wa3Var.b("title_dl_serv_new_curr_addr_detail", context.getString(R.string.new_current_address_details)));
            ll_coa.g0.setText(wa3Var.b("check_dl_serv_same_curr_addr", context.getString(R.string.same_as_curr_add)));
            ll_coa.t0.setText(wa3Var.b("title_dl_serv_new_perm_addr", context.getString(R.string.perm_add_det)));
            ll_coa.t0.setText(wa3Var.b("title_dl_serv_new_perm_addr", context.getString(R.string.perm_add_det)));
            ll_coa.x0.setText(wa3Var.b("label_dl_serv_state", "State") + " * ");
            ll_coa.F.setHint(wa3Var.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            ll_coa.l0.setText(wa3Var.b("label_dl_serv_district", "District") + " * ");
            ll_coa.E.setHint(wa3Var.b("edit_dl_serv_selc_district", context.getString(R.string.select_district)));
            ll_coa.B0.setText(wa3Var.b("label_dl_serv_block", "Taluka / Block") + " * ");
            ll_coa.D.setHint(wa3Var.b("edit_dl_serv_selc_block", context.getString(R.string.select_taluka)));
            ll_coa.I.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            ll_coa.H.setText(wa3Var.b("radio_dl_serv_town", context.getString(R.string.taluka)));
            ll_coa.G.setHint(wa3Var.b("edit_dl_serv_selc_town", context.getString(R.string.select_v_t)));
            ll_coa.p0.setText(wa3Var.b("label_house_flat_door", context.getString(R.string.house_door_flatno)));
            ll_coa.z.setHint(wa3Var.b("edit_dl_serv_hous_door_flat", context.getString(R.string.enter_h_d_f)));
            ll_coa.z0.setText(wa3Var.b("label_street_loc_ps", context.getString(R.string.street_local_ps)));
            ll_coa.C.setHint(wa3Var.b("edit_dl_serv_stree_loca_polic", context.getString(R.string.enter_s_l_p)));
            ll_coa.r0.setText(wa3Var.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            ll_coa.A.setHint(wa3Var.b("edit_dl_serv_enter_landmark", context.getString(R.string.enter_landmark)));
            ll_coa.v0.setText(wa3Var.b("label_dl_serv_pincode", "Pincode") + " * ");
            ll_coa.B.setHint(wa3Var.b("edit_dl_serv_enter_pincode", context.getString(R.string.enter_pincode)));
            ll_coa.h0.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.next)));
            ll_coa.s0.setText(wa3Var.b("current_add_details", context.getString(R.string.current_address_details)));
            ll_coa.D0.setText(wa3Var.b("radio_dl_serv_village", context.getString(R.string.village)));
            ll_coa.h0.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.next)));
        }

        public final void z0(Context context, ls1 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.W.setText(wa3Var.b("v_d_l_c", context.getString(R.string.dr_lic_alert)));
            binding.h.setText(wa3Var.b("virtual_dl", context.getString(R.string.virtual_dl)));
            binding.P.setText(wa3Var.b("label_challan_state", context.getString(R.string.state)));
            binding.s.setText(wa3Var.b("last_update", context.getString(R.string.last_update)));
            binding.n.setText(wa3Var.b("label_challan_owner_name", context.getString(R.string.owner_name)));
            binding.I.setText(wa3Var.b("label_sdf", context.getString(R.string.relation)));
            binding.B.setText(wa3Var.b("label_dl_serv_present_addr", context.getString(R.string.present_address)));
            binding.z.setText(wa3Var.b("permanent_address", context.getString(R.string.permanent_address)));
            binding.q.setText(wa3Var.b("issue_date", context.getString(R.string.issue_date)));
            binding.e.setText(wa3Var.b("dl_number", context.getString(R.string.dl_no)));
            binding.Y.setText(wa3Var.b("valid_till", context.getString(R.string.valid_till)));
            binding.S.setText(wa3Var.b("valid_till_trans", context.getString(R.string.transport_validity_)));
            binding.i.setText(wa3Var.b("lbl_dob", context.getString(R.string.dob)));
            binding.b.setText(wa3Var.b("blood_group", context.getString(R.string.blood_group)));
            binding.L.setText(wa3Var.b("registering_auth_title", context.getString(R.string.rto_code_l)));
            binding.a0.setText(wa3Var.b("vehicle_class", context.getString(R.string.vehicle_class)));
            binding.M.setText(wa3Var.b("registeringAuthTitle", context.getString(R.string.registering_auth_l)));
            binding.p.setText(wa3Var.b("tap_to_check", context.getString(R.string.driving_licence_tap_text)));
            binding.c0.setText(wa3Var.b("driving_licence_impound", context.getString(R.string.driving_licence_impound)));
            binding.G.setText(wa3Var.b("recent_challan", context.getString(R.string.recent_challan_details)));
            binding.w.setText(wa3Var.b("label_no_challan_found", context.getString(R.string.no_challan_found)));
            binding.U.setText(wa3Var.b("label_no_challan_found", context.getString(R.string.dl_note)));
            binding.R.setText(wa3Var.b("tap_notify", context.getString(R.string.tap_notify)));
            binding.m.setText(wa3Var.b("holder_name", "DL Number Holder Name"));
        }

        public final void z1(Context context, ae binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.z.setText(wa3Var.b("create_a_virtual_dl", context.getString(R.string.create_a_virtual_dl)));
            binding.u.setText(wa3Var.b("dl_number", context.getString(R.string.dl_no)));
            binding.i.setHint(wa3Var.b("title_dl_serv_enter_dl", context.getString(R.string.other_driving_license)));
            binding.v.setText(wa3Var.b("lbl_dob", context.getString(R.string.date_of_birth)));
            binding.s.setText(wa3Var.b("addMyDl", "Add My Driving Licence"));
            binding.x.setText(wa3Var.b("My_Virtual_DL", context.getString(R.string.my_virtual_dl)));
            binding.y.setText(wa3Var.b("dl_number", context.getString(R.string.dl_no)));
            binding.A.setText(wa3Var.b("view_virtual_dl", context.getString(R.string.view_virtual_dl)));
            binding.t.setText(wa3Var.b("view_alert", context.getString(R.string.alert)));
            binding.A.setText(wa3Var.b(va3.a.G(), context.getString(R.string.view_virtual_dl)));
        }

        public final void z2(Context context, ql6 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            wa3 wa3Var = new wa3(context);
            binding.b.setText(wa3Var.b("change_of_address_in_rc", context.getString(R.string.change_of_address_in_rc)));
            binding.e.setText(wa3Var.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
        }
    }
}
