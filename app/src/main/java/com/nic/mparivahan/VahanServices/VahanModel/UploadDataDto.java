package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u0005HÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006&"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/UploadDataDto;", "", "applno", "", "mandatoryList", "", "Lcom/nic/mparivahan/VahanServices/VahanModel/Mandatory;", "nonUploadedList", "Lcom/nic/mparivahan/VahanServices/VahanModel/NonUploaded;", "purposeCode", "purposeName", "state", "uploadedList", "Lcom/nic/mparivahan/VahanServices/VahanModel/Uploaded;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getApplno", "()Ljava/lang/String;", "getMandatoryList", "()Ljava/util/List;", "getNonUploadedList", "getPurposeCode", "getPurposeName", "getState", "getUploadedList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UploadDataDto {
    private final String applno;
    private final List<Mandatory> mandatoryList;
    private final List<NonUploaded> nonUploadedList;
    private final String purposeCode;
    private final String purposeName;
    private final String state;
    private final List<Uploaded> uploadedList;

    public UploadDataDto(String applno, List<Mandatory> mandatoryList, List<NonUploaded> nonUploadedList, String purposeCode, String purposeName, String state, List<Uploaded> uploadedList) {
        Intrinsics.checkNotNullParameter(applno, "applno");
        Intrinsics.checkNotNullParameter(mandatoryList, "mandatoryList");
        Intrinsics.checkNotNullParameter(nonUploadedList, "nonUploadedList");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(purposeName, "purposeName");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(uploadedList, "uploadedList");
        this.applno = applno;
        this.mandatoryList = mandatoryList;
        this.nonUploadedList = nonUploadedList;
        this.purposeCode = purposeCode;
        this.purposeName = purposeName;
        this.state = state;
        this.uploadedList = uploadedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadDataDto copy$default(UploadDataDto uploadDataDto, String str, List list, List list2, String str2, String str3, String str4, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadDataDto.applno;
        }
        if ((i & 2) != 0) {
            list = uploadDataDto.mandatoryList;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            list2 = uploadDataDto.nonUploadedList;
        }
        List list5 = list2;
        if ((i & 8) != 0) {
            str2 = uploadDataDto.purposeCode;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = uploadDataDto.purposeName;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = uploadDataDto.state;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            list3 = uploadDataDto.uploadedList;
        }
        return uploadDataDto.copy(str, list4, list5, str5, str6, str7, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplno() {
        return this.applno;
    }

    public final List<Mandatory> component2() {
        return this.mandatoryList;
    }

    public final List<NonUploaded> component3() {
        return this.nonUploadedList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPurposeCode() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPurposeName() {
        return this.purposeName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final List<Uploaded> component7() {
        return this.uploadedList;
    }

    public final UploadDataDto copy(String applno, List<Mandatory> mandatoryList, List<NonUploaded> nonUploadedList, String purposeCode, String purposeName, String state, List<Uploaded> uploadedList) {
        Intrinsics.checkNotNullParameter(applno, "applno");
        Intrinsics.checkNotNullParameter(mandatoryList, "mandatoryList");
        Intrinsics.checkNotNullParameter(nonUploadedList, "nonUploadedList");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(purposeName, "purposeName");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(uploadedList, "uploadedList");
        return new UploadDataDto(applno, mandatoryList, nonUploadedList, purposeCode, purposeName, state, uploadedList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadDataDto)) {
            return false;
        }
        UploadDataDto uploadDataDto = (UploadDataDto) other;
        return Intrinsics.areEqual(this.applno, uploadDataDto.applno) && Intrinsics.areEqual(this.mandatoryList, uploadDataDto.mandatoryList) && Intrinsics.areEqual(this.nonUploadedList, uploadDataDto.nonUploadedList) && Intrinsics.areEqual(this.purposeCode, uploadDataDto.purposeCode) && Intrinsics.areEqual(this.purposeName, uploadDataDto.purposeName) && Intrinsics.areEqual(this.state, uploadDataDto.state) && Intrinsics.areEqual(this.uploadedList, uploadDataDto.uploadedList);
    }

    public final String getApplno() {
        return this.applno;
    }

    public final List<Mandatory> getMandatoryList() {
        return this.mandatoryList;
    }

    public final List<NonUploaded> getNonUploadedList() {
        return this.nonUploadedList;
    }

    public final String getPurposeCode() {
        return this.purposeCode;
    }

    public final String getPurposeName() {
        return this.purposeName;
    }

    public final String getState() {
        return this.state;
    }

    public final List<Uploaded> getUploadedList() {
        return this.uploadedList;
    }

    public int hashCode() {
        return (((((((((((this.applno.hashCode() * 31) + this.mandatoryList.hashCode()) * 31) + this.nonUploadedList.hashCode()) * 31) + this.purposeCode.hashCode()) * 31) + this.purposeName.hashCode()) * 31) + this.state.hashCode()) * 31) + this.uploadedList.hashCode();
    }

    public String toString() {
        return "UploadDataDto(applno=" + this.applno + ", mandatoryList=" + this.mandatoryList + ", nonUploadedList=" + this.nonUploadedList + ", purposeCode=" + this.purposeCode + ", purposeName=" + this.purposeName + ", state=" + this.state + ", uploadedList=" + this.uploadedList + ')';
    }
}
