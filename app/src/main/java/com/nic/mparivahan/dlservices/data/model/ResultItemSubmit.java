package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001dJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¡\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020WHÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001fR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001f¨\u0006Y"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/ResultItemSubmit;", "Ljava/io/Serializable;", "fatherName", "", "dateofBirth", "note2", "nTValidities", "note3", "note4", "applicationNo", "applicantAddress", "dlno", "referenceLink", "barCode", "applicantGender", "servicesRequested", "Lcom/nic/mparivahan/dlservices/data/model/ServicesRequested;", "dLCOVNames", "documentaryProofsRequired", "rtoLocation", "applicantname", "note1", "tRValidities", "smsConfirmation", "bioBloodGroupname", "bloodGroup", "applicationDate", "isFaceless", "llReqforRetestMsg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/ServicesRequested;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicantAddress", "()Ljava/lang/String;", "getApplicantGender", "getApplicantname", "getApplicationDate", "getApplicationNo", "getBarCode", "getBioBloodGroupname", "getBloodGroup", "getDLCOVNames", "getDateofBirth", "getDlno", "getDocumentaryProofsRequired", "getFatherName", "getLlReqforRetestMsg", "getNTValidities", "getNote1", "getNote2", "getNote3", "getNote4", "getReferenceLink", "getRtoLocation", "getServicesRequested", "()Lcom/nic/mparivahan/dlservices/data/model/ServicesRequested;", "getSmsConfirmation", "getTRValidities", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ResultItemSubmit implements Serializable {

    @xy5("applicantAddress")
    private final String applicantAddress;

    @xy5("applicantGender")
    private final String applicantGender;

    @xy5("applicantname")
    private final String applicantname;

    @xy5("applicationDate")
    private final String applicationDate;

    @xy5("applicationNo")
    private final String applicationNo;

    @xy5("barCode")
    private final String barCode;

    @xy5("bioBloodGroupname")
    private final String bioBloodGroupname;

    @xy5("bloodGroup")
    private final String bloodGroup;

    @xy5("dLCOVNames")
    private final String dLCOVNames;

    @xy5("dateofBirth")
    private final String dateofBirth;

    @xy5("dlno")
    private final String dlno;

    @xy5("documentaryProofsRequired")
    private final String documentaryProofsRequired;

    @xy5("fatherName")
    private final String fatherName;

    @xy5("isFaceless")
    private final String isFaceless;

    @xy5("llReqforRetestMsg")
    private final String llReqforRetestMsg;

    @xy5("NTValidities")
    private final String nTValidities;

    @xy5("note1")
    private final String note1;

    @xy5("note2")
    private final String note2;

    @xy5("note3")
    private final String note3;

    @xy5("note4")
    private final String note4;

    @xy5("referenceLink")
    private final String referenceLink;

    @xy5("rtoLocation")
    private final String rtoLocation;

    @xy5("servicesRequested")
    private final ServicesRequested servicesRequested;

    @xy5("smsConfirmation")
    private final String smsConfirmation;

    @xy5("TRValidities")
    private final String tRValidities;

    public ResultItemSubmit() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFatherName() {
        return this.fatherName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReferenceLink() {
        return this.referenceLink;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBarCode() {
        return this.barCode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getApplicantGender() {
        return this.applicantGender;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ServicesRequested getServicesRequested() {
        return this.servicesRequested;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDLCOVNames() {
        return this.dLCOVNames;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDocumentaryProofsRequired() {
        return this.documentaryProofsRequired;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getRtoLocation() {
        return this.rtoLocation;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getApplicantname() {
        return this.applicantname;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getNote1() {
        return this.note1;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTRValidities() {
        return this.tRValidities;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDateofBirth() {
        return this.dateofBirth;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSmsConfirmation() {
        return this.smsConfirmation;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBioBloodGroupname() {
        return this.bioBloodGroupname;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getApplicationDate() {
        return this.applicationDate;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getIsFaceless() {
        return this.isFaceless;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getLlReqforRetestMsg() {
        return this.llReqforRetestMsg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNote2() {
        return this.note2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNTValidities() {
        return this.nTValidities;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNote3() {
        return this.note3;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNote4() {
        return this.note4;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getApplicationNo() {
        return this.applicationNo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getApplicantAddress() {
        return this.applicantAddress;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDlno() {
        return this.dlno;
    }

    public final ResultItemSubmit copy(String fatherName, String dateofBirth, String note2, String nTValidities, String note3, String note4, String applicationNo, String applicantAddress, String dlno, String referenceLink, String barCode, String applicantGender, ServicesRequested servicesRequested, String dLCOVNames, String documentaryProofsRequired, String rtoLocation, String applicantname, String note1, String tRValidities, String smsConfirmation, String bioBloodGroupname, String bloodGroup, String applicationDate, String isFaceless, String llReqforRetestMsg) {
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(dateofBirth, "dateofBirth");
        Intrinsics.checkNotNullParameter(nTValidities, "nTValidities");
        Intrinsics.checkNotNullParameter(applicantGender, "applicantGender");
        Intrinsics.checkNotNullParameter(applicantname, "applicantname");
        Intrinsics.checkNotNullParameter(tRValidities, "tRValidities");
        Intrinsics.checkNotNullParameter(smsConfirmation, "smsConfirmation");
        Intrinsics.checkNotNullParameter(bioBloodGroupname, "bioBloodGroupname");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(applicationDate, "applicationDate");
        return new ResultItemSubmit(fatherName, dateofBirth, note2, nTValidities, note3, note4, applicationNo, applicantAddress, dlno, referenceLink, barCode, applicantGender, servicesRequested, dLCOVNames, documentaryProofsRequired, rtoLocation, applicantname, note1, tRValidities, smsConfirmation, bioBloodGroupname, bloodGroup, applicationDate, isFaceless, llReqforRetestMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultItemSubmit)) {
            return false;
        }
        ResultItemSubmit resultItemSubmit = (ResultItemSubmit) other;
        return Intrinsics.areEqual(this.fatherName, resultItemSubmit.fatherName) && Intrinsics.areEqual(this.dateofBirth, resultItemSubmit.dateofBirth) && Intrinsics.areEqual(this.note2, resultItemSubmit.note2) && Intrinsics.areEqual(this.nTValidities, resultItemSubmit.nTValidities) && Intrinsics.areEqual(this.note3, resultItemSubmit.note3) && Intrinsics.areEqual(this.note4, resultItemSubmit.note4) && Intrinsics.areEqual(this.applicationNo, resultItemSubmit.applicationNo) && Intrinsics.areEqual(this.applicantAddress, resultItemSubmit.applicantAddress) && Intrinsics.areEqual(this.dlno, resultItemSubmit.dlno) && Intrinsics.areEqual(this.referenceLink, resultItemSubmit.referenceLink) && Intrinsics.areEqual(this.barCode, resultItemSubmit.barCode) && Intrinsics.areEqual(this.applicantGender, resultItemSubmit.applicantGender) && Intrinsics.areEqual(this.servicesRequested, resultItemSubmit.servicesRequested) && Intrinsics.areEqual(this.dLCOVNames, resultItemSubmit.dLCOVNames) && Intrinsics.areEqual(this.documentaryProofsRequired, resultItemSubmit.documentaryProofsRequired) && Intrinsics.areEqual(this.rtoLocation, resultItemSubmit.rtoLocation) && Intrinsics.areEqual(this.applicantname, resultItemSubmit.applicantname) && Intrinsics.areEqual(this.note1, resultItemSubmit.note1) && Intrinsics.areEqual(this.tRValidities, resultItemSubmit.tRValidities) && Intrinsics.areEqual(this.smsConfirmation, resultItemSubmit.smsConfirmation) && Intrinsics.areEqual(this.bioBloodGroupname, resultItemSubmit.bioBloodGroupname) && Intrinsics.areEqual(this.bloodGroup, resultItemSubmit.bloodGroup) && Intrinsics.areEqual(this.applicationDate, resultItemSubmit.applicationDate) && Intrinsics.areEqual(this.isFaceless, resultItemSubmit.isFaceless) && Intrinsics.areEqual(this.llReqforRetestMsg, resultItemSubmit.llReqforRetestMsg);
    }

    public final String getApplicantAddress() {
        return this.applicantAddress;
    }

    public final String getApplicantGender() {
        return this.applicantGender;
    }

    public final String getApplicantname() {
        return this.applicantname;
    }

    public final String getApplicationDate() {
        return this.applicationDate;
    }

    public final String getApplicationNo() {
        return this.applicationNo;
    }

    public final String getBarCode() {
        return this.barCode;
    }

    public final String getBioBloodGroupname() {
        return this.bioBloodGroupname;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final String getDLCOVNames() {
        return this.dLCOVNames;
    }

    public final String getDateofBirth() {
        return this.dateofBirth;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDocumentaryProofsRequired() {
        return this.documentaryProofsRequired;
    }

    public final String getFatherName() {
        return this.fatherName;
    }

    public final String getLlReqforRetestMsg() {
        return this.llReqforRetestMsg;
    }

    public final String getNTValidities() {
        return this.nTValidities;
    }

    public final String getNote1() {
        return this.note1;
    }

    public final String getNote2() {
        return this.note2;
    }

    public final String getNote3() {
        return this.note3;
    }

    public final String getNote4() {
        return this.note4;
    }

    public final String getReferenceLink() {
        return this.referenceLink;
    }

    public final String getRtoLocation() {
        return this.rtoLocation;
    }

    public final ServicesRequested getServicesRequested() {
        return this.servicesRequested;
    }

    public final String getSmsConfirmation() {
        return this.smsConfirmation;
    }

    public final String getTRValidities() {
        return this.tRValidities;
    }

    public int hashCode() {
        int iHashCode = ((this.fatherName.hashCode() * 31) + this.dateofBirth.hashCode()) * 31;
        String str = this.note2;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.nTValidities.hashCode()) * 31;
        String str2 = this.note3;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.note4;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.applicationNo;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.applicantAddress;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dlno;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.referenceLink;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.barCode;
        int iHashCode9 = (((iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.applicantGender.hashCode()) * 31;
        ServicesRequested servicesRequested = this.servicesRequested;
        int iHashCode10 = (iHashCode9 + (servicesRequested == null ? 0 : servicesRequested.hashCode())) * 31;
        String str9 = this.dLCOVNames;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.documentaryProofsRequired;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rtoLocation;
        int iHashCode13 = (((iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.applicantname.hashCode()) * 31;
        String str12 = this.note1;
        int iHashCode14 = (((((((((((iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.tRValidities.hashCode()) * 31) + this.smsConfirmation.hashCode()) * 31) + this.bioBloodGroupname.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.applicationDate.hashCode()) * 31;
        String str13 = this.isFaceless;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.llReqforRetestMsg;
        return iHashCode15 + (str14 != null ? str14.hashCode() : 0);
    }

    public final String isFaceless() {
        return this.isFaceless;
    }

    public String toString() {
        return "ResultItemSubmit(fatherName=" + this.fatherName + ", dateofBirth=" + this.dateofBirth + ", note2=" + this.note2 + ", nTValidities=" + this.nTValidities + ", note3=" + this.note3 + ", note4=" + this.note4 + ", applicationNo=" + this.applicationNo + ", applicantAddress=" + this.applicantAddress + ", dlno=" + this.dlno + ", referenceLink=" + this.referenceLink + ", barCode=" + this.barCode + ", applicantGender=" + this.applicantGender + ", servicesRequested=" + this.servicesRequested + ", dLCOVNames=" + this.dLCOVNames + ", documentaryProofsRequired=" + this.documentaryProofsRequired + ", rtoLocation=" + this.rtoLocation + ", applicantname=" + this.applicantname + ", note1=" + this.note1 + ", tRValidities=" + this.tRValidities + ", smsConfirmation=" + this.smsConfirmation + ", bioBloodGroupname=" + this.bioBloodGroupname + ", bloodGroup=" + this.bloodGroup + ", applicationDate=" + this.applicationDate + ", isFaceless=" + this.isFaceless + ", llReqforRetestMsg=" + this.llReqforRetestMsg + ')';
    }

    public ResultItemSubmit(String fatherName, String dateofBirth, String str, String nTValidities, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String applicantGender, ServicesRequested servicesRequested, String str9, String str10, String str11, String applicantname, String str12, String tRValidities, String smsConfirmation, String bioBloodGroupname, String bloodGroup, String applicationDate, String str13, String str14) {
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(dateofBirth, "dateofBirth");
        Intrinsics.checkNotNullParameter(nTValidities, "nTValidities");
        Intrinsics.checkNotNullParameter(applicantGender, "applicantGender");
        Intrinsics.checkNotNullParameter(applicantname, "applicantname");
        Intrinsics.checkNotNullParameter(tRValidities, "tRValidities");
        Intrinsics.checkNotNullParameter(smsConfirmation, "smsConfirmation");
        Intrinsics.checkNotNullParameter(bioBloodGroupname, "bioBloodGroupname");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(applicationDate, "applicationDate");
        this.fatherName = fatherName;
        this.dateofBirth = dateofBirth;
        this.note2 = str;
        this.nTValidities = nTValidities;
        this.note3 = str2;
        this.note4 = str3;
        this.applicationNo = str4;
        this.applicantAddress = str5;
        this.dlno = str6;
        this.referenceLink = str7;
        this.barCode = str8;
        this.applicantGender = applicantGender;
        this.servicesRequested = servicesRequested;
        this.dLCOVNames = str9;
        this.documentaryProofsRequired = str10;
        this.rtoLocation = str11;
        this.applicantname = applicantname;
        this.note1 = str12;
        this.tRValidities = tRValidities;
        this.smsConfirmation = smsConfirmation;
        this.bioBloodGroupname = bioBloodGroupname;
        this.bloodGroup = bloodGroup;
        this.applicationDate = applicationDate;
        this.isFaceless = str13;
        this.llReqforRetestMsg = str14;
    }

    public /* synthetic */ ResultItemSubmit(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ServicesRequested servicesRequested, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? "" : str12, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : servicesRequested, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? "" : str19, (i & 1048576) != 0 ? "" : str20, (i & 2097152) != 0 ? "" : str21, (i & 4194304) != 0 ? "" : str22, (i & 8388608) != 0 ? null : str23, (i & 16777216) != 0 ? null : str24);
    }
}
