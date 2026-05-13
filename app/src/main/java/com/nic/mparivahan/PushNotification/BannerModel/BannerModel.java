package com.nic.mparivahan.PushNotification.BannerModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u001d\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J?\u0010\u0012\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/PushNotification/BannerModel/BannerModel;", "", "mparBannerList", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/PushNotification/BannerModel/MparBanner;", "Lkotlin/collections/ArrayList;", "statusCode", "", "statusDesc", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getMparBannerList", "()Ljava/util/ArrayList;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BannerModel {
    private final ArrayList<MparBanner> mparBannerList;
    private final String statusCode;
    private final String statusDesc;

    public BannerModel(ArrayList<MparBanner> arrayList, String str, String str2) {
        this.mparBannerList = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerModel copy$default(BannerModel bannerModel, ArrayList arrayList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = bannerModel.mparBannerList;
        }
        if ((i & 2) != 0) {
            str = bannerModel.statusCode;
        }
        if ((i & 4) != 0) {
            str2 = bannerModel.statusDesc;
        }
        return bannerModel.copy(arrayList, str, str2);
    }

    public final ArrayList<MparBanner> component1() {
        return this.mparBannerList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final BannerModel copy(ArrayList<MparBanner> mparBannerList, String statusCode, String statusDesc) {
        return new BannerModel(mparBannerList, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerModel)) {
            return false;
        }
        BannerModel bannerModel = (BannerModel) other;
        return Intrinsics.areEqual(this.mparBannerList, bannerModel.mparBannerList) && Intrinsics.areEqual(this.statusCode, bannerModel.statusCode) && Intrinsics.areEqual(this.statusDesc, bannerModel.statusDesc);
    }

    public final ArrayList<MparBanner> getMparBannerList() {
        return this.mparBannerList;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        ArrayList<MparBanner> arrayList = this.mparBannerList;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.statusCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusDesc;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BannerModel(mparBannerList=" + this.mparBannerList + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
