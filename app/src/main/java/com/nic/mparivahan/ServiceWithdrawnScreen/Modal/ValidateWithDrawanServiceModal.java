package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R&\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/ServiceWithdrawnScreen/Modal/ValidateWithDrawanServiceModal;", "", "status_code", "", "status_desc", "result", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/ServiceWithdrawnScreen/Modal/ValidateWithDrawnServiceResultModal;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getResult", "()Ljava/util/ArrayList;", "getStatus_code", "()Ljava/lang/String;", "getStatus_desc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ValidateWithDrawanServiceModal {

    @xy5("Result")
    private final ArrayList<ValidateWithDrawnServiceResultModal> result;

    @xy5("status_code")
    private final String status_code;

    @xy5("status_desc")
    private final String status_desc;

    public ValidateWithDrawanServiceModal(String status_code, String status_desc, ArrayList<ValidateWithDrawnServiceResultModal> result) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(result, "result");
        this.status_code = status_code;
        this.status_desc = status_desc;
        this.result = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ValidateWithDrawanServiceModal copy$default(ValidateWithDrawanServiceModal validateWithDrawanServiceModal, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateWithDrawanServiceModal.status_code;
        }
        if ((i & 2) != 0) {
            str2 = validateWithDrawanServiceModal.status_desc;
        }
        if ((i & 4) != 0) {
            arrayList = validateWithDrawanServiceModal.result;
        }
        return validateWithDrawanServiceModal.copy(str, str2, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final ArrayList<ValidateWithDrawnServiceResultModal> component3() {
        return this.result;
    }

    public final ValidateWithDrawanServiceModal copy(String status_code, String status_desc, ArrayList<ValidateWithDrawnServiceResultModal> result) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(result, "result");
        return new ValidateWithDrawanServiceModal(status_code, status_desc, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateWithDrawanServiceModal)) {
            return false;
        }
        ValidateWithDrawanServiceModal validateWithDrawanServiceModal = (ValidateWithDrawanServiceModal) other;
        return Intrinsics.areEqual(this.status_code, validateWithDrawanServiceModal.status_code) && Intrinsics.areEqual(this.status_desc, validateWithDrawanServiceModal.status_desc) && Intrinsics.areEqual(this.result, validateWithDrawanServiceModal.result);
    }

    public final ArrayList<ValidateWithDrawnServiceResultModal> getResult() {
        return this.result;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.status_code.hashCode() * 31) + this.status_desc.hashCode()) * 31) + this.result.hashCode();
    }

    public String toString() {
        return "ValidateWithDrawanServiceModal(status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", result=" + this.result + ')';
    }

    public /* synthetic */ ValidateWithDrawanServiceModal(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, arrayList);
    }
}
