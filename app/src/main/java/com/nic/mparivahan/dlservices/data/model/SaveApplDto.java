package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/SaveApplDto;", "Ljava/io/Serializable;", "dlRenewalSaveDto", "Lcom/nic/mparivahan/dlservices/data/model/DlRenewalSaveDto;", "dldetobj", "", "(Lcom/nic/mparivahan/dlservices/data/model/DlRenewalSaveDto;Ljava/lang/Object;)V", "getDlRenewalSaveDto", "()Lcom/nic/mparivahan/dlservices/data/model/DlRenewalSaveDto;", "getDldetobj", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SaveApplDto implements Serializable {

    @xy5("dlRenewalSaveDto")
    private final DlRenewalSaveDto dlRenewalSaveDto;

    @xy5("dldetobj")
    private final Object dldetobj;

    public SaveApplDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SaveApplDto copy$default(SaveApplDto saveApplDto, DlRenewalSaveDto dlRenewalSaveDto, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            dlRenewalSaveDto = saveApplDto.dlRenewalSaveDto;
        }
        if ((i & 2) != 0) {
            obj = saveApplDto.dldetobj;
        }
        return saveApplDto.copy(dlRenewalSaveDto, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DlRenewalSaveDto getDlRenewalSaveDto() {
        return this.dlRenewalSaveDto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getDldetobj() {
        return this.dldetobj;
    }

    public final SaveApplDto copy(DlRenewalSaveDto dlRenewalSaveDto, Object dldetobj) {
        return new SaveApplDto(dlRenewalSaveDto, dldetobj);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveApplDto)) {
            return false;
        }
        SaveApplDto saveApplDto = (SaveApplDto) other;
        return Intrinsics.areEqual(this.dlRenewalSaveDto, saveApplDto.dlRenewalSaveDto) && Intrinsics.areEqual(this.dldetobj, saveApplDto.dldetobj);
    }

    public final DlRenewalSaveDto getDlRenewalSaveDto() {
        return this.dlRenewalSaveDto;
    }

    public final Object getDldetobj() {
        return this.dldetobj;
    }

    public int hashCode() {
        DlRenewalSaveDto dlRenewalSaveDto = this.dlRenewalSaveDto;
        int iHashCode = (dlRenewalSaveDto == null ? 0 : dlRenewalSaveDto.hashCode()) * 31;
        Object obj = this.dldetobj;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "SaveApplDto(dlRenewalSaveDto=" + this.dlRenewalSaveDto + ", dldetobj=" + this.dldetobj + ')';
    }

    public SaveApplDto(DlRenewalSaveDto dlRenewalSaveDto, Object obj) {
        this.dlRenewalSaveDto = dlRenewalSaveDto;
        this.dldetobj = obj;
    }

    public /* synthetic */ SaveApplDto(DlRenewalSaveDto dlRenewalSaveDto, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dlRenewalSaveDto, (i & 2) != 0 ? null : obj);
    }
}
