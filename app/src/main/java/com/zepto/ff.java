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
public class ff extends ef {
    public static final SparseIntArray G;
    public final ConstraintLayout C;
    public final LinearLayout D;
    public final wi5 E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.paymentFeeFL, 5);
        sparseIntArray.put(R.id.shimmer_view_container, 6);
        sparseIntArray.put(R.id.reprint_rec, 7);
        sparseIntArray.put(R.id.close_iv, 8);
    }

    public ff(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 9, null, G));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.F = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ff(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[8];
        Object obj = objArr[3];
        super(jd1Var, view, 0, imageView, obj != null ? vy3.a((View) obj) : null, (FrameLayout) objArr[1], (FrameLayout) objArr[5], (WebView) objArr[7], (ShimmerFrameLayout) objArr[6]);
        this.F = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.D = linearLayout;
        linearLayout.setTag(null);
        Object obj2 = objArr[4];
        this.E = obj2 != null ? wi5.a((View) obj2) : null;
        w(view);
        z();
    }
}
