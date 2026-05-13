package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.DataOpt;

import com.zepto.sd1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0086 J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerView/DataOpt/DataHandler;", "Lcom/zepto/sd1;", "", "getPayment", "keys", "getResUrl", "data", "", "a", "b", "Ljava/lang/String;", "storedData", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public abstract class DataHandler implements sd1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public String storedData;

    static {
        System.loadLibrary("system-arch");
    }

    @Override // com.zepto.sd1
    public void a(String data) {
        this.storedData = getResUrl(data) + getPayment();
    }

    @Override // com.zepto.sd1
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getStoredData() {
        return this.storedData;
    }

    public final native String getPayment();

    public final native String getResUrl(String keys);
}
