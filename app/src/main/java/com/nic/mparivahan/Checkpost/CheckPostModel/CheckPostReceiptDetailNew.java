package com.nic.mparivahan.Checkpost.CheckPostModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptDetailNew;", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptDetailNewItem;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CheckPostReceiptDetailNew extends ArrayList<CheckPostReceiptDetailNewItem> {
    public /* bridge */ boolean contains(CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem) {
        return super.contains((Object) checkPostReceiptDetailNewItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem) {
        return super.indexOf((Object) checkPostReceiptDetailNewItem);
    }

    public /* bridge */ int lastIndexOf(CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem) {
        return super.lastIndexOf((Object) checkPostReceiptDetailNewItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ CheckPostReceiptDetailNewItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ CheckPostReceiptDetailNewItem removeAt(int i) {
        return (CheckPostReceiptDetailNewItem) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof CheckPostReceiptDetailNewItem) {
            return contains((CheckPostReceiptDetailNewItem) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof CheckPostReceiptDetailNewItem) {
            return indexOf((CheckPostReceiptDetailNewItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof CheckPostReceiptDetailNewItem) {
            return lastIndexOf((CheckPostReceiptDetailNewItem) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem) {
        return super.remove((Object) checkPostReceiptDetailNewItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof CheckPostReceiptDetailNewItem) {
            return remove((CheckPostReceiptDetailNewItem) obj);
        }
        return false;
    }
}
