package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class rd6 extends qd6 {
    public static final SparseIntArray H;
    public final ConstraintLayout D;
    public final LinearLayout E;
    public final wi5 F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.paymentFeeFL, 5);
        sparseIntArray.put(R.id.shimmer_view_container, 6);
        sparseIntArray.put(R.id.paymentWv, 7);
        sparseIntArray.put(R.id.paymentFeeWv, 8);
        sparseIntArray.put(R.id.close_iv, 9);
    }

    public rd6(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 10, null, H));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.G = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rd6(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[9];
        Object obj = objArr[3];
        super(jd1Var, view, 0, imageView, obj != null ? vy3.a((View) obj) : null, (FrameLayout) objArr[1], (FrameLayout) objArr[5], (WebView) objArr[8], (WebView) objArr[7], (ShimmerFrameLayout) objArr[6]);
        this.G = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.E = linearLayout;
        linearLayout.setTag(null);
        Object obj2 = objArr[4];
        this.F = obj2 != null ? wi5.a((View) obj2) : null;
        w(view);
        x();
    }
}
