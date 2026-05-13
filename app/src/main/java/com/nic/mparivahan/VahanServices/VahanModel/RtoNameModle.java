package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/RtoNameModle;", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanModel/RtoNameModleItem;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RtoNameModle extends ArrayList<RtoNameModleItem> {
    public /* bridge */ boolean contains(RtoNameModleItem rtoNameModleItem) {
        return super.contains((Object) rtoNameModleItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(RtoNameModleItem rtoNameModleItem) {
        return super.indexOf((Object) rtoNameModleItem);
    }

    public /* bridge */ int lastIndexOf(RtoNameModleItem rtoNameModleItem) {
        return super.lastIndexOf((Object) rtoNameModleItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ RtoNameModleItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ RtoNameModleItem removeAt(int i) {
        return (RtoNameModleItem) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof RtoNameModleItem) {
            return contains((RtoNameModleItem) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof RtoNameModleItem) {
            return indexOf((RtoNameModleItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof RtoNameModleItem) {
            return lastIndexOf((RtoNameModleItem) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(RtoNameModleItem rtoNameModleItem) {
        return super.remove((Object) rtoNameModleItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof RtoNameModleItem) {
            return remove((RtoNameModleItem) obj);
        }
        return false;
    }
}
