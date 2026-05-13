package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zepto.lg6;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    public static final int[] a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        lg6 lg6VarU = lg6.u(context, attributeSet, a);
        setBackgroundDrawable(lg6VarU.g(0));
        lg6VarU.w();
    }
}
