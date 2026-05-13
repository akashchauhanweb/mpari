package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DRcModle/DReasonResponse;", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/DRcModle/DReasonResponseItem;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DReasonResponse extends ArrayList<DReasonResponseItem> {
    public /* bridge */ boolean contains(DReasonResponseItem dReasonResponseItem) {
        return super.contains((Object) dReasonResponseItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(DReasonResponseItem dReasonResponseItem) {
        return super.indexOf((Object) dReasonResponseItem);
    }

    public /* bridge */ int lastIndexOf(DReasonResponseItem dReasonResponseItem) {
        return super.lastIndexOf((Object) dReasonResponseItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ DReasonResponseItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ DReasonResponseItem removeAt(int i) {
        return (DReasonResponseItem) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof DReasonResponseItem) {
            return contains((DReasonResponseItem) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof DReasonResponseItem) {
            return indexOf((DReasonResponseItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof DReasonResponseItem) {
            return lastIndexOf((DReasonResponseItem) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(DReasonResponseItem dReasonResponseItem) {
        return super.remove((Object) dReasonResponseItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof DReasonResponseItem) {
            return remove((DReasonResponseItem) obj);
        }
        return false;
    }
}
