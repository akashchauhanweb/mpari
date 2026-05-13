package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class wa extends va {
    public static final SparseIntArray h0;
    public final FrameLayout d0;
    public final LinearLayout e0;
    public final a33 f0;
    public long g0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        h0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.headerLayout, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 7);
        sparseIntArray.put(R.id.txt_view_details, 8);
        sparseIntArray.put(R.id.select_service_name, 9);
        sparseIntArray.put(R.id.icon_image, 10);
        sparseIntArray.put(R.id.round_card_view, 11);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 12);
        sparseIntArray.put(R.id.tv_appln_detail, 13);
        sparseIntArray.put(R.id.app_arrow_up, 14);
        sparseIntArray.put(R.id.app_arrow_down, 15);
        sparseIntArray.put(R.id.ll_app_layout, 16);
        sparseIntArray.put(R.id.tv_appln_no, 17);
        sparseIntArray.put(R.id.application_number_textview, 18);
        sparseIntArray.put(R.id.tv_appln_date, 19);
        sparseIntArray.put(R.id.doc_appl_date, 20);
        sparseIntArray.put(R.id.tv_name, 21);
        sparseIntArray.put(R.id.doc_appl_name, 22);
        sparseIntArray.put(R.id.tv_son_daugh_wife, 23);
        sparseIntArray.put(R.id.doc_appl_fname, 24);
        sparseIntArray.put(R.id.tv_dob, 25);
        sparseIntArray.put(R.id.doc_appl_dob, 26);
        sparseIntArray.put(R.id.view8, 27);
        sparseIntArray.put(R.id.textView, 28);
        sparseIntArray.put(R.id.view9, 29);
        sparseIntArray.put(R.id.textView2, 30);
        sparseIntArray.put(R.id.shimmer_view_container, 31);
        sparseIntArray.put(R.id.upload_list_rv, 32);
        sparseIntArray.put(R.id.button_layout_button, 33);
        sparseIntArray.put(R.id.upload_documents, 34);
        sparseIntArray.put(R.id.skipped_upload_doc, 35);
    }

    public wa(jd1 jd1Var, View view) {
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

    public void x() {
        synchronized (this) {
            this.g0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wa(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[15];
        ImageView imageView2 = (ImageView) objArr[14];
        TextView textView = (TextView) objArr[18];
        LinearLayout linearLayout = (LinearLayout) objArr[33];
        TextView textView2 = (TextView) objArr[7];
        TextView textView3 = (TextView) objArr[20];
        TextView textView4 = (TextView) objArr[26];
        TextView textView5 = (TextView) objArr[24];
        TextView textView6 = (TextView) objArr[22];
        Object obj = objArr[4];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        CardView cardView = (CardView) objArr[10];
        ImageView imageView3 = (ImageView) objArr[12];
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        LinearLayout linearLayout3 = (LinearLayout) objArr[16];
        Object obj2 = objArr[3];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        Object obj3 = objArr[5];
        super(jd1Var, view, 0, imageView, imageView2, textView, linearLayout, textView2, textView3, textView4, textView5, textView6, vy3VarA, cardView, imageView3, linearLayout2, linearLayout3, iy3VarA, obj3 != null ? yo1.a((View) obj3) : null, (CardView) objArr[11], (MyTextView) objArr[9], (ShimmerFrameLayout) objArr[31], (CustomWegetLayout) objArr[35], (TextView) objArr[28], (TextView) objArr[30], (TextView) objArr[19], (TextView) objArr[13], (TextView) objArr[17], (TextView) objArr[25], (TextView) objArr[21], (TextView) objArr[23], (TextView) objArr[8], (CustomWegetLayout) objArr[34], (RecyclerView) objArr[32], (View) objArr[27], (View) objArr[29]);
        this.g0 = -1L;
        this.I.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.d0 = frameLayout;
        frameLayout.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[2];
        this.e0 = linearLayout4;
        linearLayout4.setTag(null);
        Object obj4 = objArr[6];
        this.f0 = obj4 != null ? a33.a((View) obj4) : null;
        w(view);
        x();
    }
}
