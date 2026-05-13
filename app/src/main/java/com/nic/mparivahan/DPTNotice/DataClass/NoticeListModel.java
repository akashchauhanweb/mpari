package com.nic.mparivahan.DPTNotice.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/DataClass/NoticeListModel;", "", "code", "", "total_challan", "", "data", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/DPTNotice/DataClass/DPTNoticeDataModel;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;ILjava/util/ArrayList;)V", "getCode", "()Ljava/lang/String;", "getData", "()Ljava/util/ArrayList;", "getTotal_challan", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NoticeListModel {

    @xy5("code")
    private final String code;

    @xy5("data")
    private final ArrayList<DPTNoticeDataModel> data;

    @xy5("total_challan")
    private final int total_challan;

    public NoticeListModel() {
        this(null, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeListModel copy$default(NoticeListModel noticeListModel, String str, int i, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noticeListModel.code;
        }
        if ((i2 & 2) != 0) {
            i = noticeListModel.total_challan;
        }
        if ((i2 & 4) != 0) {
            arrayList = noticeListModel.data;
        }
        return noticeListModel.copy(str, i, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotal_challan() {
        return this.total_challan;
    }

    public final ArrayList<DPTNoticeDataModel> component3() {
        return this.data;
    }

    public final NoticeListModel copy(String code, int total_challan, ArrayList<DPTNoticeDataModel> data) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(data, "data");
        return new NoticeListModel(code, total_challan, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoticeListModel)) {
            return false;
        }
        NoticeListModel noticeListModel = (NoticeListModel) other;
        return Intrinsics.areEqual(this.code, noticeListModel.code) && this.total_challan == noticeListModel.total_challan && Intrinsics.areEqual(this.data, noticeListModel.data);
    }

    public final String getCode() {
        return this.code;
    }

    public final ArrayList<DPTNoticeDataModel> getData() {
        return this.data;
    }

    public final int getTotal_challan() {
        return this.total_challan;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + Integer.hashCode(this.total_challan)) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "NoticeListModel(code=" + this.code + ", total_challan=" + this.total_challan + ", data=" + this.data + ')';
    }

    public NoticeListModel(String code, int i, ArrayList<DPTNoticeDataModel> data) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(data, "data");
        this.code = code;
        this.total_challan = i;
        this.data = data;
    }

    public /* synthetic */ NoticeListModel(String str, int i, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new ArrayList() : arrayList);
    }
}
