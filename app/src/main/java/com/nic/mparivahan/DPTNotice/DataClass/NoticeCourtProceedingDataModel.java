package com.nic.mparivahan.DPTNotice.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/DataClass/NoticeCourtProceedingDataModel;", "", "date_of_proceeding", "", "fine_imposed", "party_name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate_of_proceeding", "()Ljava/lang/String;", "getFine_imposed", "getParty_name", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NoticeCourtProceedingDataModel {

    @xy5("date_of_proceeding")
    private final String date_of_proceeding;

    @xy5("fine_imposed")
    private final String fine_imposed;

    @xy5("party_name")
    private final String party_name;

    public NoticeCourtProceedingDataModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ NoticeCourtProceedingDataModel copy$default(NoticeCourtProceedingDataModel noticeCourtProceedingDataModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noticeCourtProceedingDataModel.date_of_proceeding;
        }
        if ((i & 2) != 0) {
            str2 = noticeCourtProceedingDataModel.fine_imposed;
        }
        if ((i & 4) != 0) {
            str3 = noticeCourtProceedingDataModel.party_name;
        }
        return noticeCourtProceedingDataModel.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate_of_proceeding() {
        return this.date_of_proceeding;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFine_imposed() {
        return this.fine_imposed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParty_name() {
        return this.party_name;
    }

    public final NoticeCourtProceedingDataModel copy(String date_of_proceeding, String fine_imposed, String party_name) {
        Intrinsics.checkNotNullParameter(date_of_proceeding, "date_of_proceeding");
        Intrinsics.checkNotNullParameter(fine_imposed, "fine_imposed");
        Intrinsics.checkNotNullParameter(party_name, "party_name");
        return new NoticeCourtProceedingDataModel(date_of_proceeding, fine_imposed, party_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoticeCourtProceedingDataModel)) {
            return false;
        }
        NoticeCourtProceedingDataModel noticeCourtProceedingDataModel = (NoticeCourtProceedingDataModel) other;
        return Intrinsics.areEqual(this.date_of_proceeding, noticeCourtProceedingDataModel.date_of_proceeding) && Intrinsics.areEqual(this.fine_imposed, noticeCourtProceedingDataModel.fine_imposed) && Intrinsics.areEqual(this.party_name, noticeCourtProceedingDataModel.party_name);
    }

    public final String getDate_of_proceeding() {
        return this.date_of_proceeding;
    }

    public final String getFine_imposed() {
        return this.fine_imposed;
    }

    public final String getParty_name() {
        return this.party_name;
    }

    public int hashCode() {
        return (((this.date_of_proceeding.hashCode() * 31) + this.fine_imposed.hashCode()) * 31) + this.party_name.hashCode();
    }

    public String toString() {
        return "NoticeCourtProceedingDataModel(date_of_proceeding=" + this.date_of_proceeding + ", fine_imposed=" + this.fine_imposed + ", party_name=" + this.party_name + ')';
    }

    public NoticeCourtProceedingDataModel(String date_of_proceeding, String fine_imposed, String party_name) {
        Intrinsics.checkNotNullParameter(date_of_proceeding, "date_of_proceeding");
        Intrinsics.checkNotNullParameter(fine_imposed, "fine_imposed");
        Intrinsics.checkNotNullParameter(party_name, "party_name");
        this.date_of_proceeding = date_of_proceeding;
        this.fine_imposed = fine_imposed;
        this.party_name = party_name;
    }

    public /* synthetic */ NoticeCourtProceedingDataModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
