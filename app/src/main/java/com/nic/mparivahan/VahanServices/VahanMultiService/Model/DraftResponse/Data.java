package com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.TransferOwnershipDto;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0010j\b\u0012\u0004\u0012\u00020\r`\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0019\u00104\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0010j\b\u0012\u0004\u0012\u00020\r`\u0011HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0099\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0010j\b\u0012\u0004\u0012\u00020\r`\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\rHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R!\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0010j\b\u0012\u0004\u0012\u00020\r`\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006<"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftResponse/Data;", "", "applNo", "", "channgeOfAdressDto", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;", "durcdto", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;", "hpaDto", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;", "hptDto", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "officeCode", "", "openDate", "purposeCode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "regnNo", "stateCode", "transferOwnershipDto", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/TransferOwnershipDto;", "(Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;ILjava/lang/Object;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/TransferOwnershipDto;)V", "getApplNo", "()Ljava/lang/String;", "getChanngeOfAdressDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;", "getDurcdto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;", "getHpaDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;", "getHptDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "getOfficeCode", "()I", "getOpenDate", "()Ljava/lang/Object;", "getPurposeCode", "()Ljava/util/ArrayList;", "getRegnNo", "getStateCode", "getTransferOwnershipDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/TransferOwnershipDto;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final String applNo;
    private final ChanngeOfAdressDto channgeOfAdressDto;
    private final com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto durcdto;
    private final HpaDto hpaDto;
    private final HptDto hptDto;
    private final int officeCode;
    private final Object openDate;
    private final ArrayList<Integer> purposeCode;
    private final String regnNo;
    private final String stateCode;
    private final TransferOwnershipDto transferOwnershipDto;

    public Data(String str, ChanngeOfAdressDto channgeOfAdressDto, com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto durcdto, HpaDto hpaDto, HptDto hptDto, int i, Object obj, ArrayList<Integer> purposeCode, String str2, String str3, TransferOwnershipDto transferOwnershipDto) {
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        this.applNo = str;
        this.channgeOfAdressDto = channgeOfAdressDto;
        this.durcdto = durcdto;
        this.hpaDto = hpaDto;
        this.hptDto = hptDto;
        this.officeCode = i;
        this.openDate = obj;
        this.purposeCode = purposeCode;
        this.regnNo = str2;
        this.stateCode = str3;
        this.transferOwnershipDto = transferOwnershipDto;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final TransferOwnershipDto getTransferOwnershipDto() {
        return this.transferOwnershipDto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto getDurcdto() {
        return this.durcdto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HpaDto getHpaDto() {
        return this.hpaDto;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HptDto getHptDto() {
        return this.hptDto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getOpenDate() {
        return this.openDate;
    }

    public final ArrayList<Integer> component8() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    public final Data copy(String applNo, ChanngeOfAdressDto channgeOfAdressDto, com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto durcdto, HpaDto hpaDto, HptDto hptDto, int officeCode, Object openDate, ArrayList<Integer> purposeCode, String regnNo, String stateCode, TransferOwnershipDto transferOwnershipDto) {
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        return new Data(applNo, channgeOfAdressDto, durcdto, hpaDto, hptDto, officeCode, openDate, purposeCode, regnNo, stateCode, transferOwnershipDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.channgeOfAdressDto, data.channgeOfAdressDto) && Intrinsics.areEqual(this.durcdto, data.durcdto) && Intrinsics.areEqual(this.hpaDto, data.hpaDto) && Intrinsics.areEqual(this.hptDto, data.hptDto) && this.officeCode == data.officeCode && Intrinsics.areEqual(this.openDate, data.openDate) && Intrinsics.areEqual(this.purposeCode, data.purposeCode) && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.stateCode, data.stateCode) && Intrinsics.areEqual(this.transferOwnershipDto, data.transferOwnershipDto);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto getDurcdto() {
        return this.durcdto;
    }

    public final HpaDto getHpaDto() {
        return this.hpaDto;
    }

    public final HptDto getHptDto() {
        return this.hptDto;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final Object getOpenDate() {
        return this.openDate;
    }

    public final ArrayList<Integer> getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final TransferOwnershipDto getTransferOwnershipDto() {
        return this.transferOwnershipDto;
    }

    public int hashCode() {
        String str = this.applNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ChanngeOfAdressDto channgeOfAdressDto = this.channgeOfAdressDto;
        int iHashCode2 = (iHashCode + (channgeOfAdressDto == null ? 0 : channgeOfAdressDto.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto durcdto = this.durcdto;
        int iHashCode3 = (iHashCode2 + (durcdto == null ? 0 : durcdto.hashCode())) * 31;
        HpaDto hpaDto = this.hpaDto;
        int iHashCode4 = (iHashCode3 + (hpaDto == null ? 0 : hpaDto.hashCode())) * 31;
        HptDto hptDto = this.hptDto;
        int iHashCode5 = (((iHashCode4 + (hptDto == null ? 0 : hptDto.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        Object obj = this.openDate;
        int iHashCode6 = (((iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31) + this.purposeCode.hashCode()) * 31;
        String str2 = this.regnNo;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stateCode;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TransferOwnershipDto transferOwnershipDto = this.transferOwnershipDto;
        return iHashCode8 + (transferOwnershipDto != null ? transferOwnershipDto.hashCode() : 0);
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", durcdto=" + this.durcdto + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", transferOwnershipDto=" + this.transferOwnershipDto + ')';
    }
}
