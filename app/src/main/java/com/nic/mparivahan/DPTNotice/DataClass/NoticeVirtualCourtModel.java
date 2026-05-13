package com.nic.mparivahan.DPTNotice.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007HÆ\u0003JG\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR&\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/DataClass/NoticeVirtualCourtModel;", "", "code", "", "result", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/DPTNotice/DataClass/NoticeCourtStatusModel;", "Lkotlin/collections/ArrayList;", "proceeding_data", "Lcom/nic/mparivahan/DPTNotice/DataClass/NoticeCourtProceedingDataModel;", "(ILjava/util/ArrayList;Ljava/util/ArrayList;)V", "getCode", "()I", "getProceeding_data", "()Ljava/util/ArrayList;", "getResult", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NoticeVirtualCourtModel {

    @xy5("code")
    private final int code;

    @xy5("proceeding_data")
    private final ArrayList<NoticeCourtProceedingDataModel> proceeding_data;

    @xy5("result")
    private final ArrayList<NoticeCourtStatusModel> result;

    public NoticeVirtualCourtModel() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeVirtualCourtModel copy$default(NoticeVirtualCourtModel noticeVirtualCourtModel, int i, ArrayList arrayList, ArrayList arrayList2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = noticeVirtualCourtModel.code;
        }
        if ((i2 & 2) != 0) {
            arrayList = noticeVirtualCourtModel.result;
        }
        if ((i2 & 4) != 0) {
            arrayList2 = noticeVirtualCourtModel.proceeding_data;
        }
        return noticeVirtualCourtModel.copy(i, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final ArrayList<NoticeCourtStatusModel> component2() {
        return this.result;
    }

    public final ArrayList<NoticeCourtProceedingDataModel> component3() {
        return this.proceeding_data;
    }

    public final NoticeVirtualCourtModel copy(int code, ArrayList<NoticeCourtStatusModel> result, ArrayList<NoticeCourtProceedingDataModel> proceeding_data) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(proceeding_data, "proceeding_data");
        return new NoticeVirtualCourtModel(code, result, proceeding_data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoticeVirtualCourtModel)) {
            return false;
        }
        NoticeVirtualCourtModel noticeVirtualCourtModel = (NoticeVirtualCourtModel) other;
        return this.code == noticeVirtualCourtModel.code && Intrinsics.areEqual(this.result, noticeVirtualCourtModel.result) && Intrinsics.areEqual(this.proceeding_data, noticeVirtualCourtModel.proceeding_data);
    }

    public final int getCode() {
        return this.code;
    }

    public final ArrayList<NoticeCourtProceedingDataModel> getProceeding_data() {
        return this.proceeding_data;
    }

    public final ArrayList<NoticeCourtStatusModel> getResult() {
        return this.result;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + this.result.hashCode()) * 31) + this.proceeding_data.hashCode();
    }

    public String toString() {
        return "NoticeVirtualCourtModel(code=" + this.code + ", result=" + this.result + ", proceeding_data=" + this.proceeding_data + ')';
    }

    public NoticeVirtualCourtModel(int i, ArrayList<NoticeCourtStatusModel> result, ArrayList<NoticeCourtProceedingDataModel> proceeding_data) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(proceeding_data, "proceeding_data");
        this.code = i;
        this.result = result;
        this.proceeding_data = proceeding_data;
    }

    public /* synthetic */ NoticeVirtualCourtModel(int i, ArrayList arrayList, ArrayList arrayList2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : arrayList, (i2 & 4) != 0 ? new ArrayList() : arrayList2);
    }
}
