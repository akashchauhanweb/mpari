package com.nic.mparivahan.dlservices.ui.slots.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/slots/calendar/ExpandableHeightGridView;", "Landroid/widget/GridView;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "", "a", "Z", "isExpanded", "()Z", "setExpanded", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ExpandableHeightGridView extends GridView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isExpanded;

    public ExpandableHeightGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.isExpanded) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(16777215, IntCompanionObject.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }
}
