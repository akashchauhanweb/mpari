package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class fx extends ex {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.header_layout, 2);
        sparseIntArray.put(R.id.mvvm_back, 3);
        sparseIntArray.put(R.id.mvvm_home, 4);
        sparseIntArray.put(R.id.application_ll, 5);
        sparseIntArray.put(R.id.application_No_Tv, 6);
        sparseIntArray.put(R.id.application_sarathi_url, 7);
        sparseIntArray.put(R.id.imageView6, 8);
        sparseIntArray.put(R.id.done, 9);
    }

    public fx(jd1 jd1Var, View view) {
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
    public fx(jd1 jd1Var, View view, Object[] objArr) {
        LinearLayout linearLayout = (LinearLayout) objArr[5];
        MyTextView myTextView = (MyTextView) objArr[6];
        MyTextView myTextView2 = (MyTextView) objArr[7];
        TextView textView = (TextView) objArr[9];
        Object obj = objArr[2];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        ImageView imageView = (ImageView) objArr[8];
        Object obj2 = objArr[1];
        super(jd1Var, view, 0, linearLayout, myTextView, myTextView2, textView, vy3VarA, imageView, obj2 != null ? iy3.a((View) obj2) : null, (ImageView) objArr[3], (ImageView) objArr[4], (LinearLayout) objArr[0]);
        this.G = -1L;
        this.F.setTag(null);
        w(view);
        x();
    }
}
