package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\n\u0012\b\u0010#\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010%\u001a\u00020\u0010\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0013j\b\u0012\u0004\u0012\u00020\u0010`\u0014\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010,\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bX\u0010YJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0013j\b\u0012\u0004\u0012\u00020\u0010`\u0014HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003JÓ\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010 \u001a\u00020\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010%\u001a\u00020\u00102\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\u0018\b\u0002\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0013j\b\u0012\u0004\u0012\u00020\u0010`\u00142\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\t\u0010.\u001a\u00020\u0002HÖ\u0001J\t\u0010/\u001a\u00020\u0010HÖ\u0001J\u0013\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00104\u001a\u0004\b7\u00106R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\b9\u0010:R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u00104\u001a\u0004\b;\u00106R\u0019\u0010!\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\"\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010#\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010%\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\bK\u00106R'\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0013j\b\u0012\u0004\u0012\u00020\u0010`\u00148\u0006¢\u0006\f\n\u0004\b'\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\bO\u00106R\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\bP\u00106R\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u00104\u001a\u0004\bQ\u00106R\u0019\u0010+\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b+\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010,\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b,\u0010U\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "Ljava/io/Serializable;", "", "component1", "component2", "Lcom/zepto/k80;", "component3", "component4", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;", "component5", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;", "component6", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;", "component7", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "component8", "", "component9", "component10", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component11", "component12", "component13", "component14", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;", "component15", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/AddNomineeDtoX;", "component16", "applNo", "authMode", "buyerDto", "mobileNo", "channgeOfAdressDto", "durcdto", "hpaDto", "hptDto", "officeCode", "openDate", "purposeCode", "regnNo", "stateCode", "sellerOrBuyer", "transferOwnershipDto", "addNomineeDto", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getApplNo", "()Ljava/lang/String;", "getAuthMode", "Lcom/zepto/k80;", "getBuyerDto", "()Lcom/zepto/k80;", "getMobileNo", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;", "getChanngeOfAdressDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;", "getDurcdto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;", "getHpaDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "getHptDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "I", "getOfficeCode", "()I", "getOpenDate", "Ljava/util/ArrayList;", "getPurposeCode", "()Ljava/util/ArrayList;", "getRegnNo", "getStateCode", "getSellerOrBuyer", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;", "getTransferOwnershipDto", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/AddNomineeDtoX;", "getAddNomineeDto", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/AddNomineeDtoX;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/zepto/k80;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;ILjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/AddNomineeDtoX;)V", "app_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class MultiServiceDraftTO implements Serializable {
    private final AddNomineeDtoX addNomineeDto;
    private final String applNo;
    private final String authMode;
    private final k80 buyerDto;
    private final ChanngeOfAdressDto channgeOfAdressDto;
    private final Durcdto durcdto;
    private final HpaDto hpaDto;
    private final HptDto hptDto;
    private final String mobileNo;
    private final int officeCode;
    private final String openDate;
    private final ArrayList<Integer> purposeCode;
    private final String regnNo;
    private final String sellerOrBuyer;
    private final String stateCode;
    private final TransferOwnershipDto transferOwnershipDto;

    public MultiServiceDraftTO(String str, String str2, k80 k80Var, String mobileNo, ChanngeOfAdressDto channgeOfAdressDto, Durcdto durcdto, HpaDto hpaDto, HptDto hptDto, int i, String str3, ArrayList<Integer> purposeCode, String str4, String str5, String str6, TransferOwnershipDto transferOwnershipDto, AddNomineeDtoX addNomineeDtoX) {
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        this.applNo = str;
        this.authMode = str2;
        this.mobileNo = mobileNo;
        this.channgeOfAdressDto = channgeOfAdressDto;
        this.durcdto = durcdto;
        this.hpaDto = hpaDto;
        this.hptDto = hptDto;
        this.officeCode = i;
        this.openDate = str3;
        this.purposeCode = purposeCode;
        this.regnNo = str4;
        this.stateCode = str5;
        this.sellerOrBuyer = str6;
        this.transferOwnershipDto = transferOwnershipDto;
        this.addNomineeDto = addNomineeDtoX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiServiceDraftTO copy$default(MultiServiceDraftTO multiServiceDraftTO, String str, String str2, k80 k80Var, String str3, ChanngeOfAdressDto channgeOfAdressDto, Durcdto durcdto, HpaDto hpaDto, HptDto hptDto, int i, String str4, ArrayList arrayList, String str5, String str6, String str7, TransferOwnershipDto transferOwnershipDto, AddNomineeDtoX addNomineeDtoX, int i2, Object obj) {
        k80 k80Var2;
        String str8 = (i2 & 1) != 0 ? multiServiceDraftTO.applNo : str;
        String str9 = (i2 & 2) != 0 ? multiServiceDraftTO.authMode : str2;
        if ((i2 & 4) != 0) {
            multiServiceDraftTO.getClass();
            k80Var2 = null;
        } else {
            k80Var2 = k80Var;
        }
        return multiServiceDraftTO.copy(str8, str9, k80Var2, (i2 & 8) != 0 ? multiServiceDraftTO.mobileNo : str3, (i2 & 16) != 0 ? multiServiceDraftTO.channgeOfAdressDto : channgeOfAdressDto, (i2 & 32) != 0 ? multiServiceDraftTO.durcdto : durcdto, (i2 & 64) != 0 ? multiServiceDraftTO.hpaDto : hpaDto, (i2 & 128) != 0 ? multiServiceDraftTO.hptDto : hptDto, (i2 & 256) != 0 ? multiServiceDraftTO.officeCode : i, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? multiServiceDraftTO.openDate : str4, (i2 & 1024) != 0 ? multiServiceDraftTO.purposeCode : arrayList, (i2 & 2048) != 0 ? multiServiceDraftTO.regnNo : str5, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? multiServiceDraftTO.stateCode : str6, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? multiServiceDraftTO.sellerOrBuyer : str7, (i2 & 16384) != 0 ? multiServiceDraftTO.transferOwnershipDto : transferOwnershipDto, (i2 & 32768) != 0 ? multiServiceDraftTO.addNomineeDto : addNomineeDtoX);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOpenDate() {
        return this.openDate;
    }

    public final ArrayList<Integer> component11() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSellerOrBuyer() {
        return this.sellerOrBuyer;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final TransferOwnershipDto getTransferOwnershipDto() {
        return this.transferOwnershipDto;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final AddNomineeDtoX getAddNomineeDto() {
        return this.addNomineeDto;
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
    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Durcdto getDurcdto() {
        return this.durcdto;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HpaDto getHpaDto() {
        return this.hpaDto;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HptDto getHptDto() {
        return this.hptDto;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final MultiServiceDraftTO copy(String applNo, String authMode, k80 buyerDto, String mobileNo, ChanngeOfAdressDto channgeOfAdressDto, Durcdto durcdto, HpaDto hpaDto, HptDto hptDto, int officeCode, String openDate, ArrayList<Integer> purposeCode, String regnNo, String stateCode, String sellerOrBuyer, TransferOwnershipDto transferOwnershipDto, AddNomineeDtoX addNomineeDto) {
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        return new MultiServiceDraftTO(applNo, authMode, buyerDto, mobileNo, channgeOfAdressDto, durcdto, hpaDto, hptDto, officeCode, openDate, purposeCode, regnNo, stateCode, sellerOrBuyer, transferOwnershipDto, addNomineeDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiServiceDraftTO)) {
            return false;
        }
        MultiServiceDraftTO multiServiceDraftTO = (MultiServiceDraftTO) other;
        return Intrinsics.areEqual(this.applNo, multiServiceDraftTO.applNo) && Intrinsics.areEqual(this.authMode, multiServiceDraftTO.authMode) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.mobileNo, multiServiceDraftTO.mobileNo) && Intrinsics.areEqual(this.channgeOfAdressDto, multiServiceDraftTO.channgeOfAdressDto) && Intrinsics.areEqual(this.durcdto, multiServiceDraftTO.durcdto) && Intrinsics.areEqual(this.hpaDto, multiServiceDraftTO.hpaDto) && Intrinsics.areEqual(this.hptDto, multiServiceDraftTO.hptDto) && this.officeCode == multiServiceDraftTO.officeCode && Intrinsics.areEqual(this.openDate, multiServiceDraftTO.openDate) && Intrinsics.areEqual(this.purposeCode, multiServiceDraftTO.purposeCode) && Intrinsics.areEqual(this.regnNo, multiServiceDraftTO.regnNo) && Intrinsics.areEqual(this.stateCode, multiServiceDraftTO.stateCode) && Intrinsics.areEqual(this.sellerOrBuyer, multiServiceDraftTO.sellerOrBuyer) && Intrinsics.areEqual(this.transferOwnershipDto, multiServiceDraftTO.transferOwnershipDto) && Intrinsics.areEqual(this.addNomineeDto, multiServiceDraftTO.addNomineeDto);
    }

    public final AddNomineeDtoX getAddNomineeDto() {
        return this.addNomineeDto;
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

    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final Durcdto getDurcdto() {
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

    public final TransferOwnershipDto getTransferOwnershipDto() {
        return this.transferOwnershipDto;
    }

    public int hashCode() {
        String str = this.applNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authMode;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 961) + this.mobileNo.hashCode()) * 31;
        ChanngeOfAdressDto channgeOfAdressDto = this.channgeOfAdressDto;
        int iHashCode3 = (iHashCode2 + (channgeOfAdressDto == null ? 0 : channgeOfAdressDto.hashCode())) * 31;
        Durcdto durcdto = this.durcdto;
        int iHashCode4 = (iHashCode3 + (durcdto == null ? 0 : durcdto.hashCode())) * 31;
        HpaDto hpaDto = this.hpaDto;
        int iHashCode5 = (iHashCode4 + (hpaDto == null ? 0 : hpaDto.hashCode())) * 31;
        HptDto hptDto = this.hptDto;
        int iHashCode6 = (((iHashCode5 + (hptDto == null ? 0 : hptDto.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str3 = this.openDate;
        int iHashCode7 = (((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.purposeCode.hashCode()) * 31;
        String str4 = this.regnNo;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stateCode;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sellerOrBuyer;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        TransferOwnershipDto transferOwnershipDto = this.transferOwnershipDto;
        int iHashCode11 = (iHashCode10 + (transferOwnershipDto == null ? 0 : transferOwnershipDto.hashCode())) * 31;
        AddNomineeDtoX addNomineeDtoX = this.addNomineeDto;
        return iHashCode11 + (addNomineeDtoX != null ? addNomineeDtoX.hashCode() : 0);
    }

    public String toString() {
        return "MultiServiceDraftTO(applNo=" + this.applNo + ", authMode=" + this.authMode + ", buyerDto=" + ((Object) null) + ", mobileNo=" + this.mobileNo + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", durcdto=" + this.durcdto + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", sellerOrBuyer=" + this.sellerOrBuyer + ", transferOwnershipDto=" + this.transferOwnershipDto + ", addNomineeDto=" + this.addNomineeDto + ')';
    }
}
