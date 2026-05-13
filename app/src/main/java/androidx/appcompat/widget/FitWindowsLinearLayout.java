package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zepto.id2;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {
    public id2 a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        id2 id2Var = this.a;
        if (id2Var != null) {
            id2Var.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(id2 id2Var) {
    }
}
