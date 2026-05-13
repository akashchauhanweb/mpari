package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class w9 extends v9 {
    public static final SparseIntArray W;
    public final LinearLayout T;
    public final LinearLayout U;
    public long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(R.id.layout, 2);
        sparseIntArray.put(R.id.dl_no_txt, 3);
        sparseIntArray.put(R.id.select_service, 4);
        sparseIntArray.put(R.id.icon_image, 5);
        sparseIntArray.put(R.id.round_card_view, 6);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 7);
        sparseIntArray.put(R.id.tv_dl_no, 8);
        sparseIntArray.put(R.id.dl_number, 9);
        sparseIntArray.put(R.id.linear_mob, 10);
        sparseIntArray.put(R.id.chassi_number, 11);
        sparseIntArray.put(R.id.mob_number, 12);
        sparseIntArray.put(R.id.linear_otp, 13);
        sparseIntArray.put(R.id.demo_top, 14);
        sparseIntArray.put(R.id.tv_otp, 15);
        sparseIntArray.put(R.id.et_otp, 16);
        sparseIntArray.put(R.id.otp_time, 17);
        sparseIntArray.put(R.id.time_text, 18);
        sparseIntArray.put(R.id.resendOtp, 19);
        sparseIntArray.put(R.id.tv_note, 20);
        sparseIntArray.put(R.id.tv_note_one, 21);
        sparseIntArray.put(R.id.tv_note_two, 22);
        sparseIntArray.put(R.id.reset_button, 23);
        sparseIntArray.put(R.id.submit, 24);
    }

    public w9(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 25, null, W));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.V = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.V != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.V = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w9(jd1 jd1Var, View view, Object[] objArr) {
        MyTextView myTextView = (MyTextView) objArr[11];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[14];
        TextView textView = (TextView) objArr[3];
        TextView textView2 = (TextView) objArr[9];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[16];
        CardView cardView = (CardView) objArr[5];
        ImageView imageView = (ImageView) objArr[7];
        Object obj = objArr[2];
        super(jd1Var, view, 0, myTextView, appCompatTextView, textView, textView2, appCompatEditText, cardView, imageView, obj != null ? vy3.a((View) obj) : null, (LinearLayout) objArr[10], (LinearLayout) objArr[13], (AppCompatEditText) objArr[12], (AppCompatTextView) objArr[17], (TextView) objArr[19], (CustomWegetLayout) objArr[23], (CardView) objArr[6], (MyTextView) objArr[4], (CustomWegetLayout) objArr[24], (com.nic.mparivahan.MyTextView) objArr[18], (MyTextView) objArr[8], (MyTextView) objArr[20], (TextView) objArr[21], (TextView) objArr[22], (AppCompatTextView) objArr[15]);
        this.V = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.T = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.U = linearLayout2;
        linearLayout2.setTag(null);
        w(view);
        x();
    }
}
