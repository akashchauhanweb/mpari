package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class p8 extends o8 {
    public static final SparseIntArray Y;
    public final CoordinatorLayout T;
    public final LinearLayout U;
    public final LinearLayout V;
    public final bs4 W;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(R.id.txtservicename, 3);
        sparseIntArray.put(R.id.select_service, 5);
        sparseIntArray.put(R.id.tv_renewal_dl_title, 6);
        sparseIntArray.put(R.id.ll_personal_details, 7);
        sparseIntArray.put(R.id.txt_new_mobile, 8);
        sparseIntArray.put(R.id.edit_new_mobile, 9);
        sparseIntArray.put(R.id.confirm_mob_text, 10);
        sparseIntArray.put(R.id.confirm_mob, 11);
        sparseIntArray.put(R.id.mob_reason, 12);
        sparseIntArray.put(R.id.mob_reason_edit, 13);
        sparseIntArray.put(R.id.dl_personal_info_linear, 14);
        sparseIntArray.put(R.id.tv_dl_hol_name, 15);
        sparseIntArray.put(R.id.dl_holder_name, 16);
        sparseIntArray.put(R.id.tv_son_daugh_wife, 17);
        sparseIntArray.put(R.id.holder_father_name, 18);
        sparseIntArray.put(R.id.tv_dl_dob, 19);
        sparseIntArray.put(R.id.dl_dob, 20);
        sparseIntArray.put(R.id.tv_dl_blood_group, 21);
        sparseIntArray.put(R.id.blood_group, 22);
        sparseIntArray.put(R.id.tv_present_addr, 23);
        sparseIntArray.put(R.id.present_address_txt, 24);
        sparseIntArray.put(R.id.close_request, 25);
        sparseIntArray.put(R.id.next_request, 26);
    }

    public p8(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 27, null, Y));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.X = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.X != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.X = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p8(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[22];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[25];
        EditText editText = (EditText) objArr[11];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[10];
        TextView textView2 = (TextView) objArr[20];
        TextView textView3 = (TextView) objArr[16];
        LinearLayout linearLayout = (LinearLayout) objArr[14];
        EditText editText2 = (EditText) objArr[9];
        TextView textView4 = (TextView) objArr[18];
        LinearLayout linearLayout2 = (LinearLayout) objArr[7];
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[12];
        EditText editText3 = (EditText) objArr[13];
        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) objArr[26];
        TextView textView5 = (TextView) objArr[24];
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) objArr[5];
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) objArr[21];
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) objArr[19];
        AppCompatTextView appCompatTextView6 = (AppCompatTextView) objArr[15];
        AppCompatTextView appCompatTextView7 = (AppCompatTextView) objArr[23];
        AppCompatTextView appCompatTextView8 = (AppCompatTextView) objArr[6];
        AppCompatTextView appCompatTextView9 = (AppCompatTextView) objArr[17];
        AppCompatTextView appCompatTextView10 = (AppCompatTextView) objArr[8];
        Object obj = objArr[3];
        super(jd1Var, view, 0, textView, customWegetLayout, editText, appCompatTextView, textView2, textView3, linearLayout, editText2, textView4, linearLayout2, appCompatTextView2, editText3, customWegetLayout2, textView5, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, obj != null ? vy3.a((View) obj) : null);
        this.X = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.T = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[1];
        this.U = linearLayout3;
        linearLayout3.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[2];
        this.V = linearLayout4;
        linearLayout4.setTag(null);
        Object obj2 = objArr[4];
        this.W = obj2 != null ? bs4.a((View) obj2) : null;
        w(view);
        z();
    }
}
