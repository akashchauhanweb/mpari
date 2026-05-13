package com.nic.mparivahan.dlservices.newlearner.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/DataClass/CampDetailsResponseModal;", "", "cmSuboffcd", "", "cmCampAbbrv", "cmType", "cmRtoCode", "cmCampCode", "cmServType", "cmInstituteCode", "cmCampDesc", "cmAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCmAddress", "()Ljava/lang/String;", "getCmCampAbbrv", "getCmCampCode", "getCmCampDesc", "getCmInstituteCode", "getCmRtoCode", "getCmServType", "getCmSuboffcd", "getCmType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CampDetailsResponseModal {

    @xy5("cmAddress")
    private final String cmAddress;

    @xy5("cmCampAbbrv")
    private final String cmCampAbbrv;

    @xy5("cmCampCode")
    private final String cmCampCode;

    @xy5("cmCampDesc")
    private final String cmCampDesc;

    @xy5("cmInstituteCode")
    private final String cmInstituteCode;

    @xy5("cmRtoCode")
    private final String cmRtoCode;

    @xy5("cmServType")
    private final String cmServType;

    @xy5("cmSuboffcd")
    private final String cmSuboffcd;

    @xy5("cmType")
    private final String cmType;

    public CampDetailsResponseModal() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCmSuboffcd() {
        return this.cmSuboffcd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCmCampAbbrv() {
        return this.cmCampAbbrv;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCmType() {
        return this.cmType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCmRtoCode() {
        return this.cmRtoCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCmCampCode() {
        return this.cmCampCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCmServType() {
        return this.cmServType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCmInstituteCode() {
        return this.cmInstituteCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCmCampDesc() {
        return this.cmCampDesc;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCmAddress() {
        return this.cmAddress;
    }

    public final CampDetailsResponseModal copy(String cmSuboffcd, String cmCampAbbrv, String cmType, String cmRtoCode, String cmCampCode, String cmServType, String cmInstituteCode, String cmCampDesc, String cmAddress) {
        Intrinsics.checkNotNullParameter(cmSuboffcd, "cmSuboffcd");
        Intrinsics.checkNotNullParameter(cmCampAbbrv, "cmCampAbbrv");
        Intrinsics.checkNotNullParameter(cmType, "cmType");
        Intrinsics.checkNotNullParameter(cmRtoCode, "cmRtoCode");
        Intrinsics.checkNotNullParameter(cmCampCode, "cmCampCode");
        Intrinsics.checkNotNullParameter(cmServType, "cmServType");
        Intrinsics.checkNotNullParameter(cmInstituteCode, "cmInstituteCode");
        Intrinsics.checkNotNullParameter(cmCampDesc, "cmCampDesc");
        Intrinsics.checkNotNullParameter(cmAddress, "cmAddress");
        return new CampDetailsResponseModal(cmSuboffcd, cmCampAbbrv, cmType, cmRtoCode, cmCampCode, cmServType, cmInstituteCode, cmCampDesc, cmAddress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampDetailsResponseModal)) {
            return false;
        }
        CampDetailsResponseModal campDetailsResponseModal = (CampDetailsResponseModal) other;
        return Intrinsics.areEqual(this.cmSuboffcd, campDetailsResponseModal.cmSuboffcd) && Intrinsics.areEqual(this.cmCampAbbrv, campDetailsResponseModal.cmCampAbbrv) && Intrinsics.areEqual(this.cmType, campDetailsResponseModal.cmType) && Intrinsics.areEqual(this.cmRtoCode, campDetailsResponseModal.cmRtoCode) && Intrinsics.areEqual(this.cmCampCode, campDetailsResponseModal.cmCampCode) && Intrinsics.areEqual(this.cmServType, campDetailsResponseModal.cmServType) && Intrinsics.areEqual(this.cmInstituteCode, campDetailsResponseModal.cmInstituteCode) && Intrinsics.areEqual(this.cmCampDesc, campDetailsResponseModal.cmCampDesc) && Intrinsics.areEqual(this.cmAddress, campDetailsResponseModal.cmAddress);
    }

    public final String getCmAddress() {
        return this.cmAddress;
    }

    public final String getCmCampAbbrv() {
        return this.cmCampAbbrv;
    }

    public final String getCmCampCode() {
        return this.cmCampCode;
    }

    public final String getCmCampDesc() {
        return this.cmCampDesc;
    }

    public final String getCmInstituteCode() {
        return this.cmInstituteCode;
    }

    public final String getCmRtoCode() {
        return this.cmRtoCode;
    }

    public final String getCmServType() {
        return this.cmServType;
    }

    public final String getCmSuboffcd() {
        return this.cmSuboffcd;
    }

    public final String getCmType() {
        return this.cmType;
    }

    public int hashCode() {
        return (((((((((((((((this.cmSuboffcd.hashCode() * 31) + this.cmCampAbbrv.hashCode()) * 31) + this.cmType.hashCode()) * 31) + this.cmRtoCode.hashCode()) * 31) + this.cmCampCode.hashCode()) * 31) + this.cmServType.hashCode()) * 31) + this.cmInstituteCode.hashCode()) * 31) + this.cmCampDesc.hashCode()) * 31) + this.cmAddress.hashCode();
    }

    public String toString() {
        return "CampDetailsResponseModal(cmSuboffcd=" + this.cmSuboffcd + ", cmCampAbbrv=" + this.cmCampAbbrv + ", cmType=" + this.cmType + ", cmRtoCode=" + this.cmRtoCode + ", cmCampCode=" + this.cmCampCode + ", cmServType=" + this.cmServType + ", cmInstituteCode=" + this.cmInstituteCode + ", cmCampDesc=" + this.cmCampDesc + ", cmAddress=" + this.cmAddress + ')';
    }

    public CampDetailsResponseModal(String cmSuboffcd, String cmCampAbbrv, String cmType, String cmRtoCode, String cmCampCode, String cmServType, String cmInstituteCode, String cmCampDesc, String cmAddress) {
        Intrinsics.checkNotNullParameter(cmSuboffcd, "cmSuboffcd");
        Intrinsics.checkNotNullParameter(cmCampAbbrv, "cmCampAbbrv");
        Intrinsics.checkNotNullParameter(cmType, "cmType");
        Intrinsics.checkNotNullParameter(cmRtoCode, "cmRtoCode");
        Intrinsics.checkNotNullParameter(cmCampCode, "cmCampCode");
        Intrinsics.checkNotNullParameter(cmServType, "cmServType");
        Intrinsics.checkNotNullParameter(cmInstituteCode, "cmInstituteCode");
        Intrinsics.checkNotNullParameter(cmCampDesc, "cmCampDesc");
        Intrinsics.checkNotNullParameter(cmAddress, "cmAddress");
        this.cmSuboffcd = cmSuboffcd;
        this.cmCampAbbrv = cmCampAbbrv;
        this.cmType = cmType;
        this.cmRtoCode = cmRtoCode;
        this.cmCampCode = cmCampCode;
        this.cmServType = cmServType;
        this.cmInstituteCode = cmInstituteCode;
        this.cmCampDesc = cmCampDesc;
        this.cmAddress = cmAddress;
    }

    public /* synthetic */ CampDetailsResponseModal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }
}
