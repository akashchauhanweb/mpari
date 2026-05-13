package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0010\b\n\u0002\bz\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\u0006\u0010*\u001a\u00020\u0006\u0012\u0006\u0010+\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020\u0006\u0012\u0006\u0010-\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\u0006\u0010/\u001a\u00020\u0006\u0012\u0006\u00100\u001a\u00020\u0006\u0012\u0006\u00101\u001a\u00020\u0006\u0012\u0006\u00102\u001a\u00020\u0006\u0012\u0006\u00103\u001a\u00020\u0006\u0012\u0006\u00104\u001a\u00020\u0006\u0012\u0006\u00105\u001a\u000206\u0012\u0006\u00107\u001a\u00020\u0006\u0012\u0006\u00108\u001a\u00020\u0006\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003¢\u0006\u0002\u0010;J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0006HÆ\u0003J\t\u0010w\u001a\u00020\u0006HÆ\u0003J\t\u0010x\u001a\u00020\u0006HÆ\u0003J\t\u0010y\u001a\u00020\u0006HÆ\u0003J\t\u0010z\u001a\u00020\u0006HÆ\u0003J\t\u0010{\u001a\u00020\u0006HÆ\u0003J\t\u0010|\u001a\u00020\u0006HÆ\u0003J\t\u0010}\u001a\u00020\u0006HÆ\u0003J\t\u0010~\u001a\u00020\u0006HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¢\u0001\u001a\u000206HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0006HÆ\u0003J¦\u0004\u0010«\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020\u00062\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\u00062\b\b\u0002\u00104\u001a\u00020\u00062\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u0003HÆ\u0001J\u0015\u0010¬\u0001\u001a\u00020\u00062\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010®\u0001\u001a\u000206HÖ\u0001J\n\u0010¯\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010>R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u0010@R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bD\u0010@R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bE\u0010@R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u0010@R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bG\u0010@R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bH\u0010@R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bI\u0010@R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010@R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u0010@R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bL\u0010@R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bM\u0010@R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u0010@R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bO\u0010@R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bP\u0010@R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010@R\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bR\u0010@R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bS\u0010@R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bT\u0010@R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bU\u0010@R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bV\u0010@R\u0011\u0010\u001d\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bW\u0010@R\u0011\u0010\u001e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bX\u0010>R\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bY\u0010@R\u0011\u0010 \u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010@R\u0011\u0010!\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b[\u0010@R\u0011\u0010\"\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010@R\u0011\u0010#\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b]\u0010@R\u0011\u0010$\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b^\u0010@R\u0011\u0010%\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b_\u0010@R\u0011\u0010&\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b`\u0010@R\u0011\u0010'\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\ba\u0010@R\u0011\u0010(\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bb\u0010@R\u0011\u0010)\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bc\u0010@R\u0011\u0010*\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bd\u0010@R\u0011\u0010+\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\be\u0010@R\u0011\u0010,\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bf\u0010@R\u0011\u0010-\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bg\u0010@R\u0011\u0010.\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bh\u0010@R\u0011\u0010/\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bi\u0010@R\u0011\u00100\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bj\u0010@R\u0011\u00101\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bk\u0010@R\u0011\u00102\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bl\u0010@R\u0011\u00103\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bm\u0010@R\u0011\u00104\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bn\u0010@R\u0011\u00105\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0011\u00107\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bq\u0010@R\u0011\u00108\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\br\u0010@R\u0011\u00109\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010=R\u0011\u0010:\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010=¨\u0006°\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/EgblityStatus;", "", "cert_permit_prt", "", "is_tax_clear_cert", "isapptallowed", "", "isbalancefee", "isca", "iscart", "iscert_permit_prt", "isdispose", "isdoc", "isdupfit", "isduprc", "isenvtax", "isepermit", "isfit", "isform36", "isform38", "ishpa", "ishpc", "ishpt", "ismisc", "ismobilereg", "isnewportal", "isnoc", "isnoccancel", "isnonusecontinuation", "isnonuseintimation", "isnonuseshifting", "isnonusewithdrawal", "ispermaregn", "isprintfit", "isprintrcparticulars", "isrccancel", "isrcparticular", "isrcredsipatch", "isrcrelease", "isrcsurr", "isrenreg", "isselfbacklog", "istax", "istaxinstallment", "istaxrecovery", "istempreg", "isto", "isvehadv", "isvehalt", "isvehconv", "isvehdetails", "isvehreasgn", "isviewstatetax", "off_cd", "", "payment_compounding_fee", "smartcard_rc", "state_cd", "state_tax_url", "(Ljava/lang/String;Ljava/lang/Object;ZZZZZZZZZZZZZZZZZZZZZZZZLjava/lang/Object;ZZZZZZZZZZZZZZZZZZZZZZIZZLjava/lang/String;Ljava/lang/String;)V", "getCert_permit_prt", "()Ljava/lang/String;", "()Ljava/lang/Object;", "getIsapptallowed", "()Z", "getIsbalancefee", "getIsca", "getIscart", "getIscert_permit_prt", "getIsdispose", "getIsdoc", "getIsdupfit", "getIsduprc", "getIsenvtax", "getIsepermit", "getIsfit", "getIsform36", "getIsform38", "getIshpa", "getIshpc", "getIshpt", "getIsmisc", "getIsmobilereg", "getIsnewportal", "getIsnoc", "getIsnoccancel", "getIsnonusecontinuation", "getIsnonuseintimation", "getIsnonuseshifting", "getIsnonusewithdrawal", "getIspermaregn", "getIsprintfit", "getIsprintrcparticulars", "getIsrccancel", "getIsrcparticular", "getIsrcredsipatch", "getIsrcrelease", "getIsrcsurr", "getIsrenreg", "getIsselfbacklog", "getIstax", "getIstaxinstallment", "getIstaxrecovery", "getIstempreg", "getIsto", "getIsvehadv", "getIsvehalt", "getIsvehconv", "getIsvehdetails", "getIsvehreasgn", "getIsviewstatetax", "getOff_cd", "()I", "getPayment_compounding_fee", "getSmartcard_rc", "getState_cd", "getState_tax_url", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EgblityStatus {
    private final String cert_permit_prt;
    private final Object is_tax_clear_cert;
    private final boolean isapptallowed;
    private final boolean isbalancefee;
    private final boolean isca;
    private final boolean iscart;
    private final boolean iscert_permit_prt;
    private final boolean isdispose;
    private final boolean isdoc;
    private final boolean isdupfit;
    private final boolean isduprc;
    private final boolean isenvtax;
    private final boolean isepermit;
    private final boolean isfit;
    private final boolean isform36;
    private final boolean isform38;
    private final boolean ishpa;
    private final boolean ishpc;
    private final boolean ishpt;
    private final boolean ismisc;
    private final boolean ismobilereg;
    private final boolean isnewportal;
    private final boolean isnoc;
    private final boolean isnoccancel;
    private final boolean isnonusecontinuation;
    private final boolean isnonuseintimation;
    private final Object isnonuseshifting;
    private final boolean isnonusewithdrawal;
    private final boolean ispermaregn;
    private final boolean isprintfit;
    private final boolean isprintrcparticulars;
    private final boolean isrccancel;
    private final boolean isrcparticular;
    private final boolean isrcredsipatch;
    private final boolean isrcrelease;
    private final boolean isrcsurr;
    private final boolean isrenreg;
    private final boolean isselfbacklog;
    private final boolean istax;
    private final boolean istaxinstallment;
    private final boolean istaxrecovery;
    private final boolean istempreg;
    private final boolean isto;
    private final boolean isvehadv;
    private final boolean isvehalt;
    private final boolean isvehconv;
    private final boolean isvehdetails;
    private final boolean isvehreasgn;
    private final boolean isviewstatetax;
    private final int off_cd;
    private final boolean payment_compounding_fee;
    private final boolean smartcard_rc;
    private final String state_cd;
    private final String state_tax_url;

    public EgblityStatus(String cert_permit_prt, Object is_tax_clear_cert, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, Object isnonuseshifting, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, int i, boolean z47, boolean z48, String state_cd, String state_tax_url) {
        Intrinsics.checkNotNullParameter(cert_permit_prt, "cert_permit_prt");
        Intrinsics.checkNotNullParameter(is_tax_clear_cert, "is_tax_clear_cert");
        Intrinsics.checkNotNullParameter(isnonuseshifting, "isnonuseshifting");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_tax_url, "state_tax_url");
        this.cert_permit_prt = cert_permit_prt;
        this.is_tax_clear_cert = is_tax_clear_cert;
        this.isapptallowed = z;
        this.isbalancefee = z2;
        this.isca = z3;
        this.iscart = z4;
        this.iscert_permit_prt = z5;
        this.isdispose = z6;
        this.isdoc = z7;
        this.isdupfit = z8;
        this.isduprc = z9;
        this.isenvtax = z10;
        this.isepermit = z11;
        this.isfit = z12;
        this.isform36 = z13;
        this.isform38 = z14;
        this.ishpa = z15;
        this.ishpc = z16;
        this.ishpt = z17;
        this.ismisc = z18;
        this.ismobilereg = z19;
        this.isnewportal = z20;
        this.isnoc = z21;
        this.isnoccancel = z22;
        this.isnonusecontinuation = z23;
        this.isnonuseintimation = z24;
        this.isnonuseshifting = isnonuseshifting;
        this.isnonusewithdrawal = z25;
        this.ispermaregn = z26;
        this.isprintfit = z27;
        this.isprintrcparticulars = z28;
        this.isrccancel = z29;
        this.isrcparticular = z30;
        this.isrcredsipatch = z31;
        this.isrcrelease = z32;
        this.isrcsurr = z33;
        this.isrenreg = z34;
        this.isselfbacklog = z35;
        this.istax = z36;
        this.istaxinstallment = z37;
        this.istaxrecovery = z38;
        this.istempreg = z39;
        this.isto = z40;
        this.isvehadv = z41;
        this.isvehalt = z42;
        this.isvehconv = z43;
        this.isvehdetails = z44;
        this.isvehreasgn = z45;
        this.isviewstatetax = z46;
        this.off_cd = i;
        this.payment_compounding_fee = z47;
        this.smartcard_rc = z48;
        this.state_cd = state_cd;
        this.state_tax_url = state_tax_url;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCert_permit_prt() {
        return this.cert_permit_prt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsdupfit() {
        return this.isdupfit;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsduprc() {
        return this.isduprc;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsenvtax() {
        return this.isenvtax;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsepermit() {
        return this.isepermit;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsfit() {
        return this.isfit;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsform36() {
        return this.isform36;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsform38() {
        return this.isform38;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIshpa() {
        return this.ishpa;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIshpc() {
        return this.ishpc;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getIshpt() {
        return this.ishpt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getIs_tax_clear_cert() {
        return this.is_tax_clear_cert;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsmisc() {
        return this.ismisc;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getIsmobilereg() {
        return this.ismobilereg;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getIsnewportal() {
        return this.isnewportal;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getIsnoc() {
        return this.isnoc;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getIsnoccancel() {
        return this.isnoccancel;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getIsnonusecontinuation() {
        return this.isnonusecontinuation;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getIsnonuseintimation() {
        return this.isnonuseintimation;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Object getIsnonuseshifting() {
        return this.isnonuseshifting;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getIsnonusewithdrawal() {
        return this.isnonusewithdrawal;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getIspermaregn() {
        return this.ispermaregn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsapptallowed() {
        return this.isapptallowed;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getIsprintfit() {
        return this.isprintfit;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final boolean getIsprintrcparticulars() {
        return this.isprintrcparticulars;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final boolean getIsrccancel() {
        return this.isrccancel;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getIsrcparticular() {
        return this.isrcparticular;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getIsrcredsipatch() {
        return this.isrcredsipatch;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final boolean getIsrcrelease() {
        return this.isrcrelease;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final boolean getIsrcsurr() {
        return this.isrcsurr;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final boolean getIsrenreg() {
        return this.isrenreg;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final boolean getIsselfbacklog() {
        return this.isselfbacklog;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final boolean getIstax() {
        return this.istax;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsbalancefee() {
        return this.isbalancefee;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final boolean getIstaxinstallment() {
        return this.istaxinstallment;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final boolean getIstaxrecovery() {
        return this.istaxrecovery;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final boolean getIstempreg() {
        return this.istempreg;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final boolean getIsto() {
        return this.isto;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final boolean getIsvehadv() {
        return this.isvehadv;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final boolean getIsvehalt() {
        return this.isvehalt;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final boolean getIsvehconv() {
        return this.isvehconv;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final boolean getIsvehdetails() {
        return this.isvehdetails;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final boolean getIsvehreasgn() {
        return this.isvehreasgn;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final boolean getIsviewstatetax() {
        return this.isviewstatetax;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsca() {
        return this.isca;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final boolean getPayment_compounding_fee() {
        return this.payment_compounding_fee;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final boolean getSmartcard_rc() {
        return this.smartcard_rc;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getState_tax_url() {
        return this.state_tax_url;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIscart() {
        return this.iscart;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIscert_permit_prt() {
        return this.iscert_permit_prt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsdispose() {
        return this.isdispose;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsdoc() {
        return this.isdoc;
    }

    public final EgblityStatus copy(String cert_permit_prt, Object is_tax_clear_cert, boolean isapptallowed, boolean isbalancefee, boolean isca, boolean iscart, boolean iscert_permit_prt, boolean isdispose, boolean isdoc, boolean isdupfit, boolean isduprc, boolean isenvtax, boolean isepermit, boolean isfit, boolean isform36, boolean isform38, boolean ishpa, boolean ishpc, boolean ishpt, boolean ismisc, boolean ismobilereg, boolean isnewportal, boolean isnoc, boolean isnoccancel, boolean isnonusecontinuation, boolean isnonuseintimation, Object isnonuseshifting, boolean isnonusewithdrawal, boolean ispermaregn, boolean isprintfit, boolean isprintrcparticulars, boolean isrccancel, boolean isrcparticular, boolean isrcredsipatch, boolean isrcrelease, boolean isrcsurr, boolean isrenreg, boolean isselfbacklog, boolean istax, boolean istaxinstallment, boolean istaxrecovery, boolean istempreg, boolean isto, boolean isvehadv, boolean isvehalt, boolean isvehconv, boolean isvehdetails, boolean isvehreasgn, boolean isviewstatetax, int off_cd, boolean payment_compounding_fee, boolean smartcard_rc, String state_cd, String state_tax_url) {
        Intrinsics.checkNotNullParameter(cert_permit_prt, "cert_permit_prt");
        Intrinsics.checkNotNullParameter(is_tax_clear_cert, "is_tax_clear_cert");
        Intrinsics.checkNotNullParameter(isnonuseshifting, "isnonuseshifting");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_tax_url, "state_tax_url");
        return new EgblityStatus(cert_permit_prt, is_tax_clear_cert, isapptallowed, isbalancefee, isca, iscart, iscert_permit_prt, isdispose, isdoc, isdupfit, isduprc, isenvtax, isepermit, isfit, isform36, isform38, ishpa, ishpc, ishpt, ismisc, ismobilereg, isnewportal, isnoc, isnoccancel, isnonusecontinuation, isnonuseintimation, isnonuseshifting, isnonusewithdrawal, ispermaregn, isprintfit, isprintrcparticulars, isrccancel, isrcparticular, isrcredsipatch, isrcrelease, isrcsurr, isrenreg, isselfbacklog, istax, istaxinstallment, istaxrecovery, istempreg, isto, isvehadv, isvehalt, isvehconv, isvehdetails, isvehreasgn, isviewstatetax, off_cd, payment_compounding_fee, smartcard_rc, state_cd, state_tax_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EgblityStatus)) {
            return false;
        }
        EgblityStatus egblityStatus = (EgblityStatus) other;
        return Intrinsics.areEqual(this.cert_permit_prt, egblityStatus.cert_permit_prt) && Intrinsics.areEqual(this.is_tax_clear_cert, egblityStatus.is_tax_clear_cert) && this.isapptallowed == egblityStatus.isapptallowed && this.isbalancefee == egblityStatus.isbalancefee && this.isca == egblityStatus.isca && this.iscart == egblityStatus.iscart && this.iscert_permit_prt == egblityStatus.iscert_permit_prt && this.isdispose == egblityStatus.isdispose && this.isdoc == egblityStatus.isdoc && this.isdupfit == egblityStatus.isdupfit && this.isduprc == egblityStatus.isduprc && this.isenvtax == egblityStatus.isenvtax && this.isepermit == egblityStatus.isepermit && this.isfit == egblityStatus.isfit && this.isform36 == egblityStatus.isform36 && this.isform38 == egblityStatus.isform38 && this.ishpa == egblityStatus.ishpa && this.ishpc == egblityStatus.ishpc && this.ishpt == egblityStatus.ishpt && this.ismisc == egblityStatus.ismisc && this.ismobilereg == egblityStatus.ismobilereg && this.isnewportal == egblityStatus.isnewportal && this.isnoc == egblityStatus.isnoc && this.isnoccancel == egblityStatus.isnoccancel && this.isnonusecontinuation == egblityStatus.isnonusecontinuation && this.isnonuseintimation == egblityStatus.isnonuseintimation && Intrinsics.areEqual(this.isnonuseshifting, egblityStatus.isnonuseshifting) && this.isnonusewithdrawal == egblityStatus.isnonusewithdrawal && this.ispermaregn == egblityStatus.ispermaregn && this.isprintfit == egblityStatus.isprintfit && this.isprintrcparticulars == egblityStatus.isprintrcparticulars && this.isrccancel == egblityStatus.isrccancel && this.isrcparticular == egblityStatus.isrcparticular && this.isrcredsipatch == egblityStatus.isrcredsipatch && this.isrcrelease == egblityStatus.isrcrelease && this.isrcsurr == egblityStatus.isrcsurr && this.isrenreg == egblityStatus.isrenreg && this.isselfbacklog == egblityStatus.isselfbacklog && this.istax == egblityStatus.istax && this.istaxinstallment == egblityStatus.istaxinstallment && this.istaxrecovery == egblityStatus.istaxrecovery && this.istempreg == egblityStatus.istempreg && this.isto == egblityStatus.isto && this.isvehadv == egblityStatus.isvehadv && this.isvehalt == egblityStatus.isvehalt && this.isvehconv == egblityStatus.isvehconv && this.isvehdetails == egblityStatus.isvehdetails && this.isvehreasgn == egblityStatus.isvehreasgn && this.isviewstatetax == egblityStatus.isviewstatetax && this.off_cd == egblityStatus.off_cd && this.payment_compounding_fee == egblityStatus.payment_compounding_fee && this.smartcard_rc == egblityStatus.smartcard_rc && Intrinsics.areEqual(this.state_cd, egblityStatus.state_cd) && Intrinsics.areEqual(this.state_tax_url, egblityStatus.state_tax_url);
    }

    public final String getCert_permit_prt() {
        return this.cert_permit_prt;
    }

    public final boolean getIsapptallowed() {
        return this.isapptallowed;
    }

    public final boolean getIsbalancefee() {
        return this.isbalancefee;
    }

    public final boolean getIsca() {
        return this.isca;
    }

    public final boolean getIscart() {
        return this.iscart;
    }

    public final boolean getIscert_permit_prt() {
        return this.iscert_permit_prt;
    }

    public final boolean getIsdispose() {
        return this.isdispose;
    }

    public final boolean getIsdoc() {
        return this.isdoc;
    }

    public final boolean getIsdupfit() {
        return this.isdupfit;
    }

    public final boolean getIsduprc() {
        return this.isduprc;
    }

    public final boolean getIsenvtax() {
        return this.isenvtax;
    }

    public final boolean getIsepermit() {
        return this.isepermit;
    }

    public final boolean getIsfit() {
        return this.isfit;
    }

    public final boolean getIsform36() {
        return this.isform36;
    }

    public final boolean getIsform38() {
        return this.isform38;
    }

    public final boolean getIshpa() {
        return this.ishpa;
    }

    public final boolean getIshpc() {
        return this.ishpc;
    }

    public final boolean getIshpt() {
        return this.ishpt;
    }

    public final boolean getIsmisc() {
        return this.ismisc;
    }

    public final boolean getIsmobilereg() {
        return this.ismobilereg;
    }

    public final boolean getIsnewportal() {
        return this.isnewportal;
    }

    public final boolean getIsnoc() {
        return this.isnoc;
    }

    public final boolean getIsnoccancel() {
        return this.isnoccancel;
    }

    public final boolean getIsnonusecontinuation() {
        return this.isnonusecontinuation;
    }

    public final boolean getIsnonuseintimation() {
        return this.isnonuseintimation;
    }

    public final Object getIsnonuseshifting() {
        return this.isnonuseshifting;
    }

    public final boolean getIsnonusewithdrawal() {
        return this.isnonusewithdrawal;
    }

    public final boolean getIspermaregn() {
        return this.ispermaregn;
    }

    public final boolean getIsprintfit() {
        return this.isprintfit;
    }

    public final boolean getIsprintrcparticulars() {
        return this.isprintrcparticulars;
    }

    public final boolean getIsrccancel() {
        return this.isrccancel;
    }

    public final boolean getIsrcparticular() {
        return this.isrcparticular;
    }

    public final boolean getIsrcredsipatch() {
        return this.isrcredsipatch;
    }

    public final boolean getIsrcrelease() {
        return this.isrcrelease;
    }

    public final boolean getIsrcsurr() {
        return this.isrcsurr;
    }

    public final boolean getIsrenreg() {
        return this.isrenreg;
    }

    public final boolean getIsselfbacklog() {
        return this.isselfbacklog;
    }

    public final boolean getIstax() {
        return this.istax;
    }

    public final boolean getIstaxinstallment() {
        return this.istaxinstallment;
    }

    public final boolean getIstaxrecovery() {
        return this.istaxrecovery;
    }

    public final boolean getIstempreg() {
        return this.istempreg;
    }

    public final boolean getIsto() {
        return this.isto;
    }

    public final boolean getIsvehadv() {
        return this.isvehadv;
    }

    public final boolean getIsvehalt() {
        return this.isvehalt;
    }

    public final boolean getIsvehconv() {
        return this.isvehconv;
    }

    public final boolean getIsvehdetails() {
        return this.isvehdetails;
    }

    public final boolean getIsvehreasgn() {
        return this.isvehreasgn;
    }

    public final boolean getIsviewstatetax() {
        return this.isviewstatetax;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final boolean getPayment_compounding_fee() {
        return this.payment_compounding_fee;
    }

    public final boolean getSmartcard_rc() {
        return this.smartcard_rc;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_tax_url() {
        return this.state_tax_url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Type inference failed for: r1v124 */
    /* JADX WARN: Type inference failed for: r1v125 */
    /* JADX WARN: Type inference failed for: r1v126 */
    /* JADX WARN: Type inference failed for: r1v127 */
    /* JADX WARN: Type inference failed for: r1v128 */
    /* JADX WARN: Type inference failed for: r1v129 */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v130 */
    /* JADX WARN: Type inference failed for: r1v131 */
    /* JADX WARN: Type inference failed for: r1v132 */
    /* JADX WARN: Type inference failed for: r1v133 */
    /* JADX WARN: Type inference failed for: r1v134 */
    /* JADX WARN: Type inference failed for: r1v135 */
    /* JADX WARN: Type inference failed for: r1v136 */
    /* JADX WARN: Type inference failed for: r1v137 */
    /* JADX WARN: Type inference failed for: r1v138 */
    /* JADX WARN: Type inference failed for: r1v139 */
    /* JADX WARN: Type inference failed for: r1v140 */
    /* JADX WARN: Type inference failed for: r1v141 */
    /* JADX WARN: Type inference failed for: r1v142 */
    /* JADX WARN: Type inference failed for: r1v143 */
    /* JADX WARN: Type inference failed for: r1v144 */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v146 */
    /* JADX WARN: Type inference failed for: r1v147 */
    /* JADX WARN: Type inference failed for: r1v148 */
    /* JADX WARN: Type inference failed for: r1v149 */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v150 */
    /* JADX WARN: Type inference failed for: r1v151 */
    /* JADX WARN: Type inference failed for: r1v152 */
    /* JADX WARN: Type inference failed for: r1v153 */
    /* JADX WARN: Type inference failed for: r1v154 */
    /* JADX WARN: Type inference failed for: r1v155 */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r1v157 */
    /* JADX WARN: Type inference failed for: r1v158 */
    /* JADX WARN: Type inference failed for: r1v159 */
    /* JADX WARN: Type inference failed for: r1v160 */
    /* JADX WARN: Type inference failed for: r1v161 */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r1v164 */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v166 */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v169 */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v170 */
    /* JADX WARN: Type inference failed for: r1v171 */
    /* JADX WARN: Type inference failed for: r1v172 */
    /* JADX WARN: Type inference failed for: r1v173 */
    /* JADX WARN: Type inference failed for: r1v174 */
    /* JADX WARN: Type inference failed for: r1v175 */
    /* JADX WARN: Type inference failed for: r1v176 */
    /* JADX WARN: Type inference failed for: r1v177 */
    /* JADX WARN: Type inference failed for: r1v178 */
    /* JADX WARN: Type inference failed for: r1v179 */
    /* JADX WARN: Type inference failed for: r1v180 */
    /* JADX WARN: Type inference failed for: r1v181 */
    /* JADX WARN: Type inference failed for: r1v182 */
    /* JADX WARN: Type inference failed for: r1v183 */
    /* JADX WARN: Type inference failed for: r1v184 */
    /* JADX WARN: Type inference failed for: r1v185 */
    /* JADX WARN: Type inference failed for: r1v186 */
    /* JADX WARN: Type inference failed for: r1v187 */
    /* JADX WARN: Type inference failed for: r1v188 */
    /* JADX WARN: Type inference failed for: r1v189 */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v190 */
    /* JADX WARN: Type inference failed for: r1v191 */
    /* JADX WARN: Type inference failed for: r1v192 */
    /* JADX WARN: Type inference failed for: r1v193 */
    /* JADX WARN: Type inference failed for: r1v194 */
    /* JADX WARN: Type inference failed for: r1v195 */
    /* JADX WARN: Type inference failed for: r1v196 */
    /* JADX WARN: Type inference failed for: r1v197 */
    /* JADX WARN: Type inference failed for: r1v198 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39, types: [int] */
    /* JADX WARN: Type inference failed for: r1v41, types: [int] */
    /* JADX WARN: Type inference failed for: r1v43, types: [int] */
    /* JADX WARN: Type inference failed for: r1v45, types: [int] */
    /* JADX WARN: Type inference failed for: r1v47, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v53, types: [int] */
    /* JADX WARN: Type inference failed for: r1v55, types: [int] */
    /* JADX WARN: Type inference failed for: r1v57, types: [int] */
    /* JADX WARN: Type inference failed for: r1v59, types: [int] */
    /* JADX WARN: Type inference failed for: r1v61, types: [int] */
    /* JADX WARN: Type inference failed for: r1v63, types: [int] */
    /* JADX WARN: Type inference failed for: r1v65, types: [int] */
    /* JADX WARN: Type inference failed for: r1v67, types: [int] */
    /* JADX WARN: Type inference failed for: r1v69, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v71, types: [int] */
    /* JADX WARN: Type inference failed for: r1v73, types: [int] */
    /* JADX WARN: Type inference failed for: r1v75, types: [int] */
    /* JADX WARN: Type inference failed for: r1v77, types: [int] */
    /* JADX WARN: Type inference failed for: r1v79, types: [int] */
    /* JADX WARN: Type inference failed for: r1v81, types: [int] */
    /* JADX WARN: Type inference failed for: r1v83, types: [int] */
    /* JADX WARN: Type inference failed for: r1v85, types: [int] */
    /* JADX WARN: Type inference failed for: r1v87, types: [int] */
    /* JADX WARN: Type inference failed for: r1v89, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v91, types: [int] */
    /* JADX WARN: Type inference failed for: r1v93, types: [int] */
    /* JADX WARN: Type inference failed for: r1v95, types: [int] */
    /* JADX WARN: Type inference failed for: r1v99, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.cert_permit_prt.hashCode() * 31) + this.is_tax_clear_cert.hashCode()) * 31;
        boolean z = this.isapptallowed;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isbalancefee;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int i2 = (i + r12) * 31;
        boolean z3 = this.isca;
        ?? r13 = z3;
        if (z3) {
            r13 = 1;
        }
        int i3 = (i2 + r13) * 31;
        boolean z4 = this.iscart;
        ?? r14 = z4;
        if (z4) {
            r14 = 1;
        }
        int i4 = (i3 + r14) * 31;
        boolean z5 = this.iscert_permit_prt;
        ?? r15 = z5;
        if (z5) {
            r15 = 1;
        }
        int i5 = (i4 + r15) * 31;
        boolean z6 = this.isdispose;
        ?? r16 = z6;
        if (z6) {
            r16 = 1;
        }
        int i6 = (i5 + r16) * 31;
        boolean z7 = this.isdoc;
        ?? r17 = z7;
        if (z7) {
            r17 = 1;
        }
        int i7 = (i6 + r17) * 31;
        boolean z8 = this.isdupfit;
        ?? r18 = z8;
        if (z8) {
            r18 = 1;
        }
        int i8 = (i7 + r18) * 31;
        boolean z9 = this.isduprc;
        ?? r19 = z9;
        if (z9) {
            r19 = 1;
        }
        int i9 = (i8 + r19) * 31;
        boolean z10 = this.isenvtax;
        ?? r110 = z10;
        if (z10) {
            r110 = 1;
        }
        int i10 = (i9 + r110) * 31;
        boolean z11 = this.isepermit;
        ?? r111 = z11;
        if (z11) {
            r111 = 1;
        }
        int i11 = (i10 + r111) * 31;
        boolean z12 = this.isfit;
        ?? r112 = z12;
        if (z12) {
            r112 = 1;
        }
        int i12 = (i11 + r112) * 31;
        boolean z13 = this.isform36;
        ?? r113 = z13;
        if (z13) {
            r113 = 1;
        }
        int i13 = (i12 + r113) * 31;
        boolean z14 = this.isform38;
        ?? r114 = z14;
        if (z14) {
            r114 = 1;
        }
        int i14 = (i13 + r114) * 31;
        boolean z15 = this.ishpa;
        ?? r115 = z15;
        if (z15) {
            r115 = 1;
        }
        int i15 = (i14 + r115) * 31;
        boolean z16 = this.ishpc;
        ?? r116 = z16;
        if (z16) {
            r116 = 1;
        }
        int i16 = (i15 + r116) * 31;
        boolean z17 = this.ishpt;
        ?? r117 = z17;
        if (z17) {
            r117 = 1;
        }
        int i17 = (i16 + r117) * 31;
        boolean z18 = this.ismisc;
        ?? r118 = z18;
        if (z18) {
            r118 = 1;
        }
        int i18 = (i17 + r118) * 31;
        boolean z19 = this.ismobilereg;
        ?? r119 = z19;
        if (z19) {
            r119 = 1;
        }
        int i19 = (i18 + r119) * 31;
        boolean z20 = this.isnewportal;
        ?? r120 = z20;
        if (z20) {
            r120 = 1;
        }
        int i20 = (i19 + r120) * 31;
        boolean z21 = this.isnoc;
        ?? r121 = z21;
        if (z21) {
            r121 = 1;
        }
        int i21 = (i20 + r121) * 31;
        boolean z22 = this.isnoccancel;
        ?? r122 = z22;
        if (z22) {
            r122 = 1;
        }
        int i22 = (i21 + r122) * 31;
        boolean z23 = this.isnonusecontinuation;
        ?? r123 = z23;
        if (z23) {
            r123 = 1;
        }
        int i23 = (i22 + r123) * 31;
        boolean z24 = this.isnonuseintimation;
        ?? r124 = z24;
        if (z24) {
            r124 = 1;
        }
        int iHashCode2 = (((i23 + r124) * 31) + this.isnonuseshifting.hashCode()) * 31;
        boolean z25 = this.isnonusewithdrawal;
        ?? r125 = z25;
        if (z25) {
            r125 = 1;
        }
        int i24 = (iHashCode2 + r125) * 31;
        boolean z26 = this.ispermaregn;
        ?? r126 = z26;
        if (z26) {
            r126 = 1;
        }
        int i25 = (i24 + r126) * 31;
        boolean z27 = this.isprintfit;
        ?? r127 = z27;
        if (z27) {
            r127 = 1;
        }
        int i26 = (i25 + r127) * 31;
        boolean z28 = this.isprintrcparticulars;
        ?? r128 = z28;
        if (z28) {
            r128 = 1;
        }
        int i27 = (i26 + r128) * 31;
        boolean z29 = this.isrccancel;
        ?? r129 = z29;
        if (z29) {
            r129 = 1;
        }
        int i28 = (i27 + r129) * 31;
        boolean z30 = this.isrcparticular;
        ?? r130 = z30;
        if (z30) {
            r130 = 1;
        }
        int i29 = (i28 + r130) * 31;
        boolean z31 = this.isrcredsipatch;
        ?? r131 = z31;
        if (z31) {
            r131 = 1;
        }
        int i30 = (i29 + r131) * 31;
        boolean z32 = this.isrcrelease;
        ?? r132 = z32;
        if (z32) {
            r132 = 1;
        }
        int i31 = (i30 + r132) * 31;
        boolean z33 = this.isrcsurr;
        ?? r133 = z33;
        if (z33) {
            r133 = 1;
        }
        int i32 = (i31 + r133) * 31;
        boolean z34 = this.isrenreg;
        ?? r134 = z34;
        if (z34) {
            r134 = 1;
        }
        int i33 = (i32 + r134) * 31;
        boolean z35 = this.isselfbacklog;
        ?? r135 = z35;
        if (z35) {
            r135 = 1;
        }
        int i34 = (i33 + r135) * 31;
        boolean z36 = this.istax;
        ?? r136 = z36;
        if (z36) {
            r136 = 1;
        }
        int i35 = (i34 + r136) * 31;
        boolean z37 = this.istaxinstallment;
        ?? r137 = z37;
        if (z37) {
            r137 = 1;
        }
        int i36 = (i35 + r137) * 31;
        boolean z38 = this.istaxrecovery;
        ?? r138 = z38;
        if (z38) {
            r138 = 1;
        }
        int i37 = (i36 + r138) * 31;
        boolean z39 = this.istempreg;
        ?? r139 = z39;
        if (z39) {
            r139 = 1;
        }
        int i38 = (i37 + r139) * 31;
        boolean z40 = this.isto;
        ?? r140 = z40;
        if (z40) {
            r140 = 1;
        }
        int i39 = (i38 + r140) * 31;
        boolean z41 = this.isvehadv;
        ?? r141 = z41;
        if (z41) {
            r141 = 1;
        }
        int i40 = (i39 + r141) * 31;
        boolean z42 = this.isvehalt;
        ?? r142 = z42;
        if (z42) {
            r142 = 1;
        }
        int i41 = (i40 + r142) * 31;
        boolean z43 = this.isvehconv;
        ?? r143 = z43;
        if (z43) {
            r143 = 1;
        }
        int i42 = (i41 + r143) * 31;
        boolean z44 = this.isvehdetails;
        ?? r144 = z44;
        if (z44) {
            r144 = 1;
        }
        int i43 = (i42 + r144) * 31;
        boolean z45 = this.isvehreasgn;
        ?? r145 = z45;
        if (z45) {
            r145 = 1;
        }
        int i44 = (i43 + r145) * 31;
        boolean z46 = this.isviewstatetax;
        ?? r146 = z46;
        if (z46) {
            r146 = 1;
        }
        int iHashCode3 = (((i44 + r146) * 31) + Integer.hashCode(this.off_cd)) * 31;
        boolean z47 = this.payment_compounding_fee;
        ?? r147 = z47;
        if (z47) {
            r147 = 1;
        }
        int i45 = (iHashCode3 + r147) * 31;
        boolean z48 = this.smartcard_rc;
        return ((((i45 + (z48 ? 1 : z48)) * 31) + this.state_cd.hashCode()) * 31) + this.state_tax_url.hashCode();
    }

    public final Object is_tax_clear_cert() {
        return this.is_tax_clear_cert;
    }

    public String toString() {
        return "EgblityStatus(cert_permit_prt=" + this.cert_permit_prt + ", is_tax_clear_cert=" + this.is_tax_clear_cert + ", isapptallowed=" + this.isapptallowed + ", isbalancefee=" + this.isbalancefee + ", isca=" + this.isca + ", iscart=" + this.iscart + ", iscert_permit_prt=" + this.iscert_permit_prt + ", isdispose=" + this.isdispose + ", isdoc=" + this.isdoc + ", isdupfit=" + this.isdupfit + ", isduprc=" + this.isduprc + ", isenvtax=" + this.isenvtax + ", isepermit=" + this.isepermit + ", isfit=" + this.isfit + ", isform36=" + this.isform36 + ", isform38=" + this.isform38 + ", ishpa=" + this.ishpa + ", ishpc=" + this.ishpc + ", ishpt=" + this.ishpt + ", ismisc=" + this.ismisc + ", ismobilereg=" + this.ismobilereg + ", isnewportal=" + this.isnewportal + ", isnoc=" + this.isnoc + ", isnoccancel=" + this.isnoccancel + ", isnonusecontinuation=" + this.isnonusecontinuation + ", isnonuseintimation=" + this.isnonuseintimation + ", isnonuseshifting=" + this.isnonuseshifting + ", isnonusewithdrawal=" + this.isnonusewithdrawal + ", ispermaregn=" + this.ispermaregn + ", isprintfit=" + this.isprintfit + ", isprintrcparticulars=" + this.isprintrcparticulars + ", isrccancel=" + this.isrccancel + ", isrcparticular=" + this.isrcparticular + ", isrcredsipatch=" + this.isrcredsipatch + ", isrcrelease=" + this.isrcrelease + ", isrcsurr=" + this.isrcsurr + ", isrenreg=" + this.isrenreg + ", isselfbacklog=" + this.isselfbacklog + ", istax=" + this.istax + ", istaxinstallment=" + this.istaxinstallment + ", istaxrecovery=" + this.istaxrecovery + ", istempreg=" + this.istempreg + ", isto=" + this.isto + ", isvehadv=" + this.isvehadv + ", isvehalt=" + this.isvehalt + ", isvehconv=" + this.isvehconv + ", isvehdetails=" + this.isvehdetails + ", isvehreasgn=" + this.isvehreasgn + ", isviewstatetax=" + this.isviewstatetax + ", off_cd=" + this.off_cd + ", payment_compounding_fee=" + this.payment_compounding_fee + ", smartcard_rc=" + this.smartcard_rc + ", state_cd=" + this.state_cd + ", state_tax_url=" + this.state_tax_url + ')';
    }
}
