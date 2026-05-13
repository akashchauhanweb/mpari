package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/SlotDateModel;", "", "color", "", "text", "", "dateSlotModel", "Lcom/nic/mparivahan/VahanServices/VahanModel/DateSlotModel;", "(ILjava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/DateSlotModel;)V", "getColor", "()I", "setColor", "(I)V", "getDateSlotModel", "()Lcom/nic/mparivahan/VahanServices/VahanModel/DateSlotModel;", "setDateSlotModel", "(Lcom/nic/mparivahan/VahanServices/VahanModel/DateSlotModel;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SlotDateModel {
    private int color;
    private DateSlotModel dateSlotModel;
    private String text;

    public SlotDateModel(int i, String text, DateSlotModel dateSlotModel) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(dateSlotModel, "dateSlotModel");
        this.color = i;
        this.text = text;
        this.dateSlotModel = dateSlotModel;
    }

    public final int getColor() {
        return this.color;
    }

    public final DateSlotModel getDateSlotModel() {
        return this.dateSlotModel;
    }

    public final String getText() {
        return this.text;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setDateSlotModel(DateSlotModel dateSlotModel) {
        this.dateSlotModel = dateSlotModel;
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }
}
