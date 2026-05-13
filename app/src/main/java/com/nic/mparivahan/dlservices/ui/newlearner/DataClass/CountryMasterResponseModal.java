package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/CountryMasterResponseModal;", "", "countryName", "", "countryCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getCountryName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CountryMasterResponseModal {

    @xy5("country_code")
    private final String countryCode;

    @xy5("country_name")
    private final String countryName;

    public CountryMasterResponseModal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CountryMasterResponseModal copy$default(CountryMasterResponseModal countryMasterResponseModal, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryMasterResponseModal.countryName;
        }
        if ((i & 2) != 0) {
            str2 = countryMasterResponseModal.countryCode;
        }
        return countryMasterResponseModal.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final CountryMasterResponseModal copy(String countryName, String countryCode) {
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new CountryMasterResponseModal(countryName, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryMasterResponseModal)) {
            return false;
        }
        CountryMasterResponseModal countryMasterResponseModal = (CountryMasterResponseModal) other;
        return Intrinsics.areEqual(this.countryName, countryMasterResponseModal.countryName) && Intrinsics.areEqual(this.countryCode, countryMasterResponseModal.countryCode);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public int hashCode() {
        return (this.countryName.hashCode() * 31) + this.countryCode.hashCode();
    }

    public String toString() {
        return "CountryMasterResponseModal(countryName=" + this.countryName + ", countryCode=" + this.countryCode + ')';
    }

    public CountryMasterResponseModal(String countryName, String countryCode) {
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public /* synthetic */ CountryMasterResponseModal(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
