package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.zepto.k80;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\f\u0012\u0006\u0010!\u001a\u00020\u000e\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u0012\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bO\u0010PJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u0012HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003JÇ\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010!\u001a\u00020\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\u0018\b\u0002\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\t\u0010*\u001a\u00020\u0002HÖ\u0001J\t\u0010+\u001a\u00020\u000eHÖ\u0001J\u0013\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\b3\u00102R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\b7\u00102R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010 \u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b \u0010>\u001a\u0004\b?\u0010@R\u0017\u0010!\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\bD\u00102R'\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u00128\u0006¢\u0006\f\n\u0004\b#\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\bH\u00102R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\bI\u00102R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\bJ\u00102R\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\bK\u00102R\u0019\u0010(\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b(\u0010L\u001a\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/DataX;", "Ljava/io/Serializable;", "", "component1", "component2", "Lcom/zepto/k80;", "component3", "component4", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;", "component5", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;", "component6", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "component7", "", "component8", "component9", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component10", "component11", "component12", "component13", "component14", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;", "component15", "applNo", "authMode", "buyerDto", "mobileNo", "durcdto", "hpaDto", "hptDto", "officeCode", "openDate", "purposeCode", "regnNo", "stateCode", "sellerOrBuyer", "chassisNo", "transferOwnershipDto", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getApplNo", "()Ljava/lang/String;", "getAuthMode", "Lcom/zepto/k80;", "getBuyerDto", "()Lcom/zepto/k80;", "getMobileNo", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;", "getDurcdto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;", "getHpaDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "getHptDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "I", "getOfficeCode", "()I", "getOpenDate", "Ljava/util/ArrayList;", "getPurposeCode", "()Ljava/util/ArrayList;", "getRegnNo", "getStateCode", "getSellerOrBuyer", "getChassisNo", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;", "getTransferOwnershipDto", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/zepto/k80;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;ILjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;)V", "app_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class DataX implements Serializable {
    private final String applNo;
    private final String authMode;
    private final k80 buyerDto;
    private final String chassisNo;
    private final com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto durcdto;
    private final HpaDto hpaDto;
    private final HptDto hptDto;
    private final String mobileNo;
    private final int officeCode;
    private final String openDate;
    private final ArrayList<Integer> purposeCode;
    private final String regnNo;
    private final String sellerOrBuyer;
    private final String stateCode;
    private final com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto transferOwnershipDto;

    public DataX(String str, String str2, k80 k80Var, String mobileNo, com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto durcdto, HpaDto hpaDto, HptDto hptDto, int i, String str3, ArrayList<Integer> purposeCode, String str4, String str5, String str6, String str7, com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto transferOwnershipDto) {
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        this.applNo = str;
        this.authMode = str2;
        this.mobileNo = mobileNo;
        this.durcdto = durcdto;
        this.hpaDto = hpaDto;
        this.hptDto = hptDto;
        this.officeCode = i;
        this.openDate = str3;
        this.purposeCode = purposeCode;
        this.regnNo = str4;
        this.stateCode = str5;
        this.sellerOrBuyer = str6;
        this.chassisNo = str7;
        this.transferOwnershipDto = transferOwnershipDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataX copy$default(DataX dataX, String str, String str2, k80 k80Var, String str3, com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto durcdto, HpaDto hpaDto, HptDto hptDto, int i, String str4, ArrayList arrayList, String str5, String str6, String str7, String str8, com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto transferOwnershipDto, int i2, Object obj) {
        k80 k80Var2;
        String str9 = (i2 & 1) != 0 ? dataX.applNo : str;
        String str10 = (i2 & 2) != 0 ? dataX.authMode : str2;
        if ((i2 & 4) != 0) {
            dataX.getClass();
            k80Var2 = null;
        } else {
            k80Var2 = k80Var;
        }
        return dataX.copy(str9, str10, k80Var2, (i2 & 8) != 0 ? dataX.mobileNo : str3, (i2 & 16) != 0 ? dataX.durcdto : durcdto, (i2 & 32) != 0 ? dataX.hpaDto : hpaDto, (i2 & 64) != 0 ? dataX.hptDto : hptDto, (i2 & 128) != 0 ? dataX.officeCode : i, (i2 & 256) != 0 ? dataX.openDate : str4, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? dataX.purposeCode : arrayList, (i2 & 1024) != 0 ? dataX.regnNo : str5, (i2 & 2048) != 0 ? dataX.stateCode : str6, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? dataX.sellerOrBuyer : str7, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? dataX.chassisNo : str8, (i2 & 16384) != 0 ? dataX.transferOwnershipDto : transferOwnershipDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    public final ArrayList<Integer> component10() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSellerOrBuyer() {
        return this.sellerOrBuyer;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getChassisNo() {
        return this.chassisNo;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto getTransferOwnershipDto() {
        return this.transferOwnershipDto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthMode() {
        return this.authMode;
    }

    public final k80 component3() {
        return null;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMobileNo() {
        return this.mobileNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto getDurcdto() {
        return this.durcdto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HpaDto getHpaDto() {
        return this.hpaDto;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HptDto getHptDto() {
        return this.hptDto;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOpenDate() {
        return this.openDate;
    }

    public final DataX copy(String applNo, String authMode, k80 buyerDto, String mobileNo, com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto durcdto, HpaDto hpaDto, HptDto hptDto, int officeCode, String openDate, ArrayList<Integer> purposeCode, String regnNo, String stateCode, String sellerOrBuyer, String chassisNo, com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto transferOwnershipDto) {
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        return new DataX(applNo, authMode, buyerDto, mobileNo, durcdto, hpaDto, hptDto, officeCode, openDate, purposeCode, regnNo, stateCode, sellerOrBuyer, chassisNo, transferOwnershipDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataX)) {
            return false;
        }
        DataX dataX = (DataX) other;
        return Intrinsics.areEqual(this.applNo, dataX.applNo) && Intrinsics.areEqual(this.authMode, dataX.authMode) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.mobileNo, dataX.mobileNo) && Intrinsics.areEqual(this.durcdto, dataX.durcdto) && Intrinsics.areEqual(this.hpaDto, dataX.hpaDto) && Intrinsics.areEqual(this.hptDto, dataX.hptDto) && this.officeCode == dataX.officeCode && Intrinsics.areEqual(this.openDate, dataX.openDate) && Intrinsics.areEqual(this.purposeCode, dataX.purposeCode) && Intrinsics.areEqual(this.regnNo, dataX.regnNo) && Intrinsics.areEqual(this.stateCode, dataX.stateCode) && Intrinsics.areEqual(this.sellerOrBuyer, dataX.sellerOrBuyer) && Intrinsics.areEqual(this.chassisNo, dataX.chassisNo) && Intrinsics.areEqual(this.transferOwnershipDto, dataX.transferOwnershipDto);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthMode() {
        return this.authMode;
    }

    public final k80 getBuyerDto() {
        return null;
    }

    public final String getChassisNo() {
        return this.chassisNo;
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

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getOpenDate() {
        return this.openDate;
    }

    public final ArrayList<Integer> getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getSellerOrBuyer() {
        return this.sellerOrBuyer;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto getTransferOwnershipDto() {
        return this.transferOwnershipDto;
    }

    public int hashCode() {
        String str = this.applNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authMode;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 961) + this.mobileNo.hashCode()) * 31;
        com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto durcdto = this.durcdto;
        int iHashCode3 = (iHashCode2 + (durcdto == null ? 0 : durcdto.hashCode())) * 31;
        HpaDto hpaDto = this.hpaDto;
        int iHashCode4 = (iHashCode3 + (hpaDto == null ? 0 : hpaDto.hashCode())) * 31;
        HptDto hptDto = this.hptDto;
        int iHashCode5 = (((iHashCode4 + (hptDto == null ? 0 : hptDto.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str3 = this.openDate;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.purposeCode.hashCode()) * 31;
        String str4 = this.regnNo;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stateCode;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sellerOrBuyer;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.chassisNo;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto transferOwnershipDto = this.transferOwnershipDto;
        return iHashCode10 + (transferOwnershipDto != null ? transferOwnershipDto.hashCode() : 0);
    }

    public String toString() {
        return "DataX(applNo=" + this.applNo + ", authMode=" + this.authMode + ", buyerDto=" + ((Object) null) + ", mobileNo=" + this.mobileNo + ", durcdto=" + this.durcdto + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", sellerOrBuyer=" + this.sellerOrBuyer + ", chassisNo=" + this.chassisNo + ", transferOwnershipDto=" + this.transferOwnershipDto + ')';
    }
}
