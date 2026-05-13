package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class kb extends jb {
    public static final SparseIntArray e0;
    public final RelativeLayout b0;
    public final LinearLayout c0;
    public long d0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 3);
        sparseIntArray.put(R.id.multi_head, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.txt_view_details, 7);
        sparseIntArray.put(R.id.select_service, 8);
        sparseIntArray.put(R.id.icon_image, 9);
        sparseIntArray.put(R.id.round_card_view, 10);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 11);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 12);
        sparseIntArray.put(R.id.tv_detail_dupl_dl, 13);
        sparseIntArray.put(R.id.multi_steps, 14);
        sparseIntArray.put(R.id.txtAppCategory, 15);
        sparseIntArray.put(R.id.app_cat_layout, 16);
        sparseIntArray.put(R.id.spn_app_cat, 17);
        sparseIntArray.put(R.id.tv_reason, 18);
        sparseIntArray.put(R.id.id_dupdl_reason, 19);
        sparseIntArray.put(R.id.id_dupdl, 20);
        sparseIntArray.put(R.id.tv_reason_manually, 21);
        sparseIntArray.put(R.id.dupdl_optional, 22);
        sparseIntArray.put(R.id.donate_layout, 23);
        sparseIntArray.put(R.id.tv_note_organ_donate, 24);
        sparseIntArray.put(R.id.willing_to_donate, 25);
        sparseIntArray.put(R.id.not_willing_to_donate, 26);
        sparseIntArray.put(R.id.org_mob_number, 27);
        sparseIntArray.put(R.id.id_dupdl_summit, 28);
        sparseIntArray.put(R.id.id_dupdl_cancle, 29);
        sparseIntArray.put(R.id.tv_cancel, 30);
        sparseIntArray.put(R.id.reset, 31);
        sparseIntArray.put(R.id.id_next_service, 32);
    }

    public kb(jd1 jd1Var, View view) {
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
    public kb(jd1 jd1Var, View view, Object[] objArr) {
        FrameLayout frameLayout = (FrameLayout) objArr[16];
        TextView textView = (TextView) objArr[6];
        LinearLayout linearLayout = (LinearLayout) objArr[23];
        EditText editText = (EditText) objArr[22];
        LinearLayout linearLayout2 = (LinearLayout) objArr[12];
        CardView cardView = (CardView) objArr[9];
        LinearLayout linearLayout3 = (LinearLayout) objArr[20];
        LinearLayout linearLayout4 = (LinearLayout) objArr[29];
        EditText editText2 = (EditText) objArr[19];
        LinearLayout linearLayout5 = (LinearLayout) objArr[28];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[32];
        ImageView imageView = (ImageView) objArr[11];
        Object obj = objArr[3];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        LinearLayout linearLayout6 = (LinearLayout) objArr[1];
        Object obj2 = objArr[4];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        RecyclerView recyclerView = (RecyclerView) objArr[14];
        RadioButton radioButton = (RadioButton) objArr[26];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[27];
        Object obj3 = objArr[5];
        super(jd1Var, view, 0, frameLayout, textView, linearLayout, editText, linearLayout2, cardView, linearLayout3, linearLayout4, editText2, linearLayout5, customWegetLayout, imageView, vy3VarA, linearLayout6, iy3VarA, recyclerView, radioButton, appCompatEditText, obj3 != null ? bs4.a((View) obj3) : null, (CustomWegetLayout) objArr[31], (CardView) objArr[10], (MyTextView) objArr[8], (Spinner) objArr[17], (TextView) objArr[30], (MyTextView) objArr[13], (MyTextView) objArr[24], (MyTextView) objArr[18], (AppCompatTextView) objArr[21], (MyTextView) objArr[15], (TextView) objArr[7], (RadioButton) objArr[25]);
        this.d0 = -1L;
        this.J.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.b0 = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout7 = (LinearLayout) objArr[2];
        this.c0 = linearLayout7;
        linearLayout7.setTag(null);
        w(view);
        x();
    }
}
