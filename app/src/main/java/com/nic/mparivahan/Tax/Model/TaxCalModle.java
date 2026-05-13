package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/TaxCalModle;", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Tax/Model/TaxCalModleItem;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TaxCalModle extends ArrayList<TaxCalModleItem> {
    public /* bridge */ boolean contains(TaxCalModleItem taxCalModleItem) {
        return super.contains((Object) taxCalModleItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(TaxCalModleItem taxCalModleItem) {
        return super.indexOf((Object) taxCalModleItem);
    }

    public /* bridge */ int lastIndexOf(TaxCalModleItem taxCalModleItem) {
        return super.lastIndexOf((Object) taxCalModleItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ TaxCalModleItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ TaxCalModleItem removeAt(int i) {
        return (TaxCalModleItem) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof TaxCalModleItem) {
            return contains((TaxCalModleItem) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof TaxCalModleItem) {
            return indexOf((TaxCalModleItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof TaxCalModleItem) {
            return lastIndexOf((TaxCalModleItem) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(TaxCalModleItem taxCalModleItem) {
        return super.remove((Object) taxCalModleItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof TaxCalModleItem) {
            return remove((TaxCalModleItem) obj);
        }
        return false;
    }
}
