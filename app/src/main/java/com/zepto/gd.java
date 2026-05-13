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
public class gd extends fd {
    public static final SparseIntArray I;
    public final ConstraintLayout E;
    public final LinearLayout F;
    public final wi5 G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.header_layout, 4);
        sparseIntArray.put(R.id.paymentFeeFL, 6);
        sparseIntArray.put(R.id.shimmer_view_container, 7);
        sparseIntArray.put(R.id.paymentWv, 8);
        sparseIntArray.put(R.id.paymentFeeWv, 9);
        sparseIntArray.put(R.id.close_iv, 10);
    }

    public gd(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 11, null, I));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.H = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.H = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gd(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[10];
        Object obj = objArr[4];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        FrameLayout frameLayout = (FrameLayout) objArr[1];
        Object obj2 = objArr[3];
        super(jd1Var, view, 0, imageView, vy3VarA, frameLayout, obj2 != null ? iy3.a((View) obj2) : null, (FrameLayout) objArr[6], (WebView) objArr[9], (WebView) objArr[8], (ShimmerFrameLayout) objArr[7]);
        this.H = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.F = linearLayout;
        linearLayout.setTag(null);
        Object obj3 = objArr[5];
        this.G = obj3 != null ? wi5.a((View) obj3) : null;
        w(view);
        z();
    }
}
