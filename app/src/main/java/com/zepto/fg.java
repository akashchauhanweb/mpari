package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class fg extends eg {
    public static final SparseIntArray K;
    public final RelativeLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.select_service, 2);
        sparseIntArray.put(R.id.tv_cl_Details, 3);
        sparseIntArray.put(R.id.round_card_view, 4);
        sparseIntArray.put(R.id.iv_image, 5);
        sparseIntArray.put(R.id.services_text, 6);
        sparseIntArray.put(R.id.chk_renewal_cl, 7);
        sparseIntArray.put(R.id.chk_coa_cl, 8);
        sparseIntArray.put(R.id.chk_duplicate_cl, 9);
        sparseIntArray.put(R.id.chk_name_cl, 10);
        sparseIntArray.put(R.id.save_screen, 11);
        sparseIntArray.put(R.id.save_continue_to_next, 12);
    }

    public fg(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 13, null, K));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.J = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fg(jd1 jd1Var, View view, Object[] objArr) {
        CheckBox checkBox = (CheckBox) objArr[8];
        CheckBox checkBox2 = (CheckBox) objArr[9];
        CheckBox checkBox3 = (CheckBox) objArr[10];
        CheckBox checkBox4 = (CheckBox) objArr[7];
        ImageView imageView = (ImageView) objArr[5];
        Object obj = objArr[1];
        super(jd1Var, view, 0, checkBox, checkBox2, checkBox3, checkBox4, imageView, obj != null ? vy3.a((View) obj) : null, (CardView) objArr[4], (CustomWegetLayout) objArr[12], (CustomWegetLayout) objArr[11], (MyTextView) objArr[2], (TextView) objArr[6], (TextView) objArr[3]);
        this.J = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.I = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        z();
    }
}
