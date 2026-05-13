package com.nic.mparivahan;

import android.util.SparseIntArray;
import android.view.View;
import com.zepto.a8;
import com.zepto.aa;
import com.zepto.ab;
import com.zepto.ac;
import com.zepto.b7;
import com.zepto.b9;
import com.zepto.c56;
import com.zepto.ca;
import com.zepto.cd;
import com.zepto.ce;
import com.zepto.cm3;
import com.zepto.d7;
import com.zepto.d8;
import com.zepto.d9;
import com.zepto.dc;
import com.zepto.ea;
import com.zepto.ed;
import com.zepto.ee;
import com.zepto.f8;
import com.zepto.f9;
import com.zepto.ff;
import com.zepto.fg;
import com.zepto.fx;
import com.zepto.ga;
import com.zepto.gd;
import com.zepto.h8;
import com.zepto.h9;
import com.zepto.hc;
import com.zepto.ia;
import com.zepto.ib;
import com.zepto.id;
import com.zepto.id1;
import com.zepto.j8;
import com.zepto.j9;
import com.zepto.jd1;
import com.zepto.ka;
import com.zepto.kb;
import com.zepto.kc;
import com.zepto.kg;
import com.zepto.l7;
import com.zepto.ld;
import com.zepto.lq7;
import com.zepto.m9;
import com.zepto.ma;
import com.zepto.mg;
import com.zepto.n7;
import com.zepto.ne6;
import com.zepto.o9;
import com.zepto.oa;
import com.zepto.ob;
import com.zepto.oc;
import com.zepto.p7;
import com.zepto.p8;
import com.zepto.pe1;
import com.zepto.q9;
import com.zepto.qa;
import com.zepto.qc;
import com.zepto.qe;
import com.zepto.qh;
import com.zepto.qq1;
import com.zepto.r7;
import com.zepto.rd6;
import com.zepto.rz1;
import com.zepto.s9;
import com.zepto.sa;
import com.zepto.sb;
import com.zepto.sc;
import com.zepto.se;
import com.zepto.t7;
import com.zepto.t8;
import com.zepto.td;
import com.zepto.u9;
import com.zepto.ua;
import com.zepto.ub;
import com.zepto.uc;
import com.zepto.uf;
import com.zepto.v6;
import com.zepto.v8;
import com.zepto.vd;
import com.zepto.vg;
import com.zepto.vu3;
import com.zepto.w7;
import com.zepto.w9;
import com.zepto.wa;
import com.zepto.wb;
import com.zepto.wc;
import com.zepto.x6;
import com.zepto.xd;
import com.zepto.xg;
import com.zepto.y7;
import com.zepto.y9;
import com.zepto.ya;
import com.zepto.yc;
import com.zepto.z23;
import com.zepto.z6;
import com.zepto.z8;
import com.zepto.zd;
import com.zepto.ze;
import com.zepto.zg;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends id1 {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(96);
        a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_change_address_ll, 1);
        sparseIntArray.put(R.layout.activity_change_name_cl, 2);
        sparseIntArray.put(R.layout.activity_change_name_ll, 3);
        sparseIntArray.put(R.layout.activity_change_of_address, 4);
        sparseIntArray.put(R.layout.activity_change_of_address_cl, 5);
        sparseIntArray.put(R.layout.activity_cl_confirm_mob_no, 6);
        sparseIntArray.put(R.layout.activity_cl_details, 7);
        sparseIntArray.put(R.layout.activity_cl_details_top, 8);
        sparseIntArray.put(R.layout.activity_cl_documents_upload, 9);
        sparseIntArray.put(R.layout.activity_cl_fee_payment, 10);
        sparseIntArray.put(R.layout.activity_cl_mobile_update, 11);
        sparseIntArray.put(R.layout.activity_cl_otpmobile, 12);
        sparseIntArray.put(R.layout.activity_cl_photo_signature, 13);
        sparseIntArray.put(R.layout.activity_cl_services_ms, 14);
        sparseIntArray.put(R.layout.activity_cl_slots_acknow, 15);
        sparseIntArray.put(R.layout.activity_cl_sots, 16);
        sparseIntArray.put(R.layout.activity_cl_submit_screen, 17);
        sparseIntArray.put(R.layout.activity_confirm_mob_no, 18);
        sparseIntArray.put(R.layout.activity_cov_details, 19);
        sparseIntArray.put(R.layout.activity_cov_list, 20);
        sparseIntArray.put(R.layout.activity_delete_account, 21);
        sparseIntArray.put(R.layout.activity_dl_acknowled_slip, 22);
        sparseIntArray.put(R.layout.activity_dl_address_details, 23);
        sparseIntArray.put(R.layout.activity_dl_app, 24);
        sparseIntArray.put(R.layout.activity_dl_application_screen, 25);
        sparseIntArray.put(R.layout.activity_dl_cov, 26);
        sparseIntArray.put(R.layout.activity_dl_details, 27);
        sparseIntArray.put(R.layout.activity_dl_doc_upload, 28);
        sparseIntArray.put(R.layout.activity_dl_driving_school, 29);
        sparseIntArray.put(R.layout.activity_dl_extract, 30);
        sparseIntArray.put(R.layout.activity_dl_fee_payment, 31);
        sparseIntArray.put(R.layout.activity_dl_mob_update_otp, 32);
        sparseIntArray.put(R.layout.activity_dl_personal_details, 33);
        sparseIntArray.put(R.layout.activity_dl_photo_sign, 34);
        sparseIntArray.put(R.layout.activity_dl_renewal, 35);
        sparseIntArray.put(R.layout.activity_dl_renewal_fee_payment, 36);
        sparseIntArray.put(R.layout.activity_dl_renewal_slots, 37);
        sparseIntArray.put(R.layout.activity_dl_replacement, 38);
        sparseIntArray.put(R.layout.activity_dl_servcies_main_view_screen, 39);
        sparseIntArray.put(R.layout.activity_dl_service_acknow, 40);
        sparseIntArray.put(R.layout.activity_dl_slots, 41);
        sparseIntArray.put(R.layout.activity_dl_slots_acknow, 42);
        sparseIntArray.put(R.layout.activity_dl_slots_next, 43);
        sparseIntArray.put(R.layout.activity_dl_status_details, 44);
        sparseIntArray.put(R.layout.activity_dl_status_documents, 45);
        sparseIntArray.put(R.layout.activity_dl_status_photo_sign, 46);
        sparseIntArray.put(R.layout.activity_dl_submit_request_success, 47);
        sparseIntArray.put(R.layout.activity_duplicate_cl, 48);
        sparseIntArray.put(R.layout.activity_duplicate_dl, 49);
        sparseIntArray.put(R.layout.activity_duplicate_ll, 50);
        sparseIntArray.put(R.layout.activity_edit_app_personal_details, 51);
        sparseIntArray.put(R.layout.activity_edit_appl_address, 52);
        sparseIntArray.put(R.layout.activity_edit_learner_appl, 53);
        sparseIntArray.put(R.layout.activity_hill_religion, 54);
        sparseIntArray.put(R.layout.activity_issue_international_permit, 55);
        sparseIntArray.put(R.layout.activity_learner_download, 56);
        sparseIntArray.put(R.layout.activity_learner_licence_address, 57);
        sparseIntArray.put(R.layout.activity_ll, 58);
        sparseIntArray.put(R.layout.activity_ll_application_number, 59);
        sparseIntArray.put(R.layout.activity_ll_appointment, 60);
        sparseIntArray.put(R.layout.activity_ll_confirm_mob_no, 61);
        sparseIntArray.put(R.layout.activity_ll_details, 62);
        sparseIntArray.put(R.layout.activity_ll_document_upload, 63);
        sparseIntArray.put(R.layout.activity_ll_mobile_update, 64);
        sparseIntArray.put(R.layout.activity_ll_otp_mobile, 65);
        sparseIntArray.put(R.layout.activity_ll_payment, 66);
        sparseIntArray.put(R.layout.activity_ll_photo_signature, 67);
        sparseIntArray.put(R.layout.activity_ll_stolts_ack, 68);
        sparseIntArray.put(R.layout.activity_new_cl_one, 69);
        sparseIntArray.put(R.layout.activity_new_cl_submit_screen, 70);
        sparseIntArray.put(R.layout.activity_new_cl_three, 71);
        sparseIntArray.put(R.layout.activity_new_cl_two, 72);
        sparseIntArray.put(R.layout.activity_new_learner_personal_details, 73);
        sparseIntArray.put(R.layout.activity_new_learner_training, 74);
        sparseIntArray.put(R.layout.activity_pdf, 75);
        sparseIntArray.put(R.layout.activity_pdfview_internal_acitvity, 76);
        sparseIntArray.put(R.layout.activity_renewal_cl, 77);
        sparseIntArray.put(R.layout.activity_reprint, 78);
        sparseIntArray.put(R.layout.activity_sarathi_mobile_update, 79);
        sparseIntArray.put(R.layout.activity_select_cl_service, 80);
        sparseIntArray.put(R.layout.activity_sp_basic_details, 81);
        sparseIntArray.put(R.layout.activity_sp_details, 82);
        sparseIntArray.put(R.layout.activity_transfer_permit, 83);
        sparseIntArray.put(R.layout.activity_transfer_permit_details, 84);
        sparseIntArray.put(R.layout.activity_user_adhar_details, 85);
        sparseIntArray.put(R.layout.activity_verify_notice_payment_response, 86);
        sparseIntArray.put(R.layout.application_submitted, 87);
        sparseIntArray.put(R.layout.declaration_form, 88);
        sparseIntArray.put(R.layout.dl_service_view_details, 89);
        sparseIntArray.put(R.layout.edit_appl_selected_cov_details, 90);
        sparseIntArray.put(R.layout.items_dl_renewal_doc, 91);
        sparseIntArray.put(R.layout.ll_test_activity, 92);
        sparseIntArray.put(R.layout.mislinessfeepayment, 93);
        sparseIntArray.put(R.layout.sp_permit_details, 94);
        sparseIntArray.put(R.layout.taxpaymentscreen, 95);
        sparseIntArray.put(R.layout.test_photo, 96);
    }

    @Override // com.zepto.id1
    public List a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new io.github.glailton.expandabletextview.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // com.zepto.id1
    public lq7 b(jd1 jd1Var, View view, int i) {
        int i2 = a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i3 = (i2 - 1) / 50;
        if (i3 == 0) {
            return d(jd1Var, view, i2, tag);
        }
        if (i3 != 1) {
            return null;
        }
        return e(jd1Var, view, i2, tag);
    }

    @Override // com.zepto.id1
    public lq7 c(jd1 jd1Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public final lq7 d(jd1 jd1Var, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/activity_change_address_ll_0".equals(obj)) {
                    return new v6(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_change_address_ll is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_change_name_cl_0".equals(obj)) {
                    return new x6(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_change_name_cl is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_change_name_ll_0".equals(obj)) {
                    return new z6(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_change_name_ll is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_change_of_address_0".equals(obj)) {
                    return new b7(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_change_of_address is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_change_of_address_cl_0".equals(obj)) {
                    return new d7(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_change_of_address_cl is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_cl_confirm_mob_no_0".equals(obj)) {
                    return new l7(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_confirm_mob_no is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_cl_details_0".equals(obj)) {
                    return new n7(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_details is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_cl_details_top_0".equals(obj)) {
                    return new p7(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_details_top is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_cl_documents_upload_0".equals(obj)) {
                    return new r7(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_documents_upload is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_cl_fee_payment_0".equals(obj)) {
                    return new t7(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_fee_payment is invalid. Received: " + obj);
            case 11:
                if ("layout/activity_cl_mobile_update_0".equals(obj)) {
                    return new w7(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_mobile_update is invalid. Received: " + obj);
            case 12:
                if ("layout/activity_cl_otpmobile_0".equals(obj)) {
                    return new y7(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_otpmobile is invalid. Received: " + obj);
            case 13:
                if ("layout/activity_cl_photo_signature_0".equals(obj)) {
                    return new a8(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_photo_signature is invalid. Received: " + obj);
            case 14:
                if ("layout/activity_cl_services_ms_0".equals(obj)) {
                    return new d8(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_services_ms is invalid. Received: " + obj);
            case 15:
                if ("layout/activity_cl_slots_acknow_0".equals(obj)) {
                    return new f8(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_slots_acknow is invalid. Received: " + obj);
            case 16:
                if ("layout/activity_cl_sots_0".equals(obj)) {
                    return new h8(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_sots is invalid. Received: " + obj);
            case 17:
                if ("layout/activity_cl_submit_screen_0".equals(obj)) {
                    return new j8(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_submit_screen is invalid. Received: " + obj);
            case 18:
                if ("layout/activity_confirm_mob_no_0".equals(obj)) {
                    return new p8(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_confirm_mob_no is invalid. Received: " + obj);
            case 19:
                if ("layout/activity_cov_details_0".equals(obj)) {
                    return new t8(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cov_details is invalid. Received: " + obj);
            case 20:
                if ("layout/activity_cov_list_0".equals(obj)) {
                    return new v8(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_cov_list is invalid. Received: " + obj);
            case 21:
                if ("layout/activity_delete_account_0".equals(obj)) {
                    return new z8(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_delete_account is invalid. Received: " + obj);
            case 22:
                if ("layout/activity_dl_acknowled_slip_0".equals(obj)) {
                    return new b9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_acknowled_slip is invalid. Received: " + obj);
            case 23:
                if ("layout/activity_dl_address_details_0".equals(obj)) {
                    return new d9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_address_details is invalid. Received: " + obj);
            case 24:
                if ("layout/activity_dl_app_0".equals(obj)) {
                    return new f9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_app is invalid. Received: " + obj);
            case 25:
                if ("layout/activity_dl_application_screen_0".equals(obj)) {
                    return new h9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_application_screen is invalid. Received: " + obj);
            case 26:
                if ("layout/activity_dl_cov_0".equals(obj)) {
                    return new j9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_cov is invalid. Received: " + obj);
            case 27:
                if ("layout/activity_dl_details_0".equals(obj)) {
                    return new m9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_details is invalid. Received: " + obj);
            case 28:
                if ("layout/activity_dl_doc_upload_0".equals(obj)) {
                    return new o9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_doc_upload is invalid. Received: " + obj);
            case 29:
                if ("layout/activity_dl_driving_school_0".equals(obj)) {
                    return new q9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_driving_school is invalid. Received: " + obj);
            case 30:
                if ("layout/activity_dl_extract_0".equals(obj)) {
                    return new s9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_extract is invalid. Received: " + obj);
            case 31:
                if ("layout/activity_dl_fee_payment_0".equals(obj)) {
                    return new u9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_fee_payment is invalid. Received: " + obj);
            case 32:
                if ("layout/activity_dl_mob_update_otp_0".equals(obj)) {
                    return new w9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_mob_update_otp is invalid. Received: " + obj);
            case 33:
                if ("layout/activity_dl_personal_details_0".equals(obj)) {
                    return new y9(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_personal_details is invalid. Received: " + obj);
            case 34:
                if ("layout/activity_dl_photo_sign_0".equals(obj)) {
                    return new aa(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_photo_sign is invalid. Received: " + obj);
            case 35:
                if ("layout/activity_dl_renewal_0".equals(obj)) {
                    return new ca(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_renewal is invalid. Received: " + obj);
            case 36:
                if ("layout/activity_dl_renewal_fee_payment_0".equals(obj)) {
                    return new ea(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_renewal_fee_payment is invalid. Received: " + obj);
            case 37:
                if ("layout/activity_dl_renewal_slots_0".equals(obj)) {
                    return new ga(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_renewal_slots is invalid. Received: " + obj);
            case 38:
                if ("layout/activity_dl_replacement_0".equals(obj)) {
                    return new ia(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_replacement is invalid. Received: " + obj);
            case 39:
                if ("layout/activity_dl_servcies_main_view_screen_0".equals(obj)) {
                    return new ka(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_servcies_main_view_screen is invalid. Received: " + obj);
            case 40:
                if ("layout/activity_dl_service_acknow_0".equals(obj)) {
                    return new ma(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_service_acknow is invalid. Received: " + obj);
            case 41:
                if ("layout/activity_dl_slots_0".equals(obj)) {
                    return new qa(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_slots is invalid. Received: " + obj);
            case 42:
                if ("layout/activity_dl_slots_acknow_0".equals(obj)) {
                    return new oa(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_slots_acknow is invalid. Received: " + obj);
            case 43:
                if ("layout/activity_dl_slots_next_0".equals(obj)) {
                    return new sa(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_slots_next is invalid. Received: " + obj);
            case 44:
                if ("layout/activity_dl_status_details_0".equals(obj)) {
                    return new ua(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_status_details is invalid. Received: " + obj);
            case 45:
                if ("layout/activity_dl_status_documents_0".equals(obj)) {
                    return new wa(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_status_documents is invalid. Received: " + obj);
            case 46:
                if ("layout/activity_dl_status_photo_sign_0".equals(obj)) {
                    return new ya(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_status_photo_sign is invalid. Received: " + obj);
            case 47:
                if ("layout/activity_dl_submit_request_success_0".equals(obj)) {
                    return new ab(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_submit_request_success is invalid. Received: " + obj);
            case 48:
                if ("layout/activity_duplicate_cl_0".equals(obj)) {
                    return new ib(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_duplicate_cl is invalid. Received: " + obj);
            case 49:
                if ("layout/activity_duplicate_dl_0".equals(obj)) {
                    return new kb(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_duplicate_dl is invalid. Received: " + obj);
            case 50:
                if ("layout/activity_duplicate_ll_0".equals(obj)) {
                    return new ob(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_duplicate_ll is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final lq7 e(jd1 jd1Var, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/activity_edit_app_personal_details_0".equals(obj)) {
                    return new sb(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_edit_app_personal_details is invalid. Received: " + obj);
            case 52:
                if ("layout/activity_edit_appl_address_0".equals(obj)) {
                    return new ub(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_edit_appl_address is invalid. Received: " + obj);
            case 53:
                if ("layout/activity_edit_learner_appl_0".equals(obj)) {
                    return new wb(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_edit_learner_appl is invalid. Received: " + obj);
            case 54:
                if ("layout/activity_hill_religion_0".equals(obj)) {
                    return new ac(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_hill_religion is invalid. Received: " + obj);
            case 55:
                if ("layout/activity_issue_international_permit_0".equals(obj)) {
                    return new dc(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_issue_international_permit is invalid. Received: " + obj);
            case 56:
                if ("layout/activity_learner_download_0".equals(obj)) {
                    return new hc(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_learner_download is invalid. Received: " + obj);
            case 57:
                if ("layout/activity_learner_licence_address_0".equals(obj)) {
                    return new kc(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_learner_licence_address is invalid. Received: " + obj);
            case 58:
                if ("layout/activity_ll_0".equals(obj)) {
                    return new sc(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll is invalid. Received: " + obj);
            case 59:
                if ("layout/activity_ll_application_number_0".equals(obj)) {
                    return new oc(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_application_number is invalid. Received: " + obj);
            case 60:
                if ("layout/activity_ll_appointment_0".equals(obj)) {
                    return new qc(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_appointment is invalid. Received: " + obj);
            case 61:
                if ("layout/activity_ll_confirm_mob_no_0".equals(obj)) {
                    return new uc(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_confirm_mob_no is invalid. Received: " + obj);
            case 62:
                if ("layout/activity_ll_details_0".equals(obj)) {
                    return new wc(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_details is invalid. Received: " + obj);
            case 63:
                if ("layout/activity_ll_document_upload_0".equals(obj)) {
                    return new yc(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_document_upload is invalid. Received: " + obj);
            case 64:
                if ("layout/activity_ll_mobile_update_0".equals(obj)) {
                    return new cd(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_mobile_update is invalid. Received: " + obj);
            case 65:
                if ("layout/activity_ll_otp_mobile_0".equals(obj)) {
                    return new ed(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_otp_mobile is invalid. Received: " + obj);
            case 66:
                if ("layout/activity_ll_payment_0".equals(obj)) {
                    return new gd(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_payment is invalid. Received: " + obj);
            case 67:
                if ("layout/activity_ll_photo_signature_0".equals(obj)) {
                    return new id(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_photo_signature is invalid. Received: " + obj);
            case 68:
                if ("layout/activity_ll_stolts_ack_0".equals(obj)) {
                    return new ld(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_stolts_ack is invalid. Received: " + obj);
            case 69:
                if ("layout/activity_new_cl_one_0".equals(obj)) {
                    return new td(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_cl_one is invalid. Received: " + obj);
            case 70:
                if ("layout/activity_new_cl_submit_screen_0".equals(obj)) {
                    return new vd(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_cl_submit_screen is invalid. Received: " + obj);
            case 71:
                if ("layout/activity_new_cl_three_0".equals(obj)) {
                    return new xd(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_cl_three is invalid. Received: " + obj);
            case 72:
                if ("layout/activity_new_cl_two_0".equals(obj)) {
                    return new zd(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_cl_two is invalid. Received: " + obj);
            case 73:
                if ("layout/activity_new_learner_personal_details_0".equals(obj)) {
                    return new ce(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_learner_personal_details is invalid. Received: " + obj);
            case 74:
                if ("layout/activity_new_learner_training_0".equals(obj)) {
                    return new ee(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_learner_training is invalid. Received: " + obj);
            case 75:
                if ("layout/activity_pdf_0".equals(obj)) {
                    return new qe(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_pdf is invalid. Received: " + obj);
            case Base64.mimeLineLength /* 76 */:
                if ("layout/activity_pdfview_internal_acitvity_0".equals(obj)) {
                    return new se(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_pdfview_internal_acitvity is invalid. Received: " + obj);
            case 77:
                if ("layout/activity_renewal_cl_0".equals(obj)) {
                    return new ze(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_renewal_cl is invalid. Received: " + obj);
            case 78:
                if ("layout/activity_reprint_0".equals(obj)) {
                    return new ff(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_reprint is invalid. Received: " + obj);
            case 79:
                if ("layout/activity_sarathi_mobile_update_0".equals(obj)) {
                    return new uf(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_sarathi_mobile_update is invalid. Received: " + obj);
            case 80:
                if ("layout/activity_select_cl_service_0".equals(obj)) {
                    return new fg(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_select_cl_service is invalid. Received: " + obj);
            case 81:
                if ("layout/activity_sp_basic_details_0".equals(obj)) {
                    return new kg(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_sp_basic_details is invalid. Received: " + obj);
            case 82:
                if ("layout/activity_sp_details_0".equals(obj)) {
                    return new mg(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_sp_details is invalid. Received: " + obj);
            case 83:
                if ("layout/activity_transfer_permit_0".equals(obj)) {
                    return new vg(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_transfer_permit is invalid. Received: " + obj);
            case 84:
                if ("layout/activity_transfer_permit_details_0".equals(obj)) {
                    return new xg(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_transfer_permit_details is invalid. Received: " + obj);
            case 85:
                if ("layout/activity_user_adhar_details_0".equals(obj)) {
                    return new zg(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_user_adhar_details is invalid. Received: " + obj);
            case 86:
                if ("layout/activity_verify_notice_payment_response_0".equals(obj)) {
                    return new qh(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_verify_notice_payment_response is invalid. Received: " + obj);
            case 87:
                if ("layout/application_submitted_0".equals(obj)) {
                    return new fx(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for application_submitted is invalid. Received: " + obj);
            case 88:
                if ("layout/declaration_form_0".equals(obj)) {
                    return new pe1(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for declaration_form is invalid. Received: " + obj);
            case 89:
                if ("layout/dl_service_view_details_0".equals(obj)) {
                    return new qq1(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for dl_service_view_details is invalid. Received: " + obj);
            case 90:
                if ("layout/edit_appl_selected_cov_details_0".equals(obj)) {
                    return new rz1(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for edit_appl_selected_cov_details is invalid. Received: " + obj);
            case 91:
                if ("layout/items_dl_renewal_doc_0".equals(obj)) {
                    return new z23(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for items_dl_renewal_doc is invalid. Received: " + obj);
            case 92:
                if ("layout/ll_test_activity_0".equals(obj)) {
                    return new cm3(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for ll_test_activity is invalid. Received: " + obj);
            case 93:
                if ("layout/mislinessfeepayment_0".equals(obj)) {
                    return new vu3(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for mislinessfeepayment is invalid. Received: " + obj);
            case 94:
                if ("layout/sp_permit_details_0".equals(obj)) {
                    return new c56(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for sp_permit_details is invalid. Received: " + obj);
            case 95:
                if ("layout/taxpaymentscreen_0".equals(obj)) {
                    return new rd6(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for taxpaymentscreen is invalid. Received: " + obj);
            case 96:
                if ("layout/test_photo_0".equals(obj)) {
                    return new ne6(jd1Var, view);
                }
                throw new IllegalArgumentException("The tag for test_photo is invalid. Received: " + obj);
            default:
                return null;
        }
    }
}
