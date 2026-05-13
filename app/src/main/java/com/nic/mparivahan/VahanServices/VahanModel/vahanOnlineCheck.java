package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bW\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0012\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0001¢\u0006\u0002\u0010#J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0001HÆ\u0003J\t\u0010I\u001a\u00020\u000fHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0012HÆ\u0003J\t\u0010L\u001a\u00020\u0012HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u000fHÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0001HÆ\u0003J\t\u0010S\u001a\u00020\u0001HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0001HÆ\u0003J\t\u0010W\u001a\u00020\u0001HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0012HÆ\u0003J\t\u0010Z\u001a\u00020\u000fHÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0001HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0001HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003Jµ\u0002\u0010d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u0001HÆ\u0001J\u0013\u0010e\u001a\u00020\u000f2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010g\u001a\u00020\u0012HÖ\u0001J\t\u0010h\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0011\u0010\u0017\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b:\u00102R\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0011\u0010\u0019\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0011\u0010\u001c\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0011\u0010\u001d\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0011\u0010\u001f\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bB\u00105R\u0011\u0010 \u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bC\u00102R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010%R\u0011\u0010\"\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bE\u0010+¨\u0006i"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/vahanOnlineCheck;", "", "allowservice_fitnessinvalid", "", "allowservice_insuranceinvalid", "allowservice_rcvalidinvalid", "allowservice_taxinvalid", "allowservice_whenblacklist", "any_where_rto_district_mapping", "challanpndingrestrictpur_cd", "fee_exempt_owner_cd", "fitnessskipcheck", "govvehiclecheck", "hptcheck_skip_pur_cd", "hsrp_mandatory", "", "isncrbblacklist", "mobile_no_checkduration", "", "mobile_no_checklimit", "mvtax_notpermittedpurcd", "ownercdinsuranceexempt", "permitpurcondtion", "rrWithTax", "service_alert_message", "service_allowed_with_pending_appl", "service_auth_mode", "service_resume", "service_stop", "servicecombination", "state_cd", "tax_nid_days", "taxrestrictedsaleamt", "taxskipcondition", "zero_vtfee_pur_cd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/Object;)V", "getAllowservice_fitnessinvalid", "()Ljava/lang/String;", "getAllowservice_insuranceinvalid", "getAllowservice_rcvalidinvalid", "getAllowservice_taxinvalid", "getAllowservice_whenblacklist", "getAny_where_rto_district_mapping", "()Ljava/lang/Object;", "getChallanpndingrestrictpur_cd", "getFee_exempt_owner_cd", "getFitnessskipcheck", "getGovvehiclecheck", "getHptcheck_skip_pur_cd", "getHsrp_mandatory", "()Z", "getIsncrbblacklist", "getMobile_no_checkduration", "()I", "getMobile_no_checklimit", "getMvtax_notpermittedpurcd", "getOwnercdinsuranceexempt", "getPermitpurcondtion", "getRrWithTax", "getService_alert_message", "getService_allowed_with_pending_appl", "getService_auth_mode", "getService_resume", "getService_stop", "getServicecombination", "getState_cd", "getTax_nid_days", "getTaxrestrictedsaleamt", "getTaxskipcondition", "getZero_vtfee_pur_cd", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class vahanOnlineCheck {
    private final String allowservice_fitnessinvalid;
    private final String allowservice_insuranceinvalid;
    private final String allowservice_rcvalidinvalid;
    private final String allowservice_taxinvalid;
    private final String allowservice_whenblacklist;
    private final Object any_where_rto_district_mapping;
    private final String challanpndingrestrictpur_cd;
    private final String fee_exempt_owner_cd;
    private final String fitnessskipcheck;
    private final String govvehiclecheck;
    private final Object hptcheck_skip_pur_cd;
    private final boolean hsrp_mandatory;
    private final String isncrbblacklist;
    private final int mobile_no_checkduration;
    private final int mobile_no_checklimit;
    private final String mvtax_notpermittedpurcd;
    private final String ownercdinsuranceexempt;
    private final String permitpurcondtion;
    private final boolean rrWithTax;
    private final Object service_alert_message;
    private final Object service_allowed_with_pending_appl;
    private final String service_auth_mode;
    private final String service_resume;
    private final Object service_stop;
    private final Object servicecombination;
    private final String state_cd;
    private final int tax_nid_days;
    private final boolean taxrestrictedsaleamt;
    private final String taxskipcondition;
    private final Object zero_vtfee_pur_cd;

    public vahanOnlineCheck(String allowservice_fitnessinvalid, String allowservice_insuranceinvalid, String allowservice_rcvalidinvalid, String allowservice_taxinvalid, String allowservice_whenblacklist, Object any_where_rto_district_mapping, String challanpndingrestrictpur_cd, String fee_exempt_owner_cd, String fitnessskipcheck, String govvehiclecheck, Object hptcheck_skip_pur_cd, boolean z, String isncrbblacklist, int i, int i2, String mvtax_notpermittedpurcd, String ownercdinsuranceexempt, String permitpurcondtion, boolean z2, Object service_alert_message, Object service_allowed_with_pending_appl, String service_auth_mode, String service_resume, Object service_stop, Object servicecombination, String state_cd, int i3, boolean z3, String taxskipcondition, Object zero_vtfee_pur_cd) {
        Intrinsics.checkNotNullParameter(allowservice_fitnessinvalid, "allowservice_fitnessinvalid");
        Intrinsics.checkNotNullParameter(allowservice_insuranceinvalid, "allowservice_insuranceinvalid");
        Intrinsics.checkNotNullParameter(allowservice_rcvalidinvalid, "allowservice_rcvalidinvalid");
        Intrinsics.checkNotNullParameter(allowservice_taxinvalid, "allowservice_taxinvalid");
        Intrinsics.checkNotNullParameter(allowservice_whenblacklist, "allowservice_whenblacklist");
        Intrinsics.checkNotNullParameter(any_where_rto_district_mapping, "any_where_rto_district_mapping");
        Intrinsics.checkNotNullParameter(challanpndingrestrictpur_cd, "challanpndingrestrictpur_cd");
        Intrinsics.checkNotNullParameter(fee_exempt_owner_cd, "fee_exempt_owner_cd");
        Intrinsics.checkNotNullParameter(fitnessskipcheck, "fitnessskipcheck");
        Intrinsics.checkNotNullParameter(govvehiclecheck, "govvehiclecheck");
        Intrinsics.checkNotNullParameter(hptcheck_skip_pur_cd, "hptcheck_skip_pur_cd");
        Intrinsics.checkNotNullParameter(isncrbblacklist, "isncrbblacklist");
        Intrinsics.checkNotNullParameter(mvtax_notpermittedpurcd, "mvtax_notpermittedpurcd");
        Intrinsics.checkNotNullParameter(ownercdinsuranceexempt, "ownercdinsuranceexempt");
        Intrinsics.checkNotNullParameter(permitpurcondtion, "permitpurcondtion");
        Intrinsics.checkNotNullParameter(service_alert_message, "service_alert_message");
        Intrinsics.checkNotNullParameter(service_allowed_with_pending_appl, "service_allowed_with_pending_appl");
        Intrinsics.checkNotNullParameter(service_auth_mode, "service_auth_mode");
        Intrinsics.checkNotNullParameter(service_resume, "service_resume");
        Intrinsics.checkNotNullParameter(service_stop, "service_stop");
        Intrinsics.checkNotNullParameter(servicecombination, "servicecombination");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(taxskipcondition, "taxskipcondition");
        Intrinsics.checkNotNullParameter(zero_vtfee_pur_cd, "zero_vtfee_pur_cd");
        this.allowservice_fitnessinvalid = allowservice_fitnessinvalid;
        this.allowservice_insuranceinvalid = allowservice_insuranceinvalid;
        this.allowservice_rcvalidinvalid = allowservice_rcvalidinvalid;
        this.allowservice_taxinvalid = allowservice_taxinvalid;
        this.allowservice_whenblacklist = allowservice_whenblacklist;
        this.any_where_rto_district_mapping = any_where_rto_district_mapping;
        this.challanpndingrestrictpur_cd = challanpndingrestrictpur_cd;
        this.fee_exempt_owner_cd = fee_exempt_owner_cd;
        this.fitnessskipcheck = fitnessskipcheck;
        this.govvehiclecheck = govvehiclecheck;
        this.hptcheck_skip_pur_cd = hptcheck_skip_pur_cd;
        this.hsrp_mandatory = z;
        this.isncrbblacklist = isncrbblacklist;
        this.mobile_no_checkduration = i;
        this.mobile_no_checklimit = i2;
        this.mvtax_notpermittedpurcd = mvtax_notpermittedpurcd;
        this.ownercdinsuranceexempt = ownercdinsuranceexempt;
        this.permitpurcondtion = permitpurcondtion;
        this.rrWithTax = z2;
        this.service_alert_message = service_alert_message;
        this.service_allowed_with_pending_appl = service_allowed_with_pending_appl;
        this.service_auth_mode = service_auth_mode;
        this.service_resume = service_resume;
        this.service_stop = service_stop;
        this.servicecombination = servicecombination;
        this.state_cd = state_cd;
        this.tax_nid_days = i3;
        this.taxrestrictedsaleamt = z3;
        this.taxskipcondition = taxskipcondition;
        this.zero_vtfee_pur_cd = zero_vtfee_pur_cd;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAllowservice_fitnessinvalid() {
        return this.allowservice_fitnessinvalid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getGovvehiclecheck() {
        return this.govvehiclecheck;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getHptcheck_skip_pur_cd() {
        return this.hptcheck_skip_pur_cd;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getHsrp_mandatory() {
        return this.hsrp_mandatory;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIsncrbblacklist() {
        return this.isncrbblacklist;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getMobile_no_checkduration() {
        return this.mobile_no_checkduration;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getMobile_no_checklimit() {
        return this.mobile_no_checklimit;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMvtax_notpermittedpurcd() {
        return this.mvtax_notpermittedpurcd;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getOwnercdinsuranceexempt() {
        return this.ownercdinsuranceexempt;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPermitpurcondtion() {
        return this.permitpurcondtion;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getRrWithTax() {
        return this.rrWithTax;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAllowservice_insuranceinvalid() {
        return this.allowservice_insuranceinvalid;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getService_alert_message() {
        return this.service_alert_message;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Object getService_allowed_with_pending_appl() {
        return this.service_allowed_with_pending_appl;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getService_auth_mode() {
        return this.service_auth_mode;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getService_resume() {
        return this.service_resume;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getService_stop() {
        return this.service_stop;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Object getServicecombination() {
        return this.servicecombination;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getTax_nid_days() {
        return this.tax_nid_days;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getTaxrestrictedsaleamt() {
        return this.taxrestrictedsaleamt;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getTaxskipcondition() {
        return this.taxskipcondition;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAllowservice_rcvalidinvalid() {
        return this.allowservice_rcvalidinvalid;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Object getZero_vtfee_pur_cd() {
        return this.zero_vtfee_pur_cd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAllowservice_taxinvalid() {
        return this.allowservice_taxinvalid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAllowservice_whenblacklist() {
        return this.allowservice_whenblacklist;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getAny_where_rto_district_mapping() {
        return this.any_where_rto_district_mapping;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChallanpndingrestrictpur_cd() {
        return this.challanpndingrestrictpur_cd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFee_exempt_owner_cd() {
        return this.fee_exempt_owner_cd;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFitnessskipcheck() {
        return this.fitnessskipcheck;
    }

    public final vahanOnlineCheck copy(String allowservice_fitnessinvalid, String allowservice_insuranceinvalid, String allowservice_rcvalidinvalid, String allowservice_taxinvalid, String allowservice_whenblacklist, Object any_where_rto_district_mapping, String challanpndingrestrictpur_cd, String fee_exempt_owner_cd, String fitnessskipcheck, String govvehiclecheck, Object hptcheck_skip_pur_cd, boolean hsrp_mandatory, String isncrbblacklist, int mobile_no_checkduration, int mobile_no_checklimit, String mvtax_notpermittedpurcd, String ownercdinsuranceexempt, String permitpurcondtion, boolean rrWithTax, Object service_alert_message, Object service_allowed_with_pending_appl, String service_auth_mode, String service_resume, Object service_stop, Object servicecombination, String state_cd, int tax_nid_days, boolean taxrestrictedsaleamt, String taxskipcondition, Object zero_vtfee_pur_cd) {
        Intrinsics.checkNotNullParameter(allowservice_fitnessinvalid, "allowservice_fitnessinvalid");
        Intrinsics.checkNotNullParameter(allowservice_insuranceinvalid, "allowservice_insuranceinvalid");
        Intrinsics.checkNotNullParameter(allowservice_rcvalidinvalid, "allowservice_rcvalidinvalid");
        Intrinsics.checkNotNullParameter(allowservice_taxinvalid, "allowservice_taxinvalid");
        Intrinsics.checkNotNullParameter(allowservice_whenblacklist, "allowservice_whenblacklist");
        Intrinsics.checkNotNullParameter(any_where_rto_district_mapping, "any_where_rto_district_mapping");
        Intrinsics.checkNotNullParameter(challanpndingrestrictpur_cd, "challanpndingrestrictpur_cd");
        Intrinsics.checkNotNullParameter(fee_exempt_owner_cd, "fee_exempt_owner_cd");
        Intrinsics.checkNotNullParameter(fitnessskipcheck, "fitnessskipcheck");
        Intrinsics.checkNotNullParameter(govvehiclecheck, "govvehiclecheck");
        Intrinsics.checkNotNullParameter(hptcheck_skip_pur_cd, "hptcheck_skip_pur_cd");
        Intrinsics.checkNotNullParameter(isncrbblacklist, "isncrbblacklist");
        Intrinsics.checkNotNullParameter(mvtax_notpermittedpurcd, "mvtax_notpermittedpurcd");
        Intrinsics.checkNotNullParameter(ownercdinsuranceexempt, "ownercdinsuranceexempt");
        Intrinsics.checkNotNullParameter(permitpurcondtion, "permitpurcondtion");
        Intrinsics.checkNotNullParameter(service_alert_message, "service_alert_message");
        Intrinsics.checkNotNullParameter(service_allowed_with_pending_appl, "service_allowed_with_pending_appl");
        Intrinsics.checkNotNullParameter(service_auth_mode, "service_auth_mode");
        Intrinsics.checkNotNullParameter(service_resume, "service_resume");
        Intrinsics.checkNotNullParameter(service_stop, "service_stop");
        Intrinsics.checkNotNullParameter(servicecombination, "servicecombination");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(taxskipcondition, "taxskipcondition");
        Intrinsics.checkNotNullParameter(zero_vtfee_pur_cd, "zero_vtfee_pur_cd");
        return new vahanOnlineCheck(allowservice_fitnessinvalid, allowservice_insuranceinvalid, allowservice_rcvalidinvalid, allowservice_taxinvalid, allowservice_whenblacklist, any_where_rto_district_mapping, challanpndingrestrictpur_cd, fee_exempt_owner_cd, fitnessskipcheck, govvehiclecheck, hptcheck_skip_pur_cd, hsrp_mandatory, isncrbblacklist, mobile_no_checkduration, mobile_no_checklimit, mvtax_notpermittedpurcd, ownercdinsuranceexempt, permitpurcondtion, rrWithTax, service_alert_message, service_allowed_with_pending_appl, service_auth_mode, service_resume, service_stop, servicecombination, state_cd, tax_nid_days, taxrestrictedsaleamt, taxskipcondition, zero_vtfee_pur_cd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof vahanOnlineCheck)) {
            return false;
        }
        vahanOnlineCheck vahanonlinecheck = (vahanOnlineCheck) other;
        return Intrinsics.areEqual(this.allowservice_fitnessinvalid, vahanonlinecheck.allowservice_fitnessinvalid) && Intrinsics.areEqual(this.allowservice_insuranceinvalid, vahanonlinecheck.allowservice_insuranceinvalid) && Intrinsics.areEqual(this.allowservice_rcvalidinvalid, vahanonlinecheck.allowservice_rcvalidinvalid) && Intrinsics.areEqual(this.allowservice_taxinvalid, vahanonlinecheck.allowservice_taxinvalid) && Intrinsics.areEqual(this.allowservice_whenblacklist, vahanonlinecheck.allowservice_whenblacklist) && Intrinsics.areEqual(this.any_where_rto_district_mapping, vahanonlinecheck.any_where_rto_district_mapping) && Intrinsics.areEqual(this.challanpndingrestrictpur_cd, vahanonlinecheck.challanpndingrestrictpur_cd) && Intrinsics.areEqual(this.fee_exempt_owner_cd, vahanonlinecheck.fee_exempt_owner_cd) && Intrinsics.areEqual(this.fitnessskipcheck, vahanonlinecheck.fitnessskipcheck) && Intrinsics.areEqual(this.govvehiclecheck, vahanonlinecheck.govvehiclecheck) && Intrinsics.areEqual(this.hptcheck_skip_pur_cd, vahanonlinecheck.hptcheck_skip_pur_cd) && this.hsrp_mandatory == vahanonlinecheck.hsrp_mandatory && Intrinsics.areEqual(this.isncrbblacklist, vahanonlinecheck.isncrbblacklist) && this.mobile_no_checkduration == vahanonlinecheck.mobile_no_checkduration && this.mobile_no_checklimit == vahanonlinecheck.mobile_no_checklimit && Intrinsics.areEqual(this.mvtax_notpermittedpurcd, vahanonlinecheck.mvtax_notpermittedpurcd) && Intrinsics.areEqual(this.ownercdinsuranceexempt, vahanonlinecheck.ownercdinsuranceexempt) && Intrinsics.areEqual(this.permitpurcondtion, vahanonlinecheck.permitpurcondtion) && this.rrWithTax == vahanonlinecheck.rrWithTax && Intrinsics.areEqual(this.service_alert_message, vahanonlinecheck.service_alert_message) && Intrinsics.areEqual(this.service_allowed_with_pending_appl, vahanonlinecheck.service_allowed_with_pending_appl) && Intrinsics.areEqual(this.service_auth_mode, vahanonlinecheck.service_auth_mode) && Intrinsics.areEqual(this.service_resume, vahanonlinecheck.service_resume) && Intrinsics.areEqual(this.service_stop, vahanonlinecheck.service_stop) && Intrinsics.areEqual(this.servicecombination, vahanonlinecheck.servicecombination) && Intrinsics.areEqual(this.state_cd, vahanonlinecheck.state_cd) && this.tax_nid_days == vahanonlinecheck.tax_nid_days && this.taxrestrictedsaleamt == vahanonlinecheck.taxrestrictedsaleamt && Intrinsics.areEqual(this.taxskipcondition, vahanonlinecheck.taxskipcondition) && Intrinsics.areEqual(this.zero_vtfee_pur_cd, vahanonlinecheck.zero_vtfee_pur_cd);
    }

    public final String getAllowservice_fitnessinvalid() {
        return this.allowservice_fitnessinvalid;
    }

    public final String getAllowservice_insuranceinvalid() {
        return this.allowservice_insuranceinvalid;
    }

    public final String getAllowservice_rcvalidinvalid() {
        return this.allowservice_rcvalidinvalid;
    }

    public final String getAllowservice_taxinvalid() {
        return this.allowservice_taxinvalid;
    }

    public final String getAllowservice_whenblacklist() {
        return this.allowservice_whenblacklist;
    }

    public final Object getAny_where_rto_district_mapping() {
        return this.any_where_rto_district_mapping;
    }

    public final String getChallanpndingrestrictpur_cd() {
        return this.challanpndingrestrictpur_cd;
    }

    public final String getFee_exempt_owner_cd() {
        return this.fee_exempt_owner_cd;
    }

    public final String getFitnessskipcheck() {
        return this.fitnessskipcheck;
    }

    public final String getGovvehiclecheck() {
        return this.govvehiclecheck;
    }

    public final Object getHptcheck_skip_pur_cd() {
        return this.hptcheck_skip_pur_cd;
    }

    public final boolean getHsrp_mandatory() {
        return this.hsrp_mandatory;
    }

    public final String getIsncrbblacklist() {
        return this.isncrbblacklist;
    }

    public final int getMobile_no_checkduration() {
        return this.mobile_no_checkduration;
    }

    public final int getMobile_no_checklimit() {
        return this.mobile_no_checklimit;
    }

    public final String getMvtax_notpermittedpurcd() {
        return this.mvtax_notpermittedpurcd;
    }

    public final String getOwnercdinsuranceexempt() {
        return this.ownercdinsuranceexempt;
    }

    public final String getPermitpurcondtion() {
        return this.permitpurcondtion;
    }

    public final boolean getRrWithTax() {
        return this.rrWithTax;
    }

    public final Object getService_alert_message() {
        return this.service_alert_message;
    }

    public final Object getService_allowed_with_pending_appl() {
        return this.service_allowed_with_pending_appl;
    }

    public final String getService_auth_mode() {
        return this.service_auth_mode;
    }

    public final String getService_resume() {
        return this.service_resume;
    }

    public final Object getService_stop() {
        return this.service_stop;
    }

    public final Object getServicecombination() {
        return this.servicecombination;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final int getTax_nid_days() {
        return this.tax_nid_days;
    }

    public final boolean getTaxrestrictedsaleamt() {
        return this.taxrestrictedsaleamt;
    }

    public final String getTaxskipcondition() {
        return this.taxskipcondition;
    }

    public final Object getZero_vtfee_pur_cd() {
        return this.zero_vtfee_pur_cd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((this.allowservice_fitnessinvalid.hashCode() * 31) + this.allowservice_insuranceinvalid.hashCode()) * 31) + this.allowservice_rcvalidinvalid.hashCode()) * 31) + this.allowservice_taxinvalid.hashCode()) * 31) + this.allowservice_whenblacklist.hashCode()) * 31) + this.any_where_rto_district_mapping.hashCode()) * 31) + this.challanpndingrestrictpur_cd.hashCode()) * 31) + this.fee_exempt_owner_cd.hashCode()) * 31) + this.fitnessskipcheck.hashCode()) * 31) + this.govvehiclecheck.hashCode()) * 31) + this.hptcheck_skip_pur_cd.hashCode()) * 31;
        boolean z = this.hsrp_mandatory;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((((((iHashCode + r1) * 31) + this.isncrbblacklist.hashCode()) * 31) + Integer.hashCode(this.mobile_no_checkduration)) * 31) + Integer.hashCode(this.mobile_no_checklimit)) * 31) + this.mvtax_notpermittedpurcd.hashCode()) * 31) + this.ownercdinsuranceexempt.hashCode()) * 31) + this.permitpurcondtion.hashCode()) * 31;
        boolean z2 = this.rrWithTax;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int iHashCode3 = (((((((((((((((((iHashCode2 + r12) * 31) + this.service_alert_message.hashCode()) * 31) + this.service_allowed_with_pending_appl.hashCode()) * 31) + this.service_auth_mode.hashCode()) * 31) + this.service_resume.hashCode()) * 31) + this.service_stop.hashCode()) * 31) + this.servicecombination.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + Integer.hashCode(this.tax_nid_days)) * 31;
        boolean z3 = this.taxrestrictedsaleamt;
        return ((((iHashCode3 + (z3 ? 1 : z3)) * 31) + this.taxskipcondition.hashCode()) * 31) + this.zero_vtfee_pur_cd.hashCode();
    }

    public String toString() {
        return "vahanOnlineCheck(allowservice_fitnessinvalid=" + this.allowservice_fitnessinvalid + ", allowservice_insuranceinvalid=" + this.allowservice_insuranceinvalid + ", allowservice_rcvalidinvalid=" + this.allowservice_rcvalidinvalid + ", allowservice_taxinvalid=" + this.allowservice_taxinvalid + ", allowservice_whenblacklist=" + this.allowservice_whenblacklist + ", any_where_rto_district_mapping=" + this.any_where_rto_district_mapping + ", challanpndingrestrictpur_cd=" + this.challanpndingrestrictpur_cd + ", fee_exempt_owner_cd=" + this.fee_exempt_owner_cd + ", fitnessskipcheck=" + this.fitnessskipcheck + ", govvehiclecheck=" + this.govvehiclecheck + ", hptcheck_skip_pur_cd=" + this.hptcheck_skip_pur_cd + ", hsrp_mandatory=" + this.hsrp_mandatory + ", isncrbblacklist=" + this.isncrbblacklist + ", mobile_no_checkduration=" + this.mobile_no_checkduration + ", mobile_no_checklimit=" + this.mobile_no_checklimit + ", mvtax_notpermittedpurcd=" + this.mvtax_notpermittedpurcd + ", ownercdinsuranceexempt=" + this.ownercdinsuranceexempt + ", permitpurcondtion=" + this.permitpurcondtion + ", rrWithTax=" + this.rrWithTax + ", service_alert_message=" + this.service_alert_message + ", service_allowed_with_pending_appl=" + this.service_allowed_with_pending_appl + ", service_auth_mode=" + this.service_auth_mode + ", service_resume=" + this.service_resume + ", service_stop=" + this.service_stop + ", servicecombination=" + this.servicecombination + ", state_cd=" + this.state_cd + ", tax_nid_days=" + this.tax_nid_days + ", taxrestrictedsaleamt=" + this.taxrestrictedsaleamt + ", taxskipcondition=" + this.taxskipcondition + ", zero_vtfee_pur_cd=" + this.zero_vtfee_pur_cd + ')';
    }
}
