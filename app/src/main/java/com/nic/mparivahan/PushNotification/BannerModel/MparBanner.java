package com.nic.mparivahan.PushNotification.BannerModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J^\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\b\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\n\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/PushNotification/BannerModel/MparBanner;", "", "id", "", "imgDesc", "", "imgUrl", "isActive", "isAndroid", "", "isIos", "stateCd", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()I", "getImgDesc", "()Ljava/lang/String;", "getImgUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStateCd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/nic/mparivahan/PushNotification/BannerModel/MparBanner;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparBanner {
    private final int id;
    private final String imgDesc;
    private final String imgUrl;
    private final int isActive;
    private final Boolean isAndroid;
    private final Boolean isIos;
    private final String stateCd;

    public MparBanner(int i, String str, String str2, int i2, Boolean bool, Boolean bool2, String str3) {
        this.id = i;
        this.imgDesc = str;
        this.imgUrl = str2;
        this.isActive = i2;
        this.isAndroid = bool;
        this.isIos = bool2;
        this.stateCd = str3;
    }

    public static /* synthetic */ MparBanner copy$default(MparBanner mparBanner, int i, String str, String str2, int i2, Boolean bool, Boolean bool2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mparBanner.id;
        }
        if ((i3 & 2) != 0) {
            str = mparBanner.imgDesc;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = mparBanner.imgUrl;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            i2 = mparBanner.isActive;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            bool = mparBanner.isAndroid;
        }
        Boolean bool3 = bool;
        if ((i3 & 32) != 0) {
            bool2 = mparBanner.isIos;
        }
        Boolean bool4 = bool2;
        if ((i3 & 64) != 0) {
            str3 = mparBanner.stateCd;
        }
        return mparBanner.copy(i, str4, str5, i4, bool3, bool4, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImgDesc() {
        return this.imgDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsAndroid() {
        return this.isAndroid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsIos() {
        return this.isIos;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    public final MparBanner copy(int id, String imgDesc, String imgUrl, int isActive, Boolean isAndroid, Boolean isIos, String stateCd) {
        return new MparBanner(id, imgDesc, imgUrl, isActive, isAndroid, isIos, stateCd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparBanner)) {
            return false;
        }
        MparBanner mparBanner = (MparBanner) other;
        return this.id == mparBanner.id && Intrinsics.areEqual(this.imgDesc, mparBanner.imgDesc) && Intrinsics.areEqual(this.imgUrl, mparBanner.imgUrl) && this.isActive == mparBanner.isActive && Intrinsics.areEqual(this.isAndroid, mparBanner.isAndroid) && Intrinsics.areEqual(this.isIos, mparBanner.isIos) && Intrinsics.areEqual(this.stateCd, mparBanner.stateCd);
    }

    public final int getId() {
        return this.id;
    }

    public final String getImgDesc() {
        return this.imgDesc;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.imgDesc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imgUrl;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.isActive)) * 31;
        Boolean bool = this.isAndroid;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isIos;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.stateCd;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final int isActive() {
        return this.isActive;
    }

    public final Boolean isAndroid() {
        return this.isAndroid;
    }

    public final Boolean isIos() {
        return this.isIos;
    }

    public String toString() {
        return "MparBanner(id=" + this.id + ", imgDesc=" + this.imgDesc + ", imgUrl=" + this.imgUrl + ", isActive=" + this.isActive + ", isAndroid=" + this.isAndroid + ", isIos=" + this.isIos + ", stateCd=" + this.stateCd + ')';
    }
}
