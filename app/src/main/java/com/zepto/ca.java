package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ca extends ba {
    public static final SparseIntArray i0;
    public final RelativeLayout e0;
    public final LinearLayout f0;
    public final LinearLayout g0;
    public long h0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.mHeader, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.txt_view_details, 7);
        sparseIntArray.put(R.id.select_service, 8);
        sparseIntArray.put(R.id.icon_image, 9);
        sparseIntArray.put(R.id.round_card_view, 10);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 11);
        sparseIntArray.put(R.id.multi_steps, 12);
        sparseIntArray.put(R.id.tv_submit_req, 13);
        sparseIntArray.put(R.id.txtAppCategory, 14);
        sparseIntArray.put(R.id.app_cat_layout, 15);
        sparseIntArray.put(R.id.spn_app_cat, 16);
        sparseIntArray.put(R.id.tv_state, 17);
        sparseIntArray.put(R.id.state, 18);
        sparseIntArray.put(R.id.tv_rto, 19);
        sparseIntArray.put(R.id.rto, 20);
        sparseIntArray.put(R.id.tv_change_addr, 21);
        sparseIntArray.put(R.id.tv_district, 22);
        sparseIntArray.put(R.id.dist_spinner, 23);
        sparseIntArray.put(R.id.tv_taluka_block, 24);
        sparseIntArray.put(R.id.spinner_taluka, 25);
        sparseIntArray.put(R.id.radio_group, 26);
        sparseIntArray.put(R.id.village, 27);
        sparseIntArray.put(R.id.town, 28);
        sparseIntArray.put(R.id.spinner_village_or_town, 29);
        sparseIntArray.put(R.id.tv_house_door_flat, 30);
        sparseIntArray.put(R.id.house_no, 31);
        sparseIntArray.put(R.id.tv_landmark, 32);
        sparseIntArray.put(R.id.landmark, 33);
        sparseIntArray.put(R.id.tv_pincode, 34);
        sparseIntArray.put(R.id.pincode, 35);
        sparseIntArray.put(R.id.submit, 36);
    }

    public ca(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 37, null, i0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.h0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.h0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.h0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ca(jd1 jd1Var, View view, Object[] objArr) {
        FrameLayout frameLayout = (FrameLayout) objArr[15];
        Spinner spinner = (Spinner) objArr[23];
        TextView textView = (TextView) objArr[6];
        EditText editText = (EditText) objArr[31];
        CardView cardView = (CardView) objArr[9];
        ImageView imageView = (ImageView) objArr[11];
        EditText editText2 = (EditText) objArr[33];
        Object obj = objArr[4];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        Object obj2 = objArr[3];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        RecyclerView recyclerView = (RecyclerView) objArr[12];
        EditText editText3 = (EditText) objArr[35];
        Object obj3 = objArr[5];
        super(jd1Var, view, 0, frameLayout, spinner, textView, editText, cardView, imageView, editText2, vy3VarA, iy3VarA, recyclerView, editText3, obj3 != null ? bs4.a((View) obj3) : null, (RadioGroup) objArr[26], (CardView) objArr[10], (TextView) objArr[20], (TextView) objArr[8], (Spinner) objArr[25], (Spinner) objArr[29], (Spinner) objArr[16], (TextView) objArr[18], (CustomWegetLayout) objArr[36], (RadioButton) objArr[28], (CheckBox) objArr[21], (TextView) objArr[22], (TextView) objArr[30], (TextView) objArr[32], (TextView) objArr[34], (AppCompatTextView) objArr[19], (AppCompatTextView) objArr[17], (TextView) objArr[13], (TextView) objArr[24], (TextView) objArr[14], (TextView) objArr[7], (RadioButton) objArr[27]);
        this.h0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.e0 = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f0 = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[2];
        this.g0 = linearLayout2;
        linearLayout2.setTag(null);
        w(view);
        x();
    }
}
