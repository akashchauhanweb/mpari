package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class x6 extends w6 {
    public static final SparseIntArray h0;
    public final RelativeLayout f0;
    public long g0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        h0 = sparseIntArray;
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
        sparseIntArray.put(R.id.id_change_dob_reason, 11);
        sparseIntArray.put(R.id.id_dupdl, 12);
        sparseIntArray.put(R.id.tv_reason_manually, 13);
        sparseIntArray.put(R.id.dupdl_optional, 14);
        sparseIntArray.put(R.id.tv_lic_detail, 15);
        sparseIntArray.put(R.id.ll_relation, 16);
        sparseIntArray.put(R.id.txt_fname, 17);
        sparseIntArray.put(R.id.txt_fname_val, 18);
        sparseIntArray.put(R.id.txt_mname, 19);
        sparseIntArray.put(R.id.txt_mname_val, 20);
        sparseIntArray.put(R.id.txt_lname, 21);
        sparseIntArray.put(R.id.txt_lname_val, 22);
        sparseIntArray.put(R.id.txt_full_name, 23);
        sparseIntArray.put(R.id.txt_full_name_val, 24);
        sparseIntArray.put(R.id.ll_details, 25);
        sparseIntArray.put(R.id.txt_relation, 26);
        sparseIntArray.put(R.id.spn_rel_Status, 27);
        sparseIntArray.put(R.id.txt_ffname, 28);
        sparseIntArray.put(R.id.txt_name_val, 29);
        sparseIntArray.put(R.id.txt_md_name, 30);
        sparseIntArray.put(R.id.txt_md_name_val, 31);
        sparseIntArray.put(R.id.txt_last_name, 32);
        sparseIntArray.put(R.id.txt_last_name_val, 33);
        sparseIntArray.put(R.id.reset, 34);
        sparseIntArray.put(R.id.id_next_service, 35);
    }

    public x6(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 36, null, h0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.g0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.g0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.g0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x6(jd1 jd1Var, View view, Object[] objArr) {
        EditText editText = (EditText) objArr[14];
        LinearLayout linearLayout = (LinearLayout) objArr[6];
        EditText editText2 = (EditText) objArr[11];
        LinearLayout linearLayout2 = (LinearLayout) objArr[12];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[35];
        ImageView imageView = (ImageView) objArr[5];
        LinearLayout linearLayout3 = (LinearLayout) objArr[25];
        LinearLayout linearLayout4 = (LinearLayout) objArr[16];
        Object obj = objArr[2];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        Object obj2 = objArr[1];
        super(jd1Var, view, 0, editText, linearLayout, editText2, linearLayout2, customWegetLayout, imageView, linearLayout3, linearLayout4, vy3VarA, obj2 != null ? iy3.a((View) obj2) : null, (CustomWegetLayout) objArr[34], (CardView) objArr[4], (MyTextView) objArr[3], (Spinner) objArr[27], (TextView) objArr[7], (MyTextView) objArr[9], (TextView) objArr[15], (MyTextView) objArr[10], (AppCompatTextView) objArr[13], (TextView) objArr[8], (TextView) objArr[28], (TextView) objArr[17], (EditText) objArr[18], (TextView) objArr[23], (EditText) objArr[24], (TextView) objArr[32], (EditText) objArr[33], (TextView) objArr[21], (EditText) objArr[22], (TextView) objArr[30], (EditText) objArr[31], (TextView) objArr[19], (EditText) objArr[20], (EditText) objArr[29], (TextView) objArr[26]);
        this.g0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        z();
    }
}
