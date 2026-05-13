package com.nic.mparivahan.dlservices.data.model.mobupdate;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/mobupdate/DlUpdateMobResponse;", "", "errcnt", "", "errno", "errmsg", "", "iserrflag", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getErrcnt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrmsg", "()Ljava/lang/String;", "getErrno", "getIserrflag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/nic/mparivahan/dlservices/data/model/mobupdate/DlUpdateMobResponse;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlUpdateMobResponse {

    @xy5("errcnt")
    private final Integer errcnt;

    @xy5("errmsg")
    private final String errmsg;

    @xy5("errno")
    private final Integer errno;

    @xy5("iserrflag")
    private final Boolean iserrflag;

    public DlUpdateMobResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DlUpdateMobResponse copy$default(DlUpdateMobResponse dlUpdateMobResponse, Integer num, Integer num2, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dlUpdateMobResponse.errcnt;
        }
        if ((i & 2) != 0) {
            num2 = dlUpdateMobResponse.errno;
        }
        if ((i & 4) != 0) {
            str = dlUpdateMobResponse.errmsg;
        }
        if ((i & 8) != 0) {
            bool = dlUpdateMobResponse.iserrflag;
        }
        return dlUpdateMobResponse.copy(num, num2, str, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getErrcnt() {
        return this.errcnt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getErrno() {
        return this.errno;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrmsg() {
        return this.errmsg;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIserrflag() {
        return this.iserrflag;
    }

    public final DlUpdateMobResponse copy(Integer errcnt, Integer errno, String errmsg, Boolean iserrflag) {
        return new DlUpdateMobResponse(errcnt, errno, errmsg, iserrflag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlUpdateMobResponse)) {
            return false;
        }
        DlUpdateMobResponse dlUpdateMobResponse = (DlUpdateMobResponse) other;
        return Intrinsics.areEqual(this.errcnt, dlUpdateMobResponse.errcnt) && Intrinsics.areEqual(this.errno, dlUpdateMobResponse.errno) && Intrinsics.areEqual(this.errmsg, dlUpdateMobResponse.errmsg) && Intrinsics.areEqual(this.iserrflag, dlUpdateMobResponse.iserrflag);
    }

    public final Integer getErrcnt() {
        return this.errcnt;
    }

    public final String getErrmsg() {
        return this.errmsg;
    }

    public final Integer getErrno() {
        return this.errno;
    }

    public final Boolean getIserrflag() {
        return this.iserrflag;
    }

    public int hashCode() {
        Integer num = this.errcnt;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.errno;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.errmsg;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.iserrflag;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "DlUpdateMobResponse(errcnt=" + this.errcnt + ", errno=" + this.errno + ", errmsg=" + this.errmsg + ", iserrflag=" + this.iserrflag + ')';
    }

    public DlUpdateMobResponse(Integer num, Integer num2, String str, Boolean bool) {
        this.errcnt = num;
        this.errno = num2;
        this.errmsg = str;
        this.iserrflag = bool;
    }

    public /* synthetic */ DlUpdateMobResponse(Integer num, Integer num2, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool);
    }
}
