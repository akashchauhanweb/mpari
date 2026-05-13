package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class ab extends za {
    public static final SparseIntArray L;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 1);
        sparseIntArray.put(R.id.dl_details_title, 2);
        sparseIntArray.put(R.id.dl_details_checked, 3);
        sparseIntArray.put(R.id.view, 4);
        sparseIntArray.put(R.id.dl_details_unchecked1, 5);
        sparseIntArray.put(R.id.view2, 6);
        sparseIntArray.put(R.id.dl_details_unchecked2, 7);
        sparseIntArray.put(R.id.dl_details_tv, 8);
        sparseIntArray.put(R.id.textView5, 9);
        sparseIntArray.put(R.id.acknowledgemnet_tv, 10);
        sparseIntArray.put(R.id.center_ll, 11);
        sparseIntArray.put(R.id.notes, 12);
        sparseIntArray.put(R.id.save_continue_to_next, 13);
    }

    public ab(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 14, null, L));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.K = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ab(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[10];
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[11];
        ImageView imageView = (ImageView) objArr[3];
        MyTextView myTextView = (MyTextView) objArr[2];
        TextView textView2 = (TextView) objArr[8];
        ImageView imageView2 = (ImageView) objArr[5];
        ImageView imageView3 = (ImageView) objArr[7];
        Object obj = objArr[1];
        super(jd1Var, view, 0, textView, nestedScrollView, imageView, myTextView, textView2, imageView2, imageView3, obj != null ? vy3.a((View) obj) : null, (MyTextView) objArr[12], (LinearLayout) objArr[13], (LinearLayout) objArr[0], (TextView) objArr[9], (View) objArr[4], (View) objArr[6]);
        this.K = -1L;
        this.G.setTag(null);
        w(view);
        x();
    }
}
