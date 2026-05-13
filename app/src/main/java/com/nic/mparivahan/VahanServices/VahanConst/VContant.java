package com.nic.mparivahan.VahanServices.VahanConst;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.Model.VTHypthEntity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.Latesttaxdetails;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerIdentification;
import com.nic.mparivahan.VahanServices.VahanModel.PermitDetailDto;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModle;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.VtInsuranceCommonDto;
import com.nic.mparivahan.VahanServices.VahanModel.Vtpucc;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity;
import com.zepto.gd1;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanConst/VContant;", "", "()V", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VContant {
    public static final String AAHARAUTH = "AadhaarAuth";
    public static final String ACTIVITY = "Activity";
    public static final String ACTIVITY_TYPE = "ActivityType";
    public static final String ALTERATION = "Alteration";
    public static final String ALTERATION_CODE = "ALT001";
    public static final String ALTERATION_PURPOSE_CODE = "16";
    public static final String APPLICATION_SCREEN = "2";
    public static final String APP_NO = "App_no";
    public static final String AUTHMODE = "AuthMode";
    public static final String BOOKSLOT = "BookSlot";
    public static final String CHANGE_OF_ADDRESS = "Change_of_Address";
    public static final String CHANGE_OF_ADDRESS_CODE = "COD001";
    public static final String CHANGE_OF_ADDRESS_PURPOSE_CODE = "4";
    public static final String COMPOUND_FEE = "COMPOUND_FEE";
    public static final String COMPOUND_FEE_CODE = "COMP001";
    public static final String DUPLICATE_FITNESS = "Duplicate_Fitness";
    public static final String DUPLICATE_FITNESS_CODE = "DFC001";
    public static final String DUPLICATE_FITNESS_PURPOSE_CODE = "14";
    public static final String DUPLICATE_PERMIT = "Duplicate_Permit";
    public static final String DUPLICATE_PERMIT_CODE = "DP001";
    public static final String DUPLICATE_PERMIT_PURPOSE_CODE = "34";
    public static final String DUPLICATE_RC = "Duplicate_RC";
    public static final String DUPLICATE_RC_CODE = "DRC001";
    public static final String DUPLICATE_RC_PURPOSE_CODE = "3";
    public static final String FINAL_SUBMIT = "Final_Submit";
    public static final String HYPOTHECATION_ADDITION = "Hypothecation_Addition";
    public static final String HYPOTHECATION_ADDITION_CODE = "HPA001";
    public static final String HYPOTHECATION_ADDITION_PURPOSE_CODE = "6";
    public static final String HYPOTHECATION_CONTINUATION = "Hypothecation_Continuation";
    public static final String HYPOTHECATION_CONTINUATION_CODE = "HPC001";
    public static final String HYPOTHECATION_CONTINUATION_PURPOSE_CODE = "8";
    public static final String HYPOTHICATION_TERMINATION = "Hypothication_Termination";
    public static final String HYPOTHICATION_TERMINATION_CODE = "HT001";
    public static final String HYPOTHICATION_TERMINATION_PURPOSE_CODE = "7";
    public static final String MAINSCREEN = "1";
    public static final String MISELL_CODE = "MIS001";
    public static final String MISELL_PAYMENT = "MISELL_Payment";
    public static final String MISELL_PURPOSE_CODE = "48";
    public static final String MOBAUTH = "MobileAuth";
    public static final String MOBILE_NUMBER_UPDATE = "4";
    public static final String MULTISERVICE_PURPOSE_CODE = "950";
    public static final String MULTI_SELECT_SERVICE = "Mult_Select";
    public static final String MULTI_SELECT_SERVICE_ARRAY = "MULTIARRAY";
    public static final String MULTI_SELECT_SERVICE_CODE = "MSS001";
    public static final String MULTI_SERVICE_DRAFT_OBJ = "MULTIDRAFT";
    public static final String M_VALUE = "MethordValue";
    public static final String NEXGEN_INTENT_CODE = "001";
    public static final String NEXGEN_addahar_address = "aadhaarAddress";
    public static final String NEXGEN_addahar_name = "aadhaarName";
    public static final String NEXGEN_isFACELESS = "Face_Less_Staus";
    public static final String NOC = "NOC";
    public static final String NOC_CODE = "NC001";
    public static final String NOC_PURPOSE_CODE = "9";
    public static final String NOMINEE_PURPOSE_CODE = "109";
    public static final String NP_CODE = "NPP001";
    public static final String NP_Permit = "NPPermit";
    public static final String Nominee_Addition = "NOMINEE_Add";
    public static final String Nominee_CODE = "NOM001";
    public static final String PAYMENT = "Payment";
    public static final String PAY_TAX = "Tax";
    public static final String PAY_TAXASS = "TaxAssesment";
    public static final String PAY_TAX_ASS_CODE = "TAXASS001";
    public static final String PAY_TAX_CODE = "TAX001";
    public static final String PERMANENT_SURRENDER_PERMIT_PURPOSE_CODE = "41";
    public static final String PERMIT_PURPOSE_CODE = "41";
    public static final String PERMIT_RENEWAL = "PERMIT_RENEWAL";
    public static final String PERMIT_RENEWAL_CODE = "PR001";
    public static final String PERMIT_TRANSFER_DEATH_PURPOSE_CODE = "29";
    public static final String PERMIT_TRANSFER_PURPOSE_CODE = "28";
    public static final String PURPOSE_CODE = "purpose_code";
    public static final String RCPARTICULAR = "RC_Particular";
    public static final String RCPARTICULAR_CODE = "RCP001";
    public static final String RCPARTICULAR_PURPOSE_CODE = "13";
    public static final String RC_CACELLATION_PURPOSE_CODE = "61";
    public static final String RC_CANCALATION = "RC_Cancellation";
    public static final String RC_CANCELLATION_CODE = "RCC001";
    public static final String RC_PERMIT_RENEWAL_PURPOSE_CODE = "27";
    public static final String RC_RELEASE = "RC_Release";
    public static final String RC_RELEASE_CODE = "RCR001";
    public static final String RC_RELEASE_PURPOSE_CODE = "66";
    public static final String RC_SURRENDER = "RC_Surrender";
    public static final String RC_SURRENDER_PURPOSE_CODE = "65";
    public static final String RC_SURRENDER_RC_CODE = "RCS001";
    public static final String REDIRECT = "GO001";
    public static final String RETENTION_NAME = "Retention of Registration Number";
    public static final String RETENTION_REGISTRATION = "RETENTION";
    public static final String RETENTION_REGISTRATION_NUMBER_CODE = "RRN001";
    public static final String RETENTION_REGISTRATION_PURPOSE_CODE = "331";
    public static final String RenewalNpAuthorization_CODE = "39";
    public static final String SERVICE_NAME = "Service_Name";
    public static final String SPEICAL_PERMIT = "SpeicalPermit";
    public static final String SPEICAL_PERMIT_CODE = "SPC001";
    public static final String SPEICAL_PERMIT_PURPOSE_CODE = "36";
    public static final String TEMPERMIT_CODE = "TEMP001";
    public static final String TRANFER_OF_OWNERSHIP = "Transfer_of_Ownership";
    public static final String TRANFER_OF_OWNERSHIP_CODE = "TO001";
    public static final String TRANFER_OF_OWNERSHIP_PURPOSE_CODE = "5";
    public static final String TRANSFER_OF_PERMIT = "TransferOfPermit";
    public static final String TRANSFER_OF_PERMIT_DEATH_CASE = "TransferOfPermitDeathCase";
    public static final String TRANSFER_OF_PERMIT_SURRENDER = "TransferOfPermitSurrender";
    public static final String TRANSFER_PERMIT_CODE = "TPC001";
    public static final String TRANSFER_PERMIT_DEATH_CODE = "TPDC001";
    public static final String TRANSFER_PERMIT_SURRENDER_CODE = "TPSC001";
    public static final String Tax_PURPOSE_CODE = "58";
    public static final String TempPermit_PURPOSE_CODE = "35";
    public static final String Temp_Permit = "TempPermit";
    public static final String UPDATE_MOBILE = "update_mobile_no";
    public static final String UPDATE_MOBILE_CODE = "UMN001";
    public static final String UPDATE_MOBILE_PURPOSE_CODE = "135";
    public static final String UPLOADDOC = "Uploaddoc";
    public static final String VAHAN_COMPOUNDFEE_OTHER_PURPOSE_CODE = "364";
    public static final String VAHAN_COMPOUNDFEE_PURPOSE_CODE = "363";
    public static final String VERIFYPAYMENT_SCREEN = "3";
    public static final String VERIFY_PAYMENT = "verifyPayment";
    public static final int vahanLogUpdateDoc = 2;
    public static final int vahanLogUpdatePayment = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] formats = {"yyyy-MM-dd'T'HH:mm:ss'Z'", "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd HH:mm:ss", "MM/dd/yyyy HH:mm:ss", "MM/dd/yyyy'T'HH:mm:ss.SSS'Z'", "MM/dd/yyyy'T'HH:mm:ss.SSSZ", "MM/dd/yyyy'T'HH:mm:ss.SSS", "MM/dd/yyyy'T'HH:mm:ssZ", "MM/dd/yyyy'T'HH:mm:ss", "yyyy:MM:dd HH:mm:ss", "yyyyMMdd"};

    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void O(Dialog d, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            d.dismiss();
        }

        public static final void Q(Dialog d, Context context, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            Intrinsics.checkNotNullParameter(context, "$context");
            d.dismiss();
            ((Activity) context).finish();
        }

        public final String A(vh7 session) {
            Intrinsics.checkNotNullParameter(session, "session");
            try {
                return StringsKt__StringsJVMKt.equals(session.c(), VContant.DUPLICATE_RC_CODE, true) ? "3" : StringsKt__StringsJVMKt.equals(session.c(), VContant.HYPOTHECATION_ADDITION_CODE, true) ? VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.HYPOTHECATION_CONTINUATION_CODE, true) ? VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.HYPOTHICATION_TERMINATION_CODE, true) ? VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.CHANGE_OF_ADDRESS_CODE, true) ? "4" : StringsKt__StringsJVMKt.equals(session.c(), VContant.TRANFER_OF_OWNERSHIP_CODE, true) ? VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.RCPARTICULAR_CODE, true) ? VContant.RCPARTICULAR_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.NOC_CODE, true) ? VContant.NOC_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.DUPLICATE_FITNESS_CODE, true) ? VContant.DUPLICATE_FITNESS_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.RC_CANCELLATION_CODE, true) ? VContant.RC_CACELLATION_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.RC_SURRENDER_RC_CODE, true) ? VContant.RC_SURRENDER_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.DUPLICATE_PERMIT_CODE, true) ? VContant.DUPLICATE_PERMIT_PURPOSE_CODE : (StringsKt__StringsJVMKt.equals(session.c(), VContant.PAY_TAX_CODE, true) || StringsKt__StringsJVMKt.equals(session.c(), VContant.PAY_TAX_ASS_CODE, true)) ? VContant.Tax_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.RC_RELEASE_CODE, true) ? VContant.RC_RELEASE_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.TEMPERMIT_CODE, true) ? VContant.TempPermit_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.NP_CODE, true) ? VContant.RenewalNpAuthorization_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.PERMIT_RENEWAL_CODE, true) ? VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.MISELL_CODE, true) ? VContant.MISELL_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.COMPOUND_FEE_CODE, true) ? VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.ALTERATION_CODE, true) ? VContant.ALTERATION_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.UPDATE_MOBILE_CODE, true) ? VContant.UPDATE_MOBILE_PURPOSE_CODE : (StringsKt__StringsJVMKt.equals(session.c(), VContant.MULTI_SELECT_SERVICE_CODE, true) || StringsKt__StringsJVMKt.equals(session.c(), VContant.MULTI_SELECT_SERVICE_CODE, true)) ? VContant.MULTISERVICE_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.RETENTION_REGISTRATION_NUMBER_CODE, true) ? VContant.RETENTION_REGISTRATION_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(session.c(), VContant.SPEICAL_PERMIT_CODE, true) ? VContant.SPEICAL_PERMIT_PURPOSE_CODE : (StringsKt__StringsJVMKt.equals(session.c(), VContant.TRANSFER_PERMIT_CODE, true) || StringsKt__StringsJVMKt.equals(session.c(), VContant.TRANSFER_PERMIT_SURRENDER_CODE, true)) ? "41" : StringsKt__StringsJVMKt.equals(session.c(), VContant.TRANSFER_PERMIT_DEATH_CODE, true) ? "41" : "Vehicle Services";
            } catch (Exception e) {
                e.printStackTrace();
                return "Vehicle Services";
            }
        }

        public final int B(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            if (StringsKt__StringsJVMKt.equals(reason, "COMMON", true)) {
                return 0;
            }
            if (StringsKt__StringsJVMKt.equals(reason, "LOST", true)) {
                return 1;
            }
            if (StringsKt__StringsJVMKt.equals(reason, "THEFT", true)) {
                return 2;
            }
            if (StringsKt__StringsJVMKt.equals(reason, "TORN", true)) {
                return 3;
            }
            return StringsKt__StringsJVMKt.equals(reason, "OTHER", true) ? 4 : 5;
        }

        public final String C(Context context, String code) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(code, "code");
            if (StringsKt__StringsJVMKt.equals(code, "3", true)) {
                return "Issue of Duplicate RC";
            }
            if (StringsKt__StringsJVMKt.equals(code, "4", true)) {
                return "Change of Address in RC";
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, true)) {
                return "Hypothecation Addition";
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, true)) {
                return "Hypothication Termination";
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, true)) {
                return "Hypothecation Continuation";
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.RCPARTICULAR_PURPOSE_CODE, true)) {
                return "RC Particular";
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.NOC_PURPOSE_CODE, true)) {
                return "No Objection Certificate (NOC)";
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.TempPermit_PURPOSE_CODE, true)) {
                return "Temporary Permit";
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.DUPLICATE_FITNESS_PURPOSE_CODE, true)) {
                String string = context.getString(R.string.duplicate_fitness);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.DUPLICATE_PERMIT_PURPOSE_CODE, true)) {
                String string2 = context.getString(R.string.duplicate_permit_certificate);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            if (!StringsKt__StringsJVMKt.equals(code, VContant.RC_SURRENDER_PURPOSE_CODE, true)) {
                return StringsKt__StringsJVMKt.equals(code, VContant.RC_CACELLATION_PURPOSE_CODE, true) ? "RC Cancellation" : StringsKt__StringsJVMKt.equals(code, VContant.NOMINEE_PURPOSE_CODE, true) ? "Addition of Nominee" : StringsKt__StringsJVMKt.equals(code, VContant.RC_RELEASE_PURPOSE_CODE, true) ? "RC Release" : StringsKt__StringsJVMKt.equals(code, VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE, true) ? "Compounding Fee Payment" : StringsKt__StringsJVMKt.equals(code, VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE, true) ? "Permit Renewal" : StringsKt__StringsJVMKt.equals(code, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true) ? "Transfer of Ownership" : "Vehicle Services";
            }
            String string3 = context.getString(R.string.rc_surrender);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }

        public final String D(Context context, String code) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(code, "code");
            if (!StringsKt__StringsJVMKt.equals(code, "3", true) && !StringsKt__StringsJVMKt.equals(code, "4", true) && !StringsKt__StringsJVMKt.equals(code, VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, true) && !StringsKt__StringsJVMKt.equals(code, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, true) && !StringsKt__StringsJVMKt.equals(code, VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, true) && !StringsKt__StringsJVMKt.equals(code, VContant.RCPARTICULAR_PURPOSE_CODE, true) && !StringsKt__StringsJVMKt.equals(code, VContant.NOC_PURPOSE_CODE, true) && !StringsKt__StringsJVMKt.equals(code, VContant.TempPermit_PURPOSE_CODE, true) && !StringsKt__StringsJVMKt.equals(code, VContant.DUPLICATE_FITNESS_PURPOSE_CODE, true) && !StringsKt__StringsJVMKt.equals(code, VContant.DUPLICATE_PERMIT_PURPOSE_CODE, true)) {
                if (!StringsKt__StringsJVMKt.equals(code, VContant.RC_SURRENDER_PURPOSE_CODE, true)) {
                    return StringsKt__StringsJVMKt.equals(code, VContant.RC_CACELLATION_PURPOSE_CODE, true) ? "RC Cancellation" : StringsKt__StringsJVMKt.equals(code, VContant.NOMINEE_PURPOSE_CODE, true) ? "Addition of Nominee" : StringsKt__StringsJVMKt.equals(code, VContant.RC_RELEASE_PURPOSE_CODE, true) ? "RC Release" : StringsKt__StringsJVMKt.equals(code, VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE, true) ? "Compounding Fee Payment" : StringsKt__StringsJVMKt.equals(code, VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE, true) ? "Permit Renewal" : StringsKt__StringsJVMKt.equals(code, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true) ? "Transfer of \nOwnership" : "Vehicle Services";
                }
                String string = context.getString(R.string.rc_surrender);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            return L(context, code);
        }

        public final ArrayList E() {
            ArrayList arrayList = new ArrayList();
            for (int i = 1; i < 121; i++) {
                arrayList.add(String.valueOf(i));
            }
            return arrayList;
        }

        public final ArrayList F() {
            ArrayList arrayList = new ArrayList();
            for (int i = 1; i < 5; i++) {
                arrayList.add(String.valueOf(i));
            }
            return arrayList;
        }

        public final ArrayList G() {
            ArrayList arrayList = new ArrayList();
            for (int i = 1; i < 18; i++) {
                arrayList.add(String.valueOf(i));
            }
            return arrayList;
        }

        public final boolean H(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            ArrayList arrayList = new ArrayList();
            arrayList.add(VContant.APPLICATION_SCREEN);
            arrayList.add("2.0");
            arrayList.add("3");
            arrayList.add("4");
            arrayList.add(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
            arrayList.add(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
            arrayList.add(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE);
            arrayList.add(VContant.NOC_PURPOSE_CODE);
            arrayList.add(VContant.RCPARTICULAR_PURPOSE_CODE);
            arrayList.add("3.0");
            arrayList.add("4.0");
            arrayList.add("6.0");
            arrayList.add("7.0");
            arrayList.add("8.0");
            arrayList.add("9.0");
            arrayList.add("13.0");
            arrayList.add(VContant.DUPLICATE_FITNESS_PURPOSE_CODE);
            arrayList.add("14.0");
            arrayList.add(VContant.DUPLICATE_PERMIT_PURPOSE_CODE);
            arrayList.add("34.0");
            arrayList.add(VContant.RC_CACELLATION_PURPOSE_CODE);
            arrayList.add("61.0");
            arrayList.add(VContant.RC_SURRENDER_PURPOSE_CODE);
            arrayList.add("65.0");
            arrayList.add(VContant.RC_RELEASE_PURPOSE_CODE);
            arrayList.add("66.0");
            arrayList.add(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
            arrayList.add("5.0");
            arrayList.add(VContant.RenewalNpAuthorization_CODE);
            arrayList.add("39.0");
            arrayList.add(VContant.Tax_PURPOSE_CODE);
            arrayList.add("58.0");
            arrayList.add(VContant.TempPermit_PURPOSE_CODE);
            arrayList.add("35.0");
            arrayList.add(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
            arrayList.add("5.0");
            arrayList.add(VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE);
            arrayList.add("363.0");
            arrayList.add(VContant.VAHAN_COMPOUNDFEE_OTHER_PURPOSE_CODE);
            arrayList.add("364.0");
            arrayList.add(VContant.NOMINEE_PURPOSE_CODE);
            arrayList.add("109.0");
            arrayList.add(VContant.MISELL_PURPOSE_CODE);
            arrayList.add("48.0");
            arrayList.add(VContant.ALTERATION_PURPOSE_CODE);
            arrayList.add("16.0");
            arrayList.add("27.0");
            arrayList.add(VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE);
            arrayList.add("135.0");
            arrayList.add(VContant.UPDATE_MOBILE_PURPOSE_CODE);
            return arrayList.contains(code);
        }

        public final List I(String jsonArrayString) {
            Intrinsics.checkNotNullParameter(jsonArrayString, "jsonArrayString");
            List list = (List) new Gson().fromJson(jsonArrayString, new TypeToken<List<? extends RtoNameModleItem>>() { // from class: com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion$parseJsonArrayWithCondition$listType$1
            }.getType());
            Intrinsics.checkNotNull(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Integer.parseInt(((RtoNameModleItem) obj).getOff_type_cd()) >= 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final List J(String jsonArrayString) {
            Intrinsics.checkNotNullParameter(jsonArrayString, "jsonArrayString");
            List list = (List) new Gson().fromJson(jsonArrayString, new TypeToken<List<? extends RtoNameModleItem>>() { // from class: com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion$passForNocRTO$listType$1
            }.getType());
            Intrinsics.checkNotNull(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt__StringsJVMKt.equals(((RtoNameModleItem) obj).getOff_type_cd(), "0", true)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final void K(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ((Activity) context).finish();
        }

        public final String L(Context context, String code) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(code, "code");
            if (StringsKt__StringsJVMKt.equals(code, "3", true)) {
                return ta3.a.P(context, "Issue of Duplicate RC");
            }
            if (StringsKt__StringsJVMKt.equals(code, "4", true)) {
                return ta3.a.P(context, "Change of Address in RC");
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, true)) {
                return ta3.a.P(context, "Hypothecation Addition");
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, true)) {
                return ta3.a.P(context, "Hypothication Termination");
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, true)) {
                return ta3.a.P(context, "Hypothecation Continuation");
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.RCPARTICULAR_PURPOSE_CODE, true)) {
                return ta3.a.P(context, "RC Particular");
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.NOC_PURPOSE_CODE, true)) {
                return ta3.a.P(context, "No Objection Certificate (NOC)");
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.TempPermit_PURPOSE_CODE, true)) {
                return ta3.a.P(context, "Temporary Permit");
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.DUPLICATE_FITNESS_PURPOSE_CODE, true)) {
                ta3.a aVar = ta3.a;
                String string = context.getString(R.string.duplicate_fitness);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return aVar.P(context, string);
            }
            if (StringsKt__StringsJVMKt.equals(code, VContant.DUPLICATE_PERMIT_PURPOSE_CODE, true)) {
                ta3.a aVar2 = ta3.a;
                String string2 = context.getString(R.string.duplicate_permit_certificate);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return aVar2.P(context, string2);
            }
            if (!StringsKt__StringsJVMKt.equals(code, VContant.RC_SURRENDER_PURPOSE_CODE, true)) {
                return StringsKt__StringsJVMKt.equals(code, VContant.RC_CACELLATION_PURPOSE_CODE, true) ? ta3.a.P(context, "RC Cancellation") : StringsKt__StringsJVMKt.equals(code, VContant.NOMINEE_PURPOSE_CODE, true) ? ta3.a.P(context, "Addition of Nominee") : StringsKt__StringsJVMKt.equals(code, VContant.RC_RELEASE_PURPOSE_CODE, true) ? ta3.a.P(context, "RC Release") : StringsKt__StringsJVMKt.equals(code, VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE, true) ? ta3.a.P(context, "Compounding Fee Payment") : StringsKt__StringsJVMKt.equals(code, VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE, true) ? ta3.a.P(context, "Permit Renewal") : StringsKt__StringsJVMKt.equals(code, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true) ? ta3.a.P(context, "Transfer of Ownership") : StringsKt__StringsJVMKt.equals(code, VContant.UPDATE_MOBILE_PURPOSE_CODE, true) ? ta3.a.P(context, "Update Mobile No") : StringsKt__StringsJVMKt.equals(code, VContant.SPEICAL_PERMIT_PURPOSE_CODE, true) ? ta3.a.P(context, "Special Permit") : "Vehicle Services";
            }
            ta3.a aVar3 = ta3.a;
            String string3 = context.getString(R.string.rc_surrender);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return aVar3.P(context, string3);
        }

        public final void M(boolean z, View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (z) {
                view.setVisibility(8);
            }
        }

        public final void N(Context context, String str) {
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
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById).setText(str);
            wa3 wa3Var = new wa3(context);
            ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
            textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xt6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VContant.Companion.O(dialog, view);
                }
            });
            dialog.show();
        }

        public final void P(final Context context, String str) {
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
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById).setText(str);
            wa3 wa3Var = new wa3(context);
            ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
            textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wt6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VContant.Companion.Q(dialog, context, view);
                }
            });
            dialog.show();
        }

        public final NrvDetails c(OwnerDetailPuccPermit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String str = it.getP_add1() + ", " + it.getP_add2() + ',' + it.getP_add3();
            String str2 = it.getC_add1() + ", " + it.getC_add2() + ',' + it.getC_add3();
            String fit_upto = it.getFit_upto();
            VTHypthEntity vTHypthEntity = it.getVTHypthEntity();
            String fncr_name = vTHypthEntity != null ? vTHypthEntity.getFncr_name() : null;
            String strV = v(it.getVtInsuranceCommonDto());
            VtInsuranceCommonDto vtInsuranceCommonDto = it.getVtInsuranceCommonDto();
            String issuerName = vtInsuranceCommonDto != null ? vtInsuranceCommonDto.getIssuerName() : null;
            String strZ = z(it.getVtInsuranceCommonDto());
            Vtpucc vtpucc = it.getVtpucc();
            String strValueOf = String.valueOf(vtpucc != null ? vtpucc.getPucc_upto() : null);
            Vtpucc vtpucc2 = it.getVtpucc();
            String strValueOf2 = String.valueOf(vtpucc2 != null ? vtpucc2.getPucc_no() : null);
            PermitDetailDto permitDetailDto = it.getPermitDetailDto();
            String permitValidUpto = permitDetailDto != null ? permitDetailDto.getPermitValidUpto() : null;
            PermitDetailDto permitDetailDto2 = it.getPermitDetailDto();
            String permitValidFrom = permitDetailDto2 != null ? permitDetailDto2.getPermitValidFrom() : null;
            PermitDetailDto permitDetailDto3 = it.getPermitDetailDto();
            String permitType = permitDetailDto3 != null ? permitDetailDto3.getPermitType() : null;
            PermitDetailDto permitDetailDto4 = it.getPermitDetailDto();
            String issue_dt = permitDetailDto4 != null ? permitDetailDto4.getIssue_dt() : null;
            PermitDetailDto permitDetailDto5 = it.getPermitDetailDto();
            String pmt_no = permitDetailDto5 != null ? permitDetailDto5.getPmt_no() : null;
            Latesttaxdetails latesttaxdetails = it.getLatesttaxdetails();
            String strValueOf3 = String.valueOf(latesttaxdetails != null ? latesttaxdetails.getTax_upto() : null);
            String norms_descr = it.getNorms_descr();
            String fuel_descr = it.getFuel_descr();
            String regn_dt = it.getRegn_dt();
            String model_name = it.getModel_name();
            String maker_name = it.getMaker_name();
            String vch_catg = it.getVch_catg();
            String vh_class_desc = it.getVh_class_desc();
            String f_name = it.getF_name();
            String owner_name = it.getOwner_name();
            String c_state = it.getC_state();
            String chasi_no = it.getChasi_no();
            String eng_no = it.getEng_no();
            OwnerIdentification ownerIdentification = it.getOwnerIdentification();
            String strValueOf4 = String.valueOf(ownerIdentification != null ? ownerIdentification.getMobile_no() : null);
            String strValueOf5 = String.valueOf(it.getOff_cd());
            String owner_name2 = it.getOwner_name();
            String regn_no = it.getRegn_no();
            String state_cd = it.getState_cd();
            String vch_catg2 = it.getVch_catg();
            String strValueOf6 = String.valueOf(it.getVh_class());
            String vehType = it.getVehType();
            Integer vehTypeAsInt = it.getVehTypeAsInt();
            Integer seat_cap = it.getSeat_cap();
            Integer owner_sr = it.getOwner_sr();
            PermitDetailDto permitDetailDto6 = it.getPermitDetailDto();
            Object pmt_type_code = permitDetailDto6 != null ? permitDetailDto6.getPmt_type_code() : null;
            PermitDetailDto permitDetailDto7 = it.getPermitDetailDto();
            Object pmt_catg_code = permitDetailDto7 != null ? permitDetailDto7.getPmt_catg_code() : null;
            VtInsuranceCommonDto vtInsuranceCommonDto2 = it.getVtInsuranceCommonDto();
            return new NrvDetails(fit_upto, fncr_name, strV, issuerName, strZ, strValueOf, strValueOf2, "", "", "", permitValidUpto, permitValidFrom, permitType, issue_dt, pmt_no, strValueOf3, norms_descr, fuel_descr, regn_dt, model_name, maker_name, vch_catg, vh_class_desc, f_name, owner_name, c_state, chasi_no, eng_no, strValueOf4, strValueOf5, owner_name2, str, str2, regn_no, state_cd, vch_catg2, strValueOf6, vehType, vehTypeAsInt, seat_cap, owner_sr, pmt_type_code, pmt_catg_code, vtInsuranceCommonDto2 != null ? vtInsuranceCommonDto2.getInsuranceFrom() : null, it.getVTHypthEntity());
        }

        public final NrvDetails d(OwnerDetailEntity it, String enteredMobileNo) {
            Intrinsics.checkNotNullParameter(it, "it");
            Intrinsics.checkNotNullParameter(enteredMobileNo, "enteredMobileNo");
            return new NrvDetails(it.getFit_upto(), "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", it.getNorms_descr(), it.getFuel_descr(), it.getRegn_dt(), it.getModel_name(), it.getMaker_name(), it.getVch_catg(), it.getVh_class_desc(), it.getF_name(), it.getOwner_name(), it.getC_state(), it.getChasi_no(), it.getEng_no(), enteredMobileNo.toString(), String.valueOf(it.getOff_cd()), it.getOwner_name(), it.getP_add1() + ", " + it.getP_add2() + ',' + it.getP_add3(), it.getC_add1() + ", " + it.getC_add2() + ',' + it.getC_add3(), it.getRegn_no(), it.getState_cd(), it.getVch_catg(), String.valueOf(it.getVh_class()), "", 0, it.getSeat_cap(), it.getOwner_sr(), "", "", "", null);
        }

        public final NrvDetails e(OwnerDetailPuccPermit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String str = it.getP_add1() + ", " + it.getP_add2() + ',' + it.getP_add3();
            String str2 = it.getC_add1() + ", " + it.getC_add2() + ',' + it.getC_add3();
            String fit_upto = it.getFit_upto();
            VTHypthEntity vTHypthEntity = it.getVTHypthEntity();
            String fncr_name = vTHypthEntity != null ? vTHypthEntity.getFncr_name() : null;
            String strV = v(it.getVtInsuranceCommonDto());
            VtInsuranceCommonDto vtInsuranceCommonDto = it.getVtInsuranceCommonDto();
            String issuerName = vtInsuranceCommonDto != null ? vtInsuranceCommonDto.getIssuerName() : null;
            String strZ = z(it.getVtInsuranceCommonDto());
            Vtpucc vtpucc = it.getVtpucc();
            String strValueOf = String.valueOf(vtpucc != null ? vtpucc.getPucc_upto() : null);
            Vtpucc vtpucc2 = it.getVtpucc();
            String strValueOf2 = String.valueOf(vtpucc2 != null ? vtpucc2.getPucc_no() : null);
            PermitDetailDto permitDetailDto = it.getPermitDetailDto();
            String permitValidUpto = permitDetailDto != null ? permitDetailDto.getPermitValidUpto() : null;
            PermitDetailDto permitDetailDto2 = it.getPermitDetailDto();
            String permitValidFrom = permitDetailDto2 != null ? permitDetailDto2.getPermitValidFrom() : null;
            PermitDetailDto permitDetailDto3 = it.getPermitDetailDto();
            String permitType = permitDetailDto3 != null ? permitDetailDto3.getPermitType() : null;
            PermitDetailDto permitDetailDto4 = it.getPermitDetailDto();
            String strValueOf3 = String.valueOf(permitDetailDto4 != null ? permitDetailDto4.getIssue_dt() : null);
            PermitDetailDto permitDetailDto5 = it.getPermitDetailDto();
            String pmt_no = permitDetailDto5 != null ? permitDetailDto5.getPmt_no() : null;
            Latesttaxdetails latesttaxdetails = it.getLatesttaxdetails();
            String strValueOf4 = String.valueOf(latesttaxdetails != null ? latesttaxdetails.getTax_upto() : null);
            String norms_descr = it.getNorms_descr();
            String fuel_descr = it.getFuel_descr();
            String regn_dt = it.getRegn_dt();
            String model_name = it.getModel_name();
            String maker_name = it.getMaker_name();
            String vch_catg = it.getVch_catg();
            String vh_class_desc = it.getVh_class_desc();
            String f_name = it.getF_name();
            String owner_name = it.getOwner_name();
            String c_state = it.getC_state();
            String chasi_no = it.getChasi_no();
            String eng_no = it.getEng_no();
            OwnerIdentification ownerIdentification = it.getOwnerIdentification();
            String strValueOf5 = String.valueOf(ownerIdentification != null ? ownerIdentification.getMobile_no() : null);
            String strValueOf6 = String.valueOf(it.getOff_cd());
            String owner_name2 = it.getOwner_name();
            String regn_no = it.getRegn_no();
            String state_cd = it.getState_cd();
            String vch_catg2 = it.getVch_catg();
            String strValueOf7 = String.valueOf(it.getVh_class());
            String vehType = it.getVehType();
            Integer vehTypeAsInt = it.getVehTypeAsInt();
            Integer seat_cap = it.getSeat_cap();
            Integer owner_sr = it.getOwner_sr();
            PermitDetailDto permitDetailDto6 = it.getPermitDetailDto();
            Object pmt_type_code = permitDetailDto6 != null ? permitDetailDto6.getPmt_type_code() : null;
            PermitDetailDto permitDetailDto7 = it.getPermitDetailDto();
            Object pmt_catg_code = permitDetailDto7 != null ? permitDetailDto7.getPmt_catg_code() : null;
            VtInsuranceCommonDto vtInsuranceCommonDto2 = it.getVtInsuranceCommonDto();
            return new NrvDetails(fit_upto, fncr_name, strV, issuerName, strZ, strValueOf, strValueOf2, "", "", "", permitValidUpto, permitValidFrom, permitType, strValueOf3, pmt_no, strValueOf4, norms_descr, fuel_descr, regn_dt, model_name, maker_name, vch_catg, vh_class_desc, f_name, owner_name, c_state, chasi_no, eng_no, strValueOf5, strValueOf6, owner_name2, str, str2, regn_no, state_cd, vch_catg2, strValueOf7, vehType, vehTypeAsInt, seat_cap, owner_sr, pmt_type_code, pmt_catg_code, vtInsuranceCommonDto2 != null ? vtInsuranceCommonDto2.getInsuranceFrom() : null, null);
        }

        public final boolean f(String purpose_code) {
            Intrinsics.checkNotNullParameter(purpose_code, "purpose_code");
            ArrayList arrayList = new ArrayList();
            arrayList.add(VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE);
            arrayList.add(VContant.DUPLICATE_PERMIT_PURPOSE_CODE);
            arrayList.add(VContant.TempPermit_PURPOSE_CODE);
            arrayList.add(VContant.RenewalNpAuthorization_CODE);
            arrayList.add(VContant.SPEICAL_PERMIT_PURPOSE_CODE);
            arrayList.add(VContant.PERMIT_TRANSFER_PURPOSE_CODE);
            arrayList.add("41");
            arrayList.add(VContant.PERMIT_TRANSFER_DEATH_PURPOSE_CODE);
            arrayList.add("41");
            return arrayList.contains(purpose_code);
        }

        public final String g(HashMap serviceSelection_HashMap) {
            Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
            return serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC) ? "3" : serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP) ? VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS) ? "4" : serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION) ? VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION) ? VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION) ? VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR) ? VContant.RCPARTICULAR_PURPOSE_CODE : (serviceSelection_HashMap.containsKey(VContant.NOC) || serviceSelection_HashMap.containsKey(VContant.NOC)) ? VContant.NOC_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.DUPLICATE_FITNESS) ? VContant.DUPLICATE_FITNESS_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.RC_CANCALATION) ? VContant.RC_CACELLATION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.RC_SURRENDER) ? VContant.RC_SURRENDER_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP) ? VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.PERMIT_RENEWAL) ? VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.ALTERATION) ? VContant.ALTERATION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.MULTI_SELECT_SERVICE) ? VContant.MULTISERVICE_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.UPDATE_MOBILE) ? VContant.UPDATE_MOBILE_PURPOSE_CODE : "500";
        }

        public final RtoNameModle h(String authority) {
            Intrinsics.checkNotNullParameter(authority, "authority");
            RtoNameModle rtoNameModle = new RtoNameModle();
            rtoNameModle.addAll(VContant.INSTANCE.I(authority));
            return rtoNameModle;
        }

        public final ArrayList i(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            Intrinsics.checkNotNull(arrayList);
            if (arrayList.size() > 0) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(String.valueOf(((Number) arrayList.get(i)).intValue()));
                }
            }
            return arrayList2;
        }

        public final RtoNameModle j(String authorty) {
            Intrinsics.checkNotNullParameter(authorty, "authorty");
            RtoNameModle rtoNameModle = new RtoNameModle();
            rtoNameModle.addAll(VContant.INSTANCE.J(authorty));
            return rtoNameModle;
        }

        public final ArrayList k(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            Intrinsics.checkNotNull(arrayList);
            if (arrayList.size() > 0) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = arrayList.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    arrayList2.add(Integer.valueOf(Integer.parseInt((String) obj)));
                }
            }
            return arrayList2;
        }

        public final String l(String State_code) {
            Intrinsics.checkNotNullParameter(State_code, "State_code");
            HashMap map = new HashMap();
            map.put("AN", "Andaman and Nicobar Islands");
            map.put("AP", "Andhra Pradesh");
            map.put("AR", "Arunachal Pradesh");
            map.put("AS", "Assam");
            map.put("BR", "Bihar");
            map.put("CG", "Chhattisgarh");
            map.put("CH", "Chandigarh");
            map.put("DH", "Dadra and Nagar Haveli");
            map.put("DD", "Daman and Diu");
            map.put("DL", "Delhi");
            map.put("GA", "Goa");
            map.put("GJ", "Gujarat");
            map.put("HR", "Haryana");
            map.put("HP", "Himachal Pradesh");
            map.put("JK", "Jammu and Kashmir");
            map.put("JH", "Jharkhand");
            map.put("KA", "Karnataka");
            map.put("KL", "Kerala");
            map.put("LD", "Lakshadweep");
            map.put("MP", "Madhya Pradesh");
            map.put("MH", "Maharashtra");
            map.put("MN", "Manipur");
            map.put("ML", "Meghalaya");
            map.put("MZ", "Mizoram");
            map.put("NL", "Nagaland");
            map.put("OR", "Odisha");
            map.put("OD", "Odisha");
            map.put("PY", "Puducherry");
            map.put("PB", "Punjab");
            map.put("RJ", "Rajasthan");
            map.put("SK", "Sikkim");
            map.put("TN", "Tamil Nadu");
            map.put("TS", "Telangana");
            map.put("TR", "Tripura");
            map.put("UK", "Uttarakhand");
            map.put("UP", "Uttar Pradesh");
            map.put("WB", "West Bengal");
            return String.valueOf(map.get(State_code));
        }

        public final HashMap m(HashMap stateList) {
            Intrinsics.checkNotNullParameter(stateList, "stateList");
            stateList.clear();
            stateList.put("AN", "Andaman and Nicobar Islands");
            stateList.put("AP", "Andhra Pradesh");
            stateList.put("AR", "Arunachal Pradesh");
            stateList.put("AS", "Assam");
            stateList.put("BR", "Bihar");
            stateList.put("CG", "Chandigarh");
            stateList.put("CH", "Chandigarh");
            stateList.put("DH", "Dadra and Nagar Haveli");
            stateList.put("DD", "Daman and Diu");
            stateList.put("DL", "Delhi");
            stateList.put("GA", "Goa");
            stateList.put("GJ", "Gujarat");
            stateList.put("HR", "Haryana");
            stateList.put("HP", "Himachal Pradesh");
            stateList.put("JK", "Jammu and Kashmir");
            stateList.put("JH", "Jharkhand");
            stateList.put("KA", "Karnataka");
            stateList.put("KL", "Kerala");
            stateList.put("LD", "Lakshadweep");
            stateList.put("MP", "Madhya Pradesh");
            stateList.put("MH", "Maharashtra");
            stateList.put("MN", "Manipur");
            stateList.put("ML", "Meghalaya");
            stateList.put("MZ", "Mizoram");
            stateList.put("NL", "Nagaland");
            stateList.put("OR", "Odisha");
            stateList.put("PY", "Puducherry");
            stateList.put("PB", "Punjab");
            stateList.put("RJ", "Rajasthan");
            stateList.put("SK", "Sikkim");
            stateList.put("TN", "Tamil Nadu");
            stateList.put("TS", "Telangana");
            stateList.put("TR", "Tripura");
            stateList.put("UK", "Uttarakhand");
            stateList.put("UP", "Uttar Pradesh");
            stateList.put("WB", "West Bengal");
            return stateList;
        }

        public final String n(Context context, vh7 session) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(session, "session");
            try {
                return StringsKt__StringsJVMKt.equals(session.c(), VContant.DUPLICATE_RC_CODE, true) ? ta3.a.P(context, "Issue of Duplicate RC") : StringsKt__StringsJVMKt.equals(session.c(), VContant.HYPOTHECATION_ADDITION_CODE, true) ? ta3.a.P(context, "Hypothecation Addition") : StringsKt__StringsJVMKt.equals(session.c(), VContant.HYPOTHECATION_CONTINUATION_CODE, true) ? ta3.a.P(context, "Hypothecation Continuation") : StringsKt__StringsJVMKt.equals(session.c(), VContant.HYPOTHICATION_TERMINATION_CODE, true) ? ta3.a.P(context, "Hypothecation Termination") : StringsKt__StringsJVMKt.equals(session.c(), VContant.CHANGE_OF_ADDRESS_CODE, true) ? ta3.a.P(context, "Change of Address in RC") : StringsKt__StringsJVMKt.equals(session.c(), VContant.TRANFER_OF_OWNERSHIP_CODE, true) ? ta3.a.P(context, "Transfer of Ownership") : StringsKt__StringsJVMKt.equals(session.c(), VContant.RCPARTICULAR_CODE, true) ? ta3.a.P(context, "RC Particulars against Fee") : StringsKt__StringsJVMKt.equals(session.c(), VContant.NOC_CODE, true) ? ta3.a.P(context, "No Objection Certificate (NOC)") : StringsKt__StringsJVMKt.equals(session.c(), VContant.DUPLICATE_FITNESS_CODE, true) ? ta3.a.P(context, "Duplicate Fitness Certificate") : StringsKt__StringsJVMKt.equals(session.c(), VContant.DUPLICATE_PERMIT_CODE, true) ? ta3.a.P(context, "Duplicate Permit Certificate") : StringsKt__StringsJVMKt.equals(session.c(), VContant.RC_SURRENDER_RC_CODE, true) ? ta3.a.P(context, "RC Surrender") : StringsKt__StringsJVMKt.equals(session.c(), VContant.RC_CANCELLATION_CODE, true) ? ta3.a.P(context, "RC Cancellation") : StringsKt__StringsJVMKt.equals(session.c(), VContant.PAY_TAX_CODE, true) ? ta3.a.P(context, "Pay Tax") : StringsKt__StringsJVMKt.equals(session.c(), VContant.PAY_TAX_ASS_CODE, true) ? ta3.a.P(context, "Tax Assessment") : StringsKt__StringsJVMKt.equals(session.c(), VContant.RC_RELEASE_CODE, true) ? ta3.a.P(context, "RC Release") : StringsKt__StringsJVMKt.equals(session.c(), VContant.TEMPERMIT_CODE, true) ? ta3.a.P(context, "Temporary Permit") : StringsKt__StringsJVMKt.equals(session.c(), VContant.NP_CODE, true) ? ta3.a.P(context, "Renewal of NP Authorization Permit") : StringsKt__StringsJVMKt.equals(session.c(), VContant.PERMIT_RENEWAL_CODE, true) ? ta3.a.P(context, "Permit Renewal") : StringsKt__StringsJVMKt.equals(session.c(), VContant.COMPOUND_FEE_CODE, true) ? ta3.a.P(context, "Compounding Fee Payment") : StringsKt__StringsJVMKt.equals(session.c(), VContant.Nominee_CODE, true) ? ta3.a.P(context, "Addition of Nominee") : StringsKt__StringsJVMKt.equals(session.c(), VContant.MISELL_CODE, true) ? ta3.a.P(context, "Miscellaneous Fee Payment") : StringsKt__StringsJVMKt.equals(session.c(), VContant.ALTERATION_CODE, true) ? ta3.a.P(context, "Alteration of Vehicle") : session.c().equals(VContant.MULTI_SELECT_SERVICE_CODE) ? ta3.a.P(context, "RC Services") : session.c().equals(VContant.SPEICAL_PERMIT_CODE) ? ta3.a.P(context, "Special Permit") : StringsKt__StringsJVMKt.equals(session.c(), VContant.TRANSFER_PERMIT_CODE, true) ? ta3.a.P(context, "Transfer of Permit") : StringsKt__StringsJVMKt.equals(session.c(), VContant.TRANSFER_PERMIT_SURRENDER_CODE, true) ? ta3.a.P(context, "Permanent Surrender of Permit") : StringsKt__StringsJVMKt.equals(session.c(), VContant.TRANSFER_PERMIT_DEATH_CODE, true) ? ta3.a.P(context, "Transfer of Permit (Death Case)") : "Vehicle Services";
            } catch (Exception e) {
                e.printStackTrace();
                return "Vehicle Services";
            }
        }

        public final long o(String d) {
            Intrinsics.checkNotNullParameter(d, "d");
            int length = VContant.formats.length;
            for (int i = 0; i < length; i++) {
                try {
                    Date date = new SimpleDateFormat(VContant.formats[i]).parse(d);
                    Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
                    return date.getTime();
                } catch (Exception unused) {
                }
            }
            return 0L;
        }

        public final String p(String str) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date date = simpleDateFormat.parse(str);
                Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
                return simpleDateFormat2.format(date);
            } catch (ParseException unused) {
                return null;
            }
        }

        public final String q(String str) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
            try {
                Date date = simpleDateFormat.parse(str);
                Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
                return simpleDateFormat2.format(date);
            } catch (ParseException unused) {
                return null;
            }
        }

        public final String r(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            HashMap map = new HashMap();
            map.put("3", "IsueOfDuplicateMultiService");
            map.put("4", "ChangeOfAddressMultiService");
            map.put(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, "HypothecationTerminationActivityMultiService");
            map.put(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, "HypothecationAdditionActivityMultiService");
            map.put(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, "HypothecationContinuationActivityMulti");
            map.put(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, "TransferOfOwnerMultiScreen");
            return String.valueOf(map.get(code));
        }

        public final String s(String code, String type) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(type, "type");
            HashMap map = new HashMap();
            map.put(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, "HypothecationTerminationActivityMultiServiceTO");
            map.put(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, "HypothecationAdditionActivityMultiServiceTO");
            map.put(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, "HypothecationContinuationActivityMultiTO");
            if (StringsKt__StringsJVMKt.equals(type, "S", true)) {
                map.put(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, "TransferOfOwnerShipActivitySeller");
                map.put("3", "IsueOfDuplicateMultiServiceTO");
            } else {
                map.put(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, "TOBuyerMainActivity");
                map.put("3", "IssueOfDuplicateMultiServiceToBuyer");
            }
            return String.valueOf(map.get(code));
        }

        public final String t(String purCode, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(purCode, "purCode");
            try {
                Intrinsics.checkNotNull(arrayList);
                int iIndexOf = arrayList.indexOf(purCode) + 1;
                if (iIndexOf >= arrayList.size()) {
                    return VContant.REDIRECT;
                }
                Object obj = arrayList.get(iIndexOf);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return VContant.INSTANCE.r((String) obj);
            } catch (Exception unused) {
                return "0";
            }
        }

        public final String u(String purCode, ArrayList arrayList, String type) {
            Intrinsics.checkNotNullParameter(purCode, "purCode");
            Intrinsics.checkNotNullParameter(type, "type");
            try {
                Intrinsics.checkNotNull(arrayList);
                int iIndexOf = arrayList.indexOf(purCode) + 1;
                if (iIndexOf >= arrayList.size()) {
                    return VContant.REDIRECT;
                }
                Object obj = arrayList.get(iIndexOf);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return VContant.INSTANCE.s((String) obj, type);
            } catch (Exception unused) {
                return "0";
            }
        }

        public final String v(VtInsuranceCommonDto vtInsuranceCommonDto) {
            if (vtInsuranceCommonDto == null) {
                return " ";
            }
            gd1.a aVar = gd1.a;
            return aVar.m((String) vtInsuranceCommonDto.getInsuranceUpto()) ? aVar.m((String) vtInsuranceCommonDto.getIns_upto()) ? aVar.m((String) vtInsuranceCommonDto.getInsUpto()) ? " " : String.valueOf(vtInsuranceCommonDto.getInsUpto()) : String.valueOf(vtInsuranceCommonDto.getIns_upto()) : String.valueOf(vtInsuranceCommonDto.getInsuranceUpto());
        }

        public final boolean w(String purCode, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(purCode, "purCode");
            try {
                Intrinsics.checkNotNull(arrayList);
            } catch (Exception unused) {
            }
            return ((String) arrayList.get(arrayList.indexOf(purCode) + 1)).equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
        }

        public final String x(String periodMode) {
            Intrinsics.checkNotNullParameter(periodMode, "periodMode");
            return StringsKt__StringsJVMKt.equals(periodMode, "Days", true) ? "D" : StringsKt__StringsJVMKt.equals(periodMode, "Weeks", true) ? "W" : (StringsKt__StringsJVMKt.equals(periodMode, "Months", true) || StringsKt__StringsJVMKt.equals(periodMode, "year", true)) ? "M" : "";
        }

        public final String y(String periodMode) {
            Intrinsics.checkNotNullParameter(periodMode, "periodMode");
            String str = "Days";
            if (!periodMode.equals("Days") && !periodMode.equals("D")) {
                str = "Weeks";
                if (!periodMode.equals("Weeks") && !periodMode.equals("W")) {
                    str = "Months";
                    if (!periodMode.equals("Months") && !periodMode.equals("M")) {
                        return (StringsKt__StringsJVMKt.equals(periodMode, "year", true) || StringsKt__StringsJVMKt.equals(periodMode, "y", true)) ? "Year" : "";
                    }
                }
            }
            return str;
        }

        public final String z(VtInsuranceCommonDto vtInsuranceCommonDto) {
            if (vtInsuranceCommonDto == null) {
                return " ";
            }
            gd1.a aVar = gd1.a;
            return aVar.m(vtInsuranceCommonDto.getPolicy_no()) ? aVar.m(vtInsuranceCommonDto.getPolicyNo()) ? " " : String.valueOf(vtInsuranceCommonDto.getPolicyNo()) : String.valueOf(vtInsuranceCommonDto.getPolicy_no());
        }
    }
}
