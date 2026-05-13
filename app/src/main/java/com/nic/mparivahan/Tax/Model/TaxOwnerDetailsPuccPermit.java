package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.Model.OwnerIdentification;
import com.nic.mparivahan.VahanServices.Model.PermitDetailDto;
import com.nic.mparivahan.VahanServices.Model.VTHypthEntity;
import com.nic.mparivahan.VahanServices.VahanModel.VtInsuranceCommonDto;
import com.nic.mparivahan.VahanServices.VahanModel.Vtpucc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b'\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0092\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0093\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\b\u00100\u001a\u0004\u0018\u00010\u0001\u0012\b\u00101\u001a\u0004\u0018\u00010\u0006\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0006\u0012\b\u00105\u001a\u0004\u0018\u00010\u0006\u0012\b\u00106\u001a\u0004\u0018\u00010\u0019\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010@\u001a\u0004\u0018\u00010A\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010N\u001a\u0004\u0018\u00010O\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010X\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010^\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010`\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010a\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010g\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010h\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010i\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010j\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010k\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010l\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010m\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010o\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010p\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010q\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010s\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010u\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010v\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010w\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010x\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010y\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010z\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010{\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010|\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010}\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010~\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u007f\u001a\u0004\u0018\u00010\u0003\u0012\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001\u0012\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001\u0012\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006\u0012\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0006\u0012\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001\u0012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001\u0012\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u0001¢\u0006\u0003\u0010\u008d\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u008f\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u008f\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u008f\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u008f\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u008f\u0001R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u008f\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u009b\u0001\u0010\u0092\u0001R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u008f\u0001R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u0095\u0001R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u009e\u0001\u0010\u0092\u0001R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010\u008f\u0001R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b \u0001\u0010\u008f\u0001R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010\u008f\u0001R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b¢\u0001\u0010\u0095\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b£\u0001\u0010\u008f\u0001R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\r\n\u0003\u0010¦\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\r\n\u0003\u0010©\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bª\u0001\u0010\u008f\u0001R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b«\u0001\u0010\u0092\u0001R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010\u0095\u0001R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0001\u0010\u0095\u0001R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b®\u0001\u0010\u008f\u0001R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b¯\u0001\u0010\u008f\u0001R\u0015\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b°\u0001\u0010\u008f\u0001R\u0015\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b±\u0001\u0010\u008f\u0001R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b²\u0001\u0010\u008f\u0001R\u0015\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b³\u0001\u0010\u008f\u0001R\u0015\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010\u008f\u0001R\u0015\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bµ\u0001\u0010\u008f\u0001R\u0015\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b¶\u0001\u0010\u008f\u0001R\u0015\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b·\u0001\u0010\u008f\u0001R\u0015\u0010(\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b¸\u0001\u0010\u0095\u0001R\u0015\u0010)\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b¹\u0001\u0010\u0095\u0001R\u0015\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bº\u0001\u0010\u008f\u0001R\u0015\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b»\u0001\u0010\u008f\u0001R\u0015\u0010,\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b¼\u0001\u0010\u0095\u0001R\u0015\u0010-\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b½\u0001\u0010\u0095\u0001R\u0015\u0010.\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010\u0095\u0001R\u0018\u0010/\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b¿\u0001\u0010\u0092\u0001R\u0015\u00100\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\bÀ\u0001\u0010\u0095\u0001R\u0018\u00101\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÁ\u0001\u0010\u0092\u0001R\u0015\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÂ\u0001\u0010\u008f\u0001R\u0015\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÃ\u0001\u0010\u008f\u0001R\u0018\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÄ\u0001\u0010\u0092\u0001R\u0018\u00105\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÅ\u0001\u0010\u0092\u0001R\u0018\u00106\u001a\u0004\u0018\u00010\u0019¢\u0006\r\n\u0003\u0010©\u0001\u001a\u0006\bÆ\u0001\u0010¨\u0001R\u0015\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÇ\u0001\u0010\u008f\u0001R\u0015\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÈ\u0001\u0010\u008f\u0001R\u0017\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001¢\u0006\n\n\u0000\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u00109\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bË\u0001\u0010\u0092\u0001R\u0018\u0010:\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÌ\u0001\u0010\u0092\u0001R\u0018\u0010;\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÍ\u0001\u0010\u0092\u0001R\u0015\u0010<\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÎ\u0001\u0010\u008f\u0001R\u0018\u0010=\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÏ\u0001\u0010\u0092\u0001R\u0018\u0010>\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÐ\u0001\u0010\u0092\u0001R\u0015\u0010?\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\bÑ\u0001\u0010\u0095\u0001R\u0018\u0010@\u001a\u0004\u0018\u00010A¢\u0006\r\n\u0003\u0010Ô\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0015\u0010B\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÕ\u0001\u0010\u008f\u0001R\u0015\u0010C\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010\u008f\u0001R\u0018\u0010D\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b×\u0001\u0010\u0092\u0001R\u0015\u0010E\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\bØ\u0001\u0010\u0095\u0001R\u0018\u0010F\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÙ\u0001\u0010\u0092\u0001R\u0015\u0010G\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÚ\u0001\u0010\u008f\u0001R\u0015\u0010H\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\bÛ\u0001\u0010\u0095\u0001R\u0018\u0010I\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÜ\u0001\u0010\u0092\u0001R\u0015\u0010J\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÝ\u0001\u0010\u008f\u0001R\u0015\u0010K\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÞ\u0001\u0010\u008f\u0001R\u0018\u0010L\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bß\u0001\u0010\u0092\u0001R\u0015\u0010M\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\bà\u0001\u0010\u0095\u0001R\u0015\u0010N\u001a\u0004\u0018\u00010O¢\u0006\n\n\u0000\u001a\u0006\bá\u0001\u0010â\u0001R\u0018\u0010P\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bã\u0001\u0010\u0092\u0001R\u0015\u0010Q\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bä\u0001\u0010\u008f\u0001R\u0018\u0010R\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bå\u0001\u0010\u0092\u0001R\u0015\u0010S\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bæ\u0001\u0010\u008f\u0001R\u0018\u0010T\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bç\u0001\u0010\u0092\u0001R\u0015\u0010U\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bè\u0001\u0010\u008f\u0001R\u0015\u0010V\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bé\u0001\u0010\u008f\u0001R\u0015\u0010W\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bê\u0001\u0010\u008f\u0001R\u0018\u0010X\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bë\u0001\u0010\u0092\u0001R\u0015\u0010Y\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bì\u0001\u0010\u008f\u0001R\u0018\u0010Z\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bí\u0001\u0010\u0092\u0001R\u0015\u0010[\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bî\u0001\u0010\u008f\u0001R\u0015\u0010\\\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bï\u0001\u0010\u008f\u0001R\u0015\u0010]\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bð\u0001\u0010\u008f\u0001R\u0015\u0010^\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bñ\u0001\u0010\u008f\u0001R\u0017\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u0001¢\u0006\n\n\u0000\u001a\u0006\bò\u0001\u0010ó\u0001R\u0015\u0010_\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\bô\u0001\u0010\u0095\u0001R\u0015\u0010`\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\bõ\u0001\u0010\u0095\u0001R\u0015\u0010a\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\bö\u0001\u0010\u0095\u0001R\u0015\u0010b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b÷\u0001\u0010\u008f\u0001R\u0015\u0010c\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bø\u0001\u0010\u008f\u0001R\u0015\u0010d\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bù\u0001\u0010\u008f\u0001R\u0015\u0010e\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\bú\u0001\u0010\u0095\u0001R\u0015\u0010f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bû\u0001\u0010\u008f\u0001R\u0015\u0010g\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bü\u0001\u0010\u008f\u0001R\u0015\u0010h\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bý\u0001\u0010\u008f\u0001R\u0015\u0010i\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bþ\u0001\u0010\u008f\u0001R\u0015\u0010j\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\bÿ\u0001\u0010\u0095\u0001R\u0015\u0010k\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0002\u0010\u0095\u0001R\u0018\u0010l\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u0081\u0002\u0010\u0092\u0001R\u0018\u0010m\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u0082\u0002\u0010\u0092\u0001R\u0018\u0010n\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u0083\u0002\u0010\u0092\u0001R\u0018\u0010o\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u0084\u0002\u0010\u0092\u0001R\u0015\u0010p\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0002\u0010\u008f\u0001R\u0015\u0010q\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0002\u0010\u008f\u0001R\u0015\u0010r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0002\u0010\u008f\u0001R\u0015\u0010s\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0088\u0002\u0010\u0095\u0001R\u0015\u0010t\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0002\u0010\u0095\u0001R\u0018\u0010u\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u008a\u0002\u0010\u0092\u0001R\u0017\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0015\u0010v\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u008d\u0002\u0010\u008f\u0001R\u0015\u0010w\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0002\u0010\u0095\u0001R\u0015\u0010x\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0002\u0010\u008f\u0001R\u0015\u0010y\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0002\u0010\u0095\u0001R\u0015\u0010z\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0091\u0002\u0010\u008f\u0001R\u0018\u0010{\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u0092\u0002\u0010\u0092\u0001R\u0015\u0010|\u001a\u0004\u0018\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0002\u0010\u0095\u0001R\u0018\u0010}\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u0094\u0002\u0010\u0092\u0001R\u0015\u0010~\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0002\u0010\u008f\u0001R\u0015\u0010\u007f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0002\u0010\u008f\u0001R\u0016\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0002\u0010\u008f\u0001R\u0017\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0017\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0019\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u009c\u0002\u0010\u0092\u0001R\u0019\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0006¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u009d\u0002\u0010\u0092\u0001¨\u0006\u009e\u0002"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/TaxOwnerDetailsPuccPermit;", "", "aadhar_no", "", "ac_fitted", "annual_income", "", "appl_no", "audio_fitted", "body_type", "c_add1", "c_add2", "c_add3", "c_district", "c_district_name", "c_off_cd", "c_pincode", "c_state", "c_state_name", "chasi_no", "chasi_no_original", "color", "conditionstatus", "", "cubic_cap", "", "dealer_cd", "dept_cd", "dlRequired", "dlValidationRequired", "dl_no", "dlr_add1", "dlr_add2", "dlr_add3", "dlr_city", "dlr_district", "dlr_name", "dlr_pincode", "email_id", "eng_no", "eng_no_original", "eng_no_orignal", "f_name", "fit_upto", "fit_uptoAsDate", "fit_upto_desc", "flag", "floor_area", "formatRegn_dt", "fuel", "fuel_descr", "garage_add", "gcw", "height", "hp", "imported_vch", "laser_code", "ld_wt", "length", "maker", "maker_name", "manu_mon", "manu_yr", "mobileNoEditable", "mobile_no", "", "model_cd", "model_name", "no_cyl", "no_of_axles", "norms", "norms_descr", "numberOfTyres", "off_cd", "off_name", "op_dt", "other_criteria", "ownerCatg", "ownerIdentification", "Lcom/nic/mparivahan/VahanServices/Model/OwnerIdentification;", "owner_cd", "owner_cd_descr", "owner_ctg", "owner_name", "owner_sr", "p_add1", "p_add2", "p_add3", "p_district", "p_district_name", "p_pincode", "p_state", "p_state_name", "pan_no", "passport_no", "permitDetailEntity", "permit_rto_cd", "purchase_date", "purchase_dt", "ration_card_no", "regn_dt", "regn_dtAsDate", "regn_no", "regn_type", "regn_type_descr", "regn_upto", "regn_uptoAsDate", "returnMessge", "sale_amt", "seat_cap", "sleeper_cap", "stand_cap", "state_cd", "state_name", "status", "tax_mode", "transport_catg", "unld_wt", "vch_catg", "vch_catg_desc", "vch_purchase_as", "vch_purchase_asCode", "vehType", "vehTypeAsInt", "verified_on", "vh_class", "vh_class_desc", "video_fitted", "voter_id", "vtInsuranceCommonDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/VtInsuranceCommonDto;", "vtpucc", "Lcom/nic/mparivahan/VahanServices/VahanModel/Vtpucc;", "wheelbase", "width", "vTHypthEntity", "Lcom/nic/mparivahan/VahanServices/Model/VTHypthEntity;", "latesttaxdetails", "Lcom/nic/mparivahan/Tax/Model/Latestpaytaxdetails;", "permitDetailDto", "Lcom/nic/mparivahan/VahanServices/Model/PermitDetailDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/nic/mparivahan/VahanServices/Model/OwnerIdentification;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/VtInsuranceCommonDto;Lcom/nic/mparivahan/VahanServices/VahanModel/Vtpucc;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/nic/mparivahan/VahanServices/Model/VTHypthEntity;Lcom/nic/mparivahan/Tax/Model/Latestpaytaxdetails;Lcom/nic/mparivahan/VahanServices/Model/PermitDetailDto;)V", "getAadhar_no", "()Ljava/lang/String;", "getAc_fitted", "getAnnual_income", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAppl_no", "()Ljava/lang/Object;", "getAudio_fitted", "getBody_type", "getC_add1", "getC_add2", "getC_add3", "getC_district", "getC_district_name", "getC_off_cd", "getC_pincode", "getC_state", "getC_state_name", "getChasi_no", "getChasi_no_original", "getColor", "getConditionstatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCubic_cap", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDealer_cd", "getDept_cd", "getDlRequired", "getDlValidationRequired", "getDl_no", "getDlr_add1", "getDlr_add2", "getDlr_add3", "getDlr_city", "getDlr_district", "getDlr_name", "getDlr_pincode", "getEmail_id", "getEng_no", "getEng_no_original", "getEng_no_orignal", "getF_name", "getFit_upto", "getFit_uptoAsDate", "getFit_upto_desc", "getFlag", "getFloor_area", "getFormatRegn_dt", "getFuel", "getFuel_descr", "getGarage_add", "getGcw", "getHeight", "getHp", "getImported_vch", "getLaser_code", "getLatesttaxdetails", "()Lcom/nic/mparivahan/Tax/Model/Latestpaytaxdetails;", "getLd_wt", "getLength", "getMaker", "getMaker_name", "getManu_mon", "getManu_yr", "getMobileNoEditable", "getMobile_no", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getModel_cd", "getModel_name", "getNo_cyl", "getNo_of_axles", "getNorms", "getNorms_descr", "getNumberOfTyres", "getOff_cd", "getOff_name", "getOp_dt", "getOther_criteria", "getOwnerCatg", "getOwnerIdentification", "()Lcom/nic/mparivahan/VahanServices/Model/OwnerIdentification;", "getOwner_cd", "getOwner_cd_descr", "getOwner_ctg", "getOwner_name", "getOwner_sr", "getP_add1", "getP_add2", "getP_add3", "getP_district", "getP_district_name", "getP_pincode", "getP_state", "getP_state_name", "getPan_no", "getPassport_no", "getPermitDetailDto", "()Lcom/nic/mparivahan/VahanServices/Model/PermitDetailDto;", "getPermitDetailEntity", "getPermit_rto_cd", "getPurchase_date", "getPurchase_dt", "getRation_card_no", "getRegn_dt", "getRegn_dtAsDate", "getRegn_no", "getRegn_type", "getRegn_type_descr", "getRegn_upto", "getRegn_uptoAsDate", "getReturnMessge", "getSale_amt", "getSeat_cap", "getSleeper_cap", "getStand_cap", "getState_cd", "getState_name", "getStatus", "getTax_mode", "getTransport_catg", "getUnld_wt", "getVTHypthEntity", "()Lcom/nic/mparivahan/VahanServices/Model/VTHypthEntity;", "getVch_catg", "getVch_catg_desc", "getVch_purchase_as", "getVch_purchase_asCode", "getVehType", "getVehTypeAsInt", "getVerified_on", "getVh_class", "getVh_class_desc", "getVideo_fitted", "getVoter_id", "getVtInsuranceCommonDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/VtInsuranceCommonDto;", "getVtpucc", "()Lcom/nic/mparivahan/VahanServices/VahanModel/Vtpucc;", "getWheelbase", "getWidth", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TaxOwnerDetailsPuccPermit {
    private final String aadhar_no;
    private final String ac_fitted;
    private final Integer annual_income;
    private final Object appl_no;
    private final String audio_fitted;
    private final String body_type;
    private final String c_add1;
    private final String c_add2;
    private final String c_add3;
    private final Integer c_district;
    private final String c_district_name;
    private final Object c_off_cd;
    private final Integer c_pincode;
    private final String c_state;
    private final String c_state_name;
    private final String chasi_no;
    private final Object chasi_no_original;
    private final String color;
    private final Boolean conditionstatus;
    private final Double cubic_cap;
    private final String dealer_cd;
    private final Integer dept_cd;
    private final Object dlRequired;
    private final Object dlValidationRequired;
    private final String dl_no;
    private final String dlr_add1;
    private final String dlr_add2;
    private final String dlr_add3;
    private final String dlr_city;
    private final String dlr_district;
    private final String dlr_name;
    private final String dlr_pincode;
    private final String email_id;
    private final String eng_no;
    private final Object eng_no_original;
    private final Object eng_no_orignal;
    private final String f_name;
    private final String fit_upto;
    private final Object fit_uptoAsDate;
    private final Object fit_upto_desc;
    private final Object flag;
    private final Integer floor_area;
    private final Object formatRegn_dt;
    private final Integer fuel;
    private final String fuel_descr;
    private final String garage_add;
    private final Integer gcw;
    private final Integer height;
    private final Double hp;
    private final String imported_vch;
    private final String laser_code;
    private final Latestpaytaxdetails latesttaxdetails;
    private final Integer ld_wt;
    private final Integer length;
    private final Integer maker;
    private final String maker_name;
    private final Integer manu_mon;
    private final Integer manu_yr;
    private final Object mobileNoEditable;
    private final Long mobile_no;
    private final String model_cd;
    private final String model_name;
    private final Integer no_cyl;
    private final Object no_of_axles;
    private final Integer norms;
    private final String norms_descr;
    private final Object numberOfTyres;
    private final Integer off_cd;
    private final String off_name;
    private final String op_dt;
    private final Integer other_criteria;
    private final Object ownerCatg;
    private final OwnerIdentification ownerIdentification;
    private final Integer owner_cd;
    private final String owner_cd_descr;
    private final Integer owner_ctg;
    private final String owner_name;
    private final Integer owner_sr;
    private final String p_add1;
    private final String p_add2;
    private final String p_add3;
    private final Integer p_district;
    private final String p_district_name;
    private final Integer p_pincode;
    private final String p_state;
    private final String p_state_name;
    private final String pan_no;
    private final String passport_no;
    private final PermitDetailDto permitDetailDto;
    private final Object permitDetailEntity;
    private final Object permit_rto_cd;
    private final Object purchase_date;
    private final String purchase_dt;
    private final String ration_card_no;
    private final String regn_dt;
    private final Object regn_dtAsDate;
    private final String regn_no;
    private final String regn_type;
    private final String regn_type_descr;
    private final String regn_upto;
    private final Object regn_uptoAsDate;
    private final Object returnMessge;
    private final Integer sale_amt;
    private final Integer seat_cap;
    private final Integer sleeper_cap;
    private final Integer stand_cap;
    private final String state_cd;
    private final String state_name;
    private final String status;
    private final Object tax_mode;
    private final Object transport_catg;
    private final Integer unld_wt;
    private final VTHypthEntity vTHypthEntity;
    private final String vch_catg;
    private final Object vch_catg_desc;
    private final String vch_purchase_as;
    private final Object vch_purchase_asCode;
    private final String vehType;
    private final Integer vehTypeAsInt;
    private final Object verified_on;
    private final Integer vh_class;
    private final String vh_class_desc;
    private final String video_fitted;
    private final String voter_id;
    private final VtInsuranceCommonDto vtInsuranceCommonDto;
    private final Vtpucc vtpucc;
    private final Integer wheelbase;
    private final Integer width;

    public TaxOwnerDetailsPuccPermit(String str, String str2, Integer num, Object obj, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, Object obj2, Integer num3, String str9, String str10, String str11, Object obj3, String str12, Boolean bool, Double d, String str13, Integer num4, Object obj4, Object obj5, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj6, Object obj7, String str24, String str25, Object obj8, Object obj9, Object obj10, Integer num5, Object obj11, Integer num6, String str26, String str27, Integer num7, Integer num8, Double d2, String str28, String str29, Integer num9, Integer num10, Integer num11, String str30, Integer num12, Integer num13, Object obj12, Long l, String str31, String str32, Integer num14, Object obj13, Integer num15, String str33, Object obj14, Integer num16, String str34, String str35, Integer num17, Object obj15, OwnerIdentification ownerIdentification, Integer num18, String str36, Integer num19, String str37, Integer num20, String str38, String str39, String str40, Integer num21, String str41, Integer num22, String str42, String str43, String str44, String str45, Object obj16, Object obj17, Object obj18, String str46, String str47, String str48, Object obj19, String str49, String str50, String str51, String str52, Object obj20, Object obj21, Integer num23, Integer num24, Integer num25, Integer num26, String str53, String str54, String str55, Object obj22, Object obj23, Integer num27, String str56, Object obj24, String str57, Object obj25, String str58, Integer num28, Object obj26, Integer num29, String str59, String str60, String str61, VtInsuranceCommonDto vtInsuranceCommonDto, Vtpucc vtpucc, Integer num30, Integer num31, VTHypthEntity vTHypthEntity, Latestpaytaxdetails latestpaytaxdetails, PermitDetailDto permitDetailDto) {
        this.aadhar_no = str;
        this.ac_fitted = str2;
        this.annual_income = num;
        this.appl_no = obj;
        this.audio_fitted = str3;
        this.body_type = str4;
        this.c_add1 = str5;
        this.c_add2 = str6;
        this.c_add3 = str7;
        this.c_district = num2;
        this.c_district_name = str8;
        this.c_off_cd = obj2;
        this.c_pincode = num3;
        this.c_state = str9;
        this.c_state_name = str10;
        this.chasi_no = str11;
        this.chasi_no_original = obj3;
        this.color = str12;
        this.conditionstatus = bool;
        this.cubic_cap = d;
        this.dealer_cd = str13;
        this.dept_cd = num4;
        this.dlRequired = obj4;
        this.dlValidationRequired = obj5;
        this.dl_no = str14;
        this.dlr_add1 = str15;
        this.dlr_add2 = str16;
        this.dlr_add3 = str17;
        this.dlr_city = str18;
        this.dlr_district = str19;
        this.dlr_name = str20;
        this.dlr_pincode = str21;
        this.email_id = str22;
        this.eng_no = str23;
        this.eng_no_original = obj6;
        this.eng_no_orignal = obj7;
        this.f_name = str24;
        this.fit_upto = str25;
        this.fit_uptoAsDate = obj8;
        this.fit_upto_desc = obj9;
        this.flag = obj10;
        this.floor_area = num5;
        this.formatRegn_dt = obj11;
        this.fuel = num6;
        this.fuel_descr = str26;
        this.garage_add = str27;
        this.gcw = num7;
        this.height = num8;
        this.hp = d2;
        this.imported_vch = str28;
        this.laser_code = str29;
        this.ld_wt = num9;
        this.length = num10;
        this.maker = num11;
        this.maker_name = str30;
        this.manu_mon = num12;
        this.manu_yr = num13;
        this.mobileNoEditable = obj12;
        this.mobile_no = l;
        this.model_cd = str31;
        this.model_name = str32;
        this.no_cyl = num14;
        this.no_of_axles = obj13;
        this.norms = num15;
        this.norms_descr = str33;
        this.numberOfTyres = obj14;
        this.off_cd = num16;
        this.off_name = str34;
        this.op_dt = str35;
        this.other_criteria = num17;
        this.ownerCatg = obj15;
        this.ownerIdentification = ownerIdentification;
        this.owner_cd = num18;
        this.owner_cd_descr = str36;
        this.owner_ctg = num19;
        this.owner_name = str37;
        this.owner_sr = num20;
        this.p_add1 = str38;
        this.p_add2 = str39;
        this.p_add3 = str40;
        this.p_district = num21;
        this.p_district_name = str41;
        this.p_pincode = num22;
        this.p_state = str42;
        this.p_state_name = str43;
        this.pan_no = str44;
        this.passport_no = str45;
        this.permitDetailEntity = obj16;
        this.permit_rto_cd = obj17;
        this.purchase_date = obj18;
        this.purchase_dt = str46;
        this.ration_card_no = str47;
        this.regn_dt = str48;
        this.regn_dtAsDate = obj19;
        this.regn_no = str49;
        this.regn_type = str50;
        this.regn_type_descr = str51;
        this.regn_upto = str52;
        this.regn_uptoAsDate = obj20;
        this.returnMessge = obj21;
        this.sale_amt = num23;
        this.seat_cap = num24;
        this.sleeper_cap = num25;
        this.stand_cap = num26;
        this.state_cd = str53;
        this.state_name = str54;
        this.status = str55;
        this.tax_mode = obj22;
        this.transport_catg = obj23;
        this.unld_wt = num27;
        this.vch_catg = str56;
        this.vch_catg_desc = obj24;
        this.vch_purchase_as = str57;
        this.vch_purchase_asCode = obj25;
        this.vehType = str58;
        this.vehTypeAsInt = num28;
        this.verified_on = obj26;
        this.vh_class = num29;
        this.vh_class_desc = str59;
        this.video_fitted = str60;
        this.voter_id = str61;
        this.vtInsuranceCommonDto = vtInsuranceCommonDto;
        this.vtpucc = vtpucc;
        this.wheelbase = num30;
        this.width = num31;
        this.vTHypthEntity = vTHypthEntity;
        this.latesttaxdetails = latestpaytaxdetails;
        this.permitDetailDto = permitDetailDto;
    }

    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final String getAc_fitted() {
        return this.ac_fitted;
    }

    public final Integer getAnnual_income() {
        return this.annual_income;
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final String getAudio_fitted() {
        return this.audio_fitted;
    }

    public final String getBody_type() {
        return this.body_type;
    }

    public final String getC_add1() {
        return this.c_add1;
    }

    public final String getC_add2() {
        return this.c_add2;
    }

    public final String getC_add3() {
        return this.c_add3;
    }

    public final Integer getC_district() {
        return this.c_district;
    }

    public final String getC_district_name() {
        return this.c_district_name;
    }

    public final Object getC_off_cd() {
        return this.c_off_cd;
    }

    public final Integer getC_pincode() {
        return this.c_pincode;
    }

    public final String getC_state() {
        return this.c_state;
    }

    public final String getC_state_name() {
        return this.c_state_name;
    }

    public final String getChasi_no() {
        return this.chasi_no;
    }

    public final Object getChasi_no_original() {
        return this.chasi_no_original;
    }

    public final String getColor() {
        return this.color;
    }

    public final Boolean getConditionstatus() {
        return this.conditionstatus;
    }

    public final Double getCubic_cap() {
        return this.cubic_cap;
    }

    public final String getDealer_cd() {
        return this.dealer_cd;
    }

    public final Integer getDept_cd() {
        return this.dept_cd;
    }

    public final Object getDlRequired() {
        return this.dlRequired;
    }

    public final Object getDlValidationRequired() {
        return this.dlValidationRequired;
    }

    public final String getDl_no() {
        return this.dl_no;
    }

    public final String getDlr_add1() {
        return this.dlr_add1;
    }

    public final String getDlr_add2() {
        return this.dlr_add2;
    }

    public final String getDlr_add3() {
        return this.dlr_add3;
    }

    public final String getDlr_city() {
        return this.dlr_city;
    }

    public final String getDlr_district() {
        return this.dlr_district;
    }

    public final String getDlr_name() {
        return this.dlr_name;
    }

    public final String getDlr_pincode() {
        return this.dlr_pincode;
    }

    public final String getEmail_id() {
        return this.email_id;
    }

    public final String getEng_no() {
        return this.eng_no;
    }

    public final Object getEng_no_original() {
        return this.eng_no_original;
    }

    public final Object getEng_no_orignal() {
        return this.eng_no_orignal;
    }

    public final String getF_name() {
        return this.f_name;
    }

    public final String getFit_upto() {
        return this.fit_upto;
    }

    public final Object getFit_uptoAsDate() {
        return this.fit_uptoAsDate;
    }

    public final Object getFit_upto_desc() {
        return this.fit_upto_desc;
    }

    public final Object getFlag() {
        return this.flag;
    }

    public final Integer getFloor_area() {
        return this.floor_area;
    }

    public final Object getFormatRegn_dt() {
        return this.formatRegn_dt;
    }

    public final Integer getFuel() {
        return this.fuel;
    }

    public final String getFuel_descr() {
        return this.fuel_descr;
    }

    public final String getGarage_add() {
        return this.garage_add;
    }

    public final Integer getGcw() {
        return this.gcw;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Double getHp() {
        return this.hp;
    }

    public final String getImported_vch() {
        return this.imported_vch;
    }

    public final String getLaser_code() {
        return this.laser_code;
    }

    public final Latestpaytaxdetails getLatesttaxdetails() {
        return this.latesttaxdetails;
    }

    public final Integer getLd_wt() {
        return this.ld_wt;
    }

    public final Integer getLength() {
        return this.length;
    }

    public final Integer getMaker() {
        return this.maker;
    }

    public final String getMaker_name() {
        return this.maker_name;
    }

    public final Integer getManu_mon() {
        return this.manu_mon;
    }

    public final Integer getManu_yr() {
        return this.manu_yr;
    }

    public final Object getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    public final Long getMobile_no() {
        return this.mobile_no;
    }

    public final String getModel_cd() {
        return this.model_cd;
    }

    public final String getModel_name() {
        return this.model_name;
    }

    public final Integer getNo_cyl() {
        return this.no_cyl;
    }

    public final Object getNo_of_axles() {
        return this.no_of_axles;
    }

    public final Integer getNorms() {
        return this.norms;
    }

    public final String getNorms_descr() {
        return this.norms_descr;
    }

    public final Object getNumberOfTyres() {
        return this.numberOfTyres;
    }

    public final Integer getOff_cd() {
        return this.off_cd;
    }

    public final String getOff_name() {
        return this.off_name;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final Integer getOther_criteria() {
        return this.other_criteria;
    }

    public final Object getOwnerCatg() {
        return this.ownerCatg;
    }

    public final OwnerIdentification getOwnerIdentification() {
        return this.ownerIdentification;
    }

    public final Integer getOwner_cd() {
        return this.owner_cd;
    }

    public final String getOwner_cd_descr() {
        return this.owner_cd_descr;
    }

    public final Integer getOwner_ctg() {
        return this.owner_ctg;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final Integer getOwner_sr() {
        return this.owner_sr;
    }

    public final String getP_add1() {
        return this.p_add1;
    }

    public final String getP_add2() {
        return this.p_add2;
    }

    public final String getP_add3() {
        return this.p_add3;
    }

    public final Integer getP_district() {
        return this.p_district;
    }

    public final String getP_district_name() {
        return this.p_district_name;
    }

    public final Integer getP_pincode() {
        return this.p_pincode;
    }

    public final String getP_state() {
        return this.p_state;
    }

    public final String getP_state_name() {
        return this.p_state_name;
    }

    public final String getPan_no() {
        return this.pan_no;
    }

    public final String getPassport_no() {
        return this.passport_no;
    }

    public final PermitDetailDto getPermitDetailDto() {
        return this.permitDetailDto;
    }

    public final Object getPermitDetailEntity() {
        return this.permitDetailEntity;
    }

    public final Object getPermit_rto_cd() {
        return this.permit_rto_cd;
    }

    public final Object getPurchase_date() {
        return this.purchase_date;
    }

    public final String getPurchase_dt() {
        return this.purchase_dt;
    }

    public final String getRation_card_no() {
        return this.ration_card_no;
    }

    public final String getRegn_dt() {
        return this.regn_dt;
    }

    public final Object getRegn_dtAsDate() {
        return this.regn_dtAsDate;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getRegn_type() {
        return this.regn_type;
    }

    public final String getRegn_type_descr() {
        return this.regn_type_descr;
    }

    public final String getRegn_upto() {
        return this.regn_upto;
    }

    public final Object getRegn_uptoAsDate() {
        return this.regn_uptoAsDate;
    }

    public final Object getReturnMessge() {
        return this.returnMessge;
    }

    public final Integer getSale_amt() {
        return this.sale_amt;
    }

    public final Integer getSeat_cap() {
        return this.seat_cap;
    }

    public final Integer getSleeper_cap() {
        return this.sleeper_cap;
    }

    public final Integer getStand_cap() {
        return this.stand_cap;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_name() {
        return this.state_name;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Object getTax_mode() {
        return this.tax_mode;
    }

    public final Object getTransport_catg() {
        return this.transport_catg;
    }

    public final Integer getUnld_wt() {
        return this.unld_wt;
    }

    public final VTHypthEntity getVTHypthEntity() {
        return this.vTHypthEntity;
    }

    public final String getVch_catg() {
        return this.vch_catg;
    }

    public final Object getVch_catg_desc() {
        return this.vch_catg_desc;
    }

    public final String getVch_purchase_as() {
        return this.vch_purchase_as;
    }

    public final Object getVch_purchase_asCode() {
        return this.vch_purchase_asCode;
    }

    public final String getVehType() {
        return this.vehType;
    }

    public final Integer getVehTypeAsInt() {
        return this.vehTypeAsInt;
    }

    public final Object getVerified_on() {
        return this.verified_on;
    }

    public final Integer getVh_class() {
        return this.vh_class;
    }

    public final String getVh_class_desc() {
        return this.vh_class_desc;
    }

    public final String getVideo_fitted() {
        return this.video_fitted;
    }

    public final String getVoter_id() {
        return this.voter_id;
    }

    public final VtInsuranceCommonDto getVtInsuranceCommonDto() {
        return this.vtInsuranceCommonDto;
    }

    public final Vtpucc getVtpucc() {
        return this.vtpucc;
    }

    public final Integer getWheelbase() {
        return this.wheelbase;
    }

    public final Integer getWidth() {
        return this.width;
    }
}
