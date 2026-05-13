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
public class ea extends da {
    public static final SparseIntArray J;
    public final ConstraintLayout F;
    public final LinearLayout G;
    public final wi5 H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 4);
        sparseIntArray.put(R.id.header_layout, 5);
        sparseIntArray.put(R.id.paymentFeeFL, 7);
        sparseIntArray.put(R.id.shimmer_view_container, 8);
        sparseIntArray.put(R.id.paymentWv, 9);
        sparseIntArray.put(R.id.paymentFeeWv, 10);
        sparseIntArray.put(R.id.close_iv, 11);
    }

    public ea(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 12, null, J));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.I = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ea(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[11];
        Object obj = objArr[5];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        FrameLayout frameLayout = (FrameLayout) objArr[2];
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        Object obj2 = objArr[4];
        super(jd1Var, view, 0, imageView, vy3VarA, frameLayout, linearLayout, obj2 != null ? iy3.a((View) obj2) : null, (FrameLayout) objArr[7], (WebView) objArr[10], (WebView) objArr[9], (ShimmerFrameLayout) objArr[8]);
        this.I = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[3];
        this.G = linearLayout2;
        linearLayout2.setTag(null);
        Object obj3 = objArr[6];
        this.H = obj3 != null ? wi5.a((View) obj3) : null;
        w(view);
        x();
    }
}
