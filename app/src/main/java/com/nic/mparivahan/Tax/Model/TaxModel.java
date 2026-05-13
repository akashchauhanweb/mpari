package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import com.zepto.wb0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/TaxModel;", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Tax/Model/TaxModel$a;", "Lkotlin/collections/ArrayList;", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TaxModel extends ArrayList<a> {

    public static final class a {
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        return false;
    }

    public /* bridge */ a removeAt(int i) {
        wb0.a(super.remove(i));
        return null;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(a aVar) {
        return super.contains((Object) aVar);
    }

    public /* bridge */ int indexOf(a aVar) {
        return super.indexOf((Object) aVar);
    }

    public /* bridge */ int lastIndexOf(a aVar) {
        return super.lastIndexOf((Object) aVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ a remove(int i) {
        removeAt(i);
        return null;
    }

    public /* bridge */ boolean remove(a aVar) {
        return super.remove((Object) aVar);
    }
}
