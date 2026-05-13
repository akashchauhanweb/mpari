package com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DataX;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bt\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010#\u001a\u00020\u000b\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010+\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\b\u00100\u001a\u0004\u0018\u000101\u0012\b\u00102\u001a\u0004\u0018\u000103\u0012\b\u00104\u001a\u0004\u0018\u000105\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u000108\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\u0010;\u001a\u0004\u0018\u00010<\u0012\u0006\u0010=\u001a\u00020\u0005\u0012\u0006\u0010>\u001a\u00020\u000b¢\u0006\u0002\u0010?J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010aJ\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010sJ\n\u0010\u0093\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u000103HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u000105HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\n\u0010©\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0003HÆ\u0003Jø\u0003\u0010\u00ad\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010=\u001a\u00020\u00052\b\b\u0002\u0010>\u001a\u00020\u000bHÆ\u0001¢\u0006\u0003\u0010®\u0001J\u0016\u0010¯\u0001\u001a\u00020\u00052\n\u0010°\u0001\u001a\u0005\u0018\u00010±\u0001HÖ\u0003J\n\u0010²\u0001\u001a\u00020\u000bHÖ\u0001J\n\u0010³\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u00106\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010AR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010AR\u0011\u0010=\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010AR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010*\u001a\u0004\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010AR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010AR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bW\u0010JR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010AR\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bY\u0010JR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010AR\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010AR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010b\u001a\u0004\b`\u0010aR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010AR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010AR\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010AR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010AR\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010AR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0013\u00102\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010AR\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010AR\u0015\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010t\u001a\u0004\br\u0010sR\u0011\u0010#\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bu\u0010JR\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010AR\u0013\u0010;\u001a\u0004\u0018\u00010<¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0011\u0010>\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\by\u0010JR\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010AR\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010AR\u0011\u0010'\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010AR\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010AR\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0014\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010A¨\u0006´\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/BeforePayForCompoundFee;", "Ljava/io/Serializable;", "chasi_no", "", "nofees", "", "aadharauth", "appl_no", "channgeOfAdressDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "comp_cd", "", "durcdto", "Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "fir_dt", "fir_no", "hpaDto", "Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "hptDto", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "idv", "ins_from", "ins_type", "ins_upto", "msg", "nocDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "off_cd", "op_dt", "police_station", "policy_no", "pur_cd", "rcp_dt", "rcpt_NO", "rcpt_amt", "reason", "regn_no", "state_cd", "state_header", "status", "tax_mode", "vh_class", "dupfitDto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;", "rcCanceldto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "rcSurrenderdto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;", "dupPermitDto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DataX;", "rcReleaseDto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;", "permitHomeAuthdto", "Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "aadhaartxno", "tempPermitdto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "miscellaneousDto", "Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/Data;", "renPermitdto", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;", "application_status", "service_charge", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;ILcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DataX;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/Data;Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;ZI)V", "getAadhaartxno", "()Ljava/lang/String;", "getAadharauth", "getAppl_no", "getApplication_status", "()Z", "getChanngeOfAdressDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "getChasi_no", "getComp_cd", "()I", "getDupPermitDto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DataX;", "getDupfitDto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;", "getDurcdto", "()Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "getFir_dt", "getFir_no", "getHpaDto", "()Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "getHptDto", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "getIdv", "getIns_from", "getIns_type", "getIns_upto", "getMiscellaneousDto", "()Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/Data;", "getMsg", "getNocDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "getNofees", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOff_cd", "getOp_dt", "getPermitHomeAuthdto", "()Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "getPolice_station", "getPolicy_no", "getPur_cd", "getRcCanceldto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "getRcReleaseDto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;", "getRcSurrenderdto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;", "getRcp_dt", "getRcpt_NO", "getRcpt_amt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReason", "getRegn_no", "getRenPermitdto", "()Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;", "getService_charge", "getState_cd", "getState_header", "getStatus", "getTax_mode", "getTempPermitdto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "getVh_class", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;ILcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DataX;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/Data;Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;ZI)Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/BeforePayForCompoundFee;", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BeforePayForCompoundFee implements Serializable {
    private final String aadhaartxno;
    private final String aadharauth;
    private final String appl_no;
    private final boolean application_status;
    private final ChaangeOfAddressStatus channgeOfAdressDto;
    private final String chasi_no;
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
    private final Data miscellaneousDto;
    private final String msg;
    private final NocDraftResponse nocDto;
    private final Boolean nofees;
    private final String off_cd;
    private final String op_dt;
    private final com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data permitHomeAuthdto;
    private final String police_station;
    private final String policy_no;
    private final String pur_cd;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data rcCanceldto;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data rcReleaseDto;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data rcSurrenderdto;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final Integer rcpt_amt;
    private final int reason;
    private final String regn_no;
    private final com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data renPermitdto;
    private final int service_charge;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data tempPermitdto;
    private final String vh_class;

    public BeforePayForCompoundFee(String str, Boolean bool, String aadharauth, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, int i, dulicateRcResponseModle dulicatercresponsemodle, String fir_dt, String fir_no, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i2, String str3, int i3, String str4, String msg, NocDraftResponse nocDraftResponse, String off_cd, String op_dt, String police_station, String policy_no, String pur_cd, String str5, String str6, Integer num, int i4, String regn_no, String state_cd, String state_header, String status, String tax_mode, String str7, DuplicateFitessDraft duplicateFitessDraft, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2, DataX dataX, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3, com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data data4, String str8, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5, Data data6, com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data data7, boolean z, int i5) {
        Intrinsics.checkNotNullParameter(aadharauth, "aadharauth");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        this.chasi_no = str;
        this.nofees = bool;
        this.aadharauth = aadharauth;
        this.appl_no = str2;
        this.channgeOfAdressDto = chaangeOfAddressStatus;
        this.comp_cd = i;
        this.durcdto = dulicatercresponsemodle;
        this.fir_dt = fir_dt;
        this.fir_no = fir_no;
        this.hpaDto = hPAResModle;
        this.hptDto = hptTerResponse;
        this.idv = i2;
        this.ins_from = str3;
        this.ins_type = i3;
        this.ins_upto = str4;
        this.msg = msg;
        this.nocDto = nocDraftResponse;
        this.off_cd = off_cd;
        this.op_dt = op_dt;
        this.police_station = police_station;
        this.policy_no = policy_no;
        this.pur_cd = pur_cd;
        this.rcp_dt = str5;
        this.rcpt_NO = str6;
        this.rcpt_amt = num;
        this.reason = i4;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
        this.state_header = state_header;
        this.status = status;
        this.tax_mode = tax_mode;
        this.vh_class = str7;
        this.dupfitDto = duplicateFitessDraft;
        this.rcCanceldto = data;
        this.rcSurrenderdto = data2;
        this.dupPermitDto = dataX;
        this.rcReleaseDto = data3;
        this.permitHomeAuthdto = data4;
        this.aadhaartxno = str8;
        this.tempPermitdto = data5;
        this.miscellaneousDto = data6;
        this.renPermitdto = data7;
        this.application_status = z;
        this.service_charge = i5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChasi_no() {
        return this.chasi_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final HPAResModle getHpaDto() {
        return this.hpaDto;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final HptTerResponse getHptDto() {
        return this.hptDto;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIns_upto() {
        return this.ins_upto;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final NocDraftResponse getNocDto() {
        return this.nocDto;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getNofees() {
        return this.nofees;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPolice_station() {
        return this.police_station;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getPolicy_no() {
        return this.policy_no;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAadharauth() {
        return this.aadharauth;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final DuplicateFitessDraft getDupfitDto() {
        return this.dupfitDto;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data getRcCanceldto() {
        return this.rcCanceldto;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data getRcSurrenderdto() {
        return this.rcSurrenderdto;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final DataX getDupPermitDto() {
        return this.dupPermitDto;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data getRcReleaseDto() {
        return this.rcReleaseDto;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data getPermitHomeAuthdto() {
        return this.permitHomeAuthdto;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data getTempPermitdto() {
        return this.tempPermitdto;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Data getMiscellaneousDto() {
        return this.miscellaneousDto;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data getRenPermitdto() {
        return this.renPermitdto;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final boolean getApplication_status() {
        return this.application_status;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final int getService_charge() {
        return this.service_charge;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChaangeOfAddressStatus getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getComp_cd() {
        return this.comp_cd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final dulicateRcResponseModle getDurcdto() {
        return this.durcdto;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFir_dt() {
        return this.fir_dt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFir_no() {
        return this.fir_no;
    }

    public final BeforePayForCompoundFee copy(String chasi_no, Boolean nofees, String aadharauth, String appl_no, ChaangeOfAddressStatus channgeOfAdressDto, int comp_cd, dulicateRcResponseModle durcdto, String fir_dt, String fir_no, HPAResModle hpaDto, HptTerResponse hptDto, int idv, String ins_from, int ins_type, String ins_upto, String msg, NocDraftResponse nocDto, String off_cd, String op_dt, String police_station, String policy_no, String pur_cd, String rcp_dt, String rcpt_NO, Integer rcpt_amt, int reason, String regn_no, String state_cd, String state_header, String status, String tax_mode, String vh_class, DuplicateFitessDraft dupfitDto, com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data rcCanceldto, com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data rcSurrenderdto, DataX dupPermitDto, com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data rcReleaseDto, com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data permitHomeAuthdto, String aadhaartxno, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data tempPermitdto, Data miscellaneousDto, com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data renPermitdto, boolean application_status, int service_charge) {
        Intrinsics.checkNotNullParameter(aadharauth, "aadharauth");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        return new BeforePayForCompoundFee(chasi_no, nofees, aadharauth, appl_no, channgeOfAdressDto, comp_cd, durcdto, fir_dt, fir_no, hpaDto, hptDto, idv, ins_from, ins_type, ins_upto, msg, nocDto, off_cd, op_dt, police_station, policy_no, pur_cd, rcp_dt, rcpt_NO, rcpt_amt, reason, regn_no, state_cd, state_header, status, tax_mode, vh_class, dupfitDto, rcCanceldto, rcSurrenderdto, dupPermitDto, rcReleaseDto, permitHomeAuthdto, aadhaartxno, tempPermitdto, miscellaneousDto, renPermitdto, application_status, service_charge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeforePayForCompoundFee)) {
            return false;
        }
        BeforePayForCompoundFee beforePayForCompoundFee = (BeforePayForCompoundFee) other;
        return Intrinsics.areEqual(this.chasi_no, beforePayForCompoundFee.chasi_no) && Intrinsics.areEqual(this.nofees, beforePayForCompoundFee.nofees) && Intrinsics.areEqual(this.aadharauth, beforePayForCompoundFee.aadharauth) && Intrinsics.areEqual(this.appl_no, beforePayForCompoundFee.appl_no) && Intrinsics.areEqual(this.channgeOfAdressDto, beforePayForCompoundFee.channgeOfAdressDto) && this.comp_cd == beforePayForCompoundFee.comp_cd && Intrinsics.areEqual(this.durcdto, beforePayForCompoundFee.durcdto) && Intrinsics.areEqual(this.fir_dt, beforePayForCompoundFee.fir_dt) && Intrinsics.areEqual(this.fir_no, beforePayForCompoundFee.fir_no) && Intrinsics.areEqual(this.hpaDto, beforePayForCompoundFee.hpaDto) && Intrinsics.areEqual(this.hptDto, beforePayForCompoundFee.hptDto) && this.idv == beforePayForCompoundFee.idv && Intrinsics.areEqual(this.ins_from, beforePayForCompoundFee.ins_from) && this.ins_type == beforePayForCompoundFee.ins_type && Intrinsics.areEqual(this.ins_upto, beforePayForCompoundFee.ins_upto) && Intrinsics.areEqual(this.msg, beforePayForCompoundFee.msg) && Intrinsics.areEqual(this.nocDto, beforePayForCompoundFee.nocDto) && Intrinsics.areEqual(this.off_cd, beforePayForCompoundFee.off_cd) && Intrinsics.areEqual(this.op_dt, beforePayForCompoundFee.op_dt) && Intrinsics.areEqual(this.police_station, beforePayForCompoundFee.police_station) && Intrinsics.areEqual(this.policy_no, beforePayForCompoundFee.policy_no) && Intrinsics.areEqual(this.pur_cd, beforePayForCompoundFee.pur_cd) && Intrinsics.areEqual(this.rcp_dt, beforePayForCompoundFee.rcp_dt) && Intrinsics.areEqual(this.rcpt_NO, beforePayForCompoundFee.rcpt_NO) && Intrinsics.areEqual(this.rcpt_amt, beforePayForCompoundFee.rcpt_amt) && this.reason == beforePayForCompoundFee.reason && Intrinsics.areEqual(this.regn_no, beforePayForCompoundFee.regn_no) && Intrinsics.areEqual(this.state_cd, beforePayForCompoundFee.state_cd) && Intrinsics.areEqual(this.state_header, beforePayForCompoundFee.state_header) && Intrinsics.areEqual(this.status, beforePayForCompoundFee.status) && Intrinsics.areEqual(this.tax_mode, beforePayForCompoundFee.tax_mode) && Intrinsics.areEqual(this.vh_class, beforePayForCompoundFee.vh_class) && Intrinsics.areEqual(this.dupfitDto, beforePayForCompoundFee.dupfitDto) && Intrinsics.areEqual(this.rcCanceldto, beforePayForCompoundFee.rcCanceldto) && Intrinsics.areEqual(this.rcSurrenderdto, beforePayForCompoundFee.rcSurrenderdto) && Intrinsics.areEqual(this.dupPermitDto, beforePayForCompoundFee.dupPermitDto) && Intrinsics.areEqual(this.rcReleaseDto, beforePayForCompoundFee.rcReleaseDto) && Intrinsics.areEqual(this.permitHomeAuthdto, beforePayForCompoundFee.permitHomeAuthdto) && Intrinsics.areEqual(this.aadhaartxno, beforePayForCompoundFee.aadhaartxno) && Intrinsics.areEqual(this.tempPermitdto, beforePayForCompoundFee.tempPermitdto) && Intrinsics.areEqual(this.miscellaneousDto, beforePayForCompoundFee.miscellaneousDto) && Intrinsics.areEqual(this.renPermitdto, beforePayForCompoundFee.renPermitdto) && this.application_status == beforePayForCompoundFee.application_status && this.service_charge == beforePayForCompoundFee.service_charge;
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

    public final ChaangeOfAddressStatus getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final String getChasi_no() {
        return this.chasi_no;
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

    public final Data getMiscellaneousDto() {
        return this.miscellaneousDto;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final NocDraftResponse getNocDto() {
        return this.nocDto;
    }

    public final Boolean getNofees() {
        return this.nofees;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data getPermitHomeAuthdto() {
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

    public final Integer getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final int getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data getRenPermitdto() {
        return this.renPermitdto;
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

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data getTempPermitdto() {
        return this.tempPermitdto;
    }

    public final String getVh_class() {
        return this.vh_class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        String str = this.chasi_no;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.nofees;
        int iHashCode2 = (((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.aadharauth.hashCode()) * 31;
        String str2 = this.appl_no;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.channgeOfAdressDto;
        int iHashCode4 = (((iHashCode3 + (chaangeOfAddressStatus == null ? 0 : chaangeOfAddressStatus.hashCode())) * 31) + Integer.hashCode(this.comp_cd)) * 31;
        dulicateRcResponseModle dulicatercresponsemodle = this.durcdto;
        int iHashCode5 = (((((iHashCode4 + (dulicatercresponsemodle == null ? 0 : dulicatercresponsemodle.hashCode())) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31;
        HPAResModle hPAResModle = this.hpaDto;
        int iHashCode6 = (iHashCode5 + (hPAResModle == null ? 0 : hPAResModle.hashCode())) * 31;
        HptTerResponse hptTerResponse = this.hptDto;
        int iHashCode7 = (((iHashCode6 + (hptTerResponse == null ? 0 : hptTerResponse.hashCode())) * 31) + Integer.hashCode(this.idv)) * 31;
        String str3 = this.ins_from;
        int iHashCode8 = (((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.ins_type)) * 31;
        String str4 = this.ins_upto;
        int iHashCode9 = (((iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.msg.hashCode()) * 31;
        NocDraftResponse nocDraftResponse = this.nocDto;
        int iHashCode10 = (((((((((((iHashCode9 + (nocDraftResponse == null ? 0 : nocDraftResponse.hashCode())) * 31) + this.off_cd.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + this.pur_cd.hashCode()) * 31;
        String str5 = this.rcp_dt;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rcpt_NO;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.rcpt_amt;
        int iHashCode13 = (((((((((((((iHashCode12 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.reason)) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31;
        String str7 = this.vh_class;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        DuplicateFitessDraft duplicateFitessDraft = this.dupfitDto;
        int iHashCode15 = (iHashCode14 + (duplicateFitessDraft == null ? 0 : duplicateFitessDraft.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data data = this.rcCanceldto;
        int iHashCode16 = (iHashCode15 + (data == null ? 0 : data.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2 = this.rcSurrenderdto;
        int iHashCode17 = (iHashCode16 + (data2 == null ? 0 : data2.hashCode())) * 31;
        DataX dataX = this.dupPermitDto;
        int iHashCode18 = (iHashCode17 + (dataX == null ? 0 : dataX.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data3 = this.rcReleaseDto;
        int iHashCode19 = (iHashCode18 + (data3 == null ? 0 : data3.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data data4 = this.permitHomeAuthdto;
        int iHashCode20 = (iHashCode19 + (data4 == null ? 0 : data4.hashCode())) * 31;
        String str8 = this.aadhaartxno;
        int iHashCode21 = (iHashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data5 = this.tempPermitdto;
        int iHashCode22 = (iHashCode21 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.miscellaneousDto;
        int iHashCode23 = (iHashCode22 + (data6 == null ? 0 : data6.hashCode())) * 31;
        com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data data7 = this.renPermitdto;
        int iHashCode24 = (iHashCode23 + (data7 != null ? data7.hashCode() : 0)) * 31;
        boolean z = this.application_status;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode24 + r1) * 31) + Integer.hashCode(this.service_charge);
    }

    public String toString() {
        return "BeforePayForCompoundFee(chasi_no=" + this.chasi_no + ", nofees=" + this.nofees + ", aadharauth=" + this.aadharauth + ", appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", durcdto=" + this.durcdto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", nocDto=" + this.nocDto + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ", dupfitDto=" + this.dupfitDto + ", rcCanceldto=" + this.rcCanceldto + ", rcSurrenderdto=" + this.rcSurrenderdto + ", dupPermitDto=" + this.dupPermitDto + ", rcReleaseDto=" + this.rcReleaseDto + ", permitHomeAuthdto=" + this.permitHomeAuthdto + ", aadhaartxno=" + this.aadhaartxno + ", tempPermitdto=" + this.tempPermitdto + ", miscellaneousDto=" + this.miscellaneousDto + ", renPermitdto=" + this.renPermitdto + ", application_status=" + this.application_status + ", service_charge=" + this.service_charge + ')';
    }
}
