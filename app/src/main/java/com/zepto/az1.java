package com.zepto;

import android.content.Context;
import com.nic.mparivahan.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class az1 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, ne binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.M.i.setText(wa3Var.b("label_challan_payment_search", context.getString(R.string.online_challan_payment)));
                binding.z.setText(wa3Var.b("logo_challan_payment", context.getString(R.string.payment)));
                binding.h.setText(wa3Var.b("logo_challan_details", context.getString(R.string.challan_details)));
                binding.H.setText(wa3Var.b("logo_challan_receipt", context.getString(R.string.receipt)));
                binding.g.setText(wa3Var.b("label_challan_detail", context.getString(R.string.challan_details_)));
                binding.v.setText(wa3Var.b("lbl_accusedName", context.getString(R.string.accused_name)));
                binding.r.setText(wa3Var.b("lbl_rc_number", context.getString(R.string.rc_no)));
                binding.p.setText(wa3Var.b("dl_no", context.getString(R.string.dl_no)));
                binding.i.setText(wa3Var.b("label_location", context.getString(R.string.location_txt)));
                binding.J.setText(wa3Var.b("label_challan_state", context.getString(R.string.state_new)));
                binding.m.setText(wa3Var.b("label_challan_no", context.getString(R.string.challan_no)));
                binding.e.setText(wa3Var.b("label_challan_date", context.getString(R.string.challan_date)));
                binding.b.setText(wa3Var.b("label_challan_amount", context.getString(R.string.amount)));
                binding.D.setText(wa3Var.b("btn_challan_status", context.getString(R.string.status)));
                binding.y.setText(wa3Var.b("label_challan_pay_now", context.getString(R.string.pay_now)));
                binding.l.setText(wa3Var.b("label_challan_download", context.getString(R.string.challan_print)));
                binding.I.setText(wa3Var.b("label_challan_download_receipt", "Download Payment Receipt"));
                binding.k.setText(wa3Var.b("label_challan_download", context.getString(R.string.challan_print)));
                binding.B.setText(wa3Var.b("paymentDate", context.getString(R.string.payment_date)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void b(Context context, xf binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.l.setText(wa3Var.b("cn_PaymentTitle", context.getString(R.string.challan_notice_payment_title)));
                binding.g.setHint(wa3Var.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                binding.j.setText(wa3Var.b("label_challan_search", context.getString(R.string.search)));
                binding.b.setText(wa3Var.b("label_challan_all", context.getString(R.string.all)));
                binding.h.setText(wa3Var.b("label_challan_pending", context.getString(R.string.pending_1)));
                binding.d.setText(wa3Var.b("label_challan_disposed", context.getString(R.string.dispose)));
                binding.n.setText(wa3Var.b("label_challan_total", context.getString(R.string.total_challan)));
                binding.f.setText(wa3Var.b("label_challan_not_found", context.getString(R.string.no_challan_found)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void c(Context context, wf binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.E.i.setText(wa3Var.b("cn_PaymentTitle", context.getString(R.string.challan_notice_payment_title)));
                binding.r.setText(wa3Var.b("label_pay_your_challan", context.getString(R.string.pay_your_challan)));
                binding.o.setText(wa3Var.b("label_challan_my_dl_number", context.getString(R.string.my_driving_license)));
                binding.L.setText(wa3Var.b("label_challan_dl_no", "Driving Licence No"));
                binding.G.setText(wa3Var.b("label_challan_transaction_status", context.getString(R.string.transaction_status)));
                binding.B.setText(wa3Var.b("label_challan_reprint_receipt", context.getString(R.string.reprint_receipt)));
                binding.s.setText(wa3Var.b("logo_challan_payment", context.getString(R.string.payment)));
                binding.c.setText(wa3Var.b("logo_challan_details", context.getString(R.string.challan_details)));
                binding.x.setText(wa3Var.b("logo_challan_receipt", context.getString(R.string.receipt)));
                binding.b.setText(wa3Var.b("label_challan_detail", context.getString(R.string.challan_details_)));
                binding.e.setText(wa3Var.b("label_challan_number", context.getString(R.string.echallan_challan_number)));
                binding.O.setText(wa3Var.b("label_challan_vehicle_number", context.getString(R.string.echallan_vehicle_number)));
                binding.g.setText(wa3Var.b("label_challan_dl_number", context.getString(R.string.echallan_driving_licence_number)));
                binding.K.setText(wa3Var.b("label_challan_my_vehicle_no", "My Vehicle(s)"));
                binding.o.setText(wa3Var.b("label_challan_my_dl_number", context.getString(R.string.my_driving_license)));
                binding.P.setText(wa3Var.b("label_view_challan", context.getString(R.string.show_recent_challan)));
                binding.m.setHint(wa3Var.b("label_challan_enter_vehicle_no", context.getString(R.string.enter_vehicle_number)));
                binding.I.setText(wa3Var.b("label_challan_chassis_no", "Chassis No. (Enter last five digits)"));
                binding.f.setHint(wa3Var.b("label_challan_enter_chassis_no", context.getString(R.string.echallan_enter_chassis_number)));
                binding.J.setText(wa3Var.b("label_challan_engine_no", "Engine No. (Enter last five digits)"));
                binding.j.setHint(wa3Var.b("label_challan_enter_engine_no", context.getString(R.string.echallan_enter_engine_number)));
                binding.k.setText(wa3Var.b("label_challan_get_details", context.getString(R.string.get_details)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void d(Context context, bz1 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.g.setText(wa3Var.b("label_challan_reprint_receipt", context.getString(R.string.reprint_receipt)));
                binding.h.i.setText(wa3Var.b("label_challan_reprint_receipt", context.getString(R.string.reprint_receipt)));
                binding.c.setHint(wa3Var.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                binding.f.setText(wa3Var.b("label_challan_search", context.getString(R.string.search)));
                binding.i.setText(wa3Var.b("label_challan_total", context.getString(R.string.total_challan)));
                binding.b.setText(wa3Var.b("label_challan_not_found", context.getString(R.string.no_challan_found)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void e(Context context, kc0 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.i.setText(wa3Var.b("label_challan_transaction_status", context.getString(R.string.transaction_status)));
                binding.e.setText(wa3Var.b("label_challan_no", context.getString(R.string.challan_num)));
                binding.b.setText(wa3Var.b("label_challan_amount", context.getString(R.string.amount)));
                binding.k.setText(wa3Var.b("label_challan_vehicle_no", context.getString(R.string.vehicle_number)));
                binding.d.setText(wa3Var.b("label_challan_reprint_receipt", context.getString(R.string.reprint_receipt)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void f(Context context, yp5 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.G.i.setText(wa3Var.b("label_challan_status", context.getString(R.string.challan1)));
                binding.w.setText(wa3Var.b("logo_challan_payment", context.getString(R.string.payment)));
                binding.g.setText(wa3Var.b("logo_challan_details", context.getString(R.string.challan_details)));
                binding.C.setText(wa3Var.b("logo_challan_receipt", context.getString(R.string.receipt)));
                binding.f.setText(wa3Var.b("label_challan_detail", context.getString(R.string.challan_details_)));
                binding.t.setText(wa3Var.b("lbl_accusedName", context.getString(R.string.accused_name)));
                binding.p.setText(wa3Var.b("lbl_rc_number", context.getString(R.string.rc_no)));
                binding.n.setText(wa3Var.b("dl_no", context.getString(R.string.dl_no)));
                binding.h.setText(wa3Var.b("label_location", context.getString(R.string.location_txt)));
                binding.D.setText(wa3Var.b("label_challan_state", context.getString(R.string.state_new)));
                binding.k.setText(wa3Var.b("label_challan_no", context.getString(R.string.challan_no)));
                binding.d.setText(wa3Var.b("label_challan_date", context.getString(R.string.challan_date)));
                binding.b.setText(wa3Var.b("label_challan_amount", context.getString(R.string.amount)));
                binding.y.setText(wa3Var.b("btn_challan_status", context.getString(R.string.status)));
                binding.j.setText(wa3Var.b("label_challan_download", context.getString(R.string.challan_print)));
                binding.x.setText(wa3Var.b("label_challan_download_receipt", "Download Payment Receipt"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void g(Context context, yf binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.q.i.setText(wa3Var.b("cn_statusTitle", context.getString(R.string.challan_notice_status)));
                binding.c.setText(wa3Var.b("label_challan_number", context.getString(R.string.echallan_challan_number)));
                binding.x.setText(wa3Var.b("label_challan_vehicle_number", context.getString(R.string.echallan_vehicle_number)));
                binding.e.setText(wa3Var.b("label_challan_dl_number", context.getString(R.string.echallan_driving_licence_number)));
                binding.t.setText(wa3Var.b("label_challan_my_vehicle_no", "My Vehicle(s)"));
                binding.m.setText(wa3Var.b("label_challan_my_dl_number", context.getString(R.string.my_driving_license)));
                binding.y.setText(wa3Var.b("label_view_challan", context.getString(R.string.show_recent_challan)));
                binding.k.setHint(wa3Var.b("label_challan_enter_vehicle_no", context.getString(R.string.enter_vehicle_number)));
                binding.r.setText(wa3Var.b("label_challan_chassis_no", "Chassis No. (Enter last five digits)"));
                binding.d.setHint(wa3Var.b("label_challan_enter_chassis_no", context.getString(R.string.echallan_enter_chassis_number)));
                binding.s.setText(wa3Var.b("label_challan_engine_no", "Engine No. (Enter last five digits)"));
                binding.h.setHint(wa3Var.b("label_challan_enter_engine_no", context.getString(R.string.echallan_enter_engine_number)));
                binding.i.setText(wa3Var.b("label_challan_get_details", context.getString(R.string.get_details)));
                binding.u.setText(wa3Var.b("label_challan_dl_no", "Driving Licence No"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void h(Context context, sq5 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.m.i.setText(wa3Var.b("cn_statusTitle", context.getString(R.string.challan_notice_status)));
                binding.g.setHint(wa3Var.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                binding.j.setText(wa3Var.b("label_challan_search", context.getString(R.string.search)));
                binding.b.setText(wa3Var.b("label_challan_all", context.getString(R.string.all)));
                binding.h.setText(wa3Var.b("label_challan_pending", context.getString(R.string.pending_1)));
                binding.d.setText(wa3Var.b("label_challan_disposed", context.getString(R.string.dispose)));
                binding.n.setText(wa3Var.b("label_challan_total", context.getString(R.string.total_challan)));
                binding.f.setText(wa3Var.b("label_challan_not_found", context.getString(R.string.no_challan_found)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void i(Context context, cg binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.i.i.setText(wa3Var.b("View_Payment_Receipt", context.getString(R.string.view_payment_receipt)));
                binding.e.setHint(wa3Var.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                binding.g.setText(wa3Var.b("label_challan_search", context.getString(R.string.search)));
                binding.j.setText(wa3Var.b("label_challan_total", context.getString(R.string.total_challan)));
                binding.d.setText(wa3Var.b("label_challan_not_found", context.getString(R.string.no_challan_found)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void j(Context context, bg binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.j.i.setText(wa3Var.b("label_challan_print_receipt", context.getString(R.string.print_receipt)));
                binding.c.setText(wa3Var.b("label_challan_number", context.getString(R.string.echallan_challan_number)));
                binding.x.setText(wa3Var.b("label_challan_vehicle_number", context.getString(R.string.echallan_vehicle_number)));
                binding.e.setText(wa3Var.b("label_challan_dl_number", context.getString(R.string.echallan_driving_licence_number)));
                binding.t.setText(wa3Var.b("label_challan_my_vehicle_no", "My Vehicle(s)"));
                binding.n.setText(wa3Var.b("label_challan_my_dl_number", context.getString(R.string.my_driving_license)));
                binding.y.setText(wa3Var.b("label_view_challan", context.getString(R.string.show_recent_challan)));
                binding.l.setHint(wa3Var.b("label_challan_enter_vehicle_no", context.getString(R.string.enter_vehicle_number)));
                binding.r.setText(wa3Var.b("label_challan_chassis_no", "Chassis No. (Enter last five digits)"));
                binding.d.setHint(wa3Var.b("label_challan_enter_chassis_no", context.getString(R.string.echallan_enter_chassis_number)));
                binding.s.setText(wa3Var.b("label_challan_engine_no", "Engine No. (Enter last five digits)"));
                binding.h.setHint(wa3Var.b("label_challan_enter_engine_no", context.getString(R.string.echallan_enter_engine_number)));
                binding.i.setText(wa3Var.b("label_challan_get_details", context.getString(R.string.get_details)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void k(Context context, cz1 binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.g.i.setText(wa3Var.b("label_challan_transaction_status", context.getString(R.string.transaction_status)));
                binding.c.setHint(wa3Var.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                binding.e.setText(wa3Var.b("label_challan_search", context.getString(R.string.search)));
                binding.h.setText(wa3Var.b("label_challan_total", context.getString(R.string.total_challan)));
                binding.b.setText(wa3Var.b("label_challan_not_found", context.getString(R.string.no_challan_found)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void l(Context context, ne binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.M.i.setText(wa3Var.b("label_challan_verify_payment_status", context.getString(R.string.verify_challan_payment)));
                binding.z.setText(wa3Var.b("logo_challan_payment", context.getString(R.string.payment)));
                binding.h.setText(wa3Var.b("logo_challan_details", context.getString(R.string.challan_details)));
                binding.H.setText(wa3Var.b("logo_challan_receipt", context.getString(R.string.receipt)));
                binding.g.setText(wa3Var.b("label_challan_detail", context.getString(R.string.challan_details_)));
                binding.v.setText(wa3Var.b("lbl_accusedName", context.getString(R.string.accused_name)));
                binding.r.setText(wa3Var.b("lbl_rc_number", context.getString(R.string.rc_no)));
                binding.p.setText(wa3Var.b("dl_no", context.getString(R.string.dl_no)));
                binding.i.setText(wa3Var.b("label_location", context.getString(R.string.location_txt)));
                binding.J.setText(wa3Var.b("label_challan_state", context.getString(R.string.state_new)));
                binding.m.setText(wa3Var.b("label_challan_no", context.getString(R.string.challan_no)));
                binding.e.setText(wa3Var.b("label_challan_date", context.getString(R.string.challan_date)));
                binding.b.setText(wa3Var.b("label_challan_amount", context.getString(R.string.amount)));
                binding.D.setText(wa3Var.b("btn_challan_status", context.getString(R.string.status)));
                binding.y.setText(wa3Var.b("label_challan_pay_now", context.getString(R.string.pay_now)));
                binding.l.setText(wa3Var.b("label_challan_download", context.getString(R.string.challan_print)));
                binding.I.setText(wa3Var.b("label_challan_download_receipt", "Download Payment Receipt"));
                binding.k.setText(wa3Var.b("label_challan_download", context.getString(R.string.challan_print)));
                binding.B.setText(wa3Var.b("paymentDate", context.getString(R.string.payment_date)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void m(Context context, rh binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.h.i.setText(wa3Var.b("label_challan_verify_payment_status", context.getString(R.string.verify_challan_payment)));
                binding.d.setHint(wa3Var.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                binding.f.setText(wa3Var.b("label_challan_search", context.getString(R.string.search)));
                binding.i.setText(wa3Var.b("label_challan_total", context.getString(R.string.total_challan)));
                binding.c.setText(wa3Var.b("label_challan_no_payment_trans_pending", context.getString(R.string.no_transcation_found)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void n(Context context, pb binding) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            try {
                wa3 wa3Var = new wa3(context);
                binding.t.i.setText(wa3Var.b("label_challan_send_to_court", "Send To Court Data"));
                binding.s.setText(wa3Var.b("label_challan_send_to_court", "Send To Court Data"));
                binding.A.setText(wa3Var.b("label_challan_no", context.getString(R.string.challan_no)));
                binding.y.setText(wa3Var.b("label_challan_amount", context.getString(R.string.amount)));
                binding.F.setText(wa3Var.b("label_challan_court_name", "Court Name"));
                binding.E.setText(wa3Var.b("label_challan_court_add", "Court Address"));
                binding.O.setText(wa3Var.b("label_challan_send_to_court_on", "Send To Court On"));
                binding.S.setText(wa3Var.b("label_challan_virtual_court_link", context.getString(R.string.virtual_court_link)));
                binding.P.setText(wa3Var.b("label_challan_status_from_court", "Status from virtual court"));
                binding.N.setText(wa3Var.b("label_challan_proceeding_data", "Proceeding Data"));
                binding.I.setText(wa3Var.b("label_challan_proceeding_date", "Date of Proceeding"));
                binding.K.setText(wa3Var.b("label_challan_fine_imposed", "Fine Imposed"));
                binding.M.setText(wa3Var.b("label_challan_party_name", "Party Name"));
                binding.C.setText(wa3Var.b("label_challan_contested_data", "Contested Data"));
                binding.z.setText(wa3Var.b("label_challan_case_no", "Case No"));
                binding.D.setText(wa3Var.b("label_challan_court_name", "Court Name"));
                binding.J.setText(wa3Var.b("label_challan_fine_imposed", "Fine Imposed"));
                binding.R.setText(wa3Var.b("label_challan_transfer_to_regular_court", "Transferred to Regular Court Data"));
                binding.G.setText(wa3Var.b("label_challan_court_name", "Court Name"));
                binding.B.setText(wa3Var.b("label_challan_ci_no", "CI Number"));
                binding.Q.setText(wa3Var.b("label_challan_transfer_to_regular_court", "Transferred to Regular Court Data"));
                binding.H.setText(wa3Var.b("label_challan_court_number", "Court Number"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
