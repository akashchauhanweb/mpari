package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/NocReasonModle;", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanModel/NocReasonModleItem;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NocReasonModle extends ArrayList<NocReasonModleItem> {
    public /* bridge */ boolean contains(NocReasonModleItem nocReasonModleItem) {
        return super.contains((Object) nocReasonModleItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(NocReasonModleItem nocReasonModleItem) {
        return super.indexOf((Object) nocReasonModleItem);
    }

    public /* bridge */ int lastIndexOf(NocReasonModleItem nocReasonModleItem) {
        return super.lastIndexOf((Object) nocReasonModleItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ NocReasonModleItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ NocReasonModleItem removeAt(int i) {
        return (NocReasonModleItem) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof NocReasonModleItem) {
            return contains((NocReasonModleItem) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof NocReasonModleItem) {
            return indexOf((NocReasonModleItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof NocReasonModleItem) {
            return lastIndexOf((NocReasonModleItem) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(NocReasonModleItem nocReasonModleItem) {
        return super.remove((Object) nocReasonModleItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof NocReasonModleItem) {
            return remove((NocReasonModleItem) obj);
        }
        return false;
    }
}
