package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class ib extends hb {
    public static final SparseIntArray L;
    public final RelativeLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.mHeader, 2);
        sparseIntArray.put(R.id.select_service, 3);
        sparseIntArray.put(R.id.round_card_view, 4);
        sparseIntArray.put(R.id.iv_image, 5);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 6);
        sparseIntArray.put(R.id.tv_cl_Details, 7);
        sparseIntArray.put(R.id.tv_view_details, 8);
        sparseIntArray.put(R.id.tv_detail_dupl_dl, 9);
        sparseIntArray.put(R.id.tv_reason, 10);
        sparseIntArray.put(R.id.dupdl_optional, 11);
        sparseIntArray.put(R.id.reset, 12);
        sparseIntArray.put(R.id.id_next_service, 13);
    }

    public ib(jd1 jd1Var, View view) {
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

    public void z() {
        synchronized (this) {
            this.K = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ib(jd1 jd1Var, View view, Object[] objArr) {
        EditText editText = (EditText) objArr[11];
        LinearLayout linearLayout = (LinearLayout) objArr[6];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[13];
        ImageView imageView = (ImageView) objArr[5];
        Object obj = objArr[2];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        Object obj2 = objArr[1];
        super(jd1Var, view, 0, editText, linearLayout, customWegetLayout, imageView, vy3VarA, obj2 != null ? iy3.a((View) obj2) : null, (CustomWegetLayout) objArr[12], (CardView) objArr[4], (MyTextView) objArr[3], (TextView) objArr[7], (MyTextView) objArr[9], (MyTextView) objArr[10], (TextView) objArr[8]);
        this.K = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.J = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        z();
    }
}
