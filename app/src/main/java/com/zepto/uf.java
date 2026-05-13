package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class uf extends tf {
    public static final SparseIntArray P;
    public final RelativeLayout L;
    public final LinearLayout M;
    public final bs4 N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 2);
        sparseIntArray.put(R.id.dl_no_txt, 4);
        sparseIntArray.put(R.id.select_service, 5);
        sparseIntArray.put(R.id.icon_image, 6);
        sparseIntArray.put(R.id.round_card_view, 7);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 8);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 9);
        sparseIntArray.put(R.id.tv_old_mob_no, 10);
        sparseIntArray.put(R.id.old_mob_number, 11);
        sparseIntArray.put(R.id.tv_new_mob_no, 12);
        sparseIntArray.put(R.id.new_mob_number, 13);
        sparseIntArray.put(R.id.tv_remark_reason, 14);
        sparseIntArray.put(R.id.remark_reason_et, 15);
        sparseIntArray.put(R.id.cancel_cwl, 16);
        sparseIntArray.put(R.id.submit_cwl, 17);
    }

    public uf(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 18, null, P));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.O = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.O = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uf(jd1 jd1Var, View view, Object[] objArr) {
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[16];
        TextView textView = (TextView) objArr[4];
        LinearLayout linearLayout = (LinearLayout) objArr[9];
        CardView cardView = (CardView) objArr[6];
        ImageView imageView = (ImageView) objArr[8];
        Object obj = objArr[2];
        super(jd1Var, view, 0, customWegetLayout, textView, linearLayout, cardView, imageView, obj != null ? vy3.a((View) obj) : null, (AppCompatEditText) objArr[13], (AppCompatEditText) objArr[11], (EditText) objArr[15], (CardView) objArr[7], (MyTextView) objArr[5], (CustomWegetLayout) objArr[17], (MyTextView) objArr[12], (MyTextView) objArr[10], (AppCompatTextView) objArr[14]);
        this.O = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.L = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.M = linearLayout2;
        linearLayout2.setTag(null);
        Object obj2 = objArr[3];
        this.N = obj2 != null ? bs4.a((View) obj2) : null;
        w(view);
        x();
    }
}
