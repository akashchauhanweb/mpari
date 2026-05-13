package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class ne6 extends me6 {
    public static final SparseIntArray l0;
    public final CoordinatorLayout h0;
    public final LinearLayout i0;
    public final as4 j0;
    public long k0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        l0 = sparseIntArray;
        sparseIntArray.put(R.id.parent_layout, 3);
        sparseIntArray.put(R.id.mvvm_back, 4);
        sparseIntArray.put(R.id.ll_home, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.select_service_name, 7);
        sparseIntArray.put(R.id.icon_image, 8);
        sparseIntArray.put(R.id.round_card_view, 9);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 10);
        sparseIntArray.put(R.id.app_arrow_up, 11);
        sparseIntArray.put(R.id.app_arrow_down, 12);
        sparseIntArray.put(R.id.ll_bottom_design, 13);
        sparseIntArray.put(R.id.application_number, 14);
        sparseIntArray.put(R.id.application_date, 15);
        sparseIntArray.put(R.id.applicatn_name, 16);
        sparseIntArray.put(R.id.relation_name, 17);
        sparseIntArray.put(R.id.fathers_name, 18);
        sparseIntArray.put(R.id.date_of_birth, 19);
        sparseIntArray.put(R.id.rto_name, 20);
        sparseIntArray.put(R.id.app_ins_arrow_up, 21);
        sparseIntArray.put(R.id.app_ins_arrow_down, 22);
        sparseIntArray.put(R.id.ll_instructions, 23);
        sparseIntArray.put(R.id.spec_arrow_up, 24);
        sparseIntArray.put(R.id.spec_arrow_down, 25);
        sparseIntArray.put(R.id.ll_specifications, 26);
        sparseIntArray.put(R.id.app_photo_arrow_up, 27);
        sparseIntArray.put(R.id.app_photo_arrow_down, 28);
        sparseIntArray.put(R.id.ll_photo, 29);
        sparseIntArray.put(R.id.image_name, 30);
        sparseIntArray.put(R.id.image_browse, 31);
        sparseIntArray.put(R.id.signature_name, 32);
        sparseIntArray.put(R.id.signature_browse, 33);
        sparseIntArray.put(R.id.capture_button, 34);
        sparseIntArray.put(R.id.browse_button, 35);
        sparseIntArray.put(R.id.upload_image, 36);
        sparseIntArray.put(R.id.signature_image, 37);
        sparseIntArray.put(R.id.upload_photos_and_sign, 38);
        sparseIntArray.put(R.id.skipped, 39);
    }

    public ne6(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 40, null, l0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.k0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.k0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.k0 = 1L;
        }
        u();
    }

    public ne6(jd1 jd1Var, View view, Object[] objArr) {
        super(jd1Var, view, 0, (ImageView) objArr[12], (ImageView) objArr[11], (ImageView) objArr[22], (ImageView) objArr[21], (ImageView) objArr[28], (ImageView) objArr[27], (TextView) objArr[15], (TextView) objArr[14], (TextView) objArr[16], (LinearLayout) objArr[35], (LinearLayout) objArr[34], (TextView) objArr[19], (TextView) objArr[6], (TextView) objArr[18], (CardView) objArr[8], (TextView) objArr[31], (TextView) objArr[30], (ImageView) objArr[10], (LinearLayout) objArr[13], (LinearLayout) objArr[5], (LinearLayout) objArr[23], (LinearLayout) objArr[29], (LinearLayout) objArr[26], (ImageView) objArr[4], (LinearLayout) objArr[3], (AppCompatTextView) objArr[17], (CardView) objArr[9], (TextView) objArr[20], (MyTextView) objArr[7], (TextView) objArr[33], (ImageView) objArr[37], (TextView) objArr[32], (CustomWegetLayout) objArr[39], (ImageView) objArr[25], (ImageView) objArr[24], (ImageView) objArr[36], (CustomWegetLayout) objArr[38]);
        this.k0 = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.h0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.i0 = linearLayout;
        linearLayout.setTag(null);
        Object obj = objArr[2];
        this.j0 = obj != null ? as4.a((View) obj) : null;
        w(view);
        x();
    }
}
