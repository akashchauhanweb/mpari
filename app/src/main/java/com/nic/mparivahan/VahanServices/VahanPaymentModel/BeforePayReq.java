package com.nic.mparivahan.VahanServices.VahanPaymentModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DataX;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPRequestModel;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bd\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\b\u0010*\u001a\u0004\u0018\u00010+\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\b\u00100\u001a\u0004\u0018\u000101\u0012\b\u00102\u001a\u0004\u0018\u000103\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108¢\u0006\u0002\u00109J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\bHÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\bHÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020 HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010qJ\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u000103HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\bHÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J´\u0003\u0010\u009a\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u000108HÆ\u0001¢\u0006\u0003\u0010\u009b\u0001J\u0017\u0010\u009c\u0001\u001a\u00030\u009d\u00012\n\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001HÖ\u0003J\n\u0010 \u0001\u001a\u00020\bHÖ\u0001J\n\u0010¡\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010;R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010(\u001a\u0004\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010;R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010;R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bN\u0010AR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010;R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bP\u0010AR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010;R\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010;R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010;R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010;R\u0013\u00102\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010;R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010;R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010;R\u0013\u0010*\u001a\u0004\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010;R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010;R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bh\u0010AR\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010;R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010;R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010;R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010;R\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010;R\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0015\u0010'\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010r\u001a\u0004\bp\u0010q¨\u0006¢\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePayReq;", "Ljava/io/Serializable;", "aadharauth", "", "appl_no", "channgeOfAdressDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "comp_cd", "", "durcdto", "Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "fir_dt", "fir_no", "hpaDto", "Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "hptDto", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "idv", "ins_from", "ins_type", "ins_upto", "msg", "nocDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "off_cd", "op_dt", "police_station", "policy_no", "pur_cd", "rcp_dt", "rcpt_NO", "rcpt_amt", "", "reason", "regn_no", "state_cd", "state_header", "status", "tax_mode", "vh_class", "dupfitDto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;", "rcCanceldto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "rcSurrenderdto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;", "dupPermitDto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DataX;", "rcReleaseDto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;", "permitHomeAuthdto", "Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "aadhaartxno", "tempPermitdto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "miscellaneousDto", "Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MFPModel/MFPRequestModel;", "(Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;ILcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DataX;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MFPModel/MFPRequestModel;)V", "getAadhaartxno", "()Ljava/lang/String;", "getAadharauth", "getAppl_no", "getChanngeOfAdressDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "getComp_cd", "()I", "getDupPermitDto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DataX;", "getDupfitDto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;", "getDurcdto", "()Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "getFir_dt", "getFir_no", "getHpaDto", "()Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "getHptDto", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "getIdv", "getIns_from", "getIns_type", "getIns_upto", "getMiscellaneousDto", "()Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MFPModel/MFPRequestModel;", "getMsg", "getNocDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "getOff_cd", "getOp_dt", "getPermitHomeAuthdto", "()Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "getPolice_station", "getPolicy_no", "getPur_cd", "getRcCanceldto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "getRcReleaseDto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;", "getRcSurrenderdto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;", "getRcp_dt", "getRcpt_NO", "getRcpt_amt", "()D", "getReason", "getRegn_no", "getState_cd", "getState_header", "getStatus", "getTax_mode", "getTempPermitdto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "getVh_class", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;ILcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DataX;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MFPModel/MFPRequestModel;)Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePayReq;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BeforePayReq implements Serializable {
    private final String aadhaartxno;
    private final String aadharauth;
    private final String appl_no;
    private final ChaangeOfAddressStatus channgeOfAdressDto;
    private final int comp_cd;
    private final DataX dupPermitDto;
    private final DuplicateFitessDraft dupfitDto;
    private final dulicateRcResponseModle durcdto;
    private final String fir_dt;
    private final String fir_no;
    private final HPAResModle hpaDto;
    private final HptTerResponse hptDto;
    private final int idv;
    private final String ins_from;
    private final int ins_type;
    private final String ins_upto;
    private final MFPRequestModel miscellaneousDto;
    private final String msg;
    private final NocDraftResponse nocDto;
    private final String off_cd;
    private final String op_dt;
    private final Data permitHomeAuthdto;
    private final String police_station;
    private final String policy_no;
    private final String pur_cd;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data rcCanceldto;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data rcReleaseDto;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data rcSurrenderdto;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final double rcpt_amt;
    private final int reason;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data tempPermitdto;
    private final Integer vh_class;

    public BeforePayReq(String aadharauth, String appl_no, ChaangeOfAddressStatus chaangeOfAddressStatus, int i, dulicateRcResponseModle dulicatercresponsemodle, String fir_dt, String fir_no, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i2, String ins_from, int i3, String ins_upto, String msg, NocDraftResponse nocDraftResponse, String off_cd, String op_dt, String police_station, String policy_no, String pur_cd, String rcp_dt, String rcpt_NO, double d, int i4, String regn_no, String state_cd, String state_header, String status, String tax_mode, Integer num, DuplicateFitessDraft duplicateFitessDraft, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2, DataX dataX, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3, Data data4, String str, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5, MFPRequestModel mFPRequestModel) {
        Intrinsics.checkNotNullParameter(aadharauth, "aadharauth");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(rcp_dt, "rcp_dt");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        this.aadharauth = aadharauth;
        this.appl_no = appl_no;
        this.channgeOfAdressDto = chaangeOfAddressStatus;
        this.comp_cd = i;
        this.durcdto = dulicatercresponsemodle;
        this.fir_dt = fir_dt;
        this.fir_no = fir_no;
        this.hpaDto = hPAResModle;
        this.hptDto = hptTerResponse;
        this.idv = i2;
        this.ins_from = ins_from;
        this.ins_type = i3;
        this.ins_upto = ins_upto;
        this.msg = msg;
        this.nocDto = nocDraftResponse;
        this.off_cd = off_cd;
        this.op_dt = op_dt;
        this.police_station = police_station;
        this.policy_no = policy_no;
        this.pur_cd = pur_cd;
        this.rcp_dt = rcp_dt;
        this.rcpt_NO = rcpt_NO;
        this.rcpt_amt = d;
        this.reason = i4;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
        this.state_header = state_header;
        this.status = status;
        this.tax_mode = tax_mode;
        this.vh_class = num;
        this.dupfitDto = duplicateFitessDraft;
        this.rcCanceldto = data;
        this.rcSurrenderdto = data2;
        this.dupPermitDto = dataX;
        this.rcReleaseDto = data3;
        this.permitHomeAuthdto = data4;
        this.aadhaartxno = str;
        this.tempPermitdto = data5;
        this.miscellaneousDto = mFPRequestModel;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAadharauth() {
        return this.aadharauth;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIns_upto() {
        return this.ins_upto;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final NocDraftResponse getNocDto() {
        return this.nocDto;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPolice_station() {
        return this.police_station;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPolicy_no() {
        return this.policy_no;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final double getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChaangeOfAddressStatus getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final DuplicateFitessDraft getDupfitDto() {
        return this.dupfitDto;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data getRcCanceldto() {
        return this.rcCanceldto;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data getRcSurrenderdto() {
        return this.rcSurrenderdto;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final DataX getDupPermitDto() {
        return this.dupPermitDto;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data getRcReleaseDto() {
        return this.rcReleaseDto;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Data getPermitHomeAuthdto() {
        return this.permitHomeAuthdto;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data getTempPermitdto() {
        return this.tempPermitdto;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final MFPRequestModel getMiscellaneousDto() {
        return this.miscellaneousDto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getComp_cd() {
        return this.comp_cd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final dulicateRcResponseModle getDurcdto() {
        return this.durcdto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFir_dt() {
        return this.fir_dt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFir_no() {
        return this.fir_no;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HPAResModle getHpaDto() {
        return this.hpaDto;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final HptTerResponse getHptDto() {
        return this.hptDto;
    }

    public final BeforePayReq copy(String aadharauth, String appl_no, ChaangeOfAddressStatus channgeOfAdressDto, int comp_cd, dulicateRcResponseModle durcdto, String fir_dt, String fir_no, HPAResModle hpaDto, HptTerResponse hptDto, int idv, String ins_from, int ins_type, String ins_upto, String msg, NocDraftResponse nocDto, String off_cd, String op_dt, String police_station, String policy_no, String pur_cd, String rcp_dt, String rcpt_NO, double rcpt_amt, int reason, String regn_no, String state_cd, String state_header, String status, String tax_mode, Integer vh_class, DuplicateFitessDraft dupfitDto, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data rcCanceldto, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data rcSurrenderdto, DataX dupPermitDto, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data rcReleaseDto, Data permitHomeAuthdto, String aadhaartxno, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data tempPermitdto, MFPRequestModel miscellaneousDto) {
        Intrinsics.checkNotNullParameter(aadharauth, "aadharauth");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(rcp_dt, "rcp_dt");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        return new BeforePayReq(aadharauth, appl_no, channgeOfAdressDto, comp_cd, durcdto, fir_dt, fir_no, hpaDto, hptDto, idv, ins_from, ins_type, ins_upto, msg, nocDto, off_cd, op_dt, police_station, policy_no, pur_cd, rcp_dt, rcpt_NO, rcpt_amt, reason, regn_no, state_cd, state_header, status, tax_mode, vh_class, dupfitDto, rcCanceldto, rcSurrenderdto, dupPermitDto, rcReleaseDto, permitHomeAuthdto, aadhaartxno, tempPermitdto, miscellaneousDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeforePayReq)) {
            return false;
        }
        BeforePayReq beforePayReq = (BeforePayReq) other;
        return Intrinsics.areEqual(this.aadharauth, beforePayReq.aadharauth) && Intrinsics.areEqual(this.appl_no, beforePayReq.appl_no) && Intrinsics.areEqual(this.channgeOfAdressDto, beforePayReq.channgeOfAdressDto) && this.comp_cd == beforePayReq.comp_cd && Intrinsics.areEqual(this.durcdto, beforePayReq.durcdto) && Intrinsics.areEqual(this.fir_dt, beforePayReq.fir_dt) && Intrinsics.areEqual(this.fir_no, beforePayReq.fir_no) && Intrinsics.areEqual(this.hpaDto, beforePayReq.hpaDto) && Intrinsics.areEqual(this.hptDto, beforePayReq.hptDto) && this.idv == beforePayReq.idv && Intrinsics.areEqual(this.ins_from, beforePayReq.ins_from) && this.ins_type == beforePayReq.ins_type && Intrinsics.areEqual(this.ins_upto, beforePayReq.ins_upto) && Intrinsics.areEqual(this.msg, beforePayReq.msg) && Intrinsics.areEqual(this.nocDto, beforePayReq.nocDto) && Intrinsics.areEqual(this.off_cd, beforePayReq.off_cd) && Intrinsics.areEqual(this.op_dt, beforePayReq.op_dt) && Intrinsics.areEqual(this.police_station, beforePayReq.police_station) && Intrinsics.areEqual(this.policy_no, beforePayReq.policy_no) && Intrinsics.areEqual(this.pur_cd, beforePayReq.pur_cd) && Intrinsics.areEqual(this.rcp_dt, beforePayReq.rcp_dt) && Intrinsics.areEqual(this.rcpt_NO, beforePayReq.rcpt_NO) && Double.compare(this.rcpt_amt, beforePayReq.rcpt_amt) == 0 && this.reason == beforePayReq.reason && Intrinsics.areEqual(this.regn_no, beforePayReq.regn_no) && Intrinsics.areEqual(this.state_cd, beforePayReq.state_cd) && Intrinsics.areEqual(this.state_header, beforePayReq.state_header) && Intrinsics.areEqual(this.status, beforePayReq.status) && Intrinsics.areEqual(this.tax_mode, beforePayReq.tax_mode) && Intrinsics.areEqual(this.vh_class, beforePayReq.vh_class) && Intrinsics.areEqual(this.dupfitDto, beforePayReq.dupfitDto) && Intrinsics.areEqual(this.rcCanceldto, beforePayReq.rcCanceldto) && Intrinsics.areEqual(this.rcSurrenderdto, beforePayReq.rcSurrenderdto) && Intrinsics.areEqual(this.dupPermitDto, beforePayReq.dupPermitDto) && Intrinsics.areEqual(this.rcReleaseDto, beforePayReq.rcReleaseDto) && Intrinsics.areEqual(this.permitHomeAuthdto, beforePayReq.permitHomeAuthdto) && Intrinsics.areEqual(this.aadhaartxno, beforePayReq.aadhaartxno) && Intrinsics.areEqual(this.tempPermitdto, beforePayReq.tempPermitdto) && Intrinsics.areEqual(this.miscellaneousDto, beforePayReq.miscellaneousDto);
    }

    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    public final String getAadharauth() {
        return this.aadharauth;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final ChaangeOfAddressStatus getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final DataX getDupPermitDto() {
        return this.dupPermitDto;
    }

    public final DuplicateFitessDraft getDupfitDto() {
        return this.dupfitDto;
    }

    public final dulicateRcResponseModle getDurcdto() {
        return this.durcdto;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final HPAResModle getHpaDto() {
        return this.hpaDto;
    }

    public final HptTerResponse getHptDto() {
        return this.hptDto;
    }

    public final int getIdv() {
        return this.idv;
    }

    public final String getIns_from() {
        return this.ins_from;
    }

    public final int getIns_type() {
        return this.ins_type;
    }

    public final String getIns_upto() {
        return this.ins_upto;
    }

    public final MFPRequestModel getMiscellaneousDto() {
        return this.miscellaneousDto;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final NocDraftResponse getNocDto() {
        return this.nocDto;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final Data getPermitHomeAuthdto() {
        return this.permitHomeAuthdto;
    }

    public final String getPolice_station() {
        return this.police_station;
    }

    public final String getPolicy_no() {
        return this.policy_no;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data getRcCanceldto() {
        return this.rcCanceldto;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data getRcReleaseDto() {
        return this.rcReleaseDto;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data getRcSurrenderdto() {
        return this.rcSurrenderdto;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final double getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final int getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_header() {
        return this.state_header;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data getTempPermitdto() {
        return this.tempPermitdto;
    }

    public final Integer getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        int iHashCode = ((this.aadharauth.hashCode() * 31) + this.appl_no.hashCode()) * 31;
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.channgeOfAdressDto;
        int iHashCode2 = (((iHashCode + (chaangeOfAddressStatus == null ? 0 : chaangeOfAddressStatus.hashCode())) * 31) + Integer.hashCode(this.comp_cd)) * 31;
        dulicateRcResponseModle dulicatercresponsemodle = this.durcdto;
        int iHashCode3 = (((((iHashCode2 + (dulicatercresponsemodle == null ? 0 : dulicatercresponsemodle.hashCode())) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31;
        HPAResModle hPAResModle = this.hpaDto;
        int iHashCode4 = (iHashCode3 + (hPAResModle == null ? 0 : hPAResModle.hashCode())) * 31;
        HptTerResponse hptTerResponse = this.hptDto;
        int iHashCode5 = (((((((((((iHashCode4 + (hptTerResponse == null ? 0 : hptTerResponse.hashCode())) * 31) + Integer.hashCode(this.idv)) * 31) + this.ins_from.hashCode()) * 31) + Integer.hashCode(this.ins_type)) * 31) + this.ins_upto.hashCode()) * 31) + this.msg.hashCode()) * 31;
        NocDraftResponse nocDraftResponse = this.nocDto;
        int iHashCode6 = (((((((((((((((((((((((((((((iHashCode5 + (nocDraftResponse == null ? 0 : nocDraftResponse.hashCode())) * 31) + this.off_cd.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + this.pur_cd.hashCode()) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Double.hashCode(this.rcpt_amt)) * 31) + Integer.hashCode(this.reason)) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31;
        Integer num = this.vh_class;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        DuplicateFitessDraft duplicateFitessDraft = this.dupfitDto;
        int iHashCode8 = (iHashCode7 + (duplicateFitessDraft == null ? 0 : duplicateFitessDraft.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data = this.rcCanceldto;
        int iHashCode9 = (iHashCode8 + (data == null ? 0 : data.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2 = this.rcSurrenderdto;
        int iHashCode10 = (iHashCode9 + (data2 == null ? 0 : data2.hashCode())) * 31;
        DataX dataX = this.dupPermitDto;
        int iHashCode11 = (iHashCode10 + (dataX == null ? 0 : dataX.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3 = this.rcReleaseDto;
        int iHashCode12 = (iHashCode11 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.permitHomeAuthdto;
        int iHashCode13 = (iHashCode12 + (data4 == null ? 0 : data4.hashCode())) * 31;
        String str = this.aadhaartxno;
        int iHashCode14 = (iHashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5 = this.tempPermitdto;
        int iHashCode15 = (iHashCode14 + (data5 == null ? 0 : data5.hashCode())) * 31;
        MFPRequestModel mFPRequestModel = this.miscellaneousDto;
        return iHashCode15 + (mFPRequestModel != null ? mFPRequestModel.hashCode() : 0);
    }

    public String toString() {
        return "BeforePayReq(aadharauth=" + this.aadharauth + ", appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", durcdto=" + this.durcdto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", nocDto=" + this.nocDto + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ", dupfitDto=" + this.dupfitDto + ", rcCanceldto=" + this.rcCanceldto + ", rcSurrenderdto=" + this.rcSurrenderdto + ", dupPermitDto=" + this.dupPermitDto + ", rcReleaseDto=" + this.rcReleaseDto + ", permitHomeAuthdto=" + this.permitHomeAuthdto + ", aadhaartxno=" + this.aadhaartxno + ", tempPermitdto=" + this.tempPermitdto + ", miscellaneousDto=" + this.miscellaneousDto + ')';
    }

    public /* synthetic */ BeforePayReq(String str, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, int i, dulicateRcResponseModle dulicatercresponsemodle, String str3, String str4, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i2, String str5, int i3, String str6, String str7, NocDraftResponse nocDraftResponse, String str8, String str9, String str10, String str11, String str12, String str13, String str14, double d, int i4, String str15, String str16, String str17, String str18, String str19, Integer num, DuplicateFitessDraft duplicateFitessDraft, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2, DataX dataX, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3, Data data4, String str20, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5, MFPRequestModel mFPRequestModel, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, chaangeOfAddressStatus, i, dulicatercresponsemodle, str3, str4, hPAResModle, hptTerResponse, i2, str5, i3, str6, str7, nocDraftResponse, str8, str9, str10, str11, str12, str13, str14, d, i4, str15, str16, str17, str18, str19, num, duplicateFitessDraft, data, data2, dataX, data3, data4, str20, data5, (i6 & 64) != 0 ? null : mFPRequestModel);
    }
}
