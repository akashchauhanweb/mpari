package com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0019HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003Jå\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020NHÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006P"}, d2 = {"Lcom/nic/mparivahan/dlservices/DupChangeAdd/DupChangeAddModel/ResultX;", "Ljava/io/Serializable;", "NTValidities", "", "TRValidities", "applicantAddress", "applicantGender", "applicantname", "applicationNo", "barCode", "bloodGroup", "dLCOVNames", "dateofBirth", "dlno", "documentaryProofsRequired", "fatherName", "isFaceless", "llReqforRetestMsg", "note1", "note2", "note3", "note4", "referenceLink", "rtoLocation", "servicesRequested", "Lcom/nic/mparivahan/dlservices/DupChangeAdd/DupChangeAddModel/ServicesRequested;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/dlservices/DupChangeAdd/DupChangeAddModel/ServicesRequested;)V", "getNTValidities", "()Ljava/lang/String;", "getTRValidities", "getApplicantAddress", "getApplicantGender", "getApplicantname", "getApplicationNo", "getBarCode", "getBloodGroup", "getDLCOVNames", "getDateofBirth", "getDlno", "getDocumentaryProofsRequired", "getFatherName", "getLlReqforRetestMsg", "getNote1", "getNote2", "getNote3", "getNote4", "getReferenceLink", "getRtoLocation", "getServicesRequested", "()Lcom/nic/mparivahan/dlservices/DupChangeAdd/DupChangeAddModel/ServicesRequested;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ResultX implements Serializable {

    @xy5("NTValidities")
    private final String NTValidities;

    @xy5("TRValidities")
    private final String TRValidities;

    @xy5("applicantAddress")
    private final String applicantAddress;

    @xy5("applicantGender")
    private final String applicantGender;

    @xy5("applicantname")
    private final String applicantname;

    @xy5("applicationNo")
    private final String applicationNo;

    @xy5("barCode")
    private final String barCode;

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

    public ResultX(String NTValidities, String TRValidities, String applicantAddress, String applicantGender, String applicantname, String applicationNo, String barCode, String bloodGroup, String dLCOVNames, String dateofBirth, String dlno, String documentaryProofsRequired, String fatherName, String isFaceless, String llReqforRetestMsg, String note1, String note2, String note3, String note4, String referenceLink, String rtoLocation, ServicesRequested servicesRequested) {
        Intrinsics.checkNotNullParameter(NTValidities, "NTValidities");
        Intrinsics.checkNotNullParameter(TRValidities, "TRValidities");
        Intrinsics.checkNotNullParameter(applicantAddress, "applicantAddress");
        Intrinsics.checkNotNullParameter(applicantGender, "applicantGender");
        Intrinsics.checkNotNullParameter(applicantname, "applicantname");
        Intrinsics.checkNotNullParameter(applicationNo, "applicationNo");
        Intrinsics.checkNotNullParameter(barCode, "barCode");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(dLCOVNames, "dLCOVNames");
        Intrinsics.checkNotNullParameter(dateofBirth, "dateofBirth");
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(documentaryProofsRequired, "documentaryProofsRequired");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(isFaceless, "isFaceless");
        Intrinsics.checkNotNullParameter(llReqforRetestMsg, "llReqforRetestMsg");
        Intrinsics.checkNotNullParameter(note1, "note1");
        Intrinsics.checkNotNullParameter(note2, "note2");
        Intrinsics.checkNotNullParameter(note3, "note3");
        Intrinsics.checkNotNullParameter(note4, "note4");
        Intrinsics.checkNotNullParameter(referenceLink, "referenceLink");
        Intrinsics.checkNotNullParameter(rtoLocation, "rtoLocation");
        Intrinsics.checkNotNullParameter(servicesRequested, "servicesRequested");
        this.NTValidities = NTValidities;
        this.TRValidities = TRValidities;
        this.applicantAddress = applicantAddress;
        this.applicantGender = applicantGender;
        this.applicantname = applicantname;
        this.applicationNo = applicationNo;
        this.barCode = barCode;
        this.bloodGroup = bloodGroup;
        this.dLCOVNames = dLCOVNames;
        this.dateofBirth = dateofBirth;
        this.dlno = dlno;
        this.documentaryProofsRequired = documentaryProofsRequired;
        this.fatherName = fatherName;
        this.isFaceless = isFaceless;
        this.llReqforRetestMsg = llReqforRetestMsg;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.note4 = note4;
        this.referenceLink = referenceLink;
        this.rtoLocation = rtoLocation;
        this.servicesRequested = servicesRequested;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNTValidities() {
        return this.NTValidities;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDateofBirth() {
        return this.dateofBirth;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDlno() {
        return this.dlno;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDocumentaryProofsRequired() {
        return this.documentaryProofsRequired;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFatherName() {
        return this.fatherName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getIsFaceless() {
        return this.isFaceless;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLlReqforRetestMsg() {
        return this.llReqforRetestMsg;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getNote1() {
        return this.note1;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getNote2() {
        return this.note2;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getNote3() {
        return this.note3;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getNote4() {
        return this.note4;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTRValidities() {
        return this.TRValidities;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getReferenceLink() {
        return this.referenceLink;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRtoLocation() {
        return this.rtoLocation;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final ServicesRequested getServicesRequested() {
        return this.servicesRequested;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApplicantAddress() {
        return this.applicantAddress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplicantGender() {
        return this.applicantGender;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getApplicantname() {
        return this.applicantname;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getApplicationNo() {
        return this.applicationNo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBarCode() {
        return this.barCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDLCOVNames() {
        return this.dLCOVNames;
    }

    public final ResultX copy(String NTValidities, String TRValidities, String applicantAddress, String applicantGender, String applicantname, String applicationNo, String barCode, String bloodGroup, String dLCOVNames, String dateofBirth, String dlno, String documentaryProofsRequired, String fatherName, String isFaceless, String llReqforRetestMsg, String note1, String note2, String note3, String note4, String referenceLink, String rtoLocation, ServicesRequested servicesRequested) {
        Intrinsics.checkNotNullParameter(NTValidities, "NTValidities");
        Intrinsics.checkNotNullParameter(TRValidities, "TRValidities");
        Intrinsics.checkNotNullParameter(applicantAddress, "applicantAddress");
        Intrinsics.checkNotNullParameter(applicantGender, "applicantGender");
        Intrinsics.checkNotNullParameter(applicantname, "applicantname");
        Intrinsics.checkNotNullParameter(applicationNo, "applicationNo");
        Intrinsics.checkNotNullParameter(barCode, "barCode");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(dLCOVNames, "dLCOVNames");
        Intrinsics.checkNotNullParameter(dateofBirth, "dateofBirth");
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(documentaryProofsRequired, "documentaryProofsRequired");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(isFaceless, "isFaceless");
        Intrinsics.checkNotNullParameter(llReqforRetestMsg, "llReqforRetestMsg");
        Intrinsics.checkNotNullParameter(note1, "note1");
        Intrinsics.checkNotNullParameter(note2, "note2");
        Intrinsics.checkNotNullParameter(note3, "note3");
        Intrinsics.checkNotNullParameter(note4, "note4");
        Intrinsics.checkNotNullParameter(referenceLink, "referenceLink");
        Intrinsics.checkNotNullParameter(rtoLocation, "rtoLocation");
        Intrinsics.checkNotNullParameter(servicesRequested, "servicesRequested");
        return new ResultX(NTValidities, TRValidities, applicantAddress, applicantGender, applicantname, applicationNo, barCode, bloodGroup, dLCOVNames, dateofBirth, dlno, documentaryProofsRequired, fatherName, isFaceless, llReqforRetestMsg, note1, note2, note3, note4, referenceLink, rtoLocation, servicesRequested);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultX)) {
            return false;
        }
        ResultX resultX = (ResultX) other;
        return Intrinsics.areEqual(this.NTValidities, resultX.NTValidities) && Intrinsics.areEqual(this.TRValidities, resultX.TRValidities) && Intrinsics.areEqual(this.applicantAddress, resultX.applicantAddress) && Intrinsics.areEqual(this.applicantGender, resultX.applicantGender) && Intrinsics.areEqual(this.applicantname, resultX.applicantname) && Intrinsics.areEqual(this.applicationNo, resultX.applicationNo) && Intrinsics.areEqual(this.barCode, resultX.barCode) && Intrinsics.areEqual(this.bloodGroup, resultX.bloodGroup) && Intrinsics.areEqual(this.dLCOVNames, resultX.dLCOVNames) && Intrinsics.areEqual(this.dateofBirth, resultX.dateofBirth) && Intrinsics.areEqual(this.dlno, resultX.dlno) && Intrinsics.areEqual(this.documentaryProofsRequired, resultX.documentaryProofsRequired) && Intrinsics.areEqual(this.fatherName, resultX.fatherName) && Intrinsics.areEqual(this.isFaceless, resultX.isFaceless) && Intrinsics.areEqual(this.llReqforRetestMsg, resultX.llReqforRetestMsg) && Intrinsics.areEqual(this.note1, resultX.note1) && Intrinsics.areEqual(this.note2, resultX.note2) && Intrinsics.areEqual(this.note3, resultX.note3) && Intrinsics.areEqual(this.note4, resultX.note4) && Intrinsics.areEqual(this.referenceLink, resultX.referenceLink) && Intrinsics.areEqual(this.rtoLocation, resultX.rtoLocation) && Intrinsics.areEqual(this.servicesRequested, resultX.servicesRequested);
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

    public final String getApplicationNo() {
        return this.applicationNo;
    }

    public final String getBarCode() {
        return this.barCode;
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
        return this.NTValidities;
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

    public final String getTRValidities() {
        return this.TRValidities;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.NTValidities.hashCode() * 31) + this.TRValidities.hashCode()) * 31) + this.applicantAddress.hashCode()) * 31) + this.applicantGender.hashCode()) * 31) + this.applicantname.hashCode()) * 31) + this.applicationNo.hashCode()) * 31) + this.barCode.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.dLCOVNames.hashCode()) * 31) + this.dateofBirth.hashCode()) * 31) + this.dlno.hashCode()) * 31) + this.documentaryProofsRequired.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.isFaceless.hashCode()) * 31) + this.llReqforRetestMsg.hashCode()) * 31) + this.note1.hashCode()) * 31) + this.note2.hashCode()) * 31) + this.note3.hashCode()) * 31) + this.note4.hashCode()) * 31) + this.referenceLink.hashCode()) * 31) + this.rtoLocation.hashCode()) * 31) + this.servicesRequested.hashCode();
    }

    public final String isFaceless() {
        return this.isFaceless;
    }

    public String toString() {
        return "ResultX(NTValidities=" + this.NTValidities + ", TRValidities=" + this.TRValidities + ", applicantAddress=" + this.applicantAddress + ", applicantGender=" + this.applicantGender + ", applicantname=" + this.applicantname + ", applicationNo=" + this.applicationNo + ", barCode=" + this.barCode + ", bloodGroup=" + this.bloodGroup + ", dLCOVNames=" + this.dLCOVNames + ", dateofBirth=" + this.dateofBirth + ", dlno=" + this.dlno + ", documentaryProofsRequired=" + this.documentaryProofsRequired + ", fatherName=" + this.fatherName + ", isFaceless=" + this.isFaceless + ", llReqforRetestMsg=" + this.llReqforRetestMsg + ", note1=" + this.note1 + ", note2=" + this.note2 + ", note3=" + this.note3 + ", note4=" + this.note4 + ", referenceLink=" + this.referenceLink + ", rtoLocation=" + this.rtoLocation + ", servicesRequested=" + this.servicesRequested + ')';
    }
}
