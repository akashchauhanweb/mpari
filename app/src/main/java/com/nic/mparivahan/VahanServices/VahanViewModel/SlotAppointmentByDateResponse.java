package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanViewModel/SlotAppointmentByDateResponse;", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanViewModel/SlotAppointmentModel;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SlotAppointmentByDateResponse extends ArrayList<SlotAppointmentModel> {
    public /* bridge */ boolean contains(SlotAppointmentModel slotAppointmentModel) {
        return super.contains((Object) slotAppointmentModel);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(SlotAppointmentModel slotAppointmentModel) {
        return super.indexOf((Object) slotAppointmentModel);
    }

    public /* bridge */ int lastIndexOf(SlotAppointmentModel slotAppointmentModel) {
        return super.lastIndexOf((Object) slotAppointmentModel);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ SlotAppointmentModel remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ SlotAppointmentModel removeAt(int i) {
        return (SlotAppointmentModel) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SlotAppointmentModel) {
            return contains((SlotAppointmentModel) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof SlotAppointmentModel) {
            return indexOf((SlotAppointmentModel) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof SlotAppointmentModel) {
            return lastIndexOf((SlotAppointmentModel) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(SlotAppointmentModel slotAppointmentModel) {
        return super.remove((Object) slotAppointmentModel);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof SlotAppointmentModel) {
            return remove((SlotAppointmentModel) obj);
        }
        return false;
    }
}
