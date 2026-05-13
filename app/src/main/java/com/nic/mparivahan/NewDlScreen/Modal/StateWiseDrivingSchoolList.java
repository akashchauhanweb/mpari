package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Modal/StateWiseDrivingSchoolList;", "", "name", "", "code", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StateWiseDrivingSchoolList {

    @xy5("drivingSchool_code")
    private final String code;

    @xy5("drivingSchool_name")
    private final String name;

    public StateWiseDrivingSchoolList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StateWiseDrivingSchoolList copy$default(StateWiseDrivingSchoolList stateWiseDrivingSchoolList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stateWiseDrivingSchoolList.name;
        }
        if ((i & 2) != 0) {
            str2 = stateWiseDrivingSchoolList.code;
        }
        return stateWiseDrivingSchoolList.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final StateWiseDrivingSchoolList copy(String name, String code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        return new StateWiseDrivingSchoolList(name, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateWiseDrivingSchoolList)) {
            return false;
        }
        StateWiseDrivingSchoolList stateWiseDrivingSchoolList = (StateWiseDrivingSchoolList) other;
        return Intrinsics.areEqual(this.name, stateWiseDrivingSchoolList.name) && Intrinsics.areEqual(this.code, stateWiseDrivingSchoolList.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.code.hashCode();
    }

    public String toString() {
        return "StateWiseDrivingSchoolList(name=" + this.name + ", code=" + this.code + ')';
    }

    public StateWiseDrivingSchoolList(String name, String code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        this.name = name;
        this.code = code;
    }

    public /* synthetic */ StateWiseDrivingSchoolList(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
