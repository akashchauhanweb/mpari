package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/nic/mparivahan/Citizen/Models/ReverseModle;", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Citizen/Models/ReverseModleItem;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReverseModle extends ArrayList<ReverseModleItem> {
    public /* bridge */ boolean contains(ReverseModleItem reverseModleItem) {
        return super.contains((Object) reverseModleItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(ReverseModleItem reverseModleItem) {
        return super.indexOf((Object) reverseModleItem);
    }

    public /* bridge */ int lastIndexOf(ReverseModleItem reverseModleItem) {
        return super.lastIndexOf((Object) reverseModleItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ ReverseModleItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ ReverseModleItem removeAt(int i) {
        return (ReverseModleItem) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ReverseModleItem) {
            return contains((ReverseModleItem) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ReverseModleItem) {
            return indexOf((ReverseModleItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ReverseModleItem) {
            return lastIndexOf((ReverseModleItem) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(ReverseModleItem reverseModleItem) {
        return super.remove((Object) reverseModleItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ReverseModleItem) {
            return remove((ReverseModleItem) obj);
        }
        return false;
    }
}
