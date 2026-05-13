package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zepto.gz4;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int a;
    public final int b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = getResources().getDimensionPixelOffset(gz4.b);
        this.b = getResources().getDimensionPixelOffset(gz4.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.a * 2), this.b), 1073741824), i2);
    }
}
