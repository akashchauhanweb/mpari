package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012\u0012\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u001d\u00105\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012HÆ\u0003J\u001d\u00106\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0012HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003Jå\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u00122\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010#R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010#R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR*\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR*\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-¨\u0006J"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Modal/SubmittedDlDetailsModal;", "", "pinCd", "", "gender", "lastName", "applNo", "relation", "bloodGroup", "dob", "street", "houseNo", "swdName", "location", "applDate", "transactionList", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/NewDlScreen/Modal/TransactionListModal;", "Lkotlin/collections/ArrayList;", "rtoAddressList", "Lcom/nic/mparivahan/NewDlScreen/Modal/RTOAddressListModal;", "idMarkError", "bloodGroupError", "fullNameError", "mobileNumberError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplDate", "()Ljava/lang/String;", "getApplNo", "getBloodGroup", "getBloodGroupError", "getDob", "getFullNameError", "getGender", "setGender", "(Ljava/lang/String;)V", "getHouseNo", "getIdMarkError", "getLastName", "getLocation", "getMobileNumberError", "getPinCd", "setPinCd", "getRelation", "getRtoAddressList", "()Ljava/util/ArrayList;", "getStreet", "getSwdName", "getTransactionList", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SubmittedDlDetailsModal {

    @xy5("applicationDate")
    private final String applDate;

    @xy5("applno")
    private final String applNo;

    @xy5("bloodGroup")
    private final String bloodGroup;

    @xy5("UC01-E150")
    private final String bloodGroupError;

    @xy5("dob")
    private final String dob;

    @xy5("UC06-E2516")
    private final String fullNameError;

    @xy5("gender")
    private String gender;

    @xy5("houseno")
    private final String houseNo;

    @xy5("UC01-E33")
    private final String idMarkError;

    @xy5("applname")
    private final String lastName;

    @xy5("location")
    private final String location;

    @xy5("UC32-E43")
    private final String mobileNumberError;

    @xy5("pincode")
    private String pinCd;

    @xy5("relation")
    private final String relation;

    @xy5("rtoAddress")
    private final ArrayList<RTOAddressListModal> rtoAddressList;

    @xy5("street")
    private final String street;

    @xy5("swdname")
    private final String swdName;

    @xy5("transactions")
    private final ArrayList<TransactionListModal> transactionList;

    public SubmittedDlDetailsModal(String pinCd, String gender, String lastName, String applNo, String relation, String bloodGroup, String dob, String street, String houseNo, String swdName, String location, String applDate, ArrayList<TransactionListModal> arrayList, ArrayList<RTOAddressListModal> arrayList2, String idMarkError, String bloodGroupError, String fullNameError, String mobileNumberError) {
        Intrinsics.checkNotNullParameter(pinCd, "pinCd");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(relation, "relation");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(houseNo, "houseNo");
        Intrinsics.checkNotNullParameter(swdName, "swdName");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(applDate, "applDate");
        Intrinsics.checkNotNullParameter(idMarkError, "idMarkError");
        Intrinsics.checkNotNullParameter(bloodGroupError, "bloodGroupError");
        Intrinsics.checkNotNullParameter(fullNameError, "fullNameError");
        Intrinsics.checkNotNullParameter(mobileNumberError, "mobileNumberError");
        this.pinCd = pinCd;
        this.gender = gender;
        this.lastName = lastName;
        this.applNo = applNo;
        this.relation = relation;
        this.bloodGroup = bloodGroup;
        this.dob = dob;
        this.street = street;
        this.houseNo = houseNo;
        this.swdName = swdName;
        this.location = location;
        this.applDate = applDate;
        this.transactionList = arrayList;
        this.rtoAddressList = arrayList2;
        this.idMarkError = idMarkError;
        this.bloodGroupError = bloodGroupError;
        this.fullNameError = fullNameError;
        this.mobileNumberError = mobileNumberError;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPinCd() {
        return this.pinCd;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSwdName() {
        return this.swdName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getApplDate() {
        return this.applDate;
    }

    public final ArrayList<TransactionListModal> component13() {
        return this.transactionList;
    }

    public final ArrayList<RTOAddressListModal> component14() {
        return this.rtoAddressList;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIdMarkError() {
        return this.idMarkError;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBloodGroupError() {
        return this.bloodGroupError;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getFullNameError() {
        return this.fullNameError;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMobileNumberError() {
        return this.mobileNumberError;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRelation() {
        return this.relation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHouseNo() {
        return this.houseNo;
    }

    public final SubmittedDlDetailsModal copy(String pinCd, String gender, String lastName, String applNo, String relation, String bloodGroup, String dob, String street, String houseNo, String swdName, String location, String applDate, ArrayList<TransactionListModal> transactionList, ArrayList<RTOAddressListModal> rtoAddressList, String idMarkError, String bloodGroupError, String fullNameError, String mobileNumberError) {
        Intrinsics.checkNotNullParameter(pinCd, "pinCd");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(relation, "relation");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(houseNo, "houseNo");
        Intrinsics.checkNotNullParameter(swdName, "swdName");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(applDate, "applDate");
        Intrinsics.checkNotNullParameter(idMarkError, "idMarkError");
        Intrinsics.checkNotNullParameter(bloodGroupError, "bloodGroupError");
        Intrinsics.checkNotNullParameter(fullNameError, "fullNameError");
        Intrinsics.checkNotNullParameter(mobileNumberError, "mobileNumberError");
        return new SubmittedDlDetailsModal(pinCd, gender, lastName, applNo, relation, bloodGroup, dob, street, houseNo, swdName, location, applDate, transactionList, rtoAddressList, idMarkError, bloodGroupError, fullNameError, mobileNumberError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmittedDlDetailsModal)) {
            return false;
        }
        SubmittedDlDetailsModal submittedDlDetailsModal = (SubmittedDlDetailsModal) other;
        return Intrinsics.areEqual(this.pinCd, submittedDlDetailsModal.pinCd) && Intrinsics.areEqual(this.gender, submittedDlDetailsModal.gender) && Intrinsics.areEqual(this.lastName, submittedDlDetailsModal.lastName) && Intrinsics.areEqual(this.applNo, submittedDlDetailsModal.applNo) && Intrinsics.areEqual(this.relation, submittedDlDetailsModal.relation) && Intrinsics.areEqual(this.bloodGroup, submittedDlDetailsModal.bloodGroup) && Intrinsics.areEqual(this.dob, submittedDlDetailsModal.dob) && Intrinsics.areEqual(this.street, submittedDlDetailsModal.street) && Intrinsics.areEqual(this.houseNo, submittedDlDetailsModal.houseNo) && Intrinsics.areEqual(this.swdName, submittedDlDetailsModal.swdName) && Intrinsics.areEqual(this.location, submittedDlDetailsModal.location) && Intrinsics.areEqual(this.applDate, submittedDlDetailsModal.applDate) && Intrinsics.areEqual(this.transactionList, submittedDlDetailsModal.transactionList) && Intrinsics.areEqual(this.rtoAddressList, submittedDlDetailsModal.rtoAddressList) && Intrinsics.areEqual(this.idMarkError, submittedDlDetailsModal.idMarkError) && Intrinsics.areEqual(this.bloodGroupError, submittedDlDetailsModal.bloodGroupError) && Intrinsics.areEqual(this.fullNameError, submittedDlDetailsModal.fullNameError) && Intrinsics.areEqual(this.mobileNumberError, submittedDlDetailsModal.mobileNumberError);
    }

    public final String getApplDate() {
        return this.applDate;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final String getBloodGroupError() {
        return this.bloodGroupError;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getFullNameError() {
        return this.fullNameError;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getHouseNo() {
        return this.houseNo;
    }

    public final String getIdMarkError() {
        return this.idMarkError;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getMobileNumberError() {
        return this.mobileNumberError;
    }

    public final String getPinCd() {
        return this.pinCd;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final ArrayList<RTOAddressListModal> getRtoAddressList() {
        return this.rtoAddressList;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getSwdName() {
        return this.swdName;
    }

    public final ArrayList<TransactionListModal> getTransactionList() {
        return this.transactionList;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.pinCd.hashCode() * 31) + this.gender.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.applNo.hashCode()) * 31) + this.relation.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.street.hashCode()) * 31) + this.houseNo.hashCode()) * 31) + this.swdName.hashCode()) * 31) + this.location.hashCode()) * 31) + this.applDate.hashCode()) * 31;
        ArrayList<TransactionListModal> arrayList = this.transactionList;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<RTOAddressListModal> arrayList2 = this.rtoAddressList;
        return ((((((((iHashCode2 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31) + this.idMarkError.hashCode()) * 31) + this.bloodGroupError.hashCode()) * 31) + this.fullNameError.hashCode()) * 31) + this.mobileNumberError.hashCode();
    }

    public final void setGender(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gender = str;
    }

    public final void setPinCd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pinCd = str;
    }

    public String toString() {
        return "SubmittedDlDetailsModal(pinCd=" + this.pinCd + ", gender=" + this.gender + ", lastName=" + this.lastName + ", applNo=" + this.applNo + ", relation=" + this.relation + ", bloodGroup=" + this.bloodGroup + ", dob=" + this.dob + ", street=" + this.street + ", houseNo=" + this.houseNo + ", swdName=" + this.swdName + ", location=" + this.location + ", applDate=" + this.applDate + ", transactionList=" + this.transactionList + ", rtoAddressList=" + this.rtoAddressList + ", idMarkError=" + this.idMarkError + ", bloodGroupError=" + this.bloodGroupError + ", fullNameError=" + this.fullNameError + ", mobileNumberError=" + this.mobileNumberError + ')';
    }

    public /* synthetic */ SubmittedDlDetailsModal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ArrayList arrayList, ArrayList arrayList2, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : arrayList, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : arrayList2, (i & 16384) != 0 ? "" : str13, str14, str15, str16);
    }
}
