package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.Model.VTHypthEntity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bc\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010,\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010.\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u000102¢\u0006\u0002\u00103J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010.HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010.HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¬\u0004\u0010\u0093\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u000102HÆ\u0001¢\u0006\u0003\u0010\u0094\u0001J\u0016\u0010\u0095\u0001\u001a\u00030\u0096\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010.HÖ\u0003J\n\u0010\u0098\u0001\u001a\u00020*HÖ\u0001J\n\u0010\u0099\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010/\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00108R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00108R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u00108R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00108R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00108R\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00108R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u00108R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00108R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00108R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00108R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00108R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00108R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u00108R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00108R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00108R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00108R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00108R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00108R\u0015\u0010,\u001a\u0004\u0018\u00010*¢\u0006\n\n\u0002\u0010O\u001a\u0004\bM\u0010NR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00108R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00108R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00108R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u00108R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00108R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00108R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00108R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u00108R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u00108R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u00108R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u00108R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u00108R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u00108R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u00108R\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u00108R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u00108R\u0015\u0010+\u001a\u0004\u0018\u00010*¢\u0006\n\n\u0002\u0010O\u001a\u0004\b`\u0010NR\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u00108R\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u00108R\u0015\u0010)\u001a\u0004\u0018\u00010*¢\u0006\n\n\u0002\u0010O\u001a\u0004\be\u0010N¨\u0006\u009a\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Ljava/io/Serializable;", "rc_fit_upto", "", "rc_financer", "rc_insurance_upto", "rc_insurance_comp", "rc_insurance_policy_no", "rc_pucc_upto", "rc_pucc_no", "rc_np_upto", "rc_np_issued_by", "rc_np_no", "rc_permit_valid_upto", "rc_permit_valid_from", "rc_permit_type", "rc_permit_issue_dt", "rc_permit_no", "rc_tax_upto", "rc_norms_desc", "rc_fuel_desc", "rc_regn_dt", "rc_maker_model", "rc_maker_desc", "rc_vch_catg_desc", "rc_vh_class_desc", "rc_f_name", "rc_owner_name", "rc_c_state", "rc_chasi_no", "rc_eng_no", "rc_mobile_no", "rc_off_cd", "rc_owner_sr", "rc_permanent_address", "rc_present_address", "rc_regn_no", "state_cd", "rc_vch_catg", "rc_vh_class_cd", "vehType", "vehTypeAsInt", "", "seat_cap", "rc_owner_srNo", "pmt_type_code", "", "pmt_catg_code", "rc_insurance_from", "vTHypthEntity", "Lcom/nic/mparivahan/VahanServices/Model/VTHypthEntity;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/Model/VTHypthEntity;)V", "getPmt_catg_code", "()Ljava/lang/Object;", "getPmt_type_code", "getRc_c_state", "()Ljava/lang/String;", "getRc_chasi_no", "getRc_eng_no", "getRc_f_name", "getRc_financer", "getRc_fit_upto", "getRc_fuel_desc", "getRc_insurance_comp", "getRc_insurance_from", "getRc_insurance_policy_no", "getRc_insurance_upto", "getRc_maker_desc", "getRc_maker_model", "getRc_mobile_no", "getRc_norms_desc", "getRc_np_issued_by", "getRc_np_no", "getRc_np_upto", "getRc_off_cd", "getRc_owner_name", "getRc_owner_sr", "getRc_owner_srNo", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRc_permanent_address", "getRc_permit_issue_dt", "getRc_permit_no", "getRc_permit_type", "getRc_permit_valid_from", "getRc_permit_valid_upto", "getRc_present_address", "getRc_pucc_no", "getRc_pucc_upto", "getRc_regn_dt", "getRc_regn_no", "getRc_tax_upto", "getRc_vch_catg", "getRc_vch_catg_desc", "getRc_vh_class_cd", "getRc_vh_class_desc", "getSeat_cap", "getState_cd", "getVTHypthEntity", "()Lcom/nic/mparivahan/VahanServices/Model/VTHypthEntity;", "getVehType", "getVehTypeAsInt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/Model/VTHypthEntity;)Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NrvDetails implements Serializable {
    private final Object pmt_catg_code;
    private final Object pmt_type_code;
    private final String rc_c_state;
    private final String rc_chasi_no;
    private final String rc_eng_no;
    private final String rc_f_name;
    private final String rc_financer;
    private final String rc_fit_upto;
    private final String rc_fuel_desc;
    private final String rc_insurance_comp;
    private final String rc_insurance_from;
    private final String rc_insurance_policy_no;
    private final String rc_insurance_upto;
    private final String rc_maker_desc;
    private final String rc_maker_model;
    private final String rc_mobile_no;
    private final String rc_norms_desc;
    private final String rc_np_issued_by;
    private final String rc_np_no;
    private final String rc_np_upto;
    private final String rc_off_cd;
    private final String rc_owner_name;
    private final String rc_owner_sr;
    private final Integer rc_owner_srNo;
    private final String rc_permanent_address;
    private final String rc_permit_issue_dt;
    private final String rc_permit_no;
    private final String rc_permit_type;
    private final String rc_permit_valid_from;
    private final String rc_permit_valid_upto;
    private final String rc_present_address;
    private final String rc_pucc_no;
    private final String rc_pucc_upto;
    private final String rc_regn_dt;
    private final String rc_regn_no;
    private final String rc_tax_upto;
    private final String rc_vch_catg;
    private final String rc_vch_catg_desc;
    private final String rc_vh_class_cd;
    private final String rc_vh_class_desc;
    private final Integer seat_cap;
    private final String state_cd;
    private final VTHypthEntity vTHypthEntity;
    private final String vehType;
    private final Integer vehTypeAsInt;

    public NrvDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, Integer num, Integer num2, Integer num3, Object obj, Object obj2, String str39, VTHypthEntity vTHypthEntity) {
        this.rc_fit_upto = str;
        this.rc_financer = str2;
        this.rc_insurance_upto = str3;
        this.rc_insurance_comp = str4;
        this.rc_insurance_policy_no = str5;
        this.rc_pucc_upto = str6;
        this.rc_pucc_no = str7;
        this.rc_np_upto = str8;
        this.rc_np_issued_by = str9;
        this.rc_np_no = str10;
        this.rc_permit_valid_upto = str11;
        this.rc_permit_valid_from = str12;
        this.rc_permit_type = str13;
        this.rc_permit_issue_dt = str14;
        this.rc_permit_no = str15;
        this.rc_tax_upto = str16;
        this.rc_norms_desc = str17;
        this.rc_fuel_desc = str18;
        this.rc_regn_dt = str19;
        this.rc_maker_model = str20;
        this.rc_maker_desc = str21;
        this.rc_vch_catg_desc = str22;
        this.rc_vh_class_desc = str23;
        this.rc_f_name = str24;
        this.rc_owner_name = str25;
        this.rc_c_state = str26;
        this.rc_chasi_no = str27;
        this.rc_eng_no = str28;
        this.rc_mobile_no = str29;
        this.rc_off_cd = str30;
        this.rc_owner_sr = str31;
        this.rc_permanent_address = str32;
        this.rc_present_address = str33;
        this.rc_regn_no = str34;
        this.state_cd = str35;
        this.rc_vch_catg = str36;
        this.rc_vh_class_cd = str37;
        this.vehType = str38;
        this.vehTypeAsInt = num;
        this.seat_cap = num2;
        this.rc_owner_srNo = num3;
        this.pmt_type_code = obj;
        this.pmt_catg_code = obj2;
        this.rc_insurance_from = str39;
        this.vTHypthEntity = vTHypthEntity;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRc_fit_upto() {
        return this.rc_fit_upto;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRc_np_no() {
        return this.rc_np_no;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRc_permit_valid_upto() {
        return this.rc_permit_valid_upto;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRc_permit_valid_from() {
        return this.rc_permit_valid_from;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRc_permit_type() {
        return this.rc_permit_type;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRc_permit_issue_dt() {
        return this.rc_permit_issue_dt;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getRc_permit_no() {
        return this.rc_permit_no;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getRc_tax_upto() {
        return this.rc_tax_upto;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getRc_norms_desc() {
        return this.rc_norms_desc;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getRc_fuel_desc() {
        return this.rc_fuel_desc;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRc_regn_dt() {
        return this.rc_regn_dt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRc_financer() {
        return this.rc_financer;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRc_maker_model() {
        return this.rc_maker_model;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRc_maker_desc() {
        return this.rc_maker_desc;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRc_vch_catg_desc() {
        return this.rc_vch_catg_desc;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRc_vh_class_desc() {
        return this.rc_vh_class_desc;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getRc_f_name() {
        return this.rc_f_name;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getRc_owner_name() {
        return this.rc_owner_name;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getRc_c_state() {
        return this.rc_c_state;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getRc_chasi_no() {
        return this.rc_chasi_no;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getRc_eng_no() {
        return this.rc_eng_no;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getRc_mobile_no() {
        return this.rc_mobile_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRc_insurance_upto() {
        return this.rc_insurance_upto;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getRc_off_cd() {
        return this.rc_off_cd;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getRc_owner_sr() {
        return this.rc_owner_sr;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getRc_permanent_address() {
        return this.rc_permanent_address;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getRc_present_address() {
        return this.rc_present_address;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getRc_regn_no() {
        return this.rc_regn_no;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getRc_vch_catg() {
        return this.rc_vch_catg;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getRc_vh_class_cd() {
        return this.rc_vh_class_cd;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getVehType() {
        return this.vehType;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Integer getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRc_insurance_comp() {
        return this.rc_insurance_comp;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Integer getSeat_cap() {
        return this.seat_cap;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Integer getRc_owner_srNo() {
        return this.rc_owner_srNo;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Object getPmt_type_code() {
        return this.pmt_type_code;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Object getPmt_catg_code() {
        return this.pmt_catg_code;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getRc_insurance_from() {
        return this.rc_insurance_from;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final VTHypthEntity getVTHypthEntity() {
        return this.vTHypthEntity;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRc_insurance_policy_no() {
        return this.rc_insurance_policy_no;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRc_pucc_upto() {
        return this.rc_pucc_upto;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRc_pucc_no() {
        return this.rc_pucc_no;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRc_np_upto() {
        return this.rc_np_upto;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRc_np_issued_by() {
        return this.rc_np_issued_by;
    }

    public final NrvDetails copy(String rc_fit_upto, String rc_financer, String rc_insurance_upto, String rc_insurance_comp, String rc_insurance_policy_no, String rc_pucc_upto, String rc_pucc_no, String rc_np_upto, String rc_np_issued_by, String rc_np_no, String rc_permit_valid_upto, String rc_permit_valid_from, String rc_permit_type, String rc_permit_issue_dt, String rc_permit_no, String rc_tax_upto, String rc_norms_desc, String rc_fuel_desc, String rc_regn_dt, String rc_maker_model, String rc_maker_desc, String rc_vch_catg_desc, String rc_vh_class_desc, String rc_f_name, String rc_owner_name, String rc_c_state, String rc_chasi_no, String rc_eng_no, String rc_mobile_no, String rc_off_cd, String rc_owner_sr, String rc_permanent_address, String rc_present_address, String rc_regn_no, String state_cd, String rc_vch_catg, String rc_vh_class_cd, String vehType, Integer vehTypeAsInt, Integer seat_cap, Integer rc_owner_srNo, Object pmt_type_code, Object pmt_catg_code, String rc_insurance_from, VTHypthEntity vTHypthEntity) {
        return new NrvDetails(rc_fit_upto, rc_financer, rc_insurance_upto, rc_insurance_comp, rc_insurance_policy_no, rc_pucc_upto, rc_pucc_no, rc_np_upto, rc_np_issued_by, rc_np_no, rc_permit_valid_upto, rc_permit_valid_from, rc_permit_type, rc_permit_issue_dt, rc_permit_no, rc_tax_upto, rc_norms_desc, rc_fuel_desc, rc_regn_dt, rc_maker_model, rc_maker_desc, rc_vch_catg_desc, rc_vh_class_desc, rc_f_name, rc_owner_name, rc_c_state, rc_chasi_no, rc_eng_no, rc_mobile_no, rc_off_cd, rc_owner_sr, rc_permanent_address, rc_present_address, rc_regn_no, state_cd, rc_vch_catg, rc_vh_class_cd, vehType, vehTypeAsInt, seat_cap, rc_owner_srNo, pmt_type_code, pmt_catg_code, rc_insurance_from, vTHypthEntity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NrvDetails)) {
            return false;
        }
        NrvDetails nrvDetails = (NrvDetails) other;
        return Intrinsics.areEqual(this.rc_fit_upto, nrvDetails.rc_fit_upto) && Intrinsics.areEqual(this.rc_financer, nrvDetails.rc_financer) && Intrinsics.areEqual(this.rc_insurance_upto, nrvDetails.rc_insurance_upto) && Intrinsics.areEqual(this.rc_insurance_comp, nrvDetails.rc_insurance_comp) && Intrinsics.areEqual(this.rc_insurance_policy_no, nrvDetails.rc_insurance_policy_no) && Intrinsics.areEqual(this.rc_pucc_upto, nrvDetails.rc_pucc_upto) && Intrinsics.areEqual(this.rc_pucc_no, nrvDetails.rc_pucc_no) && Intrinsics.areEqual(this.rc_np_upto, nrvDetails.rc_np_upto) && Intrinsics.areEqual(this.rc_np_issued_by, nrvDetails.rc_np_issued_by) && Intrinsics.areEqual(this.rc_np_no, nrvDetails.rc_np_no) && Intrinsics.areEqual(this.rc_permit_valid_upto, nrvDetails.rc_permit_valid_upto) && Intrinsics.areEqual(this.rc_permit_valid_from, nrvDetails.rc_permit_valid_from) && Intrinsics.areEqual(this.rc_permit_type, nrvDetails.rc_permit_type) && Intrinsics.areEqual(this.rc_permit_issue_dt, nrvDetails.rc_permit_issue_dt) && Intrinsics.areEqual(this.rc_permit_no, nrvDetails.rc_permit_no) && Intrinsics.areEqual(this.rc_tax_upto, nrvDetails.rc_tax_upto) && Intrinsics.areEqual(this.rc_norms_desc, nrvDetails.rc_norms_desc) && Intrinsics.areEqual(this.rc_fuel_desc, nrvDetails.rc_fuel_desc) && Intrinsics.areEqual(this.rc_regn_dt, nrvDetails.rc_regn_dt) && Intrinsics.areEqual(this.rc_maker_model, nrvDetails.rc_maker_model) && Intrinsics.areEqual(this.rc_maker_desc, nrvDetails.rc_maker_desc) && Intrinsics.areEqual(this.rc_vch_catg_desc, nrvDetails.rc_vch_catg_desc) && Intrinsics.areEqual(this.rc_vh_class_desc, nrvDetails.rc_vh_class_desc) && Intrinsics.areEqual(this.rc_f_name, nrvDetails.rc_f_name) && Intrinsics.areEqual(this.rc_owner_name, nrvDetails.rc_owner_name) && Intrinsics.areEqual(this.rc_c_state, nrvDetails.rc_c_state) && Intrinsics.areEqual(this.rc_chasi_no, nrvDetails.rc_chasi_no) && Intrinsics.areEqual(this.rc_eng_no, nrvDetails.rc_eng_no) && Intrinsics.areEqual(this.rc_mobile_no, nrvDetails.rc_mobile_no) && Intrinsics.areEqual(this.rc_off_cd, nrvDetails.rc_off_cd) && Intrinsics.areEqual(this.rc_owner_sr, nrvDetails.rc_owner_sr) && Intrinsics.areEqual(this.rc_permanent_address, nrvDetails.rc_permanent_address) && Intrinsics.areEqual(this.rc_present_address, nrvDetails.rc_present_address) && Intrinsics.areEqual(this.rc_regn_no, nrvDetails.rc_regn_no) && Intrinsics.areEqual(this.state_cd, nrvDetails.state_cd) && Intrinsics.areEqual(this.rc_vch_catg, nrvDetails.rc_vch_catg) && Intrinsics.areEqual(this.rc_vh_class_cd, nrvDetails.rc_vh_class_cd) && Intrinsics.areEqual(this.vehType, nrvDetails.vehType) && Intrinsics.areEqual(this.vehTypeAsInt, nrvDetails.vehTypeAsInt) && Intrinsics.areEqual(this.seat_cap, nrvDetails.seat_cap) && Intrinsics.areEqual(this.rc_owner_srNo, nrvDetails.rc_owner_srNo) && Intrinsics.areEqual(this.pmt_type_code, nrvDetails.pmt_type_code) && Intrinsics.areEqual(this.pmt_catg_code, nrvDetails.pmt_catg_code) && Intrinsics.areEqual(this.rc_insurance_from, nrvDetails.rc_insurance_from) && Intrinsics.areEqual(this.vTHypthEntity, nrvDetails.vTHypthEntity);
    }

    public final Object getPmt_catg_code() {
        return this.pmt_catg_code;
    }

    public final Object getPmt_type_code() {
        return this.pmt_type_code;
    }

    public final String getRc_c_state() {
        return this.rc_c_state;
    }

    public final String getRc_chasi_no() {
        return this.rc_chasi_no;
    }

    public final String getRc_eng_no() {
        return this.rc_eng_no;
    }

    public final String getRc_f_name() {
        return this.rc_f_name;
    }

    public final String getRc_financer() {
        return this.rc_financer;
    }

    public final String getRc_fit_upto() {
        return this.rc_fit_upto;
    }

    public final String getRc_fuel_desc() {
        return this.rc_fuel_desc;
    }

    public final String getRc_insurance_comp() {
        return this.rc_insurance_comp;
    }

    public final String getRc_insurance_from() {
        return this.rc_insurance_from;
    }

    public final String getRc_insurance_policy_no() {
        return this.rc_insurance_policy_no;
    }

    public final String getRc_insurance_upto() {
        return this.rc_insurance_upto;
    }

    public final String getRc_maker_desc() {
        return this.rc_maker_desc;
    }

    public final String getRc_maker_model() {
        return this.rc_maker_model;
    }

    public final String getRc_mobile_no() {
        return this.rc_mobile_no;
    }

    public final String getRc_norms_desc() {
        return this.rc_norms_desc;
    }

    public final String getRc_np_issued_by() {
        return this.rc_np_issued_by;
    }

    public final String getRc_np_no() {
        return this.rc_np_no;
    }

    public final String getRc_np_upto() {
        return this.rc_np_upto;
    }

    public final String getRc_off_cd() {
        return this.rc_off_cd;
    }

    public final String getRc_owner_name() {
        return this.rc_owner_name;
    }

    public final String getRc_owner_sr() {
        return this.rc_owner_sr;
    }

    public final Integer getRc_owner_srNo() {
        return this.rc_owner_srNo;
    }

    public final String getRc_permanent_address() {
        return this.rc_permanent_address;
    }

    public final String getRc_permit_issue_dt() {
        return this.rc_permit_issue_dt;
    }

    public final String getRc_permit_no() {
        return this.rc_permit_no;
    }

    public final String getRc_permit_type() {
        return this.rc_permit_type;
    }

    public final String getRc_permit_valid_from() {
        return this.rc_permit_valid_from;
    }

    public final String getRc_permit_valid_upto() {
        return this.rc_permit_valid_upto;
    }

    public final String getRc_present_address() {
        return this.rc_present_address;
    }

    public final String getRc_pucc_no() {
        return this.rc_pucc_no;
    }

    public final String getRc_pucc_upto() {
        return this.rc_pucc_upto;
    }

    public final String getRc_regn_dt() {
        return this.rc_regn_dt;
    }

    public final String getRc_regn_no() {
        return this.rc_regn_no;
    }

    public final String getRc_tax_upto() {
        return this.rc_tax_upto;
    }

    public final String getRc_vch_catg() {
        return this.rc_vch_catg;
    }

    public final String getRc_vch_catg_desc() {
        return this.rc_vch_catg_desc;
    }

    public final String getRc_vh_class_cd() {
        return this.rc_vh_class_cd;
    }

    public final String getRc_vh_class_desc() {
        return this.rc_vh_class_desc;
    }

    public final Integer getSeat_cap() {
        return this.seat_cap;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final VTHypthEntity getVTHypthEntity() {
        return this.vTHypthEntity;
    }

    public final String getVehType() {
        return this.vehType;
    }

    public final Integer getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    public int hashCode() {
        String str = this.rc_fit_upto;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rc_financer;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rc_insurance_upto;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rc_insurance_comp;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rc_insurance_policy_no;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rc_pucc_upto;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rc_pucc_no;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rc_np_upto;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.rc_np_issued_by;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.rc_np_no;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rc_permit_valid_upto;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.rc_permit_valid_from;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.rc_permit_type;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.rc_permit_issue_dt;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.rc_permit_no;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.rc_tax_upto;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.rc_norms_desc;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.rc_fuel_desc;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.rc_regn_dt;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.rc_maker_model;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.rc_maker_desc;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.rc_vch_catg_desc;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.rc_vh_class_desc;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.rc_f_name;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.rc_owner_name;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.rc_c_state;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.rc_chasi_no;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.rc_eng_no;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.rc_mobile_no;
        int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.rc_off_cd;
        int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.rc_owner_sr;
        int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.rc_permanent_address;
        int iHashCode32 = (iHashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.rc_present_address;
        int iHashCode33 = (iHashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.rc_regn_no;
        int iHashCode34 = (iHashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.state_cd;
        int iHashCode35 = (iHashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.rc_vch_catg;
        int iHashCode36 = (iHashCode35 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.rc_vh_class_cd;
        int iHashCode37 = (iHashCode36 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.vehType;
        int iHashCode38 = (iHashCode37 + (str38 == null ? 0 : str38.hashCode())) * 31;
        Integer num = this.vehTypeAsInt;
        int iHashCode39 = (iHashCode38 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.seat_cap;
        int iHashCode40 = (iHashCode39 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rc_owner_srNo;
        int iHashCode41 = (iHashCode40 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Object obj = this.pmt_type_code;
        int iHashCode42 = (iHashCode41 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.pmt_catg_code;
        int iHashCode43 = (iHashCode42 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str39 = this.rc_insurance_from;
        int iHashCode44 = (iHashCode43 + (str39 == null ? 0 : str39.hashCode())) * 31;
        VTHypthEntity vTHypthEntity = this.vTHypthEntity;
        return iHashCode44 + (vTHypthEntity != null ? vTHypthEntity.hashCode() : 0);
    }

    public String toString() {
        return "NrvDetails(rc_fit_upto=" + this.rc_fit_upto + ", rc_financer=" + this.rc_financer + ", rc_insurance_upto=" + this.rc_insurance_upto + ", rc_insurance_comp=" + this.rc_insurance_comp + ", rc_insurance_policy_no=" + this.rc_insurance_policy_no + ", rc_pucc_upto=" + this.rc_pucc_upto + ", rc_pucc_no=" + this.rc_pucc_no + ", rc_np_upto=" + this.rc_np_upto + ", rc_np_issued_by=" + this.rc_np_issued_by + ", rc_np_no=" + this.rc_np_no + ", rc_permit_valid_upto=" + this.rc_permit_valid_upto + ", rc_permit_valid_from=" + this.rc_permit_valid_from + ", rc_permit_type=" + this.rc_permit_type + ", rc_permit_issue_dt=" + this.rc_permit_issue_dt + ", rc_permit_no=" + this.rc_permit_no + ", rc_tax_upto=" + this.rc_tax_upto + ", rc_norms_desc=" + this.rc_norms_desc + ", rc_fuel_desc=" + this.rc_fuel_desc + ", rc_regn_dt=" + this.rc_regn_dt + ", rc_maker_model=" + this.rc_maker_model + ", rc_maker_desc=" + this.rc_maker_desc + ", rc_vch_catg_desc=" + this.rc_vch_catg_desc + ", rc_vh_class_desc=" + this.rc_vh_class_desc + ", rc_f_name=" + this.rc_f_name + ", rc_owner_name=" + this.rc_owner_name + ", rc_c_state=" + this.rc_c_state + ", rc_chasi_no=" + this.rc_chasi_no + ", rc_eng_no=" + this.rc_eng_no + ", rc_mobile_no=" + this.rc_mobile_no + ", rc_off_cd=" + this.rc_off_cd + ", rc_owner_sr=" + this.rc_owner_sr + ", rc_permanent_address=" + this.rc_permanent_address + ", rc_present_address=" + this.rc_present_address + ", rc_regn_no=" + this.rc_regn_no + ", state_cd=" + this.state_cd + ", rc_vch_catg=" + this.rc_vch_catg + ", rc_vh_class_cd=" + this.rc_vh_class_cd + ", vehType=" + this.vehType + ", vehTypeAsInt=" + this.vehTypeAsInt + ", seat_cap=" + this.seat_cap + ", rc_owner_srNo=" + this.rc_owner_srNo + ", pmt_type_code=" + this.pmt_type_code + ", pmt_catg_code=" + this.pmt_catg_code + ", rc_insurance_from=" + this.rc_insurance_from + ", vTHypthEntity=" + this.vTHypthEntity + ')';
    }
}
