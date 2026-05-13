package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class ga extends fa {
    public static final SparseIntArray V;
    public final LinearLayout S;
    public final LinearLayout T;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 2);
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.psl, 4);
        sparseIntArray.put(R.id.dl_no_txt, 5);
        sparseIntArray.put(R.id.select_service, 6);
        sparseIntArray.put(R.id.icon_image, 7);
        sparseIntArray.put(R.id.round_card_view, 8);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 9);
        sparseIntArray.put(R.id.layoutCalender, 10);
        sparseIntArray.put(R.id.custom_view, 11);
        sparseIntArray.put(R.id.available_green_color, 12);
        sparseIntArray.put(R.id.available_green_label, 13);
        sparseIntArray.put(R.id.booked_red_color, 14);
        sparseIntArray.put(R.id.booked_red_label, 15);
        sparseIntArray.put(R.id.holiday_blue_color, 16);
        sparseIntArray.put(R.id.holiday_blue_label, 17);
        sparseIntArray.put(R.id.not_yet_gray_color, 18);
        sparseIntArray.put(R.id.not_yet_gray_label, 19);
        sparseIntArray.put(R.id.date_and_month_label, 20);
        sparseIntArray.put(R.id.day_of_month_tv, 21);
        sparseIntArray.put(R.id.view_line, 22);
        sparseIntArray.put(R.id.slots_list_rv, 23);
    }

    public ga(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 24, null, V));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.U = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.U != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.U = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ga(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[12];
        TextView textView = (TextView) objArr[13];
        ImageView imageView2 = (ImageView) objArr[14];
        TextView textView2 = (TextView) objArr[15];
        View view2 = (View) objArr[11];
        TextView textView3 = (TextView) objArr[20];
        TextView textView4 = (TextView) objArr[21];
        TextView textView5 = (TextView) objArr[5];
        Object obj = objArr[3];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        ImageView imageView3 = (ImageView) objArr[16];
        TextView textView6 = (TextView) objArr[17];
        CardView cardView = (CardView) objArr[7];
        ImageView imageView4 = (ImageView) objArr[9];
        LinearLayout linearLayout = (LinearLayout) objArr[10];
        Object obj2 = objArr[2];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        ImageView imageView5 = (ImageView) objArr[18];
        TextView textView7 = (TextView) objArr[19];
        Object obj3 = objArr[4];
        super(jd1Var, view, 0, imageView, textView, imageView2, textView2, view2, textView3, textView4, textView5, vy3VarA, imageView3, textView6, cardView, imageView4, linearLayout, iy3VarA, imageView5, textView7, obj3 != null ? zo1.a((View) obj3) : null, (CardView) objArr[8], (MyTextView) objArr[6], (RecyclerView) objArr[23], (View) objArr[22]);
        this.U = -1L;
        LinearLayout linearLayout2 = (LinearLayout) objArr[0];
        this.S = linearLayout2;
        linearLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[1];
        this.T = linearLayout3;
        linearLayout3.setTag(null);
        w(view);
        x();
    }
}
