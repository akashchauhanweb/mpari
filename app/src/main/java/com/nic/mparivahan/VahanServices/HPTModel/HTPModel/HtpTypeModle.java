package com.nic.mparivahan.VahanServices.HPTModel.HTPModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HtpTypeModle;", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModleItem;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HtpTypeModle extends ArrayList<HTPModleItem> {
    public /* bridge */ boolean contains(HTPModleItem hTPModleItem) {
        return super.contains((Object) hTPModleItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(HTPModleItem hTPModleItem) {
        return super.indexOf((Object) hTPModleItem);
    }

    public /* bridge */ int lastIndexOf(HTPModleItem hTPModleItem) {
        return super.lastIndexOf((Object) hTPModleItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ HTPModleItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ HTPModleItem removeAt(int i) {
        return (HTPModleItem) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof HTPModleItem) {
            return contains((HTPModleItem) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof HTPModleItem) {
            return indexOf((HTPModleItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof HTPModleItem) {
            return lastIndexOf((HTPModleItem) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(HTPModleItem hTPModleItem) {
        return super.remove((Object) hTPModleItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof HTPModleItem) {
            return remove((HTPModleItem) obj);
        }
        return false;
    }
}
