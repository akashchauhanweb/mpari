package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bc\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0006\u0010!\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\f0'j\b\u0012\u0004\u0012\u00020\f`(\u0012\u0006\u0010)\u001a\u00020\f\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010,\u001a\u00020\f\u0012\u0006\u0010-\u001a\u00020\f\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\f\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u000105\u0012\b\u00106\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u00107J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0007HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010s\u001a\u00020\fHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010u\u001a\u00020\fHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0007HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010 HÆ\u0003J\t\u0010{\u001a\u00020\u0007HÆ\u0003J\t\u0010|\u001a\u00020\fHÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0003HÆ\u0003J\u001a\u0010\u0080\u0001\u001a\u0012\u0012\u0004\u0012\u00020\f0'j\b\u0012\u0004\u0012\u00020\f`(HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\fHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\fHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\fHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\fHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010kJ\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\fHÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0012\u0010\u0094\u0001\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003JÜ\u0003\u0010\u0095\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\u0018\b\u0002\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\f0'j\b\u0012\u0004\u0012\u00020\f`(2\b\b\u0002\u0010)\u001a\u00020\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010,\u001a\u00020\f2\b\b\u0002\u0010-\u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0003\u0010\u0096\u0001J\u0016\u0010\u0097\u0001\u001a\u00020\u00072\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001HÖ\u0003J\n\u0010\u009a\u0001\u001a\u00020\fHÖ\u0001J\n\u0010\u009b\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00109R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u00109R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00109R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u0010=R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u0019\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bN\u0010BR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00109R\u0011\u0010\u001b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bP\u0010BR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00109R\u0011\u0010\u001d\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bR\u0010=R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u00109R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010!\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bV\u0010=R\u0011\u0010\"\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bW\u0010BR\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u00109R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u00109R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u00109R!\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\f0'j\b\u0012\u0004\u0012\u00020\f`(¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0011\u0010)\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b]\u0010BR\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u00109R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u00109R\u0011\u0010,\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b`\u0010BR\u0011\u0010-\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\ba\u0010BR\u0011\u0010.\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u00109R\u0011\u0010/\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bc\u0010BR\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u00109R\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u00109R\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u00109R\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u00109R\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0015\u00106\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010l\u001a\u0004\bj\u0010k¨\u0006\u009c\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "Ljava/io/Serializable;", "aadhaartxno", "", "aadharauth", "appl_no", "application_status", "", "channgeOfAdressDto", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;", "chasi_no", "comp_cd", "", "durcdto", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;", "feelist", "", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/Feelist;", "fir_dt", "fir_no", "fromScheduler", "hpaDto", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;", "hptDto", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "idv", "ins_from", "ins_type", "ins_upto", "isscheduler", "msg", "multiServiceDto", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceDto;", "nofees", "off_cd", "op_dt", "police_station", "policy_no", "purCodList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "pur_cd", "rcp_dt", "rcpt_NO", "rcpt_amt", "reason", "regn_no", "service_charge", "state_cd", "state_header", "status", "tax_mode", "transferOwnershipDto", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;", "vh_class", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;Ljava/lang/String;ILcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;ILjava/lang/String;ILjava/lang/String;ZLjava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceDto;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;Ljava/lang/Integer;)V", "getAadhaartxno", "()Ljava/lang/String;", "getAadharauth", "getAppl_no", "getApplication_status", "()Z", "getChanngeOfAdressDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;", "getChasi_no", "getComp_cd", "()I", "getDurcdto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;", "getFeelist", "()Ljava/util/List;", "getFir_dt", "getFir_no", "getFromScheduler", "getHpaDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;", "getHptDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "getIdv", "getIns_from", "getIns_type", "getIns_upto", "getIsscheduler", "getMsg", "getMultiServiceDto", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceDto;", "getNofees", "getOff_cd", "getOp_dt", "getPolice_station", "getPolicy_no", "getPurCodList", "()Ljava/util/ArrayList;", "getPur_cd", "getRcp_dt", "getRcpt_NO", "getRcpt_amt", "getReason", "getRegn_no", "getService_charge", "getState_cd", "getState_header", "getStatus", "getTax_mode", "getTransferOwnershipDto", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;", "getVh_class", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;Ljava/lang/String;ILcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/Durcdto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HpaDto;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;ILjava/lang/String;ILjava/lang/String;ZLjava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceDto;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/TransferOwnershipDto;Ljava/lang/Integer;)Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MultiServiceBeforePaymentRequest implements Serializable {
    private final String aadhaartxno;
    private final String aadharauth;
    private final String appl_no;
    private final boolean application_status;
    private final ChanngeOfAdressDto channgeOfAdressDto;
    private final String chasi_no;
    private final int comp_cd;
    private final Durcdto durcdto;
    private final List<Feelist> feelist;
    private final String fir_dt;
    private final String fir_no;
    private final boolean fromScheduler;
    private final HpaDto hpaDto;
    private final HptDto hptDto;
    private final int idv;
    private final String ins_from;
    private final int ins_type;
    private final String ins_upto;
    private final boolean isscheduler;
    private final String msg;
    private final MultiServiceDto multiServiceDto;
    private final boolean nofees;
    private final int off_cd;
    private final String op_dt;
    private final String police_station;
    private final String policy_no;
    private final ArrayList<Integer> purCodList;
    private final int pur_cd;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final int rcpt_amt;
    private final int reason;
    private final String regn_no;
    private final int service_charge;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final TransferOwnershipDto transferOwnershipDto;
    private final Integer vh_class;

    public MultiServiceBeforePaymentRequest(String aadhaartxno, String aadharauth, String appl_no, boolean z, ChanngeOfAdressDto channgeOfAdressDto, String chasi_no, int i, Durcdto durcdto, List<Feelist> list, String str, String str2, boolean z2, HpaDto hpaDto, HptDto hptDto, int i2, String str3, int i3, String str4, boolean z3, String str5, MultiServiceDto multiServiceDto, boolean z4, int i4, String op_dt, String police_station, String policy_no, ArrayList<Integer> purCodList, int i5, String str6, String str7, int i6, int i7, String regn_no, int i8, String str8, String str9, String str10, String str11, TransferOwnershipDto transferOwnershipDto, Integer num) {
        Intrinsics.checkNotNullParameter(aadhaartxno, "aadhaartxno");
        Intrinsics.checkNotNullParameter(aadharauth, "aadharauth");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(chasi_no, "chasi_no");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(purCodList, "purCodList");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        this.aadhaartxno = aadhaartxno;
        this.aadharauth = aadharauth;
        this.appl_no = appl_no;
        this.application_status = z;
        this.channgeOfAdressDto = channgeOfAdressDto;
        this.chasi_no = chasi_no;
        this.comp_cd = i;
        this.durcdto = durcdto;
        this.feelist = list;
        this.fir_dt = str;
        this.fir_no = str2;
        this.fromScheduler = z2;
        this.hpaDto = hpaDto;
        this.hptDto = hptDto;
        this.idv = i2;
        this.ins_from = str3;
        this.ins_type = i3;
        this.ins_upto = str4;
        this.isscheduler = z3;
        this.msg = str5;
        this.multiServiceDto = multiServiceDto;
        this.nofees = z4;
        this.off_cd = i4;
        this.op_dt = op_dt;
        this.police_station = police_station;
        this.policy_no = policy_no;
        this.purCodList = purCodList;
        this.pur_cd = i5;
        this.rcp_dt = str6;
        this.rcpt_NO = str7;
        this.rcpt_amt = i6;
        this.reason = i7;
        this.regn_no = regn_no;
        this.service_charge = i8;
        this.state_cd = str8;
        this.state_header = str9;
        this.status = str10;
        this.tax_mode = str11;
        this.transferOwnershipDto = transferOwnershipDto;
        this.vh_class = num;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFir_dt() {
        return this.fir_dt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFir_no() {
        return this.fir_no;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getFromScheduler() {
        return this.fromScheduler;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final HpaDto getHpaDto() {
        return this.hpaDto;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final HptDto getHptDto() {
        return this.hptDto;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getIns_upto() {
        return this.ins_upto;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getIsscheduler() {
        return this.isscheduler;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAadharauth() {
        return this.aadharauth;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final MultiServiceDto getMultiServiceDto() {
        return this.multiServiceDto;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getNofees() {
        return this.nofees;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPolice_station() {
        return this.police_station;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPolicy_no() {
        return this.policy_no;
    }

    public final ArrayList<Integer> component27() {
        return this.purCodList;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final int getService_charge() {
        return this.service_charge;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final TransferOwnershipDto getTransferOwnershipDto() {
        return this.transferOwnershipDto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getApplication_status() {
        return this.application_status;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Integer getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChasi_no() {
        return this.chasi_no;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getComp_cd() {
        return this.comp_cd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Durcdto getDurcdto() {
        return this.durcdto;
    }

    public final List<Feelist> component9() {
        return this.feelist;
    }

    public final MultiServiceBeforePaymentRequest copy(String aadhaartxno, String aadharauth, String appl_no, boolean application_status, ChanngeOfAdressDto channgeOfAdressDto, String chasi_no, int comp_cd, Durcdto durcdto, List<Feelist> feelist, String fir_dt, String fir_no, boolean fromScheduler, HpaDto hpaDto, HptDto hptDto, int idv, String ins_from, int ins_type, String ins_upto, boolean isscheduler, String msg, MultiServiceDto multiServiceDto, boolean nofees, int off_cd, String op_dt, String police_station, String policy_no, ArrayList<Integer> purCodList, int pur_cd, String rcp_dt, String rcpt_NO, int rcpt_amt, int reason, String regn_no, int service_charge, String state_cd, String state_header, String status, String tax_mode, TransferOwnershipDto transferOwnershipDto, Integer vh_class) {
        Intrinsics.checkNotNullParameter(aadhaartxno, "aadhaartxno");
        Intrinsics.checkNotNullParameter(aadharauth, "aadharauth");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(chasi_no, "chasi_no");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(purCodList, "purCodList");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        return new MultiServiceBeforePaymentRequest(aadhaartxno, aadharauth, appl_no, application_status, channgeOfAdressDto, chasi_no, comp_cd, durcdto, feelist, fir_dt, fir_no, fromScheduler, hpaDto, hptDto, idv, ins_from, ins_type, ins_upto, isscheduler, msg, multiServiceDto, nofees, off_cd, op_dt, police_station, policy_no, purCodList, pur_cd, rcp_dt, rcpt_NO, rcpt_amt, reason, regn_no, service_charge, state_cd, state_header, status, tax_mode, transferOwnershipDto, vh_class);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiServiceBeforePaymentRequest)) {
            return false;
        }
        MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest = (MultiServiceBeforePaymentRequest) other;
        return Intrinsics.areEqual(this.aadhaartxno, multiServiceBeforePaymentRequest.aadhaartxno) && Intrinsics.areEqual(this.aadharauth, multiServiceBeforePaymentRequest.aadharauth) && Intrinsics.areEqual(this.appl_no, multiServiceBeforePaymentRequest.appl_no) && this.application_status == multiServiceBeforePaymentRequest.application_status && Intrinsics.areEqual(this.channgeOfAdressDto, multiServiceBeforePaymentRequest.channgeOfAdressDto) && Intrinsics.areEqual(this.chasi_no, multiServiceBeforePaymentRequest.chasi_no) && this.comp_cd == multiServiceBeforePaymentRequest.comp_cd && Intrinsics.areEqual(this.durcdto, multiServiceBeforePaymentRequest.durcdto) && Intrinsics.areEqual(this.feelist, multiServiceBeforePaymentRequest.feelist) && Intrinsics.areEqual(this.fir_dt, multiServiceBeforePaymentRequest.fir_dt) && Intrinsics.areEqual(this.fir_no, multiServiceBeforePaymentRequest.fir_no) && this.fromScheduler == multiServiceBeforePaymentRequest.fromScheduler && Intrinsics.areEqual(this.hpaDto, multiServiceBeforePaymentRequest.hpaDto) && Intrinsics.areEqual(this.hptDto, multiServiceBeforePaymentRequest.hptDto) && this.idv == multiServiceBeforePaymentRequest.idv && Intrinsics.areEqual(this.ins_from, multiServiceBeforePaymentRequest.ins_from) && this.ins_type == multiServiceBeforePaymentRequest.ins_type && Intrinsics.areEqual(this.ins_upto, multiServiceBeforePaymentRequest.ins_upto) && this.isscheduler == multiServiceBeforePaymentRequest.isscheduler && Intrinsics.areEqual(this.msg, multiServiceBeforePaymentRequest.msg) && Intrinsics.areEqual(this.multiServiceDto, multiServiceBeforePaymentRequest.multiServiceDto) && this.nofees == multiServiceBeforePaymentRequest.nofees && this.off_cd == multiServiceBeforePaymentRequest.off_cd && Intrinsics.areEqual(this.op_dt, multiServiceBeforePaymentRequest.op_dt) && Intrinsics.areEqual(this.police_station, multiServiceBeforePaymentRequest.police_station) && Intrinsics.areEqual(this.policy_no, multiServiceBeforePaymentRequest.policy_no) && Intrinsics.areEqual(this.purCodList, multiServiceBeforePaymentRequest.purCodList) && this.pur_cd == multiServiceBeforePaymentRequest.pur_cd && Intrinsics.areEqual(this.rcp_dt, multiServiceBeforePaymentRequest.rcp_dt) && Intrinsics.areEqual(this.rcpt_NO, multiServiceBeforePaymentRequest.rcpt_NO) && this.rcpt_amt == multiServiceBeforePaymentRequest.rcpt_amt && this.reason == multiServiceBeforePaymentRequest.reason && Intrinsics.areEqual(this.regn_no, multiServiceBeforePaymentRequest.regn_no) && this.service_charge == multiServiceBeforePaymentRequest.service_charge && Intrinsics.areEqual(this.state_cd, multiServiceBeforePaymentRequest.state_cd) && Intrinsics.areEqual(this.state_header, multiServiceBeforePaymentRequest.state_header) && Intrinsics.areEqual(this.status, multiServiceBeforePaymentRequest.status) && Intrinsics.areEqual(this.tax_mode, multiServiceBeforePaymentRequest.tax_mode) && Intrinsics.areEqual(this.transferOwnershipDto, multiServiceBeforePaymentRequest.transferOwnershipDto) && Intrinsics.areEqual(this.vh_class, multiServiceBeforePaymentRequest.vh_class);
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

    public final boolean getApplication_status() {
        return this.application_status;
    }

    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final String getChasi_no() {
        return this.chasi_no;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final Durcdto getDurcdto() {
        return this.durcdto;
    }

    public final List<Feelist> getFeelist() {
        return this.feelist;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final boolean getFromScheduler() {
        return this.fromScheduler;
    }

    public final HpaDto getHpaDto() {
        return this.hpaDto;
    }

    public final HptDto getHptDto() {
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

    public final boolean getIsscheduler() {
        return this.isscheduler;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final MultiServiceDto getMultiServiceDto() {
        return this.multiServiceDto;
    }

    public final boolean getNofees() {
        return this.nofees;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getPolice_station() {
        return this.police_station;
    }

    public final String getPolicy_no() {
        return this.policy_no;
    }

    public final ArrayList<Integer> getPurCodList() {
        return this.purCodList;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final int getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final int getService_charge() {
        return this.service_charge;
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

    public final TransferOwnershipDto getTransferOwnershipDto() {
        return this.transferOwnershipDto;
    }

    public final Integer getVh_class() {
        return this.vh_class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v26, types: [int] */
    /* JADX WARN: Type inference failed for: r1v44, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.aadhaartxno.hashCode() * 31) + this.aadharauth.hashCode()) * 31) + this.appl_no.hashCode()) * 31;
        boolean z = this.application_status;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        ChanngeOfAdressDto channgeOfAdressDto = this.channgeOfAdressDto;
        int iHashCode2 = (((((i + (channgeOfAdressDto == null ? 0 : channgeOfAdressDto.hashCode())) * 31) + this.chasi_no.hashCode()) * 31) + Integer.hashCode(this.comp_cd)) * 31;
        Durcdto durcdto = this.durcdto;
        int iHashCode3 = (iHashCode2 + (durcdto == null ? 0 : durcdto.hashCode())) * 31;
        List<Feelist> list = this.feelist;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.fir_dt;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fir_no;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z2 = this.fromScheduler;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int i2 = (iHashCode6 + r12) * 31;
        HpaDto hpaDto = this.hpaDto;
        int iHashCode7 = (i2 + (hpaDto == null ? 0 : hpaDto.hashCode())) * 31;
        HptDto hptDto = this.hptDto;
        int iHashCode8 = (((iHashCode7 + (hptDto == null ? 0 : hptDto.hashCode())) * 31) + Integer.hashCode(this.idv)) * 31;
        String str3 = this.ins_from;
        int iHashCode9 = (((iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.ins_type)) * 31;
        String str4 = this.ins_upto;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z3 = this.isscheduler;
        ?? r13 = z3;
        if (z3) {
            r13 = 1;
        }
        int i3 = (iHashCode10 + r13) * 31;
        String str5 = this.msg;
        int iHashCode11 = (i3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MultiServiceDto multiServiceDto = this.multiServiceDto;
        int iHashCode12 = (iHashCode11 + (multiServiceDto == null ? 0 : multiServiceDto.hashCode())) * 31;
        boolean z4 = this.nofees;
        int iHashCode13 = (((((((((((((iHashCode12 + (z4 ? 1 : z4)) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + this.purCodList.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31;
        String str6 = this.rcp_dt;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rcpt_NO;
        int iHashCode15 = (((((((((iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + Integer.hashCode(this.reason)) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.service_charge)) * 31;
        String str8 = this.state_cd;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.state_header;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.status;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tax_mode;
        int iHashCode19 = (iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        TransferOwnershipDto transferOwnershipDto = this.transferOwnershipDto;
        int iHashCode20 = (iHashCode19 + (transferOwnershipDto == null ? 0 : transferOwnershipDto.hashCode())) * 31;
        Integer num = this.vh_class;
        return iHashCode20 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "MultiServiceBeforePaymentRequest(aadhaartxno=" + this.aadhaartxno + ", aadharauth=" + this.aadharauth + ", appl_no=" + this.appl_no + ", application_status=" + this.application_status + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", chasi_no=" + this.chasi_no + ", comp_cd=" + this.comp_cd + ", durcdto=" + this.durcdto + ", feelist=" + this.feelist + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", fromScheduler=" + this.fromScheduler + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", isscheduler=" + this.isscheduler + ", msg=" + this.msg + ", multiServiceDto=" + this.multiServiceDto + ", nofees=" + this.nofees + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", purCodList=" + this.purCodList + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", service_charge=" + this.service_charge + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", transferOwnershipDto=" + this.transferOwnershipDto + ", vh_class=" + this.vh_class + ')';
    }
}
