package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class z6 extends y6 {
    public static final SparseIntArray d0;
    public final RelativeLayout b0;
    public long c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.mHeader, 2);
        sparseIntArray.put(R.id.select_service, 3);
        sparseIntArray.put(R.id.round_card_view, 4);
        sparseIntArray.put(R.id.iv_image, 5);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 6);
        sparseIntArray.put(R.id.tv_ll_Details, 7);
        sparseIntArray.put(R.id.tv_view_details, 8);
        sparseIntArray.put(R.id.tv_reason, 9);
        sparseIntArray.put(R.id.id_change_dob_reason, 10);
        sparseIntArray.put(R.id.tv_lic_detail, 11);
        sparseIntArray.put(R.id.ll_relation, 12);
        sparseIntArray.put(R.id.txt_fname, 13);
        sparseIntArray.put(R.id.txt_fname_val, 14);
        sparseIntArray.put(R.id.txt_mname, 15);
        sparseIntArray.put(R.id.txt_mname_val, 16);
        sparseIntArray.put(R.id.txt_lname, 17);
        sparseIntArray.put(R.id.txt_lname_val, 18);
        sparseIntArray.put(R.id.txt_full_name, 19);
        sparseIntArray.put(R.id.txt_full_name_val, 20);
        sparseIntArray.put(R.id.ll_details, 21);
        sparseIntArray.put(R.id.txt_relation, 22);
        sparseIntArray.put(R.id.spn_rel_Status, 23);
        sparseIntArray.put(R.id.txt_ffname, 24);
        sparseIntArray.put(R.id.txt_name_val, 25);
        sparseIntArray.put(R.id.txt_md_name, 26);
        sparseIntArray.put(R.id.txt_md_name_val, 27);
        sparseIntArray.put(R.id.txt_last_name, 28);
        sparseIntArray.put(R.id.txt_last_name_val, 29);
        sparseIntArray.put(R.id.reset, 30);
        sparseIntArray.put(R.id.id_next_service, 31);
    }

    public z6(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 32, null, d0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.c0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.c0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.c0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z6(jd1 jd1Var, View view, Object[] objArr) {
        LinearLayout linearLayout = (LinearLayout) objArr[6];
        EditText editText = (EditText) objArr[10];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[31];
        ImageView imageView = (ImageView) objArr[5];
        LinearLayout linearLayout2 = (LinearLayout) objArr[21];
        LinearLayout linearLayout3 = (LinearLayout) objArr[12];
        Object obj = objArr[2];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        Object obj2 = objArr[1];
        super(jd1Var, view, 0, linearLayout, editText, customWegetLayout, imageView, linearLayout2, linearLayout3, vy3VarA, obj2 != null ? iy3.a((View) obj2) : null, (CustomWegetLayout) objArr[30], (CardView) objArr[4], (MyTextView) objArr[3], (Spinner) objArr[23], (TextView) objArr[11], (TextView) objArr[7], (MyTextView) objArr[9], (TextView) objArr[8], (TextView) objArr[24], (TextView) objArr[13], (EditText) objArr[14], (TextView) objArr[19], (EditText) objArr[20], (TextView) objArr[28], (EditText) objArr[29], (TextView) objArr[17], (EditText) objArr[18], (TextView) objArr[26], (EditText) objArr[27], (TextView) objArr[15], (EditText) objArr[16], (EditText) objArr[25], (TextView) objArr[22]);
        this.c0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.b0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        z();
    }
}
