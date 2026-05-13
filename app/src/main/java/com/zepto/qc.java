package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class qc extends pc {
    public static final SparseIntArray R;
    public final LinearLayout O;
    public final LinearLayout P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 2);
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.psl, 4);
        sparseIntArray.put(R.id.dl_no_txt, 5);
        sparseIntArray.put(R.id.layoutCalender, 6);
        sparseIntArray.put(R.id.custom_view, 7);
        sparseIntArray.put(R.id.available_green_color, 8);
        sparseIntArray.put(R.id.available_green_label, 9);
        sparseIntArray.put(R.id.booked_red_color, 10);
        sparseIntArray.put(R.id.booked_red_label, 11);
        sparseIntArray.put(R.id.holiday_blue_color, 12);
        sparseIntArray.put(R.id.holiday_blue_label, 13);
        sparseIntArray.put(R.id.not_yet_gray_color, 14);
        sparseIntArray.put(R.id.not_yet_gray_label, 15);
        sparseIntArray.put(R.id.date_and_month_label, 16);
        sparseIntArray.put(R.id.day_of_month_tv, 17);
        sparseIntArray.put(R.id.view_line, 18);
        sparseIntArray.put(R.id.slots_list_rv, 19);
    }

    public qc(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 20, null, R));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.Q = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.Q = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qc(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[8];
        TextView textView = (TextView) objArr[9];
        ImageView imageView2 = (ImageView) objArr[10];
        TextView textView2 = (TextView) objArr[11];
        View view2 = (View) objArr[7];
        TextView textView3 = (TextView) objArr[16];
        TextView textView4 = (TextView) objArr[17];
        TextView textView5 = (TextView) objArr[5];
        Object obj = objArr[3];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        ImageView imageView3 = (ImageView) objArr[12];
        TextView textView6 = (TextView) objArr[13];
        LinearLayout linearLayout = (LinearLayout) objArr[6];
        Object obj2 = objArr[2];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        ImageView imageView4 = (ImageView) objArr[14];
        TextView textView7 = (TextView) objArr[15];
        Object obj3 = objArr[4];
        super(jd1Var, view, 0, imageView, textView, imageView2, textView2, view2, textView3, textView4, textView5, vy3VarA, imageView3, textView6, linearLayout, iy3VarA, imageView4, textView7, obj3 != null ? zo1.a((View) obj3) : null, (RecyclerView) objArr[19], (View) objArr[18]);
        this.Q = -1L;
        LinearLayout linearLayout2 = (LinearLayout) objArr[0];
        this.O = linearLayout2;
        linearLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[1];
        this.P = linearLayout3;
        linearLayout3.setTag(null);
        w(view);
        z();
    }
}
