package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class qa extends pa {
    public static final SparseIntArray Q;
    public final LinearLayout N;
    public final LinearLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 2);
        sparseIntArray.put(R.id.psl, 3);
        sparseIntArray.put(R.id.dl_no_txt, 4);
        sparseIntArray.put(R.id.layoutCalender, 5);
        sparseIntArray.put(R.id.custom_view, 6);
        sparseIntArray.put(R.id.available_green_color, 7);
        sparseIntArray.put(R.id.available_green_label, 8);
        sparseIntArray.put(R.id.booked_red_color, 9);
        sparseIntArray.put(R.id.booked_red_label, 10);
        sparseIntArray.put(R.id.holiday_blue_color, 11);
        sparseIntArray.put(R.id.holiday_blue_label, 12);
        sparseIntArray.put(R.id.not_yet_gray_color, 13);
        sparseIntArray.put(R.id.not_yet_gray_label, 14);
        sparseIntArray.put(R.id.date_and_month_label, 15);
        sparseIntArray.put(R.id.day_of_month_tv, 16);
        sparseIntArray.put(R.id.view_line, 17);
        sparseIntArray.put(R.id.slots_list_rv, 18);
    }

    public qa(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 19, null, Q));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.P = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.P = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qa(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[7];
        TextView textView = (TextView) objArr[8];
        ImageView imageView2 = (ImageView) objArr[9];
        TextView textView2 = (TextView) objArr[10];
        View view2 = (View) objArr[6];
        TextView textView3 = (TextView) objArr[15];
        TextView textView4 = (TextView) objArr[16];
        TextView textView5 = (TextView) objArr[4];
        Object obj = objArr[2];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        ImageView imageView3 = (ImageView) objArr[11];
        TextView textView6 = (TextView) objArr[12];
        LinearLayout linearLayout = (LinearLayout) objArr[5];
        ImageView imageView4 = (ImageView) objArr[13];
        TextView textView7 = (TextView) objArr[14];
        Object obj2 = objArr[3];
        super(jd1Var, view, 0, imageView, textView, imageView2, textView2, view2, textView3, textView4, textView5, vy3VarA, imageView3, textView6, linearLayout, imageView4, textView7, obj2 != null ? zo1.a((View) obj2) : null, (RecyclerView) objArr[18], (View) objArr[17]);
        this.P = -1L;
        LinearLayout linearLayout2 = (LinearLayout) objArr[0];
        this.N = linearLayout2;
        linearLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[1];
        this.O = linearLayout3;
        linearLayout3.setTag(null);
        w(view);
        z();
    }
}
