package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class ac extends zb {
    public static final SparseIntArray e0;
    public final RelativeLayout b0;
    public final LinearLayout c0;
    public long d0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.mHeader, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.txt_view_details, 7);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 8);
        sparseIntArray.put(R.id.tv_detail_dupl_dl, 9);
        sparseIntArray.put(R.id.multi_steps, 10);
        sparseIntArray.put(R.id.txtAppCategory, 11);
        sparseIntArray.put(R.id.app_cat_layout, 12);
        sparseIntArray.put(R.id.spn_app_cat, 13);
        sparseIntArray.put(R.id.txt_certificate, 14);
        sparseIntArray.put(R.id.certificate_number, 15);
        sparseIntArray.put(R.id.txt_issue_date, 16);
        sparseIntArray.put(R.id.txt_issue_date_val, 17);
        sparseIntArray.put(R.id.txt_valid_from, 18);
        sparseIntArray.put(R.id.txt_valid_from_val, 19);
        sparseIntArray.put(R.id.txt_valid_upto, 20);
        sparseIntArray.put(R.id.txt_valid_to, 21);
        sparseIntArray.put(R.id.tv_reason, 22);
        sparseIntArray.put(R.id.id_issued_by, 23);
        sparseIntArray.put(R.id.donate_layout, 24);
        sparseIntArray.put(R.id.tv_note_organ_donate, 25);
        sparseIntArray.put(R.id.willing_to_donate, 26);
        sparseIntArray.put(R.id.not_willing_to_donate, 27);
        sparseIntArray.put(R.id.org_mob_number, 28);
        sparseIntArray.put(R.id.id_dupdl_summit, 29);
        sparseIntArray.put(R.id.id_dupdl_cancle, 30);
        sparseIntArray.put(R.id.tv_cancel, 31);
        sparseIntArray.put(R.id.id_next_service, 32);
    }

    public ac(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 33, null, e0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.d0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.d0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.d0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ac(jd1 jd1Var, View view, Object[] objArr) {
        FrameLayout frameLayout = (FrameLayout) objArr[12];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[15];
        TextView textView = (TextView) objArr[6];
        LinearLayout linearLayout = (LinearLayout) objArr[24];
        LinearLayout linearLayout2 = (LinearLayout) objArr[8];
        LinearLayout linearLayout3 = (LinearLayout) objArr[30];
        LinearLayout linearLayout4 = (LinearLayout) objArr[29];
        Spinner spinner = (Spinner) objArr[23];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[32];
        Object obj = objArr[4];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        LinearLayout linearLayout5 = (LinearLayout) objArr[1];
        Object obj2 = objArr[3];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        RecyclerView recyclerView = (RecyclerView) objArr[10];
        RadioButton radioButton = (RadioButton) objArr[27];
        AppCompatEditText appCompatEditText2 = (AppCompatEditText) objArr[28];
        Object obj3 = objArr[5];
        super(jd1Var, view, 0, frameLayout, appCompatEditText, textView, linearLayout, linearLayout2, linearLayout3, linearLayout4, spinner, customWegetLayout, vy3VarA, linearLayout5, iy3VarA, recyclerView, radioButton, appCompatEditText2, obj3 != null ? bs4.a((View) obj3) : null, (Spinner) objArr[13], (CustomWegetLayout) objArr[31], (MyTextView) objArr[9], (MyTextView) objArr[25], (AppCompatTextView) objArr[22], (MyTextView) objArr[11], (MyTextView) objArr[14], (MyTextView) objArr[16], (TextView) objArr[17], (MyTextView) objArr[18], (AppCompatEditText) objArr[19], (TextView) objArr[21], (MyTextView) objArr[20], (TextView) objArr[7], (RadioButton) objArr[26]);
        this.d0 = -1L;
        this.G.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.b0 = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout6 = (LinearLayout) objArr[2];
        this.c0 = linearLayout6;
        linearLayout6.setTag(null);
        w(view);
        x();
    }
}
