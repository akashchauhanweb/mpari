package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class ze extends ye {
    public static final SparseIntArray K;
    public final RelativeLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.mHeader, 2);
        sparseIntArray.put(R.id.select_service, 3);
        sparseIntArray.put(R.id.tv_cl_Details, 4);
        sparseIntArray.put(R.id.tv_view_details, 5);
        sparseIntArray.put(R.id.round_card_view, 6);
        sparseIntArray.put(R.id.iv_image, 7);
        sparseIntArray.put(R.id.tv_detail_dupl_dl, 8);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 9);
        sparseIntArray.put(R.id.tv_reason, 10);
        sparseIntArray.put(R.id.id_cancel_service, 11);
        sparseIntArray.put(R.id.id_next_service, 12);
    }

    public ze(jd1 jd1Var, View view) {
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
    public ze(jd1 jd1Var, View view, Object[] objArr) {
        LinearLayout linearLayout = (LinearLayout) objArr[9];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[11];
        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) objArr[12];
        ImageView imageView = (ImageView) objArr[7];
        Object obj = objArr[2];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        Object obj2 = objArr[1];
        super(jd1Var, view, 0, linearLayout, customWegetLayout, customWegetLayout2, imageView, vy3VarA, obj2 != null ? iy3.a((View) obj2) : null, (CardView) objArr[6], (MyTextView) objArr[3], (TextView) objArr[4], (MyTextView) objArr[8], (MyTextView) objArr[10], (TextView) objArr[5]);
        this.J = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.I = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        z();
    }
}
