package com.nic.mparivahan.Dashboard.DashBoardUtils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/Dashboard/DashBoardUtils/SpanningLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$q;", "I", "Landroid/content/Context;", "c", "Landroid/util/AttributeSet;", "attrs", "J", "Landroid/view/ViewGroup$LayoutParams;", "lp", "K", "", "r", "q", "p", "", "P2", "Q2", "layoutParams", "R2", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SpanningLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        RecyclerView.q qVarI = super.I();
        Intrinsics.checkNotNullExpressionValue(qVarI, "generateDefaultLayoutParams(...)");
        RecyclerView.q qVarR2 = R2(qVarI);
        Intrinsics.checkNotNull(qVarR2);
        return qVarR2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J(Context c, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        RecyclerView.q qVarJ = super.J(c, attrs);
        Intrinsics.checkNotNullExpressionValue(qVarJ, "generateLayoutParams(...)");
        RecyclerView.q qVarR2 = R2(qVarJ);
        Intrinsics.checkNotNull(qVarR2);
        return qVarR2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(ViewGroup.LayoutParams lp) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        RecyclerView.q qVarK = super.K(lp);
        Intrinsics.checkNotNullExpressionValue(qVarK, "generateLayoutParams(...)");
        RecyclerView.q qVarR2 = R2(qVarK);
        Intrinsics.checkNotNull(qVarR2);
        return qVarR2;
    }

    public final int P2() {
        return (u0() - k0()) - j0();
    }

    public final int Q2() {
        return (b0() - h0()) - m0();
    }

    public final RecyclerView.q R2(RecyclerView.q layoutParams) {
        if (r2() == 0) {
            ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) Math.round(((double) P2()) / ((double) e()));
        } else if (r2() == 1) {
            ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) Math.round(((double) Q2()) / ((double) e()));
        }
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(RecyclerView.q lp) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        return super.r(lp);
    }
}
