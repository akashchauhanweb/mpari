package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class yc extends xc {
    public static final SparseIntArray c0;
    public final FrameLayout Y;
    public final LinearLayout Z;
    public final a33 a0;
    public long b0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c0 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.multi_head, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 7);
        sparseIntArray.put(R.id.tv_appln_detail, 8);
        sparseIntArray.put(R.id.app_arrow_up, 9);
        sparseIntArray.put(R.id.app_arrow_down, 10);
        sparseIntArray.put(R.id.ll_app_layout, 11);
        sparseIntArray.put(R.id.tv_appln_no, 12);
        sparseIntArray.put(R.id.application_number_textview, 13);
        sparseIntArray.put(R.id.tv_appln_date, 14);
        sparseIntArray.put(R.id.doc_appl_date, 15);
        sparseIntArray.put(R.id.tv_name, 16);
        sparseIntArray.put(R.id.doc_appl_name, 17);
        sparseIntArray.put(R.id.tv_son_daugh_wife, 18);
        sparseIntArray.put(R.id.doc_appl_fname, 19);
        sparseIntArray.put(R.id.tv_dob, 20);
        sparseIntArray.put(R.id.doc_appl_dob, 21);
        sparseIntArray.put(R.id.view8, 22);
        sparseIntArray.put(R.id.textView, 23);
        sparseIntArray.put(R.id.view9, 24);
        sparseIntArray.put(R.id.textView2, 25);
        sparseIntArray.put(R.id.shimmer_view_container, 26);
        sparseIntArray.put(R.id.upload_list_rv, 27);
        sparseIntArray.put(R.id.button_layout_button, 28);
        sparseIntArray.put(R.id.upload_documents, 29);
        sparseIntArray.put(R.id.skipped_upload_doc, 30);
    }

    public yc(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 31, null, c0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.b0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.b0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.b0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yc(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[10];
        ImageView imageView2 = (ImageView) objArr[9];
        TextView textView = (TextView) objArr[13];
        LinearLayout linearLayout = (LinearLayout) objArr[28];
        TextView textView2 = (TextView) objArr[7];
        TextView textView3 = (TextView) objArr[15];
        TextView textView4 = (TextView) objArr[21];
        TextView textView5 = (TextView) objArr[19];
        TextView textView6 = (TextView) objArr[17];
        Object obj = objArr[3];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        LinearLayout linearLayout3 = (LinearLayout) objArr[11];
        Object obj2 = objArr[4];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        Object obj3 = objArr[5];
        super(jd1Var, view, 0, imageView, imageView2, textView, linearLayout, textView2, textView3, textView4, textView5, textView6, vy3VarA, linearLayout2, linearLayout3, iy3VarA, obj3 != null ? sh3.a((View) obj3) : null, (ShimmerFrameLayout) objArr[26], (CustomWegetLayout) objArr[30], (TextView) objArr[23], (TextView) objArr[25], (TextView) objArr[14], (TextView) objArr[8], (TextView) objArr[12], (TextView) objArr[20], (TextView) objArr[16], (TextView) objArr[18], (CustomWegetLayout) objArr[29], (RecyclerView) objArr[27], (View) objArr[22], (View) objArr[24]);
        this.b0 = -1L;
        this.G.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.Y = frameLayout;
        frameLayout.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[2];
        this.Z = linearLayout4;
        linearLayout4.setTag(null);
        Object obj4 = objArr[6];
        this.a0 = obj4 != null ? a33.a((View) obj4) : null;
        w(view);
        x();
    }
}
