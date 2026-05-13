package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class z8 extends y8 {
    public static final SparseIntArray H;
    public final LinearLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.header, 1);
        sparseIntArray.put(R.id.stateTv, 2);
        sparseIntArray.put(R.id.circle, 3);
        sparseIntArray.put(R.id.deleteAcctInfoTv, 4);
        sparseIntArray.put(R.id.circle1, 5);
        sparseIntArray.put(R.id.deleteVirtualRcDlTv, 6);
        sparseIntArray.put(R.id.circle3, 7);
        sparseIntArray.put(R.id.deleteTransactionHistoryTv, 8);
        sparseIntArray.put(R.id.deleteAccountButton, 9);
    }

    public z8(jd1 jd1Var, View view) {
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

    public void z() {
        synchronized (this) {
            this.G = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z8(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[3];
        ImageView imageView2 = (ImageView) objArr[5];
        ImageView imageView3 = (ImageView) objArr[7];
        TextView textView = (TextView) objArr[9];
        TextView textView2 = (TextView) objArr[4];
        TextView textView3 = (TextView) objArr[8];
        TextView textView4 = (TextView) objArr[6];
        Object obj = objArr[1];
        super(jd1Var, view, 0, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, obj != null ? ri5.a((View) obj) : null, (TextView) objArr[2]);
        this.G = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        w(view);
        z();
    }
}
