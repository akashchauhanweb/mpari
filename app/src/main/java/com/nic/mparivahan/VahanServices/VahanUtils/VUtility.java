package com.nic.mparivahan.VahanServices.VahanUtils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.AOVSaveToDraftRequest;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUpdateRequest;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadReq;
import com.nic.mparivahan.VahanServices.DRcModle.duprcDtoRequestModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitRe;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HPTRequestParamModle;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPRequestModel;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftRequestParam;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.gd1;
import com.zepto.wa3;
import com.zepto.z82;
import com.zepto.z95;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanUtils/VUtility;", "", "<init>", "()V", "Companion", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VUtility {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
    public static final String REG = "^(\\+91[\\-\\s]?)?[0]?(91)?[6789]\\d{9}$";

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.VahanUtils.VUtility$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void A(Dialog d, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            d.dismiss();
        }

        public static final void C(Dialog d, Context context, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            Intrinsics.checkNotNullParameter(context, "$context");
            d.dismiss();
            ((Activity) context).finish();
        }

        public static final void D(Dialog d, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            d.dismiss();
        }

        public static final void i(Dialog dialog, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            dialog.dismiss();
        }

        public static final void z(Dialog d, Context context, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            Intrinsics.checkNotNullParameter(context, "$context");
            d.dismiss();
            ((Activity) context).finish();
        }

        public final JSONObject A0(String bucketName, String fileName, String appNo) throws JSONException {
            Intrinsics.checkNotNullParameter(bucketName, "bucketName");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(appNo, "appNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bucketName", bucketName);
            jSONObject.put("fileName", fileName);
            jSONObject.put("appNo", appNo);
            return jSONObject;
        }

        public final void B(final Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.exit_app_diloge);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
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
            wa3 wa3Var = new wa3(context);
            ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
            textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
            textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            ((TextView) viewFindViewById).setText(str);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ju6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VUtility.Companion.C(dialog, context, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ku6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VUtility.Companion.D(dialog, view);
                }
            });
            dialog.show();
        }

        public final JSONObject E(String regn_no, String state_cd, String pur_cd) throws JSONException {
            Intrinsics.checkNotNullParameter(regn_no, "regn_no");
            Intrinsics.checkNotNullParameter(state_cd, "state_cd");
            Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regn_no);
            jSONObject.put("stateCode", state_cd);
            jSONObject.put("purCd", pur_cd);
            return jSONObject;
        }

        public final JSONObject F(String stateCode) throws JSONException {
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", stateCode);
            return jSONObject;
        }

        public final String G(AOVSaveToDraftRequest dfc) {
            Intrinsics.checkNotNullParameter(dfc, "dfc");
            String json = new Gson().toJson(dfc);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        public final JSONObject H(String encstring) throws JSONException {
            Intrinsics.checkNotNullParameter(encstring, "encstring");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("encstring", encstring);
            return jSONObject;
        }

        public final JSONObject I(String regnNo) throws JSONException {
            Intrinsics.checkNotNullParameter(regnNo, "regnNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", regnNo);
            return jSONObject;
        }

        public final JSONObject J(String stateCode, String validFrom, String periodMode, String period) throws JSONException {
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(validFrom, "validFrom");
            Intrinsics.checkNotNullParameter(periodMode, "periodMode");
            Intrinsics.checkNotNullParameter(period, "period");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", stateCode);
            jSONObject.put("validFrom", validFrom);
            jSONObject.put("periodMode", periodMode);
            jSONObject.put("period", period);
            return jSONObject;
        }

        public final JSONObject K(String applNo, String stateCode) throws JSONException {
            Intrinsics.checkNotNullParameter(applNo, "applNo");
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", applNo);
            jSONObject.put("stateCode", stateCode);
            return jSONObject;
        }

        public final JSONObject L(String stateCode, String purDesc, String permitType, String transType, String permitCat, String regNo, String offCd, String purposeReasonCode, String applNo, String purpose) throws JSONException {
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(purDesc, "purDesc");
            Intrinsics.checkNotNullParameter(permitType, "permitType");
            Intrinsics.checkNotNullParameter(transType, "transType");
            Intrinsics.checkNotNullParameter(permitCat, "permitCat");
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(offCd, "offCd");
            Intrinsics.checkNotNullParameter(purposeReasonCode, "purposeReasonCode");
            Intrinsics.checkNotNullParameter(applNo, "applNo");
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", stateCode);
            jSONObject.put("purDesc", purDesc);
            jSONObject.put("permitType", permitType);
            jSONObject.put("transType", transType);
            jSONObject.put("permitCat", permitCat);
            jSONObject.put("signType", "NA");
            jSONObject.put("regNo", regNo);
            jSONObject.put("offCd", offCd);
            jSONObject.put("purposeReasonCode", purposeReasonCode);
            jSONObject.put("applNo", applNo);
            jSONObject.put("purpose", purpose);
            return jSONObject;
        }

        public final String M(String applNo, String chasiNo, String regnNo, ArrayList purCdsForFee) {
            Intrinsics.checkNotNullParameter(applNo, "applNo");
            Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
            Intrinsics.checkNotNullParameter(regnNo, "regnNo");
            Intrinsics.checkNotNullParameter(purCdsForFee, "purCdsForFee");
            String json = new Gson().toJson(new z82(applNo, chasiNo, regnNo, purCdsForFee));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        public final JSONObject N(String natuteofGoods, String stateCode) throws JSONException {
            Intrinsics.checkNotNullParameter(natuteofGoods, "natuteofGoods");
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("natuteofGoods", natuteofGoods);
            jSONObject.put("stateCode", stateCode);
            return jSONObject;
        }

        public final String O(MFPRequestModel dfc) {
            Intrinsics.checkNotNullParameter(dfc, "dfc");
            String json = new Gson().toJson(dfc);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        public final JSONObject P() {
            return new JSONObject();
        }

        public final String Q(String regNo, String stateCode, String offCd) throws JSONException {
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(offCd, "offCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regNo);
            jSONObject.put("stateCode", stateCode);
            jSONObject.put("offCd", offCd);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final String R(DuplicateFitessDraft dfc) {
            Intrinsics.checkNotNullParameter(dfc, "dfc");
            String json = new Gson().toJson(dfc);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        public final String S(DuplicatePermitRe dp) {
            Intrinsics.checkNotNullParameter(dp, "dp");
            String json = new Gson().toJson(dp);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        public final JSONObject T(String regNo, String chasiNo) throws JSONException {
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regNo);
            jSONObject.put("chasiNo", chasiNo);
            return jSONObject;
        }

        public final JSONObject U(String transaction_no) throws JSONException {
            Intrinsics.checkNotNullParameter(transaction_no, "transaction_no");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transactionNo", transaction_no);
            return jSONObject;
        }

        public final String V(z95 dfc) {
            Intrinsics.checkNotNullParameter(dfc, "dfc");
            String json = new Gson().toJson(dfc);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        public final String W(String regNo, String offCd, String purCd, String stateCd) throws JSONException {
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(offCd, "offCd");
            Intrinsics.checkNotNullParameter(purCd, "purCd");
            Intrinsics.checkNotNullParameter(stateCd, "stateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regNo);
            jSONObject.put("offCd", offCd);
            jSONObject.put("purCd", purCd);
            jSONObject.put("stateCode", stateCd);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final JSONObject X(String regnNo, String state_code, String user_id, String device_id, String mobile_no, String tid, String chasisNo, String pcode) throws JSONException {
            Intrinsics.checkNotNullParameter(regnNo, "regnNo");
            Intrinsics.checkNotNullParameter(state_code, "state_code");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(device_id, "device_id");
            Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
            Intrinsics.checkNotNullParameter(tid, "tid");
            Intrinsics.checkNotNullParameter(chasisNo, "chasisNo");
            Intrinsics.checkNotNullParameter(pcode, "pcode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regn_no", regnNo);
            jSONObject.put("state_cd", state_code);
            jSONObject.put("did", device_id);
            jSONObject.put("mid", mobile_no);
            jSONObject.put("tid", tid);
            jSONObject.put("recordId", Long.parseLong(user_id));
            jSONObject.put("chassisNo", chasisNo);
            jSONObject.put("pur_cd", pcode);
            return jSONObject;
        }

        public final JSONObject Y(String regnNo, String state_code, String user_id, String device_id, String mobile_no, String tid, String chasisNo, String pcode) throws JSONException {
            Intrinsics.checkNotNullParameter(regnNo, "regnNo");
            Intrinsics.checkNotNullParameter(state_code, "state_code");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(device_id, "device_id");
            Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
            Intrinsics.checkNotNullParameter(tid, "tid");
            Intrinsics.checkNotNullParameter(chasisNo, "chasisNo");
            Intrinsics.checkNotNullParameter(pcode, "pcode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regn_no", regnNo);
            jSONObject.put("state_cd", state_code);
            jSONObject.put("did", device_id);
            jSONObject.put("mid", mobile_no);
            jSONObject.put("tid", tid);
            jSONObject.put("recordId", Long.parseLong(user_id));
            jSONObject.put("chassisNo", chasisNo);
            jSONObject.put("pur_cd", pcode);
            return jSONObject;
        }

        public final JSONObject Z(String mobile_number, String citizen_id) throws JSONException {
            Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
            Intrinsics.checkNotNullParameter(citizen_id, "citizen_id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsCtzId", Long.parseLong(citizen_id));
            jSONObject.put("smsEvent", "VHC_VRF");
            jSONObject.put("smsMobile", mobile_number);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", jSONObject);
            return jSONObject2;
        }

        public final String a0(String regNo, String stateCode, String offCd) throws JSONException {
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(offCd, "offCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regNo);
            jSONObject.put("stateCode", stateCode);
            jSONObject.put("offCd", offCd);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final JSONObject b0(String regnNo) throws JSONException {
            Intrinsics.checkNotNullParameter(regnNo, "regnNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regnNo);
            return jSONObject;
        }

        public final JSONObject c0() {
            return new JSONObject();
        }

        public final String d0(String stateCode, String regNo, String taxMode, String purCd, String noofperm) throws JSONException {
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(taxMode, "taxMode");
            Intrinsics.checkNotNullParameter(purCd, "purCd");
            Intrinsics.checkNotNullParameter(noofperm, "noofperm");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", stateCode);
            jSONObject.put("regNo", regNo);
            jSONObject.put("taxMode", taxMode);
            jSONObject.put("purCd", purCd);
            jSONObject.put("noofperm", noofperm);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final JSONObject e0(String regn, String stateCode, String offCd) throws JSONException {
            Intrinsics.checkNotNullParameter(regn, "regn");
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(offCd, "offCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regn);
            jSONObject.put("stateCode", stateCode);
            jSONObject.put("offCd", offCd);
            return jSONObject;
        }

        public final JSONObject f(String recptNumber, String stateCode) throws JSONException {
            Intrinsics.checkNotNullParameter(recptNumber, "recptNumber");
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("recptNumber", recptNumber);
            jSONObject.put("stateCode", stateCode);
            return jSONObject;
        }

        public final String f0(int i) {
            return i == 1 ? "P" : "G";
        }

        public final String g(String stateCode, String regNo, String chasiNo) throws JSONException {
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", stateCode);
            jSONObject.put("regNo", regNo);
            jSONObject.put("chasiNo", chasiNo);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final JSONObject g0(String regNo, String chasiNo, String engineNo, String regnDate, String regnUpto) throws JSONException {
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
            Intrinsics.checkNotNullParameter(engineNo, "engineNo");
            Intrinsics.checkNotNullParameter(regnDate, "regnDate");
            Intrinsics.checkNotNullParameter(regnUpto, "regnUpto");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regnNo", regNo);
            jSONObject.put("engineNo", engineNo);
            jSONObject.put("fitnessValidUpToDate", regnUpto);
            jSONObject.put("registrationDate", regnDate);
            jSONObject.put("chassisNo", chasiNo);
            return jSONObject;
        }

        public final void h(Context context, String title) {
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
            ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nu6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VUtility.Companion.i(dialog, view);
                }
            });
            dialog.show();
        }

        public final JSONObject h0(String stateCode) throws JSONException {
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", stateCode);
            return jSONObject;
        }

        public final JSONObject i0(String appNo, String purposeCode, String state, int i, int i2, NrvDetails rcdetails) throws JSONException {
            Intrinsics.checkNotNullParameter(appNo, "appNo");
            Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appNo", appNo);
            jSONObject.put("purposeCode", purposeCode);
            jSONObject.put("state", state);
            jSONObject.put("vhClassType", i);
            if (purposeCode.equals("3") && i2 > 0) {
                jSONObject.put("serviceRgn", i2);
            }
            if (VContant.INSTANCE.f(purposeCode)) {
                jSONObject.put("permit", String.valueOf(rcdetails.getPmt_type_code()));
                if (i == 1) {
                    jSONObject.put("transType", "P");
                } else {
                    jSONObject.put("transType", "G");
                }
                if (state.equals("DL")) {
                    jSONObject.put("permitCat", String.valueOf(rcdetails.getPmt_catg_code()));
                }
            }
            return jSONObject;
        }

        public final JSONObject j(String statecode, String purposeCode, String offCd) throws JSONException {
            Intrinsics.checkNotNullParameter(statecode, "statecode");
            Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
            Intrinsics.checkNotNullParameter(offCd, "offCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("OffCode", Integer.parseInt(offCd));
            jSONObject.put("purCode", Integer.parseInt(purposeCode));
            jSONObject.put("stateCd", statecode);
            return jSONObject;
        }

        public final JSONObject j0(String regn, String stateCode) throws JSONException {
            Intrinsics.checkNotNullParameter(regn, "regn");
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regn);
            jSONObject.put("stateCode", stateCode);
            return jSONObject;
        }

        public final JSONObject k(String regNo) throws JSONException {
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regNo);
            return jSONObject;
        }

        public final JSONObject k0(String param) throws JSONException {
            Intrinsics.checkNotNullParameter(param, "param");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("param", param);
            return jSONObject;
        }

        public final String l(String pmt_catg_code) {
            Intrinsics.checkNotNullParameter(pmt_catg_code, "pmt_catg_code");
            return gd1.a.m(pmt_catg_code) ? "0" : pmt_catg_code;
        }

        public final JSONObject l0(String regnNo) throws JSONException {
            Intrinsics.checkNotNullParameter(regnNo, "regnNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regnNo);
            return jSONObject;
        }

        public final String m(String pmt_type_code) {
            Intrinsics.checkNotNullParameter(pmt_type_code, "pmt_type_code");
            return gd1.a.m(pmt_type_code) ? "0" : pmt_type_code;
        }

        public final JSONObject m0() {
            return new JSONObject();
        }

        public final JSONObject n(String applNo) throws JSONException {
            Intrinsics.checkNotNullParameter(applNo, "applNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", applNo);
            return jSONObject;
        }

        public final String n0(BeforePaymentRequest param) {
            Intrinsics.checkNotNullParameter(param, "param");
            String json = new Gson().toJson(param);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        public final JSONObject o(String applNo, String purCd) throws JSONException {
            Intrinsics.checkNotNullParameter(applNo, "applNo");
            Intrinsics.checkNotNullParameter(purCd, "purCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", applNo);
            jSONObject.put("purCd", purCd);
            return jSONObject;
        }

        public final JSONObject o0(String regn_no, String state_cd, String chassi_no, String officecode) throws JSONException {
            Intrinsics.checkNotNullParameter(regn_no, "regn_no");
            Intrinsics.checkNotNullParameter(state_cd, "state_cd");
            Intrinsics.checkNotNullParameter(chassi_no, "chassi_no");
            Intrinsics.checkNotNullParameter(officecode, "officecode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regnNo", regn_no);
            jSONObject.put("stateCode", state_cd);
            jSONObject.put("chassisNo", chassi_no);
            jSONObject.put("officeCode", officecode);
            return jSONObject;
        }

        public final JSONObject p(String rcptno) throws JSONException {
            Intrinsics.checkNotNullParameter(rcptno, "rcptno");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rcptNo", rcptno);
            return jSONObject;
        }

        public final JSONObject p0(String regNo, String chasisNo) throws JSONException {
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(chasisNo, "chasisNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regNo);
            jSONObject.put("chasisNo", chasisNo);
            return jSONObject;
        }

        public final JSONObject q(String stateCd, String regnNo) throws JSONException {
            Intrinsics.checkNotNullParameter(stateCd, "stateCd");
            Intrinsics.checkNotNullParameter(regnNo, "regnNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCd", stateCd);
            jSONObject.put("regnNo", regnNo);
            return jSONObject;
        }

        public final String q0(HPTRequestParamModle hpt_request) {
            Intrinsics.checkNotNullParameter(hpt_request, "hpt_request");
            String json = new Gson().toJson(hpt_request);
            Intrinsics.checkNotNull(json);
            return json;
        }

        public final String r(MultiSelectRequest param) {
            Intrinsics.checkNotNullParameter(param, "param");
            String json = new Gson().toJson(param);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        public final String r0(NocDraftRequestParam noc_draft) {
            Intrinsics.checkNotNullParameter(noc_draft, "noc_draft");
            String json = new Gson().toJson(noc_draft);
            Intrinsics.checkNotNull(json);
            return json;
        }

        public final JSONObject s(String stateCode, String offCd, String purCd) throws JSONException {
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(offCd, "offCd");
            Intrinsics.checkNotNullParameter(purCd, "purCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", stateCode);
            jSONObject.put("offCd", offCd);
            jSONObject.put("purCd", purCd);
            return jSONObject;
        }

        public final String s0(BeforePaymentRequestfinal final_request) {
            Intrinsics.checkNotNullParameter(final_request, "final_request");
            String json = new Gson().toJson(final_request);
            Intrinsics.checkNotNull(json);
            return json;
        }

        public final JSONObject t(String regNo, String applNo, String chasiNo) throws JSONException {
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(applNo, "applNo");
            Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regNo);
            jSONObject.put("applNo", applNo);
            jSONObject.put("chasiNo", chasiNo);
            return jSONObject;
        }

        public final String t0(duprcDtoRequestModle hpt_request) {
            Intrinsics.checkNotNullParameter(hpt_request, "hpt_request");
            String json = new Gson().toJson(hpt_request);
            Intrinsics.checkNotNull(json);
            return json;
        }

        public final JSONObject u(String appNo) throws JSONException {
            Intrinsics.checkNotNullParameter(appNo, "appNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appNo", appNo);
            return jSONObject;
        }

        public final JSONObject u0(String regNo, String stateCd, String offCd, String transNo) throws JSONException {
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(stateCd, "stateCd");
            Intrinsics.checkNotNullParameter(offCd, "offCd");
            Intrinsics.checkNotNullParameter(transNo, "transNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regNo);
            jSONObject.put("stateCode", stateCd);
            jSONObject.put("offCd", offCd);
            jSONObject.put("transNo", transNo);
            return jSONObject;
        }

        public final JSONObject v(String regNo, String applNo, String otp) throws JSONException {
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            Intrinsics.checkNotNullParameter(applNo, "applNo");
            Intrinsics.checkNotNullParameter(otp, "otp");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regNo);
            jSONObject.put("applNo", applNo);
            jSONObject.put("otp", otp);
            return jSONObject;
        }

        public final JSONObject v0(String statecode) throws JSONException {
            Intrinsics.checkNotNullParameter(statecode, "statecode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", statecode);
            return jSONObject;
        }

        public final String w(DmsUpdateRequest dmsupdate) {
            Intrinsics.checkNotNullParameter(dmsupdate, "dmsupdate");
            String json = new Gson().toJson(dmsupdate);
            Intrinsics.checkNotNull(json);
            return json;
        }

        public final JSONObject w0(String statecode, String regno, String purCd) throws JSONException {
            Intrinsics.checkNotNullParameter(statecode, "statecode");
            Intrinsics.checkNotNullParameter(regno, "regno");
            Intrinsics.checkNotNullParameter(purCd, "purCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("purcd", purCd);
            jSONObject.put("regno", regno);
            jSONObject.put("stateCd", statecode);
            return jSONObject;
        }

        public final String x(DmsUploadReq upload_req) {
            Intrinsics.checkNotNullParameter(upload_req, "upload_req");
            String json = new Gson().toJson(upload_req);
            Intrinsics.checkNotNull(json);
            return json;
        }

        public final JSONObject x0(String purCd, String transactionId, String offCd, String stateCd, String regNo) throws JSONException {
            Intrinsics.checkNotNullParameter(purCd, "purCd");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(offCd, "offCd");
            Intrinsics.checkNotNullParameter(stateCd, "stateCd");
            Intrinsics.checkNotNullParameter(regNo, "regNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", regNo);
            jSONObject.put("transId", transactionId);
            jSONObject.put("stateCode", stateCd);
            jSONObject.put("offCd", offCd);
            jSONObject.put("purCd", purCd);
            return jSONObject;
        }

        public final void y(final Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.exit_app_diloge);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
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
            wa3 wa3Var = new wa3(context);
            ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
            textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
            textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            ((TextView) viewFindViewById).setText(str);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lu6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VUtility.Companion.z(dialog, context, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mu6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VUtility.Companion.A(dialog, view);
                }
            });
            dialog.show();
        }

        public final boolean y0(ArrayList list, String value) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(value, "value");
            return list.contains(value);
        }

        public final JSONObject z0(String regn_no, String chasi_no, String state_cd, String pur_cd, String offCd) throws JSONException {
            Intrinsics.checkNotNullParameter(regn_no, "regn_no");
            Intrinsics.checkNotNullParameter(chasi_no, "chasi_no");
            Intrinsics.checkNotNullParameter(state_cd, "state_cd");
            Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
            Intrinsics.checkNotNullParameter(offCd, "offCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("chasiNo", chasi_no);
            jSONObject.put("purCd", Integer.parseInt(pur_cd));
            jSONObject.put("regnNo", regn_no);
            jSONObject.put("stateCd", state_cd);
            jSONObject.put("userId", "NGMP");
            jSONObject.put("offCd", offCd);
            return jSONObject;
        }
    }
}
