package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.google.gson.Gson;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.Model.Afterpayment;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycRequest;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.DocUpdateLogs;
import com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.hz0;
import com.zepto.mt6;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class mt6 {
    public static final a a = new a(null);
    public static final Pattern b = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
    public static final Pattern c = Pattern.compile("/^[A-Za-z][A-Za-z\\-]([A-Za-z][A-Za-z\\-]+)*/");

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void d(Dialog dialog, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            dialog.dismiss();
        }

        public final JSONObject A(String mobile_number, String citizen_id) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
            Intrinsics.checkNotNullParameter(citizen_id, "citizen_id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsCtzId", citizen_id);
            jSONObject.put("smsEvent", "CTZ_DOC");
            jSONObject.put("smsMobile", mobile_number);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", jSONObject);
            return jSONObject2;
        }

        public final JSONObject B(String sarlogAadhar4, String sarlogApplCat, String sarlogApplDate, long j, int i, String sarlogDlDob, String sarlogDlNumber, String sarlog_eKYC, String sarlog_eSign, String sarlogGender, String sarlogMobileNo, boolean z, String sarlogPurCd, String sarlogRtoCd, String sarlogStateCd) {
            Intrinsics.checkNotNullParameter(sarlogAadhar4, "sarlogAadhar4");
            Intrinsics.checkNotNullParameter(sarlogApplCat, "sarlogApplCat");
            Intrinsics.checkNotNullParameter(sarlogApplDate, "sarlogApplDate");
            Intrinsics.checkNotNullParameter(sarlogDlDob, "sarlogDlDob");
            Intrinsics.checkNotNullParameter(sarlogDlNumber, "sarlogDlNumber");
            Intrinsics.checkNotNullParameter(sarlog_eKYC, "sarlog_eKYC");
            Intrinsics.checkNotNullParameter(sarlog_eSign, "sarlog_eSign");
            Intrinsics.checkNotNullParameter(sarlogGender, "sarlogGender");
            Intrinsics.checkNotNullParameter(sarlogMobileNo, "sarlogMobileNo");
            Intrinsics.checkNotNullParameter(sarlogPurCd, "sarlogPurCd");
            Intrinsics.checkNotNullParameter(sarlogRtoCd, "sarlogRtoCd");
            Intrinsics.checkNotNullParameter(sarlogStateCd, "sarlogStateCd");
            JSONObject jSONObject = new JSONObject();
            try {
                String str = String.format(sarlogDlDob, Arrays.copyOf(new Object[]{DateTimeFormatter.ofPattern("yyyy-MM-dd")}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sarlogAadhar4", sarlogAadhar4);
                jSONObject2.put("sarlogApplCat", sarlogApplCat);
                jSONObject2.put("sarlogApplDate", hz0.a.r());
                jSONObject2.put("sarlogApplNo", j);
                jSONObject2.put("sarlogCtzId", i);
                jSONObject2.put("sarlogDlDob", str);
                jSONObject2.put("sarlogDlNumber", sarlogDlNumber);
                jSONObject2.put("sarlog_eKYC", sarlog_eKYC);
                jSONObject2.put("sarlog_eSign", sarlog_eSign);
                jSONObject2.put("sarlogGender", "M");
                jSONObject2.put("sarlogMobileNo", sarlogMobileNo);
                jSONObject2.put("sarlogOrgDonor", z);
                jSONObject2.put("sarlogPurCd", sarlogPurCd);
                jSONObject2.put("sarlogRtoCd", sarlogRtoCd);
                jSONObject2.put("sarlogStateCd", sarlogStateCd);
                jSONObject2.put("sarlogStatus", true);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("sarathiLog", jSONObject2);
                return jSONObject3;
            } catch (Exception unused) {
                return jSONObject;
            }
        }

        public final JSONObject C(String ctzRecordId, String ctzMobileNo, NrvDetails rc_details, String isEKYC, String appl_no, String purCode, String rtocode) {
            String strSubstring;
            Intrinsics.checkNotNullParameter(ctzRecordId, "ctzRecordId");
            Intrinsics.checkNotNullParameter(ctzMobileNo, "ctzMobileNo");
            Intrinsics.checkNotNullParameter(rc_details, "rc_details");
            Intrinsics.checkNotNullParameter(isEKYC, "isEKYC");
            Intrinsics.checkNotNullParameter(appl_no, "appl_no");
            Intrinsics.checkNotNullParameter(purCode, "purCode");
            Intrinsics.checkNotNullParameter(rtocode, "rtocode");
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (StringsKt__StringsJVMKt.equals(isEKYC, "Y", true)) {
                    jSONObject2.put("vahlogAadhar4", "");
                } else {
                    jSONObject2.put("vahlogAadhar4", "0000");
                }
                jSONObject2.put("vahlogApplDate", hz0.a.r());
                jSONObject2.put("vahlogApplNo", appl_no);
                String rc_chasi_no = rc_details.getRc_chasi_no();
                String strSubstring2 = null;
                if (rc_chasi_no != null) {
                    String rc_chasi_no2 = rc_details.getRc_chasi_no();
                    Intrinsics.checkNotNull(rc_chasi_no2 != null ? Integer.valueOf(rc_chasi_no2.length()) : null);
                    strSubstring = rc_chasi_no.substring(r6.intValue() - 5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                } else {
                    strSubstring = null;
                }
                jSONObject2.put("vahlogChassis5", strSubstring);
                jSONObject2.put("vahlogCtzId", Long.parseLong(ctzRecordId));
                jSONObject2.put("vahlog_eKYC", isEKYC);
                String rc_eng_no = rc_details.getRc_eng_no();
                if (rc_eng_no != null) {
                    String rc_eng_no2 = rc_details.getRc_eng_no();
                    Intrinsics.checkNotNull(rc_eng_no2 != null ? Integer.valueOf(rc_eng_no2.length()) : null);
                    strSubstring2 = rc_eng_no.substring(r5.intValue() - 5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                }
                jSONObject2.put("vahlogEngine5", strSubstring2);
                jSONObject2.put("vahlog_eSign", "N");
                jSONObject2.put("vahlogMobileNo", ctzMobileNo);
                jSONObject2.put("vahlogPurCd", purCode);
                jSONObject2.put("vahlogRcNumber", rc_details.getRc_regn_no());
                jSONObject2.put("vahlogReptNo", "NA");
                jSONObject2.put("vahlogRtoCd", rtocode);
                jSONObject2.put("vahlogStateCd", rc_details.getState_cd());
                jSONObject2.put("vahlogVhClass", rc_details.getRc_vh_class_desc());
                jSONObject2.put("vahlogStatus", true);
                jSONObject.put("vahanLog", jSONObject2);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final JSONObject D(String sarlogApplDate, long j, int i, String sarlogDlDob, String sarlogDlNumber, String sarlogFeeDate, String sarlogRtoCd) {
            Intrinsics.checkNotNullParameter(sarlogApplDate, "sarlogApplDate");
            Intrinsics.checkNotNullParameter(sarlogDlDob, "sarlogDlDob");
            Intrinsics.checkNotNullParameter(sarlogDlNumber, "sarlogDlNumber");
            Intrinsics.checkNotNullParameter(sarlogFeeDate, "sarlogFeeDate");
            Intrinsics.checkNotNullParameter(sarlogRtoCd, "sarlogRtoCd");
            JSONObject jSONObject = new JSONObject();
            try {
                String str = String.format(sarlogDlDob, Arrays.copyOf(new Object[]{DateTimeFormatter.ofPattern("yyyy-MM-dd")}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
                JSONObject jSONObject2 = new JSONObject();
                hz0.a aVar = hz0.a;
                jSONObject2.put("sarlogApplDate", aVar.r());
                jSONObject2.put("sarlogApplNo", j);
                jSONObject2.put("sarlogCtzId", i);
                jSONObject2.put("sarlogDlDob", str);
                jSONObject2.put("sarlogDlNumber", sarlogDlNumber);
                jSONObject2.put("sarlogFeeDate", aVar.r());
                jSONObject2.put("sarlogRtoCd", sarlogRtoCd);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("sarathiLog", jSONObject2);
                return jSONObject3;
            } catch (Exception unused) {
                return jSONObject;
            }
        }

        public final JSONObject E(String sarlogApplDate, long j, int i, String sarlogDlDob, String sarlogDlNumber, String sarlogRtoCd) {
            Intrinsics.checkNotNullParameter(sarlogApplDate, "sarlogApplDate");
            Intrinsics.checkNotNullParameter(sarlogDlDob, "sarlogDlDob");
            Intrinsics.checkNotNullParameter(sarlogDlNumber, "sarlogDlNumber");
            Intrinsics.checkNotNullParameter(sarlogRtoCd, "sarlogRtoCd");
            JSONObject jSONObject = new JSONObject();
            try {
                String str = String.format(sarlogDlDob, Arrays.copyOf(new Object[]{DateTimeFormatter.ofPattern("yyyy-MM-dd")}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sarlogApplDate", hz0.a.r());
                jSONObject2.put("sarlogApplNo", j);
                jSONObject2.put("sarlogCtzId", i);
                jSONObject2.put("sarlogDlDob", str);
                jSONObject2.put("sarlogDlNumber", sarlogDlNumber);
                jSONObject2.put("sarlogRtoCd", sarlogRtoCd);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("sarathiLog", jSONObject2);
                return jSONObject3;
            } catch (Exception unused) {
                return jSONObject;
            }
        }

        public final JSONObject F(String ctzRecordId, String ctzMobileNo, String ctzDeviceId, String mpin, Context context) {
            Intrinsics.checkNotNullParameter(ctzRecordId, "ctzRecordId");
            Intrinsics.checkNotNullParameter(ctzMobileNo, "ctzMobileNo");
            Intrinsics.checkNotNullParameter(ctzDeviceId, "ctzDeviceId");
            Intrinsics.checkNotNullParameter(mpin, "mpin");
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject jSONObject = new JSONObject();
            try {
                v82 v82Var = new v82(context);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ctzMpin", mpin);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("ctzRecordId", Long.parseLong(ctzRecordId));
                jSONObject3.put("ctzMobile", ctzMobileNo);
                jSONObject3.put("ctzDeviceId", ctzDeviceId);
                jSONObject3.put("deviceModel", Build.MODEL);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("deviceFcmToken", v82Var.a());
                jSONObject.put("mparCitizenDevice", jSONObject4);
                jSONObject.put("citizenLogin", jSONObject3);
                jSONObject.put("mparCitizenUser", jSONObject2);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final JSONObject G(AfterPaymentResponse afterpayment, int i) {
            String strSubstring;
            Intrinsics.checkNotNullParameter(afterpayment, "afterpayment");
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (i == 2) {
                    jSONObject2.put("vahlogApplNo", afterpayment.getAppl_no());
                    jSONObject2.put("vahlogRcNumber", afterpayment.getRegn_no());
                    jSONObject2.put("setVahlogPhotoUplDate", afterpayment.getRcpt_dt());
                    jSONObject2.put("setVahlogDocUplDate", afterpayment.getRcpt_dt());
                } else {
                    jSONObject2.put("vahlogApplNo", afterpayment.getAppl_no());
                    hz0.a aVar = hz0.a;
                    String rcpt_dt = afterpayment.getRcpt_dt();
                    Intrinsics.checkNotNull(rcpt_dt);
                    jSONObject2.put("vahlogFeeDate", aVar.h(rcpt_dt));
                    jSONObject2.put("vahlogRcNumber", afterpayment.getRegn_no());
                    jSONObject2.put("vahlogReptDate", aVar.h(afterpayment.getRcpt_dt()));
                    jSONObject2.put("vahlogFeeAmt", afterpayment.getRcpt_amt());
                    jSONObject2.put("vahlogReptNo", afterpayment.getRcpt_NO());
                    String regn_no = afterpayment.getRegn_no();
                    if (regn_no != null) {
                        strSubstring = regn_no.substring(0, 4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        strSubstring = null;
                    }
                    jSONObject2.put("vahlogRtoCd", strSubstring);
                }
                jSONObject.put("vahanLog", jSONObject2);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final JSONObject H(DocUpdateLogs afterpayment) {
            String strSubstring;
            Intrinsics.checkNotNullParameter(afterpayment, "afterpayment");
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                hz0.a aVar = hz0.a;
                jSONObject2.put("vahlogFeeDate", aVar.h(afterpayment.getVahlogReptDate()));
                jSONObject2.put("vahlogReptDate", aVar.h(afterpayment.getVahlogReptDate()));
                jSONObject2.put("vahlogFeeAmt", afterpayment.getVahlogFeeAmt());
                jSONObject2.put("vahlogReptNo", afterpayment.getVahlogReptNo());
                String vahlogRcNumber = afterpayment.getVahlogRcNumber();
                if (vahlogRcNumber != null) {
                    strSubstring = vahlogRcNumber.substring(0, 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    strSubstring = null;
                }
                jSONObject2.put("vahlogRtoCd", strSubstring);
                jSONObject2.put("vahlogApplNo", afterpayment.getVahlogApplNo());
                jSONObject2.put("vahlogRcNumber", afterpayment.getVahlogRcNumber());
                jSONObject2.put("VahlogPhotoUplDate", afterpayment.getSetVahlogPhotoUplDate());
                jSONObject2.put("VahlogDocUplDate", afterpayment.getSetVahlogDocUplDate());
                jSONObject.put("vahanLog", jSONObject2);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final JSONObject I(Afterpayment afterpayment, int i) {
            String strSubstring;
            Intrinsics.checkNotNullParameter(afterpayment, "afterpayment");
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (i == 2) {
                    jSONObject2.put("vahlogApplNo", afterpayment.getTrans_NO());
                    jSONObject2.put("vahlogRcNumber", afterpayment.getRegn_NO());
                    jSONObject2.put("setVahlogPhotoUplDate", afterpayment.getRcpt_DT());
                    jSONObject2.put("setVahlogDocUplDate", afterpayment.getRcpt_DT());
                } else {
                    jSONObject2.put("vahlogApplNo", afterpayment.getTrans_NO());
                    hz0.a aVar = hz0.a;
                    String rcpt_DT = afterpayment.getRcpt_DT();
                    Intrinsics.checkNotNull(rcpt_DT);
                    jSONObject2.put("vahlogFeeDate", aVar.h(rcpt_DT));
                    jSONObject2.put("vahlogRcNumber", afterpayment.getRegn_NO());
                    jSONObject2.put("vahlogReptDate", aVar.h(afterpayment.getRcpt_DT()));
                    jSONObject2.put("vahlogFeeAmt", afterpayment.getRcpt_amt());
                    jSONObject2.put("vahlogReptNo", afterpayment.getRcpt_NO());
                    String regn_NO = afterpayment.getRegn_NO();
                    if (regn_NO != null) {
                        strSubstring = regn_NO.substring(0, 4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        strSubstring = null;
                    }
                    jSONObject2.put("vahlogRtoCd", strSubstring);
                }
                jSONObject.put("vahanLog", jSONObject2);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final JSONObject b(String mobile_number, String ctzDispName, String ctzEmail, String mpin, String state) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
            Intrinsics.checkNotNullParameter(ctzDispName, "ctzDispName");
            Intrinsics.checkNotNullParameter(ctzEmail, "ctzEmail");
            Intrinsics.checkNotNullParameter(mpin, "mpin");
            Intrinsics.checkNotNullParameter(state, "state");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzMobile", mobile_number);
            jSONObject.put("ctzDispName", ctzDispName);
            jSONObject.put("ctzEmail", ctzEmail);
            jSONObject.put("ctzMpin", mpin);
            if (gd1.a.m(mpin) || mpin.length() < 6) {
                jSONObject.put("ctzMpinStatus", false);
            } else {
                jSONObject.put("ctzMpinStatus", true);
            }
            jSONObject.put("ctzStateCd", state);
            return jSONObject;
        }

        public final void c(Context context, String title) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(title, "title");
            final Dialog dialog = new Dialog(context);
            dialog.requestWindowFeature(1);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.mvvm_number_dialog);
            View viewFindViewById = dialog.findViewById(R.id.txt_dialog);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById).setText(title);
            View viewFindViewById2 = dialog.findViewById(R.id.ok);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lt6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mt6.a.d(dialog, view);
                }
            });
            dialog.show();
        }

        public final JSONObject e(String otp, String otpid, String number, String fcm_token, String device_id, Context context) throws JSONException {
            Intrinsics.checkNotNullParameter(otp, "otp");
            Intrinsics.checkNotNullParameter(otpid, "otpid");
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(fcm_token, "fcm_token");
            Intrinsics.checkNotNullParameter(device_id, "device_id");
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject jSONObject = new JSONObject();
            ws6 ws6Var = new ws6(context);
            jSONObject.put("mid", number);
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("did", device_id);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("otpSmsId", Long.parseLong(otpid));
            jSONObject2.put("otpVal", otp);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ctzMobile", number);
            jSONObject3.put("ctzStatus", 2);
            jSONObject3.put("ctzRecordId", ws6Var.k());
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("smsOtp", jSONObject2);
            jSONObject4.put("mparCitizenUser", jSONObject3);
            jSONObject4.put("mparCitizenDevice", jSONObject);
            return jSONObject4;
        }

        public final String f(eKycRequest ekyc) {
            Intrinsics.checkNotNullParameter(ekyc, "ekyc");
            String json = new Gson().toJson(ekyc);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json.toString();
        }

        public final JSONObject g(String mobile_number, String id) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
            Intrinsics.checkNotNullParameter(id, "id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsCtzId", id);
            jSONObject.put("smsEvent", "CTZ_DEL");
            jSONObject.put("smsMobile", mobile_number);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", jSONObject);
            return jSONObject2;
        }

        public final JSONObject h(String id, String did, String mdid, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mdid, "mdid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzRecordId", Long.parseLong(id));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenUser", jSONObject);
            jSONObject2.put("did", did);
            jSONObject2.put("mid", mdid);
            jSONObject2.put("tid", tid);
            return jSONObject2;
        }

        public final JSONObject i(String mobile_no, String did) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
            Intrinsics.checkNotNullParameter(did, "did");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzMobile", mobile_no);
            jSONObject.put("ctzMpinStatus", false);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mid", mobile_no);
            jSONObject2.put("did", did);
            jSONObject2.put("mparCitizenUser", jSONObject);
            return jSONObject2;
        }

        public final JSONObject j(String ctzId, String did, String mid, String tid) throws JSONException {
            Intrinsics.checkNotNullParameter(ctzId, "ctzId");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(ctzId));
            jSONObject.put("did", did);
            jSONObject.put("mid", mid);
            jSONObject.put("tid", tid);
            return jSONObject;
        }

        public final JSONObject k(String mobile_no, String event) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
            Intrinsics.checkNotNullParameter(event, "event");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsEvent", event);
            jSONObject.put("smsMobile", mobile_no);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", jSONObject);
            return jSONObject2;
        }

        public final Pattern l() {
            return mt6.b;
        }

        public final JSONObject m(String mobile_number, String citizen_id) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
            Intrinsics.checkNotNullParameter(citizen_id, "citizen_id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsCtzId", citizen_id);
            jSONObject.put("smsEvent", "CTZ_UDT");
            jSONObject.put("smsMobile", mobile_number);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", jSONObject);
            return jSONObject2;
        }

        public final JSONObject n() {
            return new JSONObject();
        }

        public final JSONObject o() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", VContant.MAINSCREEN);
            return jSONObject;
        }

        public final JSONObject p(String mobile_number, int i) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsEvent", "CTZ_REG");
            jSONObject.put("smsMobile", mobile_number);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", jSONObject);
            return jSONObject2;
        }

        public final JSONObject q(String mobile_number) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsEvent", "CTZ_SIG");
            jSONObject.put("smsMobile", mobile_number);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", jSONObject);
            return jSONObject2;
        }

        public final JSONObject r(String smsId) throws JSONException {
            Intrinsics.checkNotNullParameter(smsId, "smsId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsId", smsId);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", jSONObject);
            return jSONObject2;
        }

        public final JSONObject s(String mobileNumber) {
            Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("userName", mobileNumber);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final boolean t(String mobile_number) {
            Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
            Pattern patternCompile = Pattern.compile(VUtility.REG);
            Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
            return patternCompile.matcher(mobile_number).find();
        }

        public final boolean u(String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            return l().matcher(str).matches();
        }

        public final JSONObject v(String otp, String otpid) throws JSONException {
            Intrinsics.checkNotNullParameter(otp, "otp");
            Intrinsics.checkNotNullParameter(otpid, "otpid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("otpSmsId", Long.parseLong(otpid));
            jSONObject.put("otpVal", otp);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsOtp", jSONObject);
            return jSONObject2;
        }

        public final JSONObject w(String otp, String otpid, String number, String fcm_token, String device_id, String mpin) throws JSONException {
            Intrinsics.checkNotNullParameter(otp, "otp");
            Intrinsics.checkNotNullParameter(otpid, "otpid");
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(fcm_token, "fcm_token");
            Intrinsics.checkNotNullParameter(device_id, "device_id");
            Intrinsics.checkNotNullParameter(mpin, "mpin");
            JSONObject jSONObject = new JSONObject();
            String str = Build.MODEL;
            jSONObject.put("deviceModel", str);
            jSONObject.put("deviceOsType", "Android");
            jSONObject.put("deviceOsVersion", Build.DEVICE);
            jSONObject.put("deviceFcmToken", fcm_token);
            jSONObject.put("deviceId", device_id);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("otpSmsId", Long.parseLong(otpid));
            jSONObject2.put("otpVal", otp);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ctzMobile", number);
            jSONObject3.put("ctzMpin", mpin);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("did", str);
            jSONObject4.put("mid", number);
            jSONObject4.put("smsOtp", jSONObject2);
            jSONObject4.put("mparCitizenUser", jSONObject3);
            jSONObject4.put("mparCitizenDevice", jSONObject);
            return jSONObject4;
        }

        public final JSONObject x(String otp, String otpid) throws JSONException {
            Intrinsics.checkNotNullParameter(otp, "otp");
            Intrinsics.checkNotNullParameter(otpid, "otpid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("otpSmsId", Long.parseLong(otpid));
            jSONObject.put("otpVal", otp);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsOtp", jSONObject);
            return jSONObject2;
        }

        public final JSONObject y(String otp, String otpid, String device_id, String mobile_no, String tid, String docnumber, String citizenId, String docType, String dob) throws JSONException {
            Intrinsics.checkNotNullParameter(otp, "otp");
            Intrinsics.checkNotNullParameter(otpid, "otpid");
            Intrinsics.checkNotNullParameter(device_id, "device_id");
            Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
            Intrinsics.checkNotNullParameter(tid, "tid");
            Intrinsics.checkNotNullParameter(docnumber, "docnumber");
            Intrinsics.checkNotNullParameter(citizenId, "citizenId");
            Intrinsics.checkNotNullParameter(docType, "docType");
            Intrinsics.checkNotNullParameter(dob, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("docCtzId", Long.parseLong(citizenId));
            jSONObject.put("docNumber", StringsKt__StringsKt.trim((CharSequence) docnumber).toString());
            jSONObject.put("docType", docType);
            if (docType.equals("DL")) {
                jSONObject.put("docDob", k18.a.b(StringsKt__StringsKt.trim((CharSequence) dob).toString()));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("otpSmsId", Long.parseLong(otpid));
            jSONObject2.put("otpVal", otp);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("smsOtp", jSONObject2);
            jSONObject3.put("mparCitizenDoc", jSONObject);
            jSONObject3.put("did", device_id);
            jSONObject3.put("mid", mobile_no);
            jSONObject3.put("tid", tid);
            return jSONObject3;
        }

        public final JSONObject z(String otp, String otpid, String mobile_number, String ctzDispName, String ctzEmail, String mpin, String state, String device_id, String fcm_token) throws JSONException {
            Intrinsics.checkNotNullParameter(otp, "otp");
            Intrinsics.checkNotNullParameter(otpid, "otpid");
            Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
            Intrinsics.checkNotNullParameter(ctzDispName, "ctzDispName");
            Intrinsics.checkNotNullParameter(ctzEmail, "ctzEmail");
            Intrinsics.checkNotNullParameter(mpin, "mpin");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(device_id, "device_id");
            Intrinsics.checkNotNullParameter(fcm_token, "fcm_token");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceModel", Build.MODEL);
            jSONObject.put("deviceOsType", "Android");
            jSONObject.put("deviceOsVersion", Build.DEVICE);
            jSONObject.put("deviceFcmToken", fcm_token);
            jSONObject.put("deviceId", device_id);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("otpSmsId", Long.parseLong(otpid));
            jSONObject2.put("otpVal", otp);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("mparCitizenDevice", jSONObject);
            jSONObject3.put("smsOtp", jSONObject2);
            jSONObject3.put("mparCitizenUser", b(mobile_number, ctzDispName, ctzEmail, mpin, state));
            return jSONObject3;
        }
    }
}
