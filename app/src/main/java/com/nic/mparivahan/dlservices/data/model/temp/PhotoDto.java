package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006HÆ\u0003J5\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/temp/PhotoDto;", "", "statusCode", "", "statusDesc", "jsonArray", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getJsonArray", "()Ljava/util/List;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PhotoDto {

    @xy5("jsonArray")
    private final List<String> jsonArray;

    @xy5("status_code")
    private final String statusCode;

    @xy5("status_desc")
    private final String statusDesc;

    public PhotoDto() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotoDto copy$default(PhotoDto photoDto, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photoDto.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = photoDto.statusDesc;
        }
        if ((i & 4) != 0) {
            list = photoDto.jsonArray;
        }
        return photoDto.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final List<String> component3() {
        return this.jsonArray;
    }

    public final PhotoDto copy(String statusCode, String statusDesc, List<String> jsonArray) {
        return new PhotoDto(statusCode, statusDesc, jsonArray);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoDto)) {
            return false;
        }
        PhotoDto photoDto = (PhotoDto) other;
        return Intrinsics.areEqual(this.statusCode, photoDto.statusCode) && Intrinsics.areEqual(this.statusDesc, photoDto.statusDesc) && Intrinsics.areEqual(this.jsonArray, photoDto.jsonArray);
    }

    public final List<String> getJsonArray() {
        return this.jsonArray;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        String str = this.statusCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.jsonArray;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PhotoDto(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", jsonArray=" + this.jsonArray + ')';
    }

    public PhotoDto(String str, String str2, List<String> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.jsonArray = list;
    }

    public /* synthetic */ PhotoDto(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
