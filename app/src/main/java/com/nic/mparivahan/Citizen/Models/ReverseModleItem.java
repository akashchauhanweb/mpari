package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/ReverseModleItem;", "", "districtcode", "", "districtname", "statecode", "statename", "district_lgd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDistrict_lgd", "()Ljava/lang/String;", "getDistrictcode", "getDistrictname", "getStatecode", "getStatename", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ReverseModleItem {
    private final String district_lgd;
    private final String districtcode;
    private final String districtname;
    private final String statecode;
    private final String statename;

    public ReverseModleItem(String str, String str2, String str3, String str4, String str5) {
        this.districtcode = str;
        this.districtname = str2;
        this.statecode = str3;
        this.statename = str4;
        this.district_lgd = str5;
    }

    public static /* synthetic */ ReverseModleItem copy$default(ReverseModleItem reverseModleItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reverseModleItem.districtcode;
        }
        if ((i & 2) != 0) {
            str2 = reverseModleItem.districtname;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = reverseModleItem.statecode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = reverseModleItem.statename;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = reverseModleItem.district_lgd;
        }
        return reverseModleItem.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDistrictcode() {
        return this.districtcode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDistrictname() {
        return this.districtname;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatecode() {
        return this.statecode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatename() {
        return this.statename;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDistrict_lgd() {
        return this.district_lgd;
    }

    public final ReverseModleItem copy(String districtcode, String districtname, String statecode, String statename, String district_lgd) {
        return new ReverseModleItem(districtcode, districtname, statecode, statename, district_lgd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReverseModleItem)) {
            return false;
        }
        ReverseModleItem reverseModleItem = (ReverseModleItem) other;
        return Intrinsics.areEqual(this.districtcode, reverseModleItem.districtcode) && Intrinsics.areEqual(this.districtname, reverseModleItem.districtname) && Intrinsics.areEqual(this.statecode, reverseModleItem.statecode) && Intrinsics.areEqual(this.statename, reverseModleItem.statename) && Intrinsics.areEqual(this.district_lgd, reverseModleItem.district_lgd);
    }

    public final String getDistrict_lgd() {
        return this.district_lgd;
    }

    public final String getDistrictcode() {
        return this.districtcode;
    }

    public final String getDistrictname() {
        return this.districtname;
    }

    public final String getStatecode() {
        return this.statecode;
    }

    public final String getStatename() {
        return this.statename;
    }

    public int hashCode() {
        String str = this.districtcode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.districtname;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statecode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.statename;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.district_lgd;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ReverseModleItem(districtcode=" + this.districtcode + ", districtname=" + this.districtname + ", statecode=" + this.statecode + ", statename=" + this.statename + ", district_lgd=" + this.district_lgd + ')';
    }
}
