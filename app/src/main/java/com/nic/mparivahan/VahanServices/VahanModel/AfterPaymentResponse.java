package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.NocDto;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\bp\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B©\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00104J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010~\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0002\u0010ZJ\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0088\u0004\u0010\u0093\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u0094\u0001J\u0016\u0010\u0095\u0001\u001a\u00020\u00052\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001HÖ\u0003J\u000b\u0010\u0098\u0001\u001a\u00030\u0099\u0001HÖ\u0001J\n\u0010\u009a\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u00106R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00106R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00106R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00106R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00106R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00106R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00106R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00106R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u00106R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00106R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00106R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00106R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u00106R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u00106R\u0015\u0010%\u001a\u0004\u0018\u00010&¢\u0006\n\n\u0002\u0010[\u001a\u0004\bY\u0010ZR\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u00106R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u00106R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u00106R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u00106R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u00106R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u00106R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u00106R\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u00106R\u0013\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u00106R\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u00106R\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u00106R\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u00106R\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u00106¨\u0006\u009b\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "Ljava/io/Serializable;", "action_cd", "", "facelesstransaction", "", "appl_no", "channgeOfAdressDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "chassis", "comp_cd", "duplicateRCDto", "Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "fir_dt", "fir_no", "flow_slno", "hpadto", "Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "hptdto", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "idv", "ins_from", "ins_type", "ins_upto", "messege", "nocDobj", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/NocDto;", "off_cd", "off_descr", "op_dt", "owner_name", "payment_mode", "police_station", "policy_no", "pur_cd", "rcp_dt", "rcpt_NO", "rcpt_amt", "", "rcpt_dt", "reason", "regn_date", "regn_no", "response_code", "serviceDto", "state_cd", "state_header", "status", "status_desc", "tax_mode", "treasury_REF_NO", "vh_class", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/NocDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction_cd", "()Ljava/lang/String;", "getAppl_no", "getChanngeOfAdressDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "getChassis", "getComp_cd", "getDuplicateRCDto", "()Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "getFacelesstransaction", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFir_dt", "getFir_no", "getFlow_slno", "getHpadto", "()Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "getHptdto", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "getIdv", "getIns_from", "getIns_type", "getIns_upto", "getMessege", "getNocDobj", "()Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/NocDto;", "getOff_cd", "getOff_descr", "getOp_dt", "getOwner_name", "getPayment_mode", "getPolice_station", "getPolicy_no", "getPur_cd", "getRcp_dt", "getRcpt_NO", "getRcpt_amt", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRcpt_dt", "getReason", "getRegn_date", "getRegn_no", "getResponse_code", "getServiceDto", "getState_cd", "getState_header", "getStatus", "getStatus_desc", "getTax_mode", "getTreasury_REF_NO", "getVh_class", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/NocDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AfterPaymentResponse implements Serializable {
    private final String action_cd;
    private final String appl_no;
    private final ChaangeOfAddressStatus channgeOfAdressDto;
    private final String chassis;
    private final String comp_cd;
    private final dulicateRcResponseModle duplicateRCDto;
    private final Boolean facelesstransaction;
    private final String fir_dt;
    private final String fir_no;
    private final String flow_slno;
    private final HPAResModle hpadto;
    private final HptTerResponse hptdto;
    private final String idv;
    private final String ins_from;
    private final String ins_type;
    private final String ins_upto;
    private final String messege;
    private final NocDto nocDobj;
    private final String off_cd;
    private final String off_descr;
    private final String op_dt;
    private final String owner_name;
    private final String payment_mode;
    private final String police_station;
    private final String policy_no;
    private final String pur_cd;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final Double rcpt_amt;
    private final String rcpt_dt;
    private final String reason;
    private final String regn_date;
    private final String regn_no;
    private final String response_code;
    private final String serviceDto;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String status_desc;
    private final String tax_mode;
    private final String treasury_REF_NO;
    private final String vh_class;

    public AfterPaymentResponse(String str, Boolean bool, String str2, ChaangeOfAddressStatus chaangeOfAddressStatus, String str3, String str4, dulicateRcResponseModle dulicatercresponsemodle, String str5, String str6, String str7, HPAResModle hPAResModle, HptTerResponse hptTerResponse, String str8, String str9, String str10, String str11, String str12, NocDto nocDto, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Double d, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.action_cd = str;
        this.facelesstransaction = bool;
        this.appl_no = str2;
        this.channgeOfAdressDto = chaangeOfAddressStatus;
        this.chassis = str3;
        this.comp_cd = str4;
        this.duplicateRCDto = dulicatercresponsemodle;
        this.fir_dt = str5;
        this.fir_no = str6;
        this.flow_slno = str7;
        this.hpadto = hPAResModle;
        this.hptdto = hptTerResponse;
        this.idv = str8;
        this.ins_from = str9;
        this.ins_type = str10;
        this.ins_upto = str11;
        this.messege = str12;
        this.nocDobj = nocDto;
        this.off_cd = str13;
        this.off_descr = str14;
        this.op_dt = str15;
        this.owner_name = str16;
        this.payment_mode = str17;
        this.police_station = str18;
        this.policy_no = str19;
        this.pur_cd = str20;
        this.rcp_dt = str21;
        this.rcpt_NO = str22;
        this.rcpt_amt = d;
        this.rcpt_dt = str23;
        this.reason = str24;
        this.regn_date = str25;
        this.regn_no = str26;
        this.response_code = str27;
        this.serviceDto = str28;
        this.state_cd = str29;
        this.state_header = str30;
        this.status = str31;
        this.status_desc = str32;
        this.tax_mode = str33;
        this.treasury_REF_NO = str34;
        this.vh_class = str35;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction_cd() {
        return this.action_cd;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFlow_slno() {
        return this.flow_slno;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final HPAResModle getHpadto() {
        return this.hpadto;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final HptTerResponse getHptdto() {
        return this.hptdto;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getIns_upto() {
        return this.ins_upto;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMessege() {
        return this.messege;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final NocDto getNocDobj() {
        return this.nocDobj;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getFacelesstransaction() {
        return this.facelesstransaction;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getOff_descr() {
        return this.off_descr;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getOwner_name() {
        return this.owner_name;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getPayment_mode() {
        return this.payment_mode;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getPolice_station() {
        return this.police_station;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPolicy_no() {
        return this.policy_no;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Double getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getRegn_date() {
        return this.regn_date;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getResponse_code() {
        return this.response_code;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getServiceDto() {
        return this.serviceDto;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChaangeOfAddressStatus getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getTreasury_REF_NO() {
        return this.treasury_REF_NO;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChassis() {
        return this.chassis;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getComp_cd() {
        return this.comp_cd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final dulicateRcResponseModle getDuplicateRCDto() {
        return this.duplicateRCDto;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFir_dt() {
        return this.fir_dt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFir_no() {
        return this.fir_no;
    }

    public final AfterPaymentResponse copy(String action_cd, Boolean facelesstransaction, String appl_no, ChaangeOfAddressStatus channgeOfAdressDto, String chassis, String comp_cd, dulicateRcResponseModle duplicateRCDto, String fir_dt, String fir_no, String flow_slno, HPAResModle hpadto, HptTerResponse hptdto, String idv, String ins_from, String ins_type, String ins_upto, String messege, NocDto nocDobj, String off_cd, String off_descr, String op_dt, String owner_name, String payment_mode, String police_station, String policy_no, String pur_cd, String rcp_dt, String rcpt_NO, Double rcpt_amt, String rcpt_dt, String reason, String regn_date, String regn_no, String response_code, String serviceDto, String state_cd, String state_header, String status, String status_desc, String tax_mode, String treasury_REF_NO, String vh_class) {
        return new AfterPaymentResponse(action_cd, facelesstransaction, appl_no, channgeOfAdressDto, chassis, comp_cd, duplicateRCDto, fir_dt, fir_no, flow_slno, hpadto, hptdto, idv, ins_from, ins_type, ins_upto, messege, nocDobj, off_cd, off_descr, op_dt, owner_name, payment_mode, police_station, policy_no, pur_cd, rcp_dt, rcpt_NO, rcpt_amt, rcpt_dt, reason, regn_date, regn_no, response_code, serviceDto, state_cd, state_header, status, status_desc, tax_mode, treasury_REF_NO, vh_class);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AfterPaymentResponse)) {
            return false;
        }
        AfterPaymentResponse afterPaymentResponse = (AfterPaymentResponse) other;
        return Intrinsics.areEqual(this.action_cd, afterPaymentResponse.action_cd) && Intrinsics.areEqual(this.facelesstransaction, afterPaymentResponse.facelesstransaction) && Intrinsics.areEqual(this.appl_no, afterPaymentResponse.appl_no) && Intrinsics.areEqual(this.channgeOfAdressDto, afterPaymentResponse.channgeOfAdressDto) && Intrinsics.areEqual(this.chassis, afterPaymentResponse.chassis) && Intrinsics.areEqual(this.comp_cd, afterPaymentResponse.comp_cd) && Intrinsics.areEqual(this.duplicateRCDto, afterPaymentResponse.duplicateRCDto) && Intrinsics.areEqual(this.fir_dt, afterPaymentResponse.fir_dt) && Intrinsics.areEqual(this.fir_no, afterPaymentResponse.fir_no) && Intrinsics.areEqual(this.flow_slno, afterPaymentResponse.flow_slno) && Intrinsics.areEqual(this.hpadto, afterPaymentResponse.hpadto) && Intrinsics.areEqual(this.hptdto, afterPaymentResponse.hptdto) && Intrinsics.areEqual(this.idv, afterPaymentResponse.idv) && Intrinsics.areEqual(this.ins_from, afterPaymentResponse.ins_from) && Intrinsics.areEqual(this.ins_type, afterPaymentResponse.ins_type) && Intrinsics.areEqual(this.ins_upto, afterPaymentResponse.ins_upto) && Intrinsics.areEqual(this.messege, afterPaymentResponse.messege) && Intrinsics.areEqual(this.nocDobj, afterPaymentResponse.nocDobj) && Intrinsics.areEqual(this.off_cd, afterPaymentResponse.off_cd) && Intrinsics.areEqual(this.off_descr, afterPaymentResponse.off_descr) && Intrinsics.areEqual(this.op_dt, afterPaymentResponse.op_dt) && Intrinsics.areEqual(this.owner_name, afterPaymentResponse.owner_name) && Intrinsics.areEqual(this.payment_mode, afterPaymentResponse.payment_mode) && Intrinsics.areEqual(this.police_station, afterPaymentResponse.police_station) && Intrinsics.areEqual(this.policy_no, afterPaymentResponse.policy_no) && Intrinsics.areEqual(this.pur_cd, afterPaymentResponse.pur_cd) && Intrinsics.areEqual(this.rcp_dt, afterPaymentResponse.rcp_dt) && Intrinsics.areEqual(this.rcpt_NO, afterPaymentResponse.rcpt_NO) && Intrinsics.areEqual((Object) this.rcpt_amt, (Object) afterPaymentResponse.rcpt_amt) && Intrinsics.areEqual(this.rcpt_dt, afterPaymentResponse.rcpt_dt) && Intrinsics.areEqual(this.reason, afterPaymentResponse.reason) && Intrinsics.areEqual(this.regn_date, afterPaymentResponse.regn_date) && Intrinsics.areEqual(this.regn_no, afterPaymentResponse.regn_no) && Intrinsics.areEqual(this.response_code, afterPaymentResponse.response_code) && Intrinsics.areEqual(this.serviceDto, afterPaymentResponse.serviceDto) && Intrinsics.areEqual(this.state_cd, afterPaymentResponse.state_cd) && Intrinsics.areEqual(this.state_header, afterPaymentResponse.state_header) && Intrinsics.areEqual(this.status, afterPaymentResponse.status) && Intrinsics.areEqual(this.status_desc, afterPaymentResponse.status_desc) && Intrinsics.areEqual(this.tax_mode, afterPaymentResponse.tax_mode) && Intrinsics.areEqual(this.treasury_REF_NO, afterPaymentResponse.treasury_REF_NO) && Intrinsics.areEqual(this.vh_class, afterPaymentResponse.vh_class);
    }

    public final String getAction_cd() {
        return this.action_cd;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final ChaangeOfAddressStatus getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final String getChassis() {
        return this.chassis;
    }

    public final String getComp_cd() {
        return this.comp_cd;
    }

    public final dulicateRcResponseModle getDuplicateRCDto() {
        return this.duplicateRCDto;
    }

    public final Boolean getFacelesstransaction() {
        return this.facelesstransaction;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final String getFlow_slno() {
        return this.flow_slno;
    }

    public final HPAResModle getHpadto() {
        return this.hpadto;
    }

    public final HptTerResponse getHptdto() {
        return this.hptdto;
    }

    public final String getIdv() {
        return this.idv;
    }

    public final String getIns_from() {
        return this.ins_from;
    }

    public final String getIns_type() {
        return this.ins_type;
    }

    public final String getIns_upto() {
        return this.ins_upto;
    }

    public final String getMessege() {
        return this.messege;
    }

    public final NocDto getNocDobj() {
        return this.nocDobj;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOff_descr() {
        return this.off_descr;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getPayment_mode() {
        return this.payment_mode;
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

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final Double getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegn_date() {
        return this.regn_date;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getResponse_code() {
        return this.response_code;
    }

    public final String getServiceDto() {
        return this.serviceDto;
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

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final String getTreasury_REF_NO() {
        return this.treasury_REF_NO;
    }

    public final String getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        String str = this.action_cd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.facelesstransaction;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.appl_no;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.channgeOfAdressDto;
        int iHashCode4 = (iHashCode3 + (chaangeOfAddressStatus == null ? 0 : chaangeOfAddressStatus.hashCode())) * 31;
        String str3 = this.chassis;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.comp_cd;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        dulicateRcResponseModle dulicatercresponsemodle = this.duplicateRCDto;
        int iHashCode7 = (iHashCode6 + (dulicatercresponsemodle == null ? 0 : dulicatercresponsemodle.hashCode())) * 31;
        String str5 = this.fir_dt;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fir_no;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.flow_slno;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        HPAResModle hPAResModle = this.hpadto;
        int iHashCode11 = (iHashCode10 + (hPAResModle == null ? 0 : hPAResModle.hashCode())) * 31;
        HptTerResponse hptTerResponse = this.hptdto;
        int iHashCode12 = (iHashCode11 + (hptTerResponse == null ? 0 : hptTerResponse.hashCode())) * 31;
        String str8 = this.idv;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.ins_from;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ins_type;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.ins_upto;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.messege;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        NocDto nocDto = this.nocDobj;
        int iHashCode18 = (iHashCode17 + (nocDto == null ? 0 : nocDto.hashCode())) * 31;
        String str13 = this.off_cd;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.off_descr;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.op_dt;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.owner_name;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.payment_mode;
        int iHashCode23 = (iHashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.police_station;
        int iHashCode24 = (iHashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.policy_no;
        int iHashCode25 = (iHashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.pur_cd;
        int iHashCode26 = (iHashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.rcp_dt;
        int iHashCode27 = (iHashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.rcpt_NO;
        int iHashCode28 = (iHashCode27 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Double d = this.rcpt_amt;
        int iHashCode29 = (iHashCode28 + (d == null ? 0 : d.hashCode())) * 31;
        String str23 = this.rcpt_dt;
        int iHashCode30 = (iHashCode29 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.reason;
        int iHashCode31 = (iHashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.regn_date;
        int iHashCode32 = (iHashCode31 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.regn_no;
        int iHashCode33 = (iHashCode32 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.response_code;
        int iHashCode34 = (iHashCode33 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.serviceDto;
        int iHashCode35 = (iHashCode34 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.state_cd;
        int iHashCode36 = (iHashCode35 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.state_header;
        int iHashCode37 = (iHashCode36 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.status;
        int iHashCode38 = (iHashCode37 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.status_desc;
        int iHashCode39 = (iHashCode38 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.tax_mode;
        int iHashCode40 = (iHashCode39 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.treasury_REF_NO;
        int iHashCode41 = (iHashCode40 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.vh_class;
        return iHashCode41 + (str35 != null ? str35.hashCode() : 0);
    }

    public String toString() {
        return "AfterPaymentResponse(action_cd=" + this.action_cd + ", facelesstransaction=" + this.facelesstransaction + ", appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", chassis=" + this.chassis + ", comp_cd=" + this.comp_cd + ", duplicateRCDto=" + this.duplicateRCDto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", flow_slno=" + this.flow_slno + ", hpadto=" + this.hpadto + ", hptdto=" + this.hptdto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", messege=" + this.messege + ", nocDobj=" + this.nocDobj + ", off_cd=" + this.off_cd + ", off_descr=" + this.off_descr + ", op_dt=" + this.op_dt + ", owner_name=" + this.owner_name + ", payment_mode=" + this.payment_mode + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", rcpt_dt=" + this.rcpt_dt + ", reason=" + this.reason + ", regn_date=" + this.regn_date + ", regn_no=" + this.regn_no + ", response_code=" + this.response_code + ", serviceDto=" + this.serviceDto + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", status_desc=" + this.status_desc + ", tax_mode=" + this.tax_mode + ", treasury_REF_NO=" + this.treasury_REF_NO + ", vh_class=" + this.vh_class + ')';
    }
}
